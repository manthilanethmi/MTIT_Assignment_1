package beverageconsumer;

import beverageproducer.BeverageProduce;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Beverage Consumer Started!");
		serviceReference = context.getServiceReference(BeverageProduce.class.getName());
		BeverageProduce servicePublish = (BeverageProduce) context.getService(serviceReference);
		System.out.println(servicePublish.publishService());
	}
	
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Beverage Consumer stopped!");
		context.ungetService(serviceReference);
	}

}