#
###set environment
Tomcat 激活spring profile
#### 方法一
springboot打包war部署到外部tomcat的时候指定profile启动
windows
在%tomcat%/bin下创建setenv.bat文件

linux
在%tomcat%/bin下创建setenv.sh文件

使用JVM参数:

windows
set "JAVA_OPTS=%JAVA_OPTS% -Dspring.profiles.active=dev"
inux
JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=dev"

或者使用CATALINA_OPTS参数：
CATALINA_OPTS="-Dspring.profiles.active=prod"
#### 方法二
或者catalina.bat
set "JAVA_OPTS=%JAVA_OPTS% -Djava.protocol.handler.pkgs=org.apache.catalina.webresources -Dspring.profiles.active=locationHierarchyFromFile,Development"

###异常
1. Invalid character found in the request target. The valid characters are defined in RFC 7230 and RFC 3986
URL中包含 |, {}等符号会产生此异常
解决办法
    Tomcat 7 :
    You can add system property tomcat.util.http.parser.HttpParser.requestTargetAllow={} to prevent this error. One of the soltion is editing $CATALINA_HOME\conf\catalina.properties.