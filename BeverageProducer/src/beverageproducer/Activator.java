package beverageproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Beverage Producer Started!");
		BeverageProduce publisherService = new BeverageProduceImpl();
		publishServiceRegistration = context.registerService(
				BeverageProduce.class.getName(), publisherService, null);
	}
	
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Beverage Producer Stopped!");
		publishServiceRegistration.unregister();
	}

}
