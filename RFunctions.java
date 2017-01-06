import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;


public class RFunctions {
	
	

	public void testR() {
		System.out.println("got to RFunctions");

		Rengine rengine = new Rengine(new String[] {"--vanilla"}, false, null);
		
		System.out.println("got past Rengine");
		/*
		if (!re.waitForR()) {
	            System.out.println("Cannot load R");
	            return;
	        }
	    */

	    System.out.println("R initialization worked!");
	}

	
	

}