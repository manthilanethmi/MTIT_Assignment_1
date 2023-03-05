package billconsumer;

import billproducer.BillProducer;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class BillConsumerActivator implements BundleActivator {

	ServiceReference <?> serviceReference;
	Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
		System.out.println("Bill Consumer Start");
		serviceReference = context.getServiceReference(BillProducer.class.getName());
		BillProducer billadminproducer = (BillProducer) context.getService(serviceReference);
		System.out.println(billadminproducer.wellcome());
		billadminproducer.ViewAllRecord();
		
		System.out.println("_________________________________ Add New Items TO the Bill _________________________________\n");
		System.out.println("Item Categorys :Bars\tBreads\tBreakfast Products\tCookies\tDessertsEnter\n ");
		System.out.println("Enter food Item ?");
		String bcfoodItem = sc.next();
		System.out.println("Enter food Name ?");
		String bcfoodName = sc.next();
		System.out.println("Enter Quantity ?");
		String bcQuantity = sc.next();
		billadminproducer.insertnewBill(bcfoodItem , bcfoodName ,bcQuantity);

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bill Consumer Stop !!!");
		if(serviceReference != null) {
			context.ungetService(serviceReference);
		}
	}


}
