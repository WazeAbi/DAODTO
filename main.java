package toto;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
 
	public static void main(String[] args) {
	ArrayList<Article> mesArticles = new ArrayList<Article>();
		 
		Connection conn = null;
		try {
		    conn =
		      DriverManager.getConnection("jdbc:mysql://localhost/snackmouns?" +
		                                   "user=root&password=root");
		    Statement stmt = conn.createStatement();
	           ResultSet RS = stmt.executeQuery("SELECT * from article");
	           while(RS.next()) {
	        	   Article article = new Article(RS.getInt("id"),RS.getString("libelle") ,RS.getInt("prix") );
	        	   	mesArticles.add(article);
	        	   
	            }
	           for (Article monArticle : mesArticles) {
	        	   System.out.printf("%d\t%s\t% .2f\n",
	        			   monArticle.getId(),
	        			   monArticle.getType(),
	        			   monArticle.getPrice()
	        			   );
	           }
	            
	        
	         
	     
		} catch(Exception e){
            System.out.println("Connexion impossible: "+e);
            System.exit(-1);  
        }
		
		}

	}

