package feemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Variables {
    public static String loginUsername,loginPassword;
    public static String addUsername,addPassword;
    public static String deleteId;
    private static String nName, nDept, nYear, nDiv;
    private static int nFees;
    public static String uId,uName,uDept,uYear,uDiv;
    public static int uFees;
    public static boolean login;

    public Variables() {
        loginUsername = "loginUsername";
        loginPassword = "loginPassword";
        addUsername = "addUsername";
        addPassword = "addPassword";
        nName = "nName";
        nDept = "nDept";
        nYear = "nYear";
        nDiv = "nDiv";
        login = false;
        nFees = 0;
    }
    public static void setNewStudent(String nName,String nDept,String nYear,String nDiv,int nFees){
        Variables.nName=nName;
        Variables.nDept=nDept;
        Variables.nYear=nYear;
        Variables.nDiv=nDiv;
        Variables.nFees = nFees;
    }
    
    public static void setUpdateStudent(String uId,String uName,String uDept,String uYear,String uDiv,int uFees){
        Variables.uId=uId;
        Variables.uName=uName;
        Variables.uDept=uDept;
        Variables.uYear=uYear;
        Variables.uDiv=uDiv;
        Variables.uFees=uFees;
    }
    
 //db connection variables
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/fee?useSSL=false";
    static final String USER = "root";
    static final String PASS = "";
    
    public static void sendData(int ch){
        Connection conn = null;
        Statement stmt = null;    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            switch (ch) {
                case 99:
                    {
                    }
                    break;
                case 1:
                    {
                        String query = "INSERT INTO staff( s_user , s_pass ) values( '"+Variables.addUsername+"' , '"+Variables.addPassword+"' )";
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(query);
                        ps.execute();
                        stmt.close();
                    }
                    break;
                case 98:
                    {
                    }
                    break;
                case 2:
                    {
                        String query = "DELETE FROM staff WHERE s_id = "+deleteId;
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(query);
                        ps.execute();
                        stmt.close();
                    }
                    break;
                case 3:
                    {
//                        
                        String sql;
                        String n_name = Variables.nName;
                        String n_dept = Variables.nDept;
                        String n_year = Variables.nYear;
                        String n_div = Variables.nDiv;
                        int n_fees = Variables.nFees;
                        int remaining = 70500 - n_fees;
                        sql = "INSERT INTO `student`(`name`, `dept`, `year`, `div`, `fees` , `remaining`) "
                                +"VALUES ('"+n_name+"' , '"+n_dept+"' , '"+n_year+"' , '"+n_div+"' , '"+n_fees+"', '"+remaining+"')";
                        PreparedStatement preparedStmt = conn.prepareStatement(sql);
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(sql);
                        ps.execute();
                        stmt.close();
                    }
                    break;
                case 5:
                    {
                        String sql;
                        String n_id = Variables.uId;
                        String n_name = Variables.uName;
                        String n_dept = Variables.uDept;
                        String n_year = Variables.uYear;
                        String n_div = Variables.uDiv;
                        int n_fees = Variables.uFees;
                        int remaining = 10500 - n_fees;
                        sql ="UPDATE `student` SET `name`='"+n_name+"',`dept`='"+n_dept+"',`year`='"+n_year+"',`div`='"+n_div+"',`fees`='"+n_fees+"',`remaining`='"+remaining+"' WHERE `id` = '"+n_id+"'";
                        PreparedStatement preparedStmt = conn.prepareStatement(sql);
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(sql);
                        ps.execute();
                        stmt.close();
                    } 
                    break;
                case 6:
                    {
                        String query = "SELECT * FROM staff WHERE s_user = '"+loginUsername+"' AND s_pass = '"+loginPassword+"'";
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(query);
                        ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            Variables.login = true;
                        }
                        rs.close();
                        stmt.close();
                    }
                    break;
                case 7:
                    {
//                        Variables.tempCount = 1;
//                        String query = rNoSql;
//                        PreparedStatement ps = null;
//                        ps = conn.prepareStatement(query);
//                        ResultSet rs = ps.executeQuery();
//                        while(rs.next()){
//                            Variables.tempCount++;
//                        }
//                        rs.close();
//                        stmt.close();
                    }
                    break;
                case 8:
                    {
//                        String query = "DELETE FROM room WHERE r_id = "+cId;
//                        PreparedStatement ps = null;
//                        ps = conn.prepareStatement(query);
//                        ps.execute();
//                        stmt.close();
                    }
                    break;
                default:
                    {
                        
                    }
                    break;
            }
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
         }finally{
            //finally block used to close resources
            try{
               if(stmt!=null)
                    stmt.close();
            }
            catch(SQLException se2){
                // nothing we can do
            }
            try{
               if(conn!=null)
                    conn.close();
            }
            catch(SQLException se){
                se.printStackTrace();
            }//end finally try
         }//end try
    }
    
    
}
