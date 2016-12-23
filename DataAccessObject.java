import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.rowset.JdbcRowSet;

public class DataAccessObject {
	
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private JdbcRowSet rowSet = null;

    public void addRecord(Game game) {

    	try{

    		// create a mysql database connection
      		//String myDriver = "org.gjt.mm.mysql.Driver";
    		String myDriver = "com.mysql.jdbc.Driver";
    	    // Setup the connection with the DB
    	    String myUrl = "jdbc:mysql://localhost/cfc_football_club";
    	    Class.forName(myDriver);
    	    Connection conn = DriverManager.getConnection(myUrl, "root", "Stardog8*");

    	    // the mysql insert statement
      		String query = " insert into madeUpTeam(possession, shots, passAccuracy)"
        	+ " values (?, ?, ?)";

        	// create the mysql insert preparedstatement
      		PreparedStatement preparedStmt = conn.prepareStatement(query);

      		preparedstatement.setInt(1, game.getYellowCards());
      		preparedstatement.setInt(2, game.getredCards());
      		preparedstatement.setInt(3, game.getFouls());

      		preparedstatement.setInt(4, game.getCorners());
      		preparedstatement.setInt(5, game.getOffsides());
      		preparedstatement.setInt(6, game.getPossessionPercent());
      		preparedstatement.setInt(7, game.getPassAccuracyPercent());

      		preparedstatement.setInt(8, game.getFormation());
      		preparedstatement.setInt(9, game.getOpponentsFormation());

      		preparedstatement.setInt(10, game.getGoals());
      		preparedstatement.setInt(11, game.getGoalsScoredCounterAttack());
      		preparedstatement.setInt(12, game.getGoalsScoredOpenPlay());
      		preparedstatement.setInt(13, game.getGoalsScoredSetPiece());
      		preparedstatement.setInt(14, game.getGoalsScoredPenalty());
      		preparedstatement.setInt(15, game.getOwnGoals());

      		preparedstatement.setInt(16, game.getShots());
      		preparedstatement.setInt(17, game.getShotsOnTarget());
      		preparedstatement.setInt(18, game.getDribblesWon());
      		preparedstatement.setInt(19, game.getFoulsWon());

			preparedstatement.setInt(20, game.getTackles());
      		preparedstatement.setInt(21, game.getInterceptions());
      		preparedstatement.setInt(22, game.getClearance());
      		preparedstatement.setInt(23, game.getShotsBlocked());
      		preparedstatement.setInt(24, game.getShotsConceded());

      		preparedstatement.setInt(25, game.getTotalPasses());
      		preparedstatement.setInt(26, game.getPassSuccessPercent());
      		preparedstatement.setInt(27, game.getCrossPass());
      		preparedstatement.setInt(28, game.getThroughBallPass());
      		preparedstatement.setInt(29, game.getLongBallPass());
      		preparedstatement.setInt(30, game.getShortPass());

      		preparedstatement.setInt(31, game.getWin());


      		// execute the preparedstatement
      		preparedStmt.execute();
      
      		conn.close();


    	} catch (Exception e)
    		{
      			System.err.println("Got an exception!");
      			System.err.println(e.getMessage());
    		}
    }
    /*
    public void readDatabase() throws Exception {
    	try{
    		
    		Class.forName("com.mysql.jdbc.Driver");
    	    // Setup the connection with the DB
    	    connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"
    	                                    + "user=sqluser&password=sqluserpw");

    	    // Statements allow to issue SQL queries to the database
    	    statement = connect.createStatement();
    	    
    	    // Result set get the result of the SQL query
    	    resultSet = statement.executeQuery("select * from feedback.comments");
    	    
    	    //writeResultSet(resultSet);
    		
    	} catch (Exception e) {
            throw e;
    	} 
    }
     
    public void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String user = resultSet.getString("myuser");
                String website = resultSet.getString("webpage");
                String summary = resultSet.getString("summary");
                Date date = resultSet.getDate("datum");
                String comment = resultSet.getString("comments");
                System.out.println("User: " + user);
                System.out.println("Website: " + website);
                System.out.println("summary: " + summary);
                System.out.println("Date: " + date);
                System.out.println("Comment: " + comment);
        }
    }
    
 	// You need to close the resultSet
    public void close() {
            try {
                    if (resultSet != null) {
                            resultSet.close();
                    }

                    if (statement != null) {
                            statement.close();
                    }

                    if (connect != null) {
                            connect.close();
                    }
            } catch (Exception e) {

            }
    }
    
    public ResultSet getResultSet() {
    	return resultSet;
    }
    */

}