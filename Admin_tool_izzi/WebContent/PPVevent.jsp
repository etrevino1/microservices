
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
				<td><s:textfield key="label.account" name="account" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.irisId" name="irisId" /></td>
			</tr>
			<tr>
				<td><s:submit key="label.retrieve"></s:submit></td>
			</tr>
		</table>
	</s:form>


	<h3>
		<s:text name="label.clients" />
	</h3>
	<c:if test="${!empty subscriber}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.nickname" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.regionName" /></th>
				<th align="left"><s:text name="label.actions" /></th>
			</tr>
				<tr>
					<td>${subscriber.nickname}</td>
					<td>${subscriber.irisId}</td>
					<td>${subscriber.regionName}</td>
					<td>delete</td>
				</tr>
		</table>
	</c:if>
	
	<c:if test="${!empty subscription}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.irisPackageId" /></th>
				<th align="left"><s:text name="label.packageName" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>
			<c:forEach items="${subscription}" var="current" >
				<tr>
					<td>delete</td>
					<td>${current.irisId}</td>
					<td>${current.irisPackageId}</td>
					<td>${current.packageName}</td>
					<td>${current.creationDatetime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${!empty equipments}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.hardwareId" /></th>
				<th align="left"><s:text name="label.type" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>
			<c:forEach items="${equipments}" var="current" >
				<tr>
					<td>delete</td>
					<td>${current.irisId}</td>
					<td>${current.hardwareId}</td>
					<td>${current.type}</td>
					<td>${current.creationDatetime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>