package bgu.osgi.helloworldbundle.function;

public class FunctionalUnit extends Thread {
    private volatile boolean active = true;

		public void run() {
		    while (active) {
		System.out.println("OSGI console. FunctionalUnit works.");
		try  {
		   Thread.sleep(5000);
		} catch (Exception e) {
		   System.out.println("Thread interrupted " + e.getMessage());
		            }
		     }
		}
		
		public void stopThread() {
		          active = false;
		       }

}
