package jdbcConnect;

import java.sql.*;

import com.intersys.jdbc.CacheConnectionPoolDataSource;

public class jConnect {
    private static final int DEFAULT_PORT = 1972;
    private Connection dbconnection;
    private int PoolCounter = 0;
    private Statement stmt;
    
    public jConnect()throws Exception{
    	try {
            int port = determinePort();
            String url = "jdbc:Cache://127.0.0.1:" + port + "/SAMPLES";
            String user = "_SYSTEM";
            String password = "SYS";

			Class.forName ("com.intersys.jdbc.CacheDriver");
			dbconnection = DriverManager.getConnection(url,user,password);
			stmt = dbconnection.createStatement();

		} catch (Exception ex) {
			System.out.println("Caught exception: " +
                           ex.getClass().getName()
                           + ": " + ex.getMessage());
		}
    }
    
    public jConnect(String url, String user, String password)throws Exception{
    	try {
			Class.forName ("com.intersys.jdbc.CacheDriver");
			dbconnection = DriverManager.getConnection(url,user,password);
			stmt = dbconnection.createStatement();

		} catch (Exception ex) {
			System.out.println("Caught exception: " +
                           ex.getClass().getName()
                           + ": " + ex.getMessage());
		}
    }
    public void MakePool(String url, String user, String password) throws SQLException{
    	CacheConnectionPoolDataSource pds = new CacheConnectionPoolDataSource();
    	   pds.restartConnectionPool();
    	   pds.setURL(url);
    	   pds.setUser(user);
    	   pds.setPassword(password);
    	   dbconnection = pds.getConnection();
    	   setPoolCounter(pds.getPoolCount());
    }
    /*public void main(String[] args) throws Exception{
    	int port = determinePort();
            String url = "jdbc:Cache://127.0.0.1:" + port + "/SAMPLES";
            String user = "_SYSTEM";
            String password = "SYS";
            Class.forName ("com.intersys.jdbc.CacheDriver");
			dbconnection = DriverManager.getConnection(url,user,password);
			stmt = dbconnection.createStatement();
        String stQuery = "Select * from Sample.Person";
        java.sql.ResultSet rs = stmt.executeQuery(stQuery);
		ResultSetMetaData rsmd = rs.getMetaData();
		int colnum = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i=1; i<=colnum; i++) {
				System.out.print(rs.getString(i) + "  ");
			}
			System.out.println();
		}
		CloseDBConnection();
 	}*/
    
    private void setPoolCounter(int poolCount) {
		PoolCounter=poolCount;
		
	}

	private final void CloseDBConnection() throws SQLException{
    	dbconnection.close();
    }
    
    private final static int determinePort() throws Exception
    {
        String pt = System.getProperty ("com.intersys.port");
        if (pt == null)
            {
                return DEFAULT_PORT;
            }
        
        int port = 0;
        try
            {
                port = Integer.parseInt(pt);
            }
        catch (NumberFormatException x)
            {
                throw new Exception ("Invalid default port specified in " + 
                                          "system properties: "+ pt);
            }

        return port;
    }

	public Connection getDbconnection() {
		return dbconnection;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public Statement getStmt() {
		return stmt;
	}

	public int getPoolCounter() {
		return PoolCounter;
	}
    
}