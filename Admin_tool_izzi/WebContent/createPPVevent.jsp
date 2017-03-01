
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>
<%-- <%@ taglib uri="/struts-dojo-tags" prefix="sx"%> --%>
<%@ taglib uri="/struts-tags" prefix="s"%>




<html>
<head>
<sx:head />
<title>DB Test</title>

<style>
table.list {
	border-collapse: collapse;
	width: 40%;
}

table.list, table.list td, table.list th {
	border: 1px solid gray;
	padding: 5px;
}
</style>
</head>
<body>


	<s:url id="localeEN" namespace="/locale" action="locale">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:url id="localeES" namespace="/locale" action="locale">
		<s:param name="request_locale">es</s:param>
	</s:url>

	<s:a href="%{localeEN}">English</s:a>
	<s:a href="%{localeES}">Español</s:a>

	<s:form method="post" action="findSubscriber">
		<table>
			<tr>
				<td><s:textfield key="label.eventId" name="eventId" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.channelName" name="channelName" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.externalRef" name="externalRef" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.price" name="price" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.title" name="title" /></td>
			</tr>
			<tr>
				<td><s:submit key="label.retrieve"></s:submit></td>
			</tr>
		</table>
	</s:form>


	
</body>
</html>