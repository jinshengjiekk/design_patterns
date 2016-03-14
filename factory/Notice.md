**Benefits of Factory Pattern**  

1. Factory pattern provides approach to code for interface rather than implementation.
2. Factory pattern removes the instantiation of actual implementation classes from client code, 
making it more robust, less coupled and easy to extend. 
For example, we can easily change PC class implementation because client program is unaware of this.
3. Factory pattern provides abstraction between implementation and client classes through inheritance.

**Factory Pattern Examples in JDK**  

1. java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
2. valueOf() method in wrapper classes like Boolean, Integer etc.
  
  
  
**Benefits of Abstract Factory Pattern**  

1. Abstract Factory pattern provides approach to code for interface rather than implementation.
2. Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, 
for example we can add another sub-class Laptop and a factory LaptopFactory.
3. Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.  

**Abstract Factory Pattern Examples in JDK**   

1. javax.xml.parsers.DocumentBuilderFactory#newInstance()
2. javax.xml.transform.TransformerFactory#newInstance()
3. javax.xml.xpath.XPathFactory#newInstance()