# MTIT_Assignment_1
In this project, we have created a café management system based on the OSGi (Open-Source Gateway Initiative) framework with producer and consumer implementations. We have implemented 4 producers and 4 consumers. They are as follows,
•	Beverage Item Producer, Beverage Producer, Beverage Consumer
•	Bill Producer, Bill Consumer
•	Employee Producer, Employee Consumer
•	Stock Producer, Stock Consumer
When considering the behaviors of the functions implemented in our system, basically,
	Beverage item producer produces beverage items. By consuming that beverage items beverage producer produces beverages. Beverage consumer consumes the beverages produced by the beverage producer.
	Similarly, in
– Bill producer, Bill consumer function, 
– Employee producer, Employee consumer function 
– Stock producer, Stock consumer function, bill, employee, and stock consumers consume what is produced by the bill, employee, and stocks producers respectively.  
Initially, we need to import the OSGi framework package into the producer manifest file and consumer manifest file. After that, when building the connection between the producer and the consumer, first we must export producer packages from the producer manifest file and then, need to import all the exported packages to the consumer manifest file. 
