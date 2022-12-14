<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <form method="post" action="/results">
      <label for="latitude">Latitude</label>
      <input
        type="number"
        name="latitude"
        min="-90"
        max="90"
        step="0.0001"
        value="42.3314"
        required
      />
      <label for="longitude">Longitude</label>
      <input
        type="number"
        name="longitude"
        min="-180"
        max="180"
        step="0.0001"
        value="-83.0458"
        required
      />
      <input type="submit" value="Submit" />
    </form>
	
		<div>
			Location: ${weather.location.areaDescription}
		</div>
		<div>
			Date: ${weather.currentobservation.date}
		</div>
		<div>
			Temperature: ${weather.currentobservation.temp}
		</div>
		<div>
			Details: ${weather.currentobservation.weather}
		</div>
		
		 <table>
      <thead>
        <tr>
          <c:forEach var="days" items="${weather.time.startPeriodName}">
            <th>${days}</th> </c:forEach>
        </tr>
      </thead>
      <tbody>
        <tr>
          <c:forEach var="days" items="${weather.time.tempLabel}">
            <td>${days}</td>
          </c:forEach>
        </tr>
        <tr>
          <c:forEach var="days" items="${weather.data.temperature}">
            <td>${days}</td> </c:forEach>
        </tr>
        <tr>
          <c:forEach var="days" items="${weather.data.text}">
            <td>${days}</td></c:forEach>
        </tr>
      </tbody>
    </table>
	
</body>
</html>