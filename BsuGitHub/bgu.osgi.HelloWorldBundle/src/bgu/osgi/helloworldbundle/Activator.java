package bgu.osgi.helloworldbundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import bgu.osgi.helloworldbundle.function.FunctionalUnit;

public class Activator implements BundleActivator {
	private FunctionalUnit func;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
        System.out.println("Starting BSU OSGi bundle ...");
        func = new FunctionalUnit();
        func.start();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping BSU Osgi bundle");
        func.stopThread();
        func.join();
	}

}
