import weka.core.Instances;
import weka.experiment.InstanceQuery;

import java.io.*;

public class WekaTest{

 

	public static void main(String []args) {
		System.out.println("Weka imports worked!");
		InstanceQuery query=null;

		try{
			query = new InstanceQuery();
		} catch(Exception e) {
			System.out.println(e);
		}
		 query.setUsername("root");
		 query.setPassword("Stardog8*");
		 query.setQuery("select * from premierLeague20162017");
		 // You can declare that your data set is sparse
		 // query.setSparseData(true);
		 Instances data =null	;
		 try{
		 	 data = query.retrieveInstances();
		 } catch(Exception e){
		 	System.out.println(e);
		 }
		 System.out.println(data);
	}
}