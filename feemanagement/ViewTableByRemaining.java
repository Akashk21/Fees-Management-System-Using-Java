package feemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ViewTableByRemaining extends javax.swing.JFrame {

  
    public ViewTableByRemaining() {
        initComponents();
        addRowToJTable();
    }

    public class User{
        public int id;
        public String name;
        public String dept;
        public String year;
        public String div;
        public int fees;
        public int re;
        
        public User(int Id, String name, String dept, String year, String div, int fees,int re)
        {
            this.id = Id;
            this.name = name;
            this.dept = dept;
            this.year = year;
            this.div = div;
            this.fees = fees;
            this.re = re;
        }
    }

    public ArrayList ListUsers()
    {
        ArrayList<User> list = new ArrayList<User>();
        Connection conn = null;
        Statement stmt = null;    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
                        String sql;
                        sql = "SELECT * FROM student ORDER BY fees";
                        PreparedStatement ps = null;
                        ps = conn.prepareStatement(sql);
                        ResultSet rs = ps.executeQuery();
                        String id,name,dept,year,div;
                        int b,re,fees;
                        if(rs.next()){
                            id  = rs.getString("id");
                            name  = rs.getString("name");
                            dept  = rs.getString("dept");
                            year  = rs.getString("year");
                            div  = rs.getString("div");
                            fees  = rs.getInt("fees");
                            b = 70500;
                            re = b - fees;
                            User u1 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                            list.add(u1);
                        }
                        
                        if(rs.next()){
                            id  = rs.getString("id");
                            name  = rs.getString("name");
                            dept  = rs.getString("dept");
                            year  = rs.getString("year");
                            div  = rs.getString("div");
                            fees  = rs.getInt("fees");
                            b = 70500;
                            re = b - fees;
                            User u2 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                            list.add(u2);
                        }
                        
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u3 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u3);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u4 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u4);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u5 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u5);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u6 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u6);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u7 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u7);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u8 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u8);
                        }
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u9 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u9);
                        }
                        
                        
                        if(rs.next()){
                        id  = rs.getString("id");
                        name  = rs.getString("name");
                        dept  = rs.getString("dept");
                        year  = rs.getString("year");
                        div  = rs.getString("div");
                        fees  = rs.getInt("fees");
                        b = 70500;
                        re = b - fees;
                        User u10 = new User(Integer.parseInt(id),name,dept,year,div,fees,re);
                        list.add(u10);
                        }
                        rs.close();
                        stmt.close();
         }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            e.printStackTrace();
         }finally{
            
            try{
               if(stmt!=null)
                  stmt.close();
            }catch(SQLException se2){
            }
            try{
               if(conn!=null)
                  conn.close();
            }catch(SQLException se){
               se.printStackTrace();
            }
         }
        return list;
    }
    
    
    
    
    
    //Database conectivity
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/fee";
    static final String USER = "root";
    static final String PASS = "";
    
    /*
    public ArrayList ListUsers()
    {
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User(1,"","","","","");
        User u2 = new User(2,"","","","","");
        User u3 = new User(3,"","","","","");
        User u4 = new User(4,"","","","","");
        User u5 = new User(5,"","","","","");
        User u6 = new User(6,"","","","","");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        return list;
    }
    */
    
// added rows from arraylist to jtable
    public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<User> list = ListUsers();
        Object rowData[] = new Object[7];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).id;
            rowData[1] = list.get(i).name;
            rowData[2] = list.get(i).dept;
            rowData[3] = list.get(i).year;
            rowData[4] = list.get(i).div;
            rowData[5] = list.get(i).fees; 
            rowData[6] = list.get(i).re;
            model.addRow(rowData);
        }
                
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Dept", "Year", "Div", "Fees", "Remaining"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(785, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(866, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminLogged().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTableByRemaining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTableByRemaining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTableByRemaining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTableByRemaining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTableByRemaining().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
