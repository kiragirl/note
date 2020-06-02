#
###异常
1. Invalid character found in the request target. The valid characters are defined in RFC 7230 and RFC 3986
URL中包含 |, {}等符号会产生此异常
解决办法
    Tomcat 7 :
    You can add system property tomcat.util.http.parser.HttpParser.requestTargetAllow={} to prevent this error. One of the soltion is editing $CATALINA_HOME\conf\catalina.properties.