package ads;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gannu
 */
public class TheatreSeats extends javax.swing.JFrame {
    public static int count;
   public int seatcount=0;
   int[] selected= new int[65]; 
   String[] A=new String[65];
  
   public String s1;
   public String fname,email,time,movie;
   //String[] B=new String[20];
   //String[] C=new String[20];
   //String[] D=new String[20];
   //String[] E=new String[20];
   //String[] F=new String[20];
   //String[] G=new String[20];
   //String[] H=new String[20];
   
    /**
     * Creates new form TheatreSeats
     */
    /*public TheatreSeats() {
        initComponents();
        
    }*/
    public TheatreSeats(String fname1,String email1,String movie1,String time1) {
        initComponents();
        s1= " " ;
        //count=count1;
        //jTextField1.setText(Integer.toString(count));
        fname=fname1;
        email=email1;
        time=time1;
        movie=movie1;
        //time="1115";
        //movie="logan";
        int i=1;
        try{  
            //jTextField1.setText(Integer.toString(seatcount));
            //System.out.println("hi"+5);
			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MTBS","root","shreyata@06");  
  

                        
			Statement stmt=con.createStatement(); 
                        ResultSet rs=stmt.executeQuery("Select * from "+movie+";");
        
            while(rs.next())
            {
               // int a=stmt.executeUpdate("insert into ddlj values ('"+A+"','0','0')");
                selected[i]=Integer.parseInt(rs.getString(movie+time)); 
                i++;
            }
            System.out.println("hi"+5);
            for(i=1;i<=64;i++)
            {
                //System.out.println(selected[i]);
                if(selected[i]==0)
                    break;
            
            } 
            if(i==65)
            {
                HomeScreen h1=new HomeScreen(fname,email);
                this.setVisible(false);
                h1.setVisible(true);
            }
            
        con.close();
        }
        catch(Exception e){ 
		e.printStackTrace();
		}
        if(selected[1]==1)
        {
            jToggleButton1.setEnabled(false);
        }
        if(selected[2]==1)
        {
            jToggleButton10.setEnabled(false);
        }
        if(selected[3]==1)
        {
            jToggleButton18.setEnabled(false);
        }
        if(selected[4]==1)
        {
            jToggleButton26.setEnabled(false);
        }
        if(selected[5]==1)
        {
            jToggleButton34.setEnabled(false);
        }
        if(selected[6]==1)
        {
            jToggleButton2.setEnabled(false);
        }
        if(selected[7]==1)
        {
            jToggleButton51.setEnabled(false);
        }
        if(selected[8]==1)
        {
            jToggleButton43.setEnabled(false);
        }
        if(selected[9]==1)
        {
            jToggleButton8.setEnabled(false);
        }
        if(selected[10]==1)
        {
            jToggleButton17.setEnabled(false);
        }
        if(selected[11]==1)
        {
            jToggleButton21.setEnabled(false);
        }
        if(selected[12]==1)
        {
            jToggleButton27.setEnabled(false);
        }
        if(selected[13]==1)
        {
            jToggleButton35.setEnabled(false);
        }
        if(selected[14]==1)
        {
            jToggleButton44.setEnabled(false);
        }
        if(selected[15]==1)
        {
            jToggleButton42.setEnabled(false);
        }
        if(selected[16]==1)
        {
            jToggleButton58.setEnabled(false);
        }
        if(selected[17]==1)
        {
            jToggleButton7.setEnabled(false);
        }
        if(selected[18]==1)
        {
            jToggleButton12.setEnabled(false);
        }
        if(selected[19]==1)
        {
            jToggleButton19.setEnabled(false);
        }
        if(selected[20]==1)
        {
            jToggleButton28.setEnabled(false);
        }
        if(selected[21]==1)
        {
            jToggleButton36.setEnabled(false);
        }
if(selected[22]==1)
        {
            jToggleButton45.setEnabled(false);
        }
if(selected[23]==1)
        {
            jToggleButton52.setEnabled(false);
        }
if(selected[24]==1)
        {
            jToggleButton59.setEnabled(false);
        }
if(selected[25]==1)
        {
            jToggleButton6.setEnabled(false);
        }
if(selected[26]==1)
        {
            jToggleButton13.setEnabled(false);
        }
if(selected[27]==1)
        {
            jToggleButton20.setEnabled(false);
        }
if(selected[28]==1)
        {
            jToggleButton29.setEnabled(false);
        }
if(selected[29]==1)
        {
            jToggleButton37.setEnabled(false);
        }
if(selected[30]==1)
        {
            jToggleButton46.setEnabled(false);
        }
if(selected[31]==1)
        {
            jToggleButton53.setEnabled(false);
        }
if(selected[32]==1)
        {
            jToggleButton60.setEnabled(false);
        }
if(selected[33]==1)
        {
            jToggleButton9.setEnabled(false);
        }
if(selected[34]==1)
        {
            jToggleButton11.setEnabled(false);
        }
if(selected[35]==1)
        {
            jToggleButton22.setEnabled(false);
        }
if(selected[36]==1)
        {
            jToggleButton30.setEnabled(false);
        }
if(selected[37]==1)
        {
            jToggleButton38.setEnabled(false);
        }
if(selected[38]==1)
        {
            jToggleButton47.setEnabled(false);
        }
if(selected[39]==1)
        {
            jToggleButton54.setEnabled(false);
        }
if(selected[40]==1)
        {
            jToggleButton61.setEnabled(false);
        }
if(selected[41]==1)
        {
            jToggleButton5.setEnabled(false);
        }
if(selected[42]==1)
        {
            jToggleButton14.setEnabled(false);
        }
if(selected[43]==1)
        {
            jToggleButton23.setEnabled(false);
        }
if(selected[44]==1)
        {
            jToggleButton31.setEnabled(false);
        }
if(selected[45]==1)
        {
            jToggleButton39.setEnabled(false);
        }
if(selected[46]==1)
        {
            jToggleButton48.setEnabled(false);
        }
if(selected[47]==1)
        {
            jToggleButton55.setEnabled(false);
        }
if(selected[48]==1)
        {
            jToggleButton62.setEnabled(false);
        }
if(selected[49]==1)
        {
            jToggleButton4.setEnabled(false);
        }
if(selected[50]==1)
        {
            jToggleButton15.setEnabled(false);
        }
if(selected[51]==1)
        {
            jToggleButton24.setEnabled(false);
        }
if(selected[52]==1)
        {
            jToggleButton32.setEnabled(false);
        }
if(selected[53]==1)
        {
            jToggleButton40.setEnabled(false);
        }
if(selected[54]==1)
        {
            jToggleButton49.setEnabled(false);
        }
if(selected[55]==1)
        {
            jToggleButton56.setEnabled(false);
        }
if(selected[56]==1)
        {
            jToggleButton63.setEnabled(false);
        }
if(selected[57]==1)
        {
            jToggleButton3.setEnabled(false);
        }
if(selected[58]==1)
        {
            jToggleButton16.setEnabled(false);
        }
if(selected[59]==1)
        {
            jToggleButton25.setEnabled(false);
        }
if(selected[60]==1)
        {
            jToggleButton33.setEnabled(false);
        }
if(selected[61]==1)
        {
            jToggleButton41.setEnabled(false);
        }
if(selected[62]==1)
        {
            jToggleButton50.setEnabled(false);
        }
if(selected[63]==1)
        {
            jToggleButton57.setEnabled(false);
        }
if(selected[64]==1)
        {
            jToggleButton64.setEnabled(false);
        }
        for(i=1;i<=64;i++)
        {
            A[i]="0";
        }
        jLabel10.setText(time);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jToggleButton51 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jToggleButton53 = new javax.swing.JToggleButton();
        jToggleButton54 = new javax.swing.JToggleButton();
        jToggleButton55 = new javax.swing.JToggleButton();
        jToggleButton56 = new javax.swing.JToggleButton();
        jToggleButton57 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton59 = new javax.swing.JToggleButton();
        jToggleButton60 = new javax.swing.JToggleButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton62 = new javax.swing.JToggleButton();
        jToggleButton63 = new javax.swing.JToggleButton();
        jToggleButton64 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(500, 500, 500, 100));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jToggleButton1.setText("1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("1");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("1");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("1");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("1");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("1");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("1");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setText("1");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("2");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("2");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setText("2");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setText("2");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setText("2");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setText("2");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setText("2");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setText("2");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setText("3");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setText("3");
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setText("3");
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setText("3");
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setText("3");
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton23.setText("3");
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton24.setText("3");
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton25.setText("3");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setText("4");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setText("4");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setText("4");
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        jToggleButton29.setText("4");
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });

        jToggleButton30.setText("4");
        jToggleButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton30ActionPerformed(evt);
            }
        });

        jToggleButton31.setText("4");
        jToggleButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton31ActionPerformed(evt);
            }
        });

        jToggleButton32.setText("4");
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });

        jToggleButton33.setText("4");
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });

        jToggleButton34.setText("5");
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jToggleButton35.setText("5");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jToggleButton36.setText("5");
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });

        jToggleButton37.setText("5");
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });

        jToggleButton38.setText("5");
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });

        jToggleButton39.setText("5");
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });

        jToggleButton40.setText("5");
        jToggleButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton40ActionPerformed(evt);
            }
        });

        jToggleButton41.setText("5");
        jToggleButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton41ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("6");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton42.setText("7");
        jToggleButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton42ActionPerformed(evt);
            }
        });

        jToggleButton43.setText("8");
        jToggleButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton43ActionPerformed(evt);
            }
        });

        jToggleButton44.setText("6");
        jToggleButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton44ActionPerformed(evt);
            }
        });

        jToggleButton45.setText("6");
        jToggleButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton45ActionPerformed(evt);
            }
        });

        jToggleButton46.setText("6");
        jToggleButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton46ActionPerformed(evt);
            }
        });

        jToggleButton47.setText("6");
        jToggleButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton47ActionPerformed(evt);
            }
        });

        jToggleButton48.setText("6");
        jToggleButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton48ActionPerformed(evt);
            }
        });

        jToggleButton49.setText("6");
        jToggleButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton49ActionPerformed(evt);
            }
        });

        jToggleButton50.setText("6");
        jToggleButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton50ActionPerformed(evt);
            }
        });

        jToggleButton51.setText("7");
        jToggleButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton51ActionPerformed(evt);
            }
        });

        jToggleButton52.setText("7");
        jToggleButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton52ActionPerformed(evt);
            }
        });

        jToggleButton53.setText("7");
        jToggleButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton53ActionPerformed(evt);
            }
        });

        jToggleButton54.setText("7");
        jToggleButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton54ActionPerformed(evt);
            }
        });

        jToggleButton55.setText("7");
        jToggleButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton55ActionPerformed(evt);
            }
        });

        jToggleButton56.setText("7");
        jToggleButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton56ActionPerformed(evt);
            }
        });

        jToggleButton57.setText("7");
        jToggleButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton57ActionPerformed(evt);
            }
        });

        jToggleButton58.setText("8");
        jToggleButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton58ActionPerformed(evt);
            }
        });

        jToggleButton59.setText("8");
        jToggleButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton59ActionPerformed(evt);
            }
        });

        jToggleButton60.setText("8");
        jToggleButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton60ActionPerformed(evt);
            }
        });

        jToggleButton61.setText("8");
        jToggleButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton61ActionPerformed(evt);
            }
        });

        jToggleButton62.setText("8");
        jToggleButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton62ActionPerformed(evt);
            }
        });

        jToggleButton63.setText("8");
        jToggleButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton63ActionPerformed(evt);
            }
        });

        jToggleButton64.setText("8");
        jToggleButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton64ActionPerformed(evt);
            }
        });

        jLabel1.setText("All eyes this way please!");

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("A");

        jLabel3.setText("B");

        jLabel4.setText("C");

        jLabel5.setText("D");

        jLabel6.setText("E");

        jLabel7.setText("F");

        jLabel8.setText("G");

        jLabel9.setText("H");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(23, 23, 23)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jToggleButton10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jToggleButton5)
                                            .addComponent(jToggleButton9))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jToggleButton6)
                                            .addComponent(jToggleButton7)
                                            .addComponent(jToggleButton8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jToggleButton3)
                                                .addComponent(jToggleButton4))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jToggleButton17, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jToggleButton13, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jToggleButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jToggleButton14, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jToggleButton15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jToggleButton16, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton21)
                                        .addComponent(jToggleButton19)
                                        .addComponent(jToggleButton20))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton27)
                                        .addComponent(jToggleButton28)
                                        .addComponent(jToggleButton29)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jToggleButton18)
                                    .addGap(18, 18, 18)
                                    .addComponent(jToggleButton26))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton22)
                                        .addComponent(jToggleButton23)
                                        .addComponent(jToggleButton24)
                                        .addComponent(jToggleButton25))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton30)
                                        .addComponent(jToggleButton31)
                                        .addComponent(jToggleButton32)
                                        .addComponent(jToggleButton33))))
                            .addGap(194, 194, 194)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton34)
                                .addComponent(jToggleButton35)
                                .addComponent(jToggleButton37)
                                .addComponent(jToggleButton38)
                                .addComponent(jToggleButton39)
                                .addComponent(jToggleButton40)
                                .addComponent(jToggleButton41)
                                .addComponent(jToggleButton36))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton2)
                                .addComponent(jToggleButton44)
                                .addComponent(jToggleButton45)
                                .addComponent(jToggleButton46)
                                .addComponent(jToggleButton47)
                                .addComponent(jToggleButton48)
                                .addComponent(jToggleButton49)
                                .addComponent(jToggleButton50))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton51)
                                .addComponent(jToggleButton42)
                                .addComponent(jToggleButton52)
                                .addComponent(jToggleButton53)
                                .addComponent(jToggleButton54)
                                .addComponent(jToggleButton55)
                                .addComponent(jToggleButton56)
                                .addComponent(jToggleButton57))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton64)
                                .addComponent(jToggleButton58)
                                .addComponent(jToggleButton59)
                                .addComponent(jToggleButton60)
                                .addComponent(jToggleButton61)
                                .addComponent(jToggleButton62)
                                .addComponent(jToggleButton63)
                                .addComponent(jToggleButton43)))))
                .addContainerGap(953, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton17)
                                    .addComponent(jToggleButton21)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jToggleButton6)
                                                .addComponent(jToggleButton13)
                                                .addComponent(jToggleButton20)
                                                .addComponent(jToggleButton29)))))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton9)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton5)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton4)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton3)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton33)))))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton18)
                            .addComponent(jToggleButton26)
                            .addComponent(jToggleButton34)
                            .addComponent(jToggleButton10)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton28)
                                    .addComponent(jToggleButton19)
                                    .addComponent(jToggleButton12)
                                    .addComponent(jToggleButton7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jToggleButton35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton37)
                                .addGap(80, 80, 80)
                                .addComponent(jToggleButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton41))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton53))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jToggleButton44)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jToggleButton45)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jToggleButton46)
                                            .addGap(216, 216, 216))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jToggleButton49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jToggleButton50))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jToggleButton47)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jToggleButton48))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jToggleButton54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton57))))
                            .addComponent(jToggleButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jToggleButton59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton58)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton64)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(748, 748, 748))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        A[2]="A2";
        if(jToggleButton10.isSelected()==true)
        {
            selected[2]=1;
            //if(seatcount<=count)
            //{
              seatcount++;
            jToggleButton10.setBackground(Color.CYAN);
            //}
            //else
        }
        else
        {
            selected[2]=0;
            seatcount--;
            jToggleButton10.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
           // TODO add your handling code here:
           A[34]="E2";
        if(jToggleButton11.isSelected()==true)
        {
            selected[34]=1;
            seatcount++;
            jToggleButton11.setBackground(Color.CYAN);
        }
        else
        {
            selected[34]=1;
            seatcount--;
            jToggleButton11.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        A[18]="C2";
        if(jToggleButton12.isSelected()==true)
        {
            selected[18]=1;
            seatcount++;
            jToggleButton12.setBackground(Color.CYAN);
        }
        else
        {
            selected[18]=0;
            seatcount--;
            jToggleButton12.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
        A[26]="D2";
        if(jToggleButton13.isSelected()==true)
        {
            selected[26]=1;
            seatcount++;
            jToggleButton13.setBackground(Color.CYAN);
        }
        else
        {
            selected[26]=0;
            seatcount--;
            jToggleButton13.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
        A[42]="F2";
        if(jToggleButton14.isSelected()==true)
        {
            selected[42]=1;
            seatcount++;
            jToggleButton14.setBackground(Color.CYAN);
        }
        else
        {
            selected[42]=0;
            seatcount--;
            jToggleButton14.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // TODO add your handling code here:
        A[50]="G2";
        if(jToggleButton15.isSelected()==true)
        {
            selected[50]=1;
            seatcount++;
            jToggleButton15.setBackground(Color.CYAN);
        }
        else
        {
            selected[50]=0;
            seatcount--;
            jToggleButton15.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        // TODO add your handling code here:
        A[58]="H2";
        if(jToggleButton16.isSelected()==true)
        {
            selected[58]=1;
            seatcount++;
            jToggleButton16.setBackground(Color.CYAN);
        }
        else
        {
            selected[58]=0;
            seatcount--;
            jToggleButton16.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        // TODO add your handling code here:
        A[10]="B2";
        if(jToggleButton17.isSelected()==true)
        {
            selected[10]=1;
            seatcount++;
            jToggleButton17.setBackground(Color.CYAN);
        }
        else
        {
            selected[10]=0;
            seatcount--;
            jToggleButton17.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // TODO add your handling code here:
        A[3]="A3";
        if(jToggleButton18.isSelected()==true)
        {
            selected[3]=1;
            seatcount++;
            jToggleButton18.setBackground(Color.CYAN);
        }
        else
        {
            selected[3]=0;
            seatcount--;
            jToggleButton18.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // TODO add your handling code here:
        A[19]="C3";
        if(jToggleButton19.isSelected()==true)
        {
            selected[19]=1;
            seatcount++;
            jToggleButton19.setBackground(Color.CYAN);
        }
        else
        {
            selected[19]=0;
            seatcount--;
            jToggleButton19.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // TODO add your handling code here:
        A[27]="D3";
        if(jToggleButton20.isSelected()==true)
        {
            selected[27]=1;
            seatcount++;
            jToggleButton20.setBackground(Color.CYAN);
        }
        else
        {
            selected[27]=0;
            seatcount--;
            jToggleButton20.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // TODO add your handling code here:
        A[11]="B3";
        if(jToggleButton21.isSelected()==true)
        {
            selected[11]=1;
            seatcount++;
            jToggleButton21.setBackground(Color.CYAN);
        }
        else
        {
            selected[11]=0;
            seatcount--;
            jToggleButton21.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // TODO add your handling code here:
        A[35]="E3";
        if(jToggleButton22.isSelected()==true)
        {
            selected[35]=1;
            seatcount++;
            jToggleButton22.setBackground(Color.CYAN);
        }
        else
        {
            selected[35]=1;
            seatcount--;
            jToggleButton22.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // TODO add your handling code here:
        A[43]="F3";
        if(jToggleButton23.isSelected()==true)
        {
            selected[43]=1;
            seatcount++;
            jToggleButton23.setBackground(Color.CYAN);
        }
        else
        {
            selected[43]=0;
            seatcount--;
            jToggleButton23.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
   A[51]="G3";
        if(jToggleButton24.isSelected()==true)
        {
            selected[51]=1;
            seatcount++;
            jToggleButton24.setBackground(Color.CYAN);
        }
        else
        {
            selected[51]=0;
            seatcount--;
            jToggleButton24.setBackground(Color.WHITE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
      A[59]="H3";
        if(jToggleButton25.isSelected()==true)
        {
            selected[59]=1;
            seatcount++;
            jToggleButton25.setBackground(Color.CYAN);
        }
        else
        {
            selected[59]=0;
            seatcount--;
            jToggleButton25.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        A[4]="A4";
        if(jToggleButton26.isSelected()==true)
        {
            selected[4]=1;
            seatcount++;
            jToggleButton26.setBackground(Color.CYAN);
        }
        else
        {
            selected[4]=0;
            seatcount--;
            jToggleButton26.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
       A[12]="B4";
        if(jToggleButton27.isSelected()==true)
        {
            selected[12]=1;
            seatcount++;
            jToggleButton27.setBackground(Color.CYAN);
        }
        else
        {
            selected[12]=0;
            seatcount--;
            jToggleButton27.setBackground(Color.WHITE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        A[20]="C4";
        if(jToggleButton28.isSelected()==true)
        {
            selected[20]=1;
            seatcount++;
            jToggleButton28.setBackground(Color.CYAN);
        }
        else
        {
            selected[20]=0;
            seatcount--;
            jToggleButton28.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
        A[28]="D4";
        if(jToggleButton29.isSelected()==true)
        {
            selected[28]=1;
            seatcount++;
            jToggleButton29.setBackground(Color.CYAN);
        }
        else
        {
            selected[28]=1;
            seatcount--;
            jToggleButton29.setBackground(Color.WHITE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton30ActionPerformed
        A[36]="E4";
        if(jToggleButton30.isSelected()==true)
        {
            selected[36]=1;
            seatcount++;
            jToggleButton30.setBackground(Color.CYAN);
        }
        else
        {
            selected[36]=0;
            seatcount--;
            jToggleButton30.setBackground(Color.WHITE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton30ActionPerformed

    private void jToggleButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton31ActionPerformed
        // TODO add your handling code here:
        A[44]="F4";
        if(jToggleButton31.isSelected()==true)
        {
            selected[44]=1;
            seatcount++;
            jToggleButton31.setBackground(Color.CYAN);
        }
        else
        {
            selected[44]=0;
            seatcount--;
            jToggleButton31.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton31ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        // TODO add your handling code here:
        A[52]="G4";
        if(jToggleButton32.isSelected()==true)
        {
            selected[52]=1;
            seatcount++;
            jToggleButton32.setBackground(Color.CYAN);
        }
        else
        {
            selected[52]=0;
            seatcount--;
            jToggleButton32.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
        // TODO add your handling code here:
        A[60]="H4";
        if(jToggleButton33.isSelected()==true)
        {
            selected[60]=1;
            seatcount++;
            jToggleButton33.setBackground(Color.CYAN);
        }
        else
        {
            selected[60]=0;
            seatcount--;
            jToggleButton33.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed

        // TODO add your handling code here:
        A[5]="A5";
        if(jToggleButton34.isSelected()==true)
        {
            selected[5]=1;
            seatcount++;
            jToggleButton34.setBackground(Color.CYAN);
        }
        else
        {
            selected[5]=0;
            seatcount--;
            jToggleButton34.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        // TODO add your handling code here:
        A[13]="B5";
        if(jToggleButton35.isSelected()==true)
        {
            selected[13]=1;
            seatcount++;
            jToggleButton35.setBackground(Color.CYAN);
        }
        else
        {
            selected[13]=0;
            seatcount--;
            jToggleButton35.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        // TODO add your handling code here:
        A[21]="C5";
        if(jToggleButton36.isSelected()==true)
        {
            selected[21]=1;
            seatcount++;
            jToggleButton36.setBackground(Color.CYAN);
        }
        else
        {
            selected[21]=0;
            seatcount--;
            jToggleButton36.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        // TODO add your handling code here:
        A[29]="D5";
        if(jToggleButton37.isSelected()==true)
        {
            selected[29]=1;
            seatcount++;
            jToggleButton37.setBackground(Color.CYAN);
        }
        else
        {
            selected[29]=0;
            seatcount--;
            jToggleButton37.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
             // TODO add your handling code here:
             A[37]="E5";
        if(jToggleButton38.isSelected()==true)
        {
            selected[37]=1;
            seatcount++;
            jToggleButton38.setBackground(Color.CYAN);
        }
        else
        {
            selected[37]=0;
            seatcount--;
            jToggleButton38.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        // TODO add your handling code here:
        A[45]="F5";
        if(jToggleButton39.isSelected()==true)
        {
            selected[45]=1;
            seatcount++;
            jToggleButton39.setBackground(Color.CYAN);
        }
        else
        {
            selected[45]=0;
            seatcount--;
            jToggleButton39.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton40ActionPerformed
        // TODO add your handling code here:
        A[53]="G5";
        if(jToggleButton40.isSelected()==true)
        {
            selected[53]=1;
            seatcount++;
            jToggleButton40.setBackground(Color.CYAN);
        }
        else
        {
            selected[53]=0;
            seatcount--;
            jToggleButton40.setBackground(Color.WHITE);
        }     
    }//GEN-LAST:event_jToggleButton40ActionPerformed

    private void jToggleButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton41ActionPerformed
        // TODO add your handling code here:
        A[61]="H5";
        if(jToggleButton41.isSelected()==true)
        {
            selected[61]=1;
            seatcount++;
            jToggleButton41.setBackground(Color.CYAN);
        }
        else
        {
            selected[61]=0;
            seatcount--;
            jToggleButton41.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton41ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        A[6]="A6";
        if(jToggleButton2.isSelected()==true)
        {
            selected[6]=1;
            seatcount++;
            jToggleButton2.setBackground(Color.CYAN);
        }
        else
        {
            selected[6]=0;
            seatcount--;
            jToggleButton2.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton44ActionPerformed
        // TODO add your handling code here:
        A[14]="B6";
        if(jToggleButton44.isSelected()==true)
        {
            selected[14]=1;
            seatcount++;
            jToggleButton44.setBackground(Color.CYAN);
        }
        else
        {
            selected[14]=0;
            selected[36]=1;
            seatcount--;
            jToggleButton44.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton44ActionPerformed

    private void jToggleButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton45ActionPerformed
        // TODO add your handling code here:
        A[22]="C6";
        if(jToggleButton45.isSelected()==true)
        {
            selected[22]=1;
            seatcount++;
            jToggleButton45.setBackground(Color.CYAN);
        }
        else
        {
            selected[22]=0;
            seatcount--;
            jToggleButton45.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton45ActionPerformed

    private void jToggleButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton46ActionPerformed
        // TODO add your handling code here:
        A[30]="D6";
        if(jToggleButton46.isSelected()==true)
        {
            selected[30]=1;
            seatcount++;
            jToggleButton46.setBackground(Color.CYAN);
        }
        else
        {
            selected[30]=0;
            seatcount--;
            jToggleButton46.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton46ActionPerformed

    private void jToggleButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton47ActionPerformed
        // TODO add your handling code here:
        A[38]="E6";
        if(jToggleButton47.isSelected()==true)
        {
            selected[38]=1;
            seatcount++;
            jToggleButton47.setBackground(Color.CYAN);
        }
        else
        {
            selected[38]=0;
            seatcount--;
            jToggleButton47.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton47ActionPerformed

    private void jToggleButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton48ActionPerformed
        // TODO add your handling code here:
        A[46]="F6";
        if(jToggleButton48.isSelected()==true)
        {
            selected[46]=1;
            seatcount++;
            jToggleButton48.setBackground(Color.CYAN);
        }
        else
        {
            selected[46]=0;
            seatcount--;
            jToggleButton48.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton48ActionPerformed

    private void jToggleButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton49ActionPerformed
        // TODO add your handling code here:
        A[54]="G6";
        if(jToggleButton49.isSelected()==true)
        {
            selected[54]=1;
            seatcount++;
            jToggleButton49.setBackground(Color.CYAN);
        }
        else
        {
            selected[54]=0;
            seatcount--;
            jToggleButton49.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton49ActionPerformed

    private void jToggleButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton50ActionPerformed
        // TODO add your handling code here:
        A[62]="H6";
        if(jToggleButton50.isSelected()==true)
        {
            selected[62]=1;
            seatcount++;
            jToggleButton50.setBackground(Color.CYAN);
        }
        else
        {
            selected[62]=0;
            seatcount--;
            jToggleButton50.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton50ActionPerformed

    private void jToggleButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton42ActionPerformed
        // TODO add your handling code here:
        A[15]="B7";
        if(jToggleButton42.isSelected()==true)
        {
            selected[15]=1;
            seatcount++;
            jToggleButton42.setBackground(Color.CYAN);
        }
        else
        {
            selected[15]=0;
            seatcount--;
            jToggleButton42.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton42ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         A[1]="A1";
        if(jToggleButton1.isSelected()==true)
        {
            selected[1]=1;
            seatcount++;
            jToggleButton1.setBackground(Color.CYAN);
        }
        else
        {
            selected[1]=0;
            seatcount--;
            jToggleButton1.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        A[9]="B1";
        if(jToggleButton8.isSelected()==true)
        {
            selected[9]=1;
            seatcount++;
            jToggleButton8.setBackground(Color.CYAN);
        }
        else
        {
            selected[9]=0;
            seatcount--;
            jToggleButton8.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        A[17]="C1";
        if(jToggleButton7.isSelected()==true)
        {
            selected[17]=1;
            seatcount++;
            jToggleButton7.setBackground(Color.CYAN);
        }
        else
        {
            selected[17]=0;
            seatcount--;
            jToggleButton7.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        A[25]="D1";
        if(jToggleButton6.isSelected()==true)
        {
            selected[25]=1;
            seatcount++;
            jToggleButton6.setBackground(Color.CYAN);
        }
        else
        {
            selected[25]=1;
            seatcount--;
            jToggleButton6.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        A[33]="E1";
        if(jToggleButton9.isSelected()==true)
        {
            selected[33]=1;
            seatcount++;
            jToggleButton9.setBackground(Color.CYAN);
        }
        else
        {
            selected[33]=1;
            seatcount--;
            jToggleButton9.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        A[41]="F1";
        if(jToggleButton5.isSelected()==true)
        {
            selected[41]=1;
            seatcount++;
            jToggleButton5.setBackground(Color.CYAN);
        }
        else
        {
            selected[41]=0;
            seatcount--;
            jToggleButton5.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        A[49]="G1";
        if(jToggleButton4.isSelected()==true)
        {
            selected[49]=1;
            seatcount++;
            jToggleButton4.setBackground(Color.CYAN);
        }
        else
        {
            selected[49]=0;
            seatcount--;
            jToggleButton4.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        A[57]="H1";
        if(jToggleButton3.isSelected()==true)
        {
            selected[57]=1;
            seatcount++;
            jToggleButton3.setBackground(Color.CYAN);
        }
        else
        {
            selected[57]=0;
            seatcount--;
            jToggleButton3.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton51ActionPerformed
        // TODO add your handling code here:
        A[7]="A7";
        if(jToggleButton51.isSelected()==true)
        {
            selected[7]=1;
            seatcount++;
            jToggleButton51.setBackground(Color.CYAN);
        }
        else
        {
            selected[7]=0;
            seatcount--;
            jToggleButton51.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton51ActionPerformed

    private void jToggleButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton52ActionPerformed
        // TODO add your handling code here:
        A[23]="C7";
        if(jToggleButton52.isSelected()==true)
        {
            selected[23]=1;
            seatcount++;
            jToggleButton52.setBackground(Color.CYAN);
        }
        else
        {
            selected[23]=0;
            seatcount--;
            jToggleButton52.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton52ActionPerformed

    private void jToggleButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton53ActionPerformed
        // TODO add your handling code here:
        A[31]="D7";
        if(jToggleButton53.isSelected()==true)
        {
            selected[31]=1;
            seatcount++;
            jToggleButton53.setBackground(Color.CYAN);
        }
        else
        {
            selected[30]=0;
            seatcount--;
            jToggleButton53.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton53ActionPerformed

    private void jToggleButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton54ActionPerformed
        // TODO add your handling code here:
        A[39]="E7";
        if(jToggleButton54.isSelected()==true)
        {
            selected[39]=1;
            seatcount++;
            jToggleButton54.setBackground(Color.CYAN);
        }
        else
        {
            selected[39]=0;
            seatcount--;
            jToggleButton54.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton54ActionPerformed

    private void jToggleButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton55ActionPerformed
        // TODO add your handling code here:
        A[47]="F7";
        if(jToggleButton55.isSelected()==true)
        {
            selected[47]=1;
            seatcount++;
            jToggleButton55.setBackground(Color.CYAN);
        }
        else
        {
            selected[47]=0;
            seatcount--;
            jToggleButton55.setBackground(Color.WHITE);
        }   
        
    }//GEN-LAST:event_jToggleButton55ActionPerformed

    private void jToggleButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton56ActionPerformed
        // TODO add your handling code here:
        A[55]="G7";
        if(jToggleButton56.isSelected()==true)
        {
            selected[55]=1;
            seatcount++;
            jToggleButton56.setBackground(Color.CYAN);
        }
        else
        {
            selected[55]=0;
            seatcount--;
            jToggleButton56.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton56ActionPerformed

    private void jToggleButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton57ActionPerformed
        // TODO add your handling code here:
        A[63]="H7";
        if(jToggleButton57.isSelected()==true)
        {
            selected[63]=1;
            seatcount++;
            jToggleButton57.setBackground(Color.CYAN);
        }
        else
        {
            selected[63]=0;
            seatcount--;
            jToggleButton57.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton57ActionPerformed

    private void jToggleButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton43ActionPerformed
        // TODO add your handling code here:
        A[8]="A8";
        if(jToggleButton43.isSelected()==true)
        {
            selected[8]=1;
            seatcount++;
            jToggleButton43.setBackground(Color.CYAN);
        }
        else
        {
            selected[8]=0;
            seatcount--;
            jToggleButton43.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton43ActionPerformed

    private void jToggleButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton58ActionPerformed
        // TODO add your handling code here:
        A[16]="B8";
        if(jToggleButton58.isSelected()==true)
        {
            selected[16]=1;
            seatcount++;
            jToggleButton58.setBackground(Color.CYAN);
        }
        else
        {
            selected[16]=0;
            seatcount--;
            jToggleButton58.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton58ActionPerformed

    private void jToggleButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton59ActionPerformed
        // TODO add your handling code here:
        A[24]="C8";
        if(jToggleButton59.isSelected()==true)
        {
            selected[24]=1;
            seatcount++;
            jToggleButton59.setBackground(Color.CYAN);
        }
        else
        {
            selected[24]=0;
            seatcount--;
            jToggleButton59.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton59ActionPerformed

    private void jToggleButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton60ActionPerformed
        // TODO add your handling code here:
        A[32]="D8";
        if(jToggleButton60.isSelected()==true)
        {
            selected[32]=1;
            seatcount++;
            jToggleButton60.setBackground(Color.CYAN);
        }
        else
        {
            selected[32]=0;
            seatcount--;
            jToggleButton60.setBackground(Color.WHITE);
        }   
    }//GEN-LAST:event_jToggleButton60ActionPerformed

    private void jToggleButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton61ActionPerformed
        // TODO add your handling code here:
        A[40]="E8";
        if(jToggleButton61.isSelected()==true)
        {
            selected[40]=1;
            seatcount++;
            jToggleButton61.setBackground(Color.CYAN);
        }
        else
        {
            selected[40]=1;
            seatcount--;
            jToggleButton61.setBackground(Color.WHITE);
        }  
    }//GEN-LAST:event_jToggleButton61ActionPerformed

    private void jToggleButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton62ActionPerformed
        // TODO add your handling code here:
        A[48]="F8";
        if(jToggleButton62.isSelected()==true)
        {
            selected[48]=1;
            seatcount++;
            jToggleButton62.setBackground(Color.CYAN);
        }
        else
        {
            selected[48]=0;
            seatcount--;
            jToggleButton62.setBackground(Color.WHITE);
        }  
    }//GEN-LAST:event_jToggleButton62ActionPerformed

    private void jToggleButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton63ActionPerformed
        // TODO add your handling code here:
        A[56]="G8";
        if(jToggleButton63.isSelected()==true)
        {
            selected[56]=1;
            seatcount++;
            jToggleButton63.setBackground(Color.CYAN);
        }
        else
        {
            selected[56]=0;
            seatcount--;
            jToggleButton63.setBackground(Color.WHITE);
        }  
    }//GEN-LAST:event_jToggleButton63ActionPerformed

    private void jToggleButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton64ActionPerformed
        // TODO add your handling code here:
        A[64]="H8";
        if(jToggleButton64.isSelected()==true)
        {
            selected[64]=1;
            seatcount++;
            jToggleButton64.setBackground(Color.CYAN);
        }
        else
        {
            selected[64]=0;
            seatcount--;
            jToggleButton64.setBackground(Color.WHITE);
        }  
    }//GEN-LAST:event_jToggleButton64ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{  
            //jTextField1.setText(Integer.toString(seatcount));
			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MTBS","root","shreyata@06");  
  

                        
			Statement stmt=con.createStatement();  
        for(int i=1;i<=64;i++)
        {
            if(selected[i]==1)
            {
               // int a=stmt.executeUpdate("insert into ddlj values ('"+A+"','0','0')");
                int b=stmt.executeUpdate("update "+movie+" set "+movie+time+"='1' where seat_no='"+A[i]+"';");
                if(!(A[i].equals("0")))
                {
                    s1= s1+A[i]+","; 
                }
            }
        }
        //ResultSet rs=stmt.executeQuery("Select * from '"+movie+"' where seat_no ='"+A[i]+"';");
        con.close();
        }
        catch(Exception e){ 
		e.printStackTrace();
		}
        PaymentOption p1= new PaymentOption(fname,email,movie,time,s1,seatcount);
        p1.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(TheatreSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheatreSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheatreSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheatreSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new TheatreSeats("\0","\0","\0","\0").setVisible(true);
                //TheatreSeats t1=new TheatreSeats(count);
        //t1.setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton51;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton53;
    private javax.swing.JToggleButton jToggleButton54;
    private javax.swing.JToggleButton jToggleButton55;
    private javax.swing.JToggleButton jToggleButton56;
    private javax.swing.JToggleButton jToggleButton57;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton59;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton60;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton62;
    private javax.swing.JToggleButton jToggleButton63;
    private javax.swing.JToggleButton jToggleButton64;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
