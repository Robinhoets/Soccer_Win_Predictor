import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.rowset.JdbcRowSet;

import java.util.ArrayList; 

public class DataAccessObject {
	
	private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;
  private JdbcRowSet rowSet = null;

  private ArrayList<String> gameList = new ArrayList<String>();

    public void addRecord(Game game) {

    	try{

    		// create a mysql database connection
    		String myDriver = "com.mysql.jdbc.Driver";
    	  // Setup the connection with the DB
    	  String myUrl = "jdbc:mysql://localhost/cfc_football_club";
    	  Class.forName(myDriver);
    	  Connection conn = DriverManager.getConnection(myUrl, "root", "Stardog8*");

    	  // the mysql insert statement
      	String query = " insert into premierLeague20162017(yellowCards, redCards, fouls, corners, offsides, possessionPercent, passAccuracyPercent, formation, opponentsFormation, goals, goalsScoredCounterAttack, goalsScoredOpenPlay, goalsScoredSetPiece, goalsScoredPenalty, ownGoals, shots, shotsOnTarget, dribblesWon, foulsWon, tackles, interceptions, clearance, shotsBlocked, shotsConceded, totalPasses, passSuccessPercent, crossPass, throughBallPass, longBallPass, shortPass, win)"
        	+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // create the mysql insert preparedstatement
      	PreparedStatement preparedStmt = conn.prepareStatement(query);

      	preparedStmt.setInt(1, game.getYellowCards());
      	preparedStmt.setInt(2, game.getRedCards());
      	preparedStmt.setInt(3, game.getFouls());

      	preparedStmt.setInt(4, game.getCorners());
      	preparedStmt.setInt(5, game.getOffsides());
      	preparedStmt.setInt(6, game.getPossessionPercent());
      	preparedStmt.setInt(7, game.getPassAccuracyPercent());

      	preparedStmt.setInt(8, game.getFormation());
      	preparedStmt.setInt(9, game.getOpponentsFormation());

      	preparedStmt.setInt(10, game.getGoals());
      	preparedStmt.setInt(11, game.getGoalsScoredCounterAttack());
      	preparedStmt.setInt(12, game.getGoalsScoredOpenPlay());
      	preparedStmt.setInt(13, game.getGoalsScoredSetPiece());
      	preparedStmt.setInt(14, game.getGoalsScoredPenalty());
      	preparedStmt.setInt(15, game.getOwnGoals());

      	preparedStmt.setInt(16, game.getShots());
      	preparedStmt.setInt(17, game.getShotsOnTarget());
      	preparedStmt.setInt(18, game.getDribblesWon());
      	preparedStmt.setInt(19, game.getFoulsWon());

			  preparedStmt.setInt(20, game.getTackles());
      	preparedStmt.setInt(21, game.getInterceptions());
      	preparedStmt.setInt(22, game.getClearance());
      	preparedStmt.setInt(23, game.getShotsBlocked());
      	preparedStmt.setInt(24, game.getShotsConceded());

      	preparedStmt.setInt(25, game.getTotalPasses());
      	preparedStmt.setInt(26, game.getPassSuccessPercent());
      	preparedStmt.setInt(27, game.getCrossPass());
      	preparedStmt.setInt(28, game.getThroughBallPass());
      	preparedStmt.setInt(29, game.getLongBallPass());
      	preparedStmt.setInt(30, game.getShortPass());

      	preparedStmt.setInt(31, game.getWin());


      		// execute the preparedstatement
      	preparedStmt.execute();
      
      	conn.close();


    	} catch (Exception e)
    		{
      			System.err.println("Got an exception!");
      			System.err.println(e.getMessage());
    		}
    }


    public ArrayList<String> readDatabaseAndCreateArrayList() throws Exception {

      try{
        // create a mysql database connection
        //String myDriver = "org.gjt.mm.mysql.Driver";
        String myDriver = "com.mysql.jdbc.Driver";
        // Setup the connection with the DB
        String myUrl = "jdbc:mysql://localhost/cfc_football_club";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "Stardog8*");

        // SQL query
        String query = "SELECT * FROM premierLeague20162017";

        // create the java statement
        Statement statement = conn.createStatement();
      
        // execute the query, and get a java resultset
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()) {

          int id = resultSet.getInt("id");
          int yellowCards = resultSet.getInt("yellowCards");
          int redCards = resultSet.getInt("redCards");
          int fouls = resultSet.getInt("fouls");

          int corners = resultSet.getInt("corners");
          int offsides = resultSet.getInt("offsides");
          int possessionPercent = resultSet.getInt("possessionPercent");
          int passAccuracyPercent = resultSet.getInt("passAccuracyPercent");

          int formation = resultSet.getInt("formation");
          int opponentsFormation = resultSet.getInt("opponentsFormation");

          int goals = resultSet.getInt("goals");
          int goalsScoredCounterAttack = resultSet.getInt("goalsScoredCounterAttack");
          int goalsScoredOpenPlay = resultSet.getInt("goalsScoredOpenPlay");
          int goalsScoredSetPiece = resultSet.getInt("goalsScoredSetPiece");
          int goalsScoredPenalty = resultSet.getInt("goalsScoredPenalty");
          int ownGoals = resultSet.getInt("ownGoals");

          int shots = resultSet.getInt("shots");
          int shotsOnTarget = resultSet.getInt("shotsOnTarget");
          int dribblesWon = resultSet.getInt("dribblesWon");
          int foulsWon = resultSet.getInt("foulsWon");

          int tackles = resultSet.getInt("tackles");
          int interceptions = resultSet.getInt("interceptions");
          int clearance = resultSet.getInt("clearance");
          int shotsBlocked = resultSet.getInt("shotsBlocked");
          int shotsConceded = resultSet.getInt("shotsConceded");

          int totalPasses = resultSet.getInt("totalPasses");
          int passSuccessPercent = resultSet.getInt("passSuccessPercent");
          int crossPass = resultSet.getInt("crossPass");
          int throughBallPass = resultSet.getInt("throughBallPass");
          int longBallPass = resultSet.getInt("longBallPass");
          int shortPass = resultSet.getInt("shortPass");

          int win = resultSet.getInt("win");

          String game = getRowAndMakeString(id,
                                            yellowCards, redCards, fouls, 
                                            corners, offsides, possessionPercent, passAccuracyPercent, 
                                            formation, opponentsFormation,
                                            goals, goalsScoredCounterAttack, goalsScoredOpenPlay, goalsScoredSetPiece, goalsScoredPenalty, ownGoals, 
                                            shots, shotsOnTarget, dribblesWon, foulsWon,
                                            tackles, interceptions, clearance, shotsBlocked, shotsConceded,
                                            totalPasses, passSuccessPercent, crossPass, throughBallPass, longBallPass, shortPass,
                                            win);
          // add game to arraylist
          gameList.add(game);

        }

        statement.close();

        } catch (Exception e)
          {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
          }

        // return the entire game list
        return gameList;

    }

    public String getRowAndMakeString(int id, int yellowCards, int redCards, int fouls, 
        int corners, int offsides, int possessionPercent, int passAccuracyPercent, 
        int formation, int opponentsFormation,
        int goals, int goalsScoredCounterAttack, int goalsScoredOpenPlay, int goalsScoredSetPiece, int goalsScoredPenalty, int ownGoals, 
        int shots, int shotsOnTarget, int dribblesWon, int foulsWon,
        int tackles, int interceptions, int clearance, int shotsBlocked, int shotsConceded,
        int totalPasses, int passSuccessPercent, int crossPass, int throughBallPass, int longBallPass, int shortPass,
        int win) {

      String game = "\nGame: " + id + "\n" 
                    + "\t" + "Yellow Cards: " + yellowCards + "  Red Cards: " + redCards + "\n"
                    + "\t" + "Corners: " + corners + "  Offsides: " + offsides + "  Possession Percent: " + possessionPercent + "  Pass Accuracy Percent: " + "\n" 
                    + "\t" + "Formation: " + formation + "  Oppnonents Formaiton: " + opponentsFormation + "\n"
                    + "\t" + "Goals: " + goals + "  Goals Scored Counter Attack: " + goalsScoredCounterAttack + "  Goals Scored Open Play: " + goalsScoredOpenPlay + "  Goals Scored Set Piece: " + goalsScoredSetPiece + "  Goals Score Penalty: " + goalsScoredPenalty + "  Own Goals: " + ownGoals + "\n"
                    + "\t" + "Shots: " + shots + "  Shots On Target: " + "Dribbles Won: " + dribblesWon + "  Fouls Won: " + foulsWon + "\n"
                    + "\t" + "Tackles: " + tackles + "  Interceptions: " + interceptions + "  Clearance: " + clearance + "  Shots Blocked: " + shotsBlocked + "  Shots Conceded: " + shotsConceded + "\n"
                    + "\t" + "Total Passes: " + totalPasses + "  Pass Success Percent: " + passSuccessPercent + "  Cross Passes: " + crossPass + "  Through Balls: " + throughBallPass + "  Long Balls: " + longBallPass + "  Short Pass: " + shortPass + "\n"
                    + "\t" + "Win: " + win;

      return game;
    }

    public void deleteRecord(int recordNumber) {

      try{

        // create a mysql database connection
        String myDriver = "com.mysql.jdbc.Driver";
        // Setup the connection with the DB
        String myUrl = "jdbc:mysql://localhost/cfc_football_club";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "Stardog8*");

        // create the mysql delete statement.

        String query = "delete from premierLeague20162017 where id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, recordNumber);

        // execute the preparedstatement
        preparedStmt.execute();
      
        conn.close();
      }
        catch (Exception e)
        {
          System.err.println("Got an exception! ");
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