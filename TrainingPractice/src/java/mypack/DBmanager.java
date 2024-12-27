package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBmanager
{
    Connection con=null;
    PreparedStatement pd=null;
    ResultSet rs=null;
    
    
    public DBmanager()
            
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){}
    }
    //code for connection
    public Connection getCon()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            return con;
        }
        catch(Exception ex){}
        return con;
    }
    //end code for connection
    
    //code for insertupdatedelete method
    public boolean MyInsertUpadateDelete(String command)
    {
        try{
            pd=getCon().prepareStatement(command);
            pd.executeUpdate(command);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
    //end code for insert method
    
    
    //code for display records
    public ResultSet DisplayAllRecords(String command)
    {
        try
        {
            pd=getCon().prepareStatement(command);
            rs=pd.executeQuery(command);
            return rs;
        }
        catch(Exception ex){}
        return rs;
    }
    //end code for display records
}