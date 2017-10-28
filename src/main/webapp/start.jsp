<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<html:html>
    <head>
        <title>Home Page</title>
        <html:base />
    </head>
    <body>
        <p>Message: <bean:message key="welcome.message" /></p>
        <a href="action.do?success=ok">Go to Success Page</a>
        <br/>
        <a href="action.do">Go to Failure Page</a>
    </body>
</html:html>