https://stackoverflow.com/questions/25263978/ioexception-parsing-xml-document-from-class-path-resource-file-does-not-exist
Caused by: java.io.FileNotFoundException: class path resource [MySprintCfg.xml] cannot be opened because it does not exist
	at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:172)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:330)
	... 18 more
	
报找不到文件的处理方法(把资源文件放到src/main/resources)

Generally your classpath would be .../src/main/java/, 
and ClassPathXmlApplicationContext would read from .../src/main/resources. 
Then your test classes would be in .../src/test/java/ and 
ClassPathXmlApplicationContext would read from .../src/test/resources.

So, check where your test application context is, and put a copy of the xml there.