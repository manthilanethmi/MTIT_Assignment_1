package beverageitemproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Beverage Item Producer Started!");
		BeverageItemProduce publisherService = new BeverageItemProduceImpl();
		publishServiceRegistration = context.registerService(
				BeverageItemProduce.class.getName(), publisherService, null);
	}
	
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Beverage Item Producer Stopped!");
		publishServiceRegistration.unregister();
	}

}
