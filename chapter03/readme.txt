Book - Beginning Java EE 6 with Glassfish
Antonio Goncalves
--
Section 1 - Introduction
  Chapter 1 - Java EE 6 Environment

Section 2 - Building a domain model
  Chapter 2 - Java Persistence
  Chapter 3 - Object-Relational Mapping
  Chapter 4 - Querying Objects
  Chapter 5 - Callbacks and Listeners

Section 3 - Implementing business logic
  Chapter 6 - Enterprise Java Beans
  Chapter 7 - Session Beans & Timer Service
  Chapter 8 - Callback & Interceptors
  Chapter 9 - Transactions and security


Section 4 - Adding a user interface
  Chapter 10 - Java Server Faces
  Chapter 11 - Pages and components
  Chapter 12 - Navigation

Section 5 - Interoperability
  Chapter 13 - JMS & MDB
  Chapter 14 - Web Services
  Chapter 15 - RESTful Service
--
The test clases of this chapter, by default, use the Embedded mode of Derby (JavaDB). That means that the persistence.xml file defines a persistent unit with the folowing JDBC Driver

    <property name="javax.persistence.jdbc.driver" value="org.apache.derby.jdbc.EmbeddedDriver"/>
    <property name="javax.persistence.jdbc.url" value="jdbc:derby:chapter05DB;create=true"/>

Embedded mode is good for testing, but it means that no database is really created, so you can't browse its structure with a tool. If you can to be able to browse the database structure, you need to change the embedded mode to a client/server implementation that uses the Derby Network Server. For that, you'll have to do the following steps :

1. Install Derby. You must download the distribution and extract the package (http://db.apache.org) into DERBY_HOME directory. Add %DERBY_HOME%\bin to your PATH and run the sysinfo command line to display information about your Java environment and your version of Derby.
2. Start Derby server with the following command : java -jar %DERBY_HOME%\lib\derbyrun.jar server start (or startNetworkServer.bat)
3. Change the JDBC driver and url in your persistence.xml file :

    <property name="javax.persistence.jdbc.driver" value="org.apache.derby.jdbc.ClientDriver"/>
    <property name="javax.persistence.jdbc.url" value="jdbc:derby://localhost:1527/chapter05DB;create=true"/>

4. Run the test with Maven : mvn clean test
5. Once finished, shutdown the database with : java -jar %DERBY_HOME%\lib\derbyrun.jar server shutdown (or stopNetworkServer.bat)
 