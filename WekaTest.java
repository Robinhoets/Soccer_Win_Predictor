import weka.core.Instances;
import weka.experiment.InstanceQuery;
import weka.classifiers.functions.LinearRegression;

import java.io.*;

public class WekaTest{

 

	public static void main(String []args) {
		System.out.println("Weka imports worked!");
		


		 //System.out.println(data);
	}

	public void runLinearRegression() {
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
		 	 //method for liner regression
			 data.setClassIndex(data.numAttributes() - 1);
			 LinearRegression model = new LinearRegression();
			 model.buildClassifier(data);
			 System.out.println(model);
		 } catch(Exception e){
		 	System.out.println(e);
		 }
	}


	/*
	import weka.core.Instance;
	import weka.core.Instances;
	import weka.classifiers.functions.LinearRegression;
	public class Regression{
	public static void main(String args[]) throws Exception{
	//load data
	Instances data = new Instances(new BufferedReader(new
	FileReader("dataset/house.arff")));
	data.setClassIndex(data.numAttributes() - 1);
	//build model
	LinearRegression model = new LinearRegression();
	model.buildClassifier(data); //the last instance with missing
	class is not used
	System.out.println(model);
	//classify the last instance
	Instance myHouse = data.lastInstance();
	double price = model.classifyInstance(myHouse);
	System.out.println("My house ("+myHouse+"): "+price);
	}
	*/
}