import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.TimeZone;

import javax.swing.text.DateFormatter;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;


public class GetPPVFile {

	//	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		GetPPVFile ppv = new GetPPVFile();
		ppv.getJSONEvents(args[0], args[1], args[2], args[3]);
	}

	private void getJSONEvents(String channelExternalID, String startDate, String endDate, String node) throws ParseException{
		RestTemplate restTemplate = new RestTemplate();
		List<Event> events = null; 

		HttpHeaders headers = new HttpHeaders();
		headers.set("IRIS-DEVICE-TYPE", "TEST");
		headers.set("IRIS-DEVICE-CLASS", "PC");
		headers.set("IRIS-HW-DEVICE-ID", "1");
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "";
		if(node.equals("mex")){
			url ="http://172.20.183.55:8888";
		}else if(node.equals("mty")){
			url ="http://172.18.1.234:8888";
		}
		
		String event = restTemplate.postForObject(url + "/managetv/tvinfo/events/schedule?serviceId=" + channelExternalID + "&start=" + (new DateTime(startDate, DateTimeZone.UTC)) + "&end=" + (new DateTime(endDate, DateTimeZone.UTC)) + "&view=ppv-csv-deliveries", entity, String.class);
		
		events = getEvents(event);
		
//		eventsToString(events);
		eventsToFile(events, node);
	}

	private List<Event> getEvents(String superEvent){
		StringTokenizer st = new StringTokenizer(superEvent, "\n");
		List<Event> events = new ArrayList<Event>();
		
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			events.add(new Event(temp));
		}
		
		System.out.println(events.size());
		
		return events;
	}
	
	private void eventsToString(List<Event> events){
		Iterator<Event> it = events.iterator();
		while(it.hasNext()){
			System.out.print(it.next().toFileString());
		}
	}
	
	private void eventsToFile(List<Event> events, String node){
		BufferedWriter bw = null;
		String heads = "SERVICE_EXTERNAL _REF\tEVENT_EXTERNAL_REF\tFECHA_INICIO	FECHA_FIN\tTITULO\tRPT\tPRECIO_CC\tPRECIO_SUC\tPRECIO_WEB\tPRECIO_IMPULSO\tCLASIFICACION\tDESCRIPCION\tFECHA_DISPONIBLE\tFECHA_LIMITE_CANCELACION\tTECNOLOGIA\tCATEGORIA" + System.lineSeparator();
		
		try{
			bw = new BufferedWriter(new FileWriter("C:\\Users\\esuarez\\Desktop\\PPV Mirada\\Eventos " +  (new SimpleDateFormat("yyyyMMdd HHmmss")).format(Calendar.getInstance().getTime()) + " " + node + ".txt"));
			bw.write(heads);
			
			Iterator<Event> it = events.iterator();
			while(it.hasNext()){
				bw.write(it.next().toFileString());
			}
			
		}catch (IOException ioe){
			System.err.println(ioe.getMessage());
		}finally{
			try{
			if(bw != null){
				bw.close();
			}
			}catch(IOException ioe){
				System.err.println(ioe.getMessage());
			}
		}
		
		
	}

	private Properties getHeads() throws IOException{
		Properties props = new Properties();
		String file = "default.properties";
		
		InputStream is = getClass().getClassLoader().getResourceAsStream(file);
		
		if(is != null){
			props.load(is);
		}else{
			throw new FileNotFoundException("Properties file " + file + " not found in the classpath");
		}
		
		return props;
	}
	
}
