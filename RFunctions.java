import org.rosuda.JRI.Rengine;


public class RFunctions {
	


	public void testR() {

		Rengine re = new Rengine();

		if (re.waitForR()) {
	            System.out.println("Cannot load R");
	            return;
	        }

	    System.out.println("R initialization worked!");
	}

	
	

}