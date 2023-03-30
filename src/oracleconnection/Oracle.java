
package oracleconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import static oracleconnection.DialogConneP.url;


public class Oracle extends javax.swing.JFrame {
    public static  String urle;
    public static  String users;
    public static  String passwords;
    
    public static  String nomi;
    public static  String prenomi;
    public static  int salairei;
    public static  String tablei;
    
    
    public Oracle() {
                initComponents();
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        ConnectionBase = new javax.swing.JButton();
        ChargerJT1 = new javax.swing.JButton();
        ChargerJT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Recher = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        ConnectionBase.setBackground(new java.awt.Color(255, 255, 255));
        ConnectionBase.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        ConnectionBase.setForeground(new java.awt.Color(255, 102, 102));
        ConnectionBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        ConnectionBase.setText("News");
        ConnectionBase.setFocusable(false);
        ConnectionBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConnectionBase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ConnectionBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectionBaseActionPerformed(evt);
            }
        });
        jToolBar1.add(ConnectionBase);

        ChargerJT1.setBackground(new java.awt.Color(255, 255, 255));
        ChargerJT1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        ChargerJT1.setForeground(new java.awt.Color(255, 102, 102));
        ChargerJT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/undo.png"))); // NOI18N
        ChargerJT1.setText("Add");
        ChargerJT1.setFocusable(false);
        ChargerJT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ChargerJT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChargerJT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargerJT1ActionPerformed(evt);
            }
        });
        jToolBar1.add(ChargerJT1);

        ChargerJT.setBackground(new java.awt.Color(255, 255, 255));
        ChargerJT.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        ChargerJT.setForeground(new java.awt.Color(255, 102, 102));
        ChargerJT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        ChargerJT.setText("Discon");
        ChargerJT.setFocusable(false);
        ChargerJT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ChargerJT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChargerJT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargerJTActionPerformed(evt);
            }
        });
        jToolBar1.add(ChargerJT);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree2);

        jScrollPane1.setRequestFocusEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "prenom", "salaire"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Recher.setColumns(20);
        Recher.setRows(5);
        Recher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecherMouseEntered(evt);
            }
        });
        Recher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RecherKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RecherKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(Recher);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    ////bouton connection a al base de donner et chargement des tables
    public static ArrayList<ConneP> Conn;   
    private void ConnectionBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectionBaseActionPerformed
                Oracle.urle="";
                Oracle.users="";
                Oracle.passwords="";
                DialogConneP conn=new DialogConneP(this,true);
                 url.setText("jdbc:oracle:thin:@localhost:1521:xe");
                    conn.setVisible(true);
                    
              
                
                if(!Oracle.urle.isEmpty() && !Oracle.users.isEmpty()&& !Oracle.passwords.isEmpty())
                {
                    Connection(Oracle.urle,Oracle.users,Oracle.passwords);
                }

    }//GEN-LAST:event_ConnectionBaseActionPerformed

                  
    ////fonction insertiondes donners dans ma table
   public void Insertion( String noms,String prenoms,int salaires){
       Connection con = null;
                result = new ArrayList();
               
               Tablereserve = (DefaultTableModel) jTable1.getModel(); 
                try{
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        con = DriverManager.getConnection(Oracle.urle,Oracle.users,Oracle.passwords);
                        String sql="INSERT INTO utilisateur VALUES (?,?,?)";
                       PreparedStatement prestm= con.prepareStatement(sql);
                        prestm.setString(1,noms);
                        prestm.setString(2,prenoms);
                        prestm.setInt(3,salaires); 
                        
               int rs=prestm.executeUpdate();
                        if (rs!=0){
                        JOptionPane.showMessageDialog(this,"add succesffuly");
                        } 
                        else {
                        JOptionPane.showMessageDialog(this,"echec de l'ajout");
                        }
                } catch (SQLException e)
                {
                        System.out.println(e);
                } catch (ClassNotFoundException ex) {  
                        Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }    
                
    }
    
    
    private void ChargerJTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargerJTActionPerformed
          
    }//GEN-LAST:event_ChargerJTActionPerformed
   
    /////fonction qui me permet de charger mes mon jtables  avec les donner de ma table
    public static ArrayList<utilisateur> result;
    public static DefaultTableModel Tablereserve;
    private void chargeTable( String ur,String Use,String pass,String nom){
        Connection con = null;
    result = new ArrayList();
               
               Tablereserve = (DefaultTableModel) jTable1.getModel(); 
                try{
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        con = DriverManager.getConnection(ur,Use, pass);
                        Statement stmt=con.createStatement();
                        String sql="select * from "+nom;
                        ResultSet rs=stmt.executeQuery(sql);
                while (rs.next()) 
                {
                        utilisateur util=new utilisateur(rs.getString(1),rs.getString(2),rs.getInt(3));
                        result.add(util);  
                }
                } catch (SQLException e)
                {
                        System.out.println(e);
                } catch (ClassNotFoundException ex) {  
                        Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
                for (utilisateur obje :  result) {
                        String listSa=String.valueOf(obje.getSalaire());
                        String tableContent[]={obje.getNom(),obje.getPrenom(),listSa};
                        Tablereserve.addRow(tableContent);
                }     
                
    }
    
    
    ///////fonction qui me permet de faire mes requete sql avec jtextarea
     private void chargeCom( String nomm){
                Connection con = null;
                result = new ArrayList();
               
               Tablereserve = (DefaultTableModel) jTable1.getModel(); 
                try{
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        con = DriverManager.getConnection(Oracle.urle,Oracle.users,Oracle.passwords);
                        Statement stmt=con.createStatement();
                        String sql=nomm;
                        ResultSet rs=stmt.executeQuery(sql);
                while (rs.next()) 
                {
                        utilisateur util=new utilisateur(rs.getString(1),rs.getString(2),rs.getInt(3));
                        result.add(util);  
                }
                } catch (SQLException e)
                {
                        System.out.println(e);
                } catch (ClassNotFoundException ex) {  
                        Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
                for (utilisateur obje :  result) {
                        String listSa=String.valueOf(obje.getSalaire());
                        String tableContent[]={obje.getNom(),obje.getPrenom(),listSa};
                        Tablereserve.addRow(tableContent);
                }     
                
    }
    
    /////fonction qui me permet de faire la connection a am base deonner et de recuper les tables dans mon JTree
                DefaultTreeModel Tree;
void Connection(String ur,String Use,String pass){
                Connection con = null;
                ArrayList tname = new ArrayList();
                try{ 
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        con = DriverManager.getConnection(ur,Use, pass);
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery("select * from sys.tab");
                try{
                       int i = 0;
                while (rs.next())
                {                
                        tname.add(rs.getString(1));
                }
                }
                catch(Exception wh)
                {
                        System.out.println("erreur lors de remplissage de tname");
                }
                }catch (Exception e) {System.out.println(e);}
                        DefaultMutableTreeNode node= new  DefaultMutableTreeNode("Reservation");
                        DefaultMutableTreeNode node2 =new DefaultMutableTreeNode("TableReserve");
                        node.add(node2);  
                        DefaultTreeModel Tree   =(DefaultTreeModel) jTree2.getModel();
                        Tree.setRoot(node);
                        JTree trre= new JTree(Tree);
                for(int i  =0;i<tname.size();i++)
                { node2.add(new DefaultMutableTreeNode(tname.get(i)));}  

}
/////////le bouton qui  me permet d'afficher les element dans mon JTable pour au click de la souris 
    private void jTree2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree2MouseClicked
                try {
                        if (evt.getClickCount() == 2){
                        if(jTree2.getSelectionModel().getSelectionPath()!=null)
                               chargeTable(Oracle.urle,Oracle.users,Oracle.passwords,jTree2.getSelectionModel().getSelectionPath().getLastPathComponent().toString()); 
                    }
                else if (evt.getClickCount() == 1){
                               Tablereserve.setRowCount(0);
                    }
                    }
                catch (Exception e) {
                    }


    }//GEN-LAST:event_jTree2MouseClicked

    private void RecherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecherMouseEntered
        
    }//GEN-LAST:event_RecherMouseEntered

    private void RecherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecherKeyPressed
        
       
    }//GEN-LAST:event_RecherKeyPressed

    /////////bouton qui me permet de de faire une recherche en click  sur  entre
    private void RecherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecherKeyTyped
               if(evt.getKeyChar()==evt.VK_ENTER) {
                    String recup=Recher.getText();
                try {
                    Tablereserve.setRowCount(0);
                if(jTree2.getSelectionModel().getSelectionPath()!=null)
                        chargeCom(recup); 
                } 
                catch (Exception e) {
                    }
                   }
    }//GEN-LAST:event_RecherKeyTyped

    private void ChargerJT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargerJT1ActionPerformed
//              Oracle.nomi="";
//               Oracle.prenomi="";
//               Oracle.salairei=0;
//               Oracle.tablei="";
                Requette req =new Requette(this, true);
                req.setVisible(true);
                
                
               
    }//GEN-LAST:event_ChargerJT1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
UIManager.setLookAndFeel(new NimbusLookAndFeel());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oracle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChargerJT;
    private javax.swing.JButton ChargerJT1;
    private javax.swing.JButton ConnectionBase;
    private javax.swing.JTextArea Recher;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables
}
