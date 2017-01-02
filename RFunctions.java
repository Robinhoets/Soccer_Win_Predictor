import org.rosuda.JRI.Rengine;
import org.rosuda.JRI.REXP;


public class RFunctions {
	
	Rengine rengine;

	public void testR() {
		System.out.println("got to RFunctions");


		rengine.eval(String.format("greeting <- '%s'", "Hello R World"));
		//REXP result = rengine.eval("greeting");
		//System.out.println("Greeting from R: "+result.asString());;

		//Rengine re = Rengine.getMainEngine();
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