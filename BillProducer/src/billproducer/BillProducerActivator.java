package billproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BillProducerActivator implements BundleActivator {
	
	ServiceRegistration<?> publishServiceRegistration;
	
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Bill Producer Start");
		BillProducer publishService = new ProducerBill();
		publishServiceRegistration = bundleContext.registerService(BillProducer.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Bill Producer Stop !!!");
		publishServiceRegistration.unregister();
	}

}
