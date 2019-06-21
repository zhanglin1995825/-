<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="message" >
        <spring:message code="${code}"/>
    </json:property>
    <json:array name="items" var="c" items="${banners}">
        <json:object>
            <json:property name="id" value="${c.id}"/>
            <json:property name="url" value="${c.url}"/>
            <json:property name="img" value="${c.img}"/>
            <json:property name="createby" value="${c.createby}"/>
            <json:property name="createat" value="${c.createat}"/>
            <json:property name="updateat" value="${c.updateat}"/>
            <json:property name="updateby" value="${c.updateby}"/>
        <json:property name="state" value="${c.state}"/>
        </json:object>
    </json:array>
</json:object>