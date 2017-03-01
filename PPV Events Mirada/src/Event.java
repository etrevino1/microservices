import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	private String channelExternalRef;
	private String scheduleId;
	private Date startDate;
	private Date endDate;
	private String title;
	private String rpt;
	private int precio_cc;
	private int precio_suc;
	private int precio_web;
	private int precio_impulso;
	private String clasificacion;
	private String descripcion;
	private Date availableDate;
	private Date cancelDate;
	private String technology;
	private String category;

	public Event(String evento){
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		StringTokenizer st = new StringTokenizer(evento, "|");

		channelExternalRef = st.nextToken();
		scheduleId = st.nextToken();
		try{
			startDate = formatter.parse(st.nextToken());
		}catch(ParseException pe){
			pe.getCause();
			startDate = new Date();
		}
		try{
			endDate = formatter.parse(st.nextToken());
		}catch(ParseException pe){
			endDate = new Date();
		}
		title = st.nextToken();
		rpt = "000";
		precio_cc = 50;
		precio_suc = 50;
		precio_web = 50;
		precio_impulso = 55;
		clasificacion = "A";
		descripcion = "PRUEBA";
		availableDate = new  Date(Calendar.getInstance().getTimeInMillis() + (35 * 60000));//now + 35 minutes
		cancelDate = startDate;
		technology = "MIRADA";
		category = "DEPORTES";
		
	}

	@Override
	public String toString(){
		return "ScheduleId:" + scheduleId + " - " + startDate + " - " + endDate + " - " + availableDate + " - " + cancelDate;
	}
	
	public String toFileString(){
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		DateTimeFormatter jodaFormatter = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
//		DateTime 
		
		return 	scheduleId + "\t" + 
				scheduleId + "\t" + 
				formatter.format(startDate) + "\t" +
				
//				jodaFormatter.l
//				(new DateTime(startDate, DateTimeZone.forID("Mexico/General"))) + "\t" +
				
				
				formatter.format(endDate) + "\t" +
				title + "\t" +
				rpt + "\t" +
				precio_cc + "\t" +
				precio_suc + "\t" +
				precio_web + "\t" +
				precio_impulso + "\t" +
				clasificacion + "\t" +
				descripcion + "\t" +
				formatter.format(availableDate) + "\t" +
				formatter.format(cancelDate) + "\t" +
				technology + "\t" +
				category + System.lineSeparator()
				;
	}
}
