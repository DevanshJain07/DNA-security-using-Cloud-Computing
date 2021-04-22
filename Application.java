package javaapplication;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
 
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import java.util.Base64;

public class Application extends javax.swing.JFrame {

    String ext;
    String path;
    String textkey=""; 
    private static String keyyyy;
    private static ArrayList<String> text=new ArrayList<>();
    private static  String textWord;
    Client client;
    Server server;
     public  RSA rsa = new RSA();
     byte[] textkey2;
    private final int port = 12345;

    private LinkedList<Socket> clients = new LinkedList<Socket>();

    public Application() {
        initComponents();
    }
     
    public void activer (JInternalFrame fr){
        jInternalFrame1.setVisible(false);
        jInternalFrame3.setVisible(false);
        jInternalFrame2.setVisible(false);
        jInternalFrame4.setVisible(false);
        fr.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/min1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1070, 3, 40, 40);

        jDesktopPane1.setBackground(new java.awt.Color(246, 248, 250));
        jDesktopPane1.setForeground(new java.awt.Color(246, 248, 250));
        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 248, 250));

        jLabel8.setBackground(new java.awt.Color(51, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/gif5.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 910, 580));

        jDesktopPane1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 950, 620));

        jInternalFrame2.setVisible(false);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(246, 248, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/importbutton1.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/exportbutton1.jpg"))); // NOI18N
        jLabel11.setEnabled(false);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/encrypt1.jpg"))); // NOI18N
        jLabel12.setEnabled(false);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/decrypt1.jpg"))); // NOI18N
        jLabel13.setEnabled(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/importkey1.jpg"))); // NOI18N
        jLabel14.setEnabled(false);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(28, 28, 28))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(26, 26, 26))
        );

        jInternalFrame2.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 910, 580));

        jDesktopPane1.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 950, 620));

        jInternalFrame3.setVisible(false);
        jInternalFrame3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 248, 250));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jScrollPane3.setViewportView(jTextArea3);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("IP");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/import1.png"))); // NOI18N
        // jLabel20.setToolTipText("Importer la cl�");
        jLabel20.setToolTipText("Importer the Key�");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel20MouseReleased(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/export1.png"))); // NOI18N
        // jLabel21.setToolTipText("Exporter la cl�");
        jLabel21.setToolTipText("Export the Key�");

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel21MouseReleased(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/encrypt1.jpg"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/decrypt1.jpg"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel23MouseReleased(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 1, true));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/send1.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel24MouseReleased(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/start1.jpg"))); // NOI18N
        // jLabel25.setToolTipText("D�marrer le Serveur");
        jLabel25.setToolTipText("Start the Server");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel25MouseReleased(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/client1.jpg"))); // NOI18N
        // jLabel26.setToolTipText("Connexion client");
        jLabel26.setToolTipText("Connect with the client");

        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel26MouseReleased(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("localhost");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Message");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("�");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addContainerGap())
                    .addComponent(jSeparator3)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel20)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addComponent(jLabel26))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(430, 430, 430))))
        );

        jInternalFrame3.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 580));

        jDesktopPane1.add(jInternalFrame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 950, 620));

        jInternalFrame4.setVisible(false);
        jInternalFrame4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(246, 248, 250));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/about.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame4.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 910, 580));

        jDesktopPane1.add(jInternalFrame4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 950, 620));

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(270, 98, 887, 572);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/cloud1.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(23, 300, 239, 76);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/qt1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1120, 3, 40, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/security1.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(23, 390, 239, 76);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/home1.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(23, 210, 239, 76);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 110, 80, 70);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(120, 130, 130, 40);

        jSeparator2.setForeground(new java.awt.Color(0, 120, 215));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(23, 195, 238, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/about1.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(23, 480, 239, 76);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Data security in cloud computing");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(100, 0, 920, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/images/app2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1180, 683);

        setSize(new java.awt.Dimension(1175, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
   ImageIcon A= new ImageIcon(getClass().getResource("images/qt2.png"));
    jLabel2.setIcon(A);    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
 ImageIcon A= new ImageIcon(getClass().getResource("images/qt1.png"));
    jLabel2.setIcon(A);      }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
 ImageIcon A= new ImageIcon(getClass().getResource("images/qt2.png"));
    jLabel2.setIcon(A);      }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
 ImageIcon A= new ImageIcon(getClass().getResource("images/qt1.png"));
    jLabel2.setIcon(A);      }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    this.setState(Application.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
   ImageIcon A= new ImageIcon(getClass().getResource("images/min2.png"));
    jLabel4.setIcon(A);  
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
   ImageIcon A= new ImageIcon(getClass().getResource("images/min1.png"));
    jLabel4.setIcon(A); 
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
     ImageIcon A= new ImageIcon(getClass().getResource("images/min2.png"));
    jLabel4.setIcon(A); 
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
   ImageIcon A= new ImageIcon(getClass().getResource("images/min1.png"));
    jLabel4.setIcon(A);     }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     activer(jInternalFrame3);
   
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    
    activer(jInternalFrame2);    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
    ImageIcon A= new ImageIcon(getClass().getResource("images/cloud2.jpg"));
    jLabel7.setIcon(A);     }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
 ImageIcon A= new ImageIcon(getClass().getResource("images/cloud1.jpg"));
    jLabel7.setIcon(A);     }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
 ImageIcon A= new ImageIcon(getClass().getResource("images/cloud2.jpg"));
    jLabel7.setIcon(A);     }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
 ImageIcon A= new ImageIcon(getClass().getResource("images/cloud1.jpg"));

    jLabel7.setIcon(A);     }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
     ImageIcon A= new ImageIcon(getClass().getResource("images/security2.jpg"));
    jLabel5.setIcon(A);     }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
 ImageIcon A= new ImageIcon(getClass().getResource("images/security1.jpg"));
    jLabel5.setIcon(A);     }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
     ImageIcon A= new ImageIcon(getClass().getResource("images/security2.jpg"));
     jLabel5.setIcon(A);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
    ImageIcon A= new ImageIcon(getClass().getResource("images/security1.jpg"));
    jLabel5.setIcon(A);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
   activer(jInternalFrame1);
    
     }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
   ImageIcon A= new ImageIcon(getClass().getResource("images/home2.jpg"));
    jLabel6.setIcon(A);    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
    ImageIcon A= new ImageIcon(getClass().getResource("images/home1.jpg"));
    jLabel6.setIcon(A);    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
    ImageIcon A= new ImageIcon(getClass().getResource("images/home2.jpg"));
    jLabel6.setIcon(A);    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
    ImageIcon A= new ImageIcon(getClass().getResource("images/home1.jpg"));
    jLabel6.setIcon(A);    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       
        JFileChooser window2=new JFileChooser();
        FileNameExtensionFilter filetxt=new FileNameExtensionFilter("text","txt");
        FileNameExtensionFilter filedoc=new FileNameExtensionFilter("word","docx");
            window2.setFileFilter(filetxt);
            window2.setFileFilter(filedoc);
            window2.setFileFilter(null);
	window2.setDialogTitle("Import file");
	int value2=window2.showOpenDialog(null);
 	
	if(value2==JFileChooser.APPROVE_OPTION) {
	File file2= window2.getSelectedFile();
        path= file2.getAbsolutePath();
        ext=path.substring(path.lastIndexOf("."));
        jLabel14.enable();
        ImageIcon D= new ImageIcon(getClass().getResource("images/importkey1.jpg"));
        jLabel14.setIcon(D);
 
        
       if(ext.contains(".docx")) {
      
 		try {
                   XWPFDocument doc=new XWPFDocument(new FileInputStream(file2));
	          XWPFWordExtractor ex =new XWPFWordExtractor(doc);
	           textWord=ex.getText();
                   jTextArea1.setText("");
                  jTextArea1.setText(textWord);
                } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                }
                
           
    ImageIcon A= new ImageIcon(getClass().getResource("images/word.png"));
    jLabel15.setIcon(A); 
         
    }//GEN-LAST:event_jLabel10MouseClicked
     if(ext.contains(".txt")) {
 
   try{
        FileReader reader=new FileReader(path);
	BufferedReader buffer=new BufferedReader(reader); 
	 String line="";
         text.clear();
         while((line=buffer.readLine())!=null){           
       text.add(line);
   }
            jTextArea1.setText("");
         	 for(String ligne:text) {
         jTextArea1.append(ligne);
         jTextArea1.append("\n");
                 }
         if(buffer!=null){
             buffer.close();
         }
   }
    catch(IOException e) {
          JOptionPane.showMessageDialog(null,e);
            }
 ImageIcon B= new ImageIcon(getClass().getResource("images/txt.png"));
    jLabel15.setIcon(B);
        }
    }
    }
    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/importbutton2.jpg"));
    jLabel10.setIcon(A);     }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/importbutton1.jpg"));
    jLabel10.setIcon(A);     }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/importbutton2.jpg"));
    jLabel10.setIcon(A);    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/importbutton1.jpg"));
    jLabel10.setIcon(A);    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
 if(!jTextArea1.getText().equals(""))  {
       JFileChooser fs=new JFileChooser();
       fs.setDialogTitle("Save file");
       FileNameExtensionFilter filetxt=new FileNameExtensionFilter("text","txt");
        FileNameExtensionFilter filedoc=new FileNameExtensionFilter("word","docx");
            fs.setFileFilter(filetxt);
            fs.setFileFilter(filedoc);
            fs.setFileFilter(null);
            int result=fs.showSaveDialog(null);
            if(result== JFileChooser.APPROVE_OPTION){
                String Contenant=jTextArea1.getText();
                File file=fs.getSelectedFile();
                if(ext.contains(".docx")){
                  try {  
              XWPFDocument wordDecry=new XWPFDocument();
              XWPFParagraph p2=wordDecry.createParagraph();
              XWPFRun run2=p2.createRun();
              run2.setText(Contenant);
                   
               FileOutputStream output2 = new FileOutputStream(file.getPath()); 
               wordDecry.write(output2);
               output2.close();
  
                    } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
                }
                else if (ext.contains(".txt")){
            try{
                FileWriter fw= new FileWriter(file.getPath());
                fw.write(Contenant);
                fw.flush();
                fw.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
                }
            }
 }  
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton2.jpg"));
    jLabel11.setIcon(A);    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
    jLabel11.setIcon(A);     }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton2.jpg"));
    jLabel11.setIcon(A);     }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
    jLabel11.setIcon(A);     }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
    
        if("".equals(jTextField1.getText())){
        }
        else{ keyyyy=jTextField1.getText();
       if(ext.contains(".docx")) {
          
                 String textCrypted = AES.encrypt(textWord, keyyyy) ;
                 
		 String textDecrypte1 = AES.decrypt(textCrypted, keyyyy) ;
                 textWord = new String(textDecrypte1.getBytes(),Charset.forName("UTF-8"));
                 
                  String textDecrypte2 = AES.decrypt(textWord, keyyyy) ;
                 textWord = new String(textDecrypte2.getBytes(),Charset.forName("UTF-8"));

         jTextArea1.setText("");
         jTextArea1.append(textWord);    
          jLabel11.enable();
         ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
         jLabel11.setIcon(A); 
           
    
    }//GEN-LAST:event_jLabel13MouseClicked

 if(ext.contains(".txt")) {
     	 for(int i=0;i<text.size();i++) {
		 String encryptedString = AES.encrypt(text.get(i), keyyyy) ;
		 text.set(i, encryptedString);
	 }
     
 for(int i=0;i<text.size();i++) {
		 String decryptedString = AES.decrypt(text.get(i), keyyyy) ;
               String decryptedString2 = new String(decryptedString.getBytes(),Charset.forName("UTF-8"));

		 text.set(i, decryptedString2);
	 }
 for(int i=0;i<text.size();i++) {
		 String decryptedString = AES.decrypt(text.get(i), keyyyy) ;
               String decryptedString2 = new String(decryptedString.getBytes(),Charset.forName("UTF-8"));

		 text.set(i, decryptedString2);
	 }
 
                         jTextArea1.setText("");
		 for(String ligne:text) {
         jTextArea1.append(ligne);
         jTextArea1.append("\n");
                 }
    jLabel11.enable();
     ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
     jLabel11.setIcon(A); 
    
   
   
    
    }
}
}
    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt2.jpg"));
    jLabel13.setIcon(A);     }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
    jLabel13.setIcon(A);     }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt2.jpg"));
    jLabel13.setIcon(A);    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
    jLabel13.setIcon(A);    }//GEN-LAST:event_jLabel13MouseReleased
   
    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt2.jpg"));
    jLabel12.setIcon(A);    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
    jLabel12.setIcon(A);      }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt2.jpg"));
    jLabel12.setIcon(A);      }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
    jLabel12.setIcon(A);      }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        JFileChooser window1=new JFileChooser();
        String filekey="";
	window1.setDialogTitle("Import the key");
        FileNameExtensionFilter filetxt=new FileNameExtensionFilter("text","txt");
            window1.setFileFilter(filetxt);
	int value1=window1.showOpenDialog(null);
  	if(value1==JFileChooser.APPROVE_OPTION) {
		 BufferedReader buffer=null;
	        File file1=null;
	        file1= window1.getSelectedFile().getAbsoluteFile(); 
	        String path= file1.getAbsolutePath();
    try {
        buffer = new BufferedReader(new FileReader(path));  
        filekey =buffer.readLine();
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null,ex);    }
	}
        jTextField1.setText(filekey);
        jLabel13.enable();
        jLabel12.enable();
        ImageIcon E= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
    jLabel13.setIcon(E);
     ImageIcon F= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
        jLabel12.setIcon(F);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/importkey2.jpg"));
    jLabel14.setIcon(A);      }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/importkey1.jpg"));
    jLabel14.setIcon(A);    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/importkey2.jpg"));
    jLabel14.setIcon(A);    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/importkey1.jpg"));
    jLabel14.setIcon(A);    }//GEN-LAST:event_jLabel14MouseReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
activer(jInternalFrame4);    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/about2.jpg"));
    jLabel18.setIcon(A);    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/about1.jpg"));
    jLabel18.setIcon(A);     }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/about2.jpg"));
    jLabel18.setIcon(A);     }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/about1.jpg"));
    jLabel18.setIcon(A);     }//GEN-LAST:event_jLabel18MouseReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/import2.png"));
    jLabel20.setIcon(A);    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/import1.png"));
    jLabel20.setIcon(A);      }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/import2.png"));
    jLabel20.setIcon(A);      }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/import1.png"));
    jLabel20.setIcon(A);      }//GEN-LAST:event_jLabel20MouseReleased

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/export2.png"));
    jLabel21.setIcon(A);      }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/export1.png"));
    jLabel21.setIcon(A);    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/export2.png"));
    jLabel21.setIcon(A);    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/export1.png"));
    jLabel21.setIcon(A);    }//GEN-LAST:event_jLabel21MouseReleased

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/send2.jpg"));
    jLabel24.setIcon(A);     }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
    ImageIcon A= new ImageIcon(getClass().getResource("images/send1.jpg"));
    jLabel24.setIcon(A);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/send2.jpg"));
    jLabel24.setIcon(A);    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/send1.jpg"));
    jLabel24.setIcon(A);    }//GEN-LAST:event_jLabel24MouseReleased

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt2.jpg"));
    jLabel22.setIcon(A);    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
    jLabel22.setIcon(A);    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt2.jpg"));
    jLabel22.setIcon(A);    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
    jLabel22.setIcon(A);    }//GEN-LAST:event_jLabel22MouseReleased

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt2.jpg"));
    jLabel23.setIcon(A);    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
    jLabel23.setIcon(A);     }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt2.jpg"));
    jLabel23.setIcon(A);     }//GEN-LAST:event_jLabel23MousePressed

    private void jLabel23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
    jLabel23.setIcon(A);     }//GEN-LAST:event_jLabel23MouseReleased

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/start2.jpg"));
    jLabel25.setIcon(A);     }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/start1.jpg"));
    jLabel25.setIcon(A);     }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/start2.jpg"));
    jLabel25.setIcon(A);     }//GEN-LAST:event_jLabel25MousePressed

    private void jLabel25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/start1.jpg"));
    jLabel25.setIcon(A);     }//GEN-LAST:event_jLabel25MouseReleased

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
ImageIcon A= new ImageIcon(getClass().getResource("images/client2.jpg"));
    jLabel26.setIcon(A);     }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
ImageIcon A= new ImageIcon(getClass().getResource("images/client1.jpg"));
    jLabel26.setIcon(A);     }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
ImageIcon A= new ImageIcon(getClass().getResource("images/client2.jpg"));
    jLabel26.setIcon(A);     }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseReleased
ImageIcon A= new ImageIcon(getClass().getResource("images/client1.jpg"));
    jLabel26.setIcon(A);     }//GEN-LAST:event_jLabel26MouseReleased

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
 JFileChooser window1=new JFileChooser();
        
	window1.setDialogTitle("Import the Key");
        FileNameExtensionFilter filetxt=new FileNameExtensionFilter("text","txt");
            window1.setFileFilter(filetxt);
	int value1=window1.showOpenDialog(null);
  	if(value1==JFileChooser.APPROVE_OPTION) {
		 BufferedReader buffer=null;
	        File file1=null;
	        file1= window1.getSelectedFile().getAbsoluteFile(); 
	        String path= file1.getAbsolutePath();
    try {
        buffer = new BufferedReader(new FileReader(path));  
        textkey =buffer.readLine();
        jTextField2.setText(textkey);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null,ex);    }
	}
        
                 }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
   
        server= new Server(jTextArea3);
        Thread t = new Thread(server);
        t.start();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
      String name=jLabel17.getText();
       String host=jTextField4.getText();
     
        client= new Client(jTextArea2,name,host);
        Thread t = new Thread(client);
        t.start();    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
     String msg = jTextField2.getText();
     String name=jTextField3.getText();
     String in=jLabel17.getText();
     if(!jTextField2.getText().equals("") && !jTextField3.getText().equals("") ){
          msg+="@"+name;
          msg+="@"+in;
        client.sendermsg(msg);
jTextField2.setText("");
          }//GEN-LAST:event_jLabel24MouseClicked
    }
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
   jLabel12.enable();
            ImageIcon A= new ImageIcon(getClass().getResource("images/encrypt1.jpg"));
            jLabel12.setIcon(A);
               jLabel13.enable();
            ImageIcon B= new ImageIcon(getClass().getResource("images/decrypt1.jpg"));
            jLabel13.setIcon(B); 
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
  if("".equals(jTextField1.getText())){
        }
else{
            keyyyy=jTextField1.getText();
         
        if(ext.contains(".docx")) {
             
		 String textCrypted = AES.encrypt(textWord, keyyyy) ;
                 textWord=textCrypted;
		 jTextArea1.setText("");
                 jTextArea1.setText(textWord);
        jLabel11.enable();
        ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
        jLabel11.setIcon(A); 
	     }                                    
 
            if(ext.contains(".txt")) {
                	 for(int i=0;i<text.size();i++) {
		 String encryptedString = AES.encrypt(text.get(i), keyyyy) ;
		 text.set(i, encryptedString);
	 }
                         jTextArea1.setText("");
		 for(String line:text) {
         jTextArea1.append(line);
         jTextArea1.append("\n");
                 }
                   jLabel11.enable();
                  ImageIcon A= new ImageIcon(getClass().getResource("images/exportbutton1.jpg"));
                  jLabel11.setIcon(A); 
        
}
}
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
     if(!jTextField2.getText().equals("" )){
        String text=jTextField2.getText();
      textkey2 = rsa.encryptRSA(text.getBytes());
    
        jTextField2.setText(Base64.getEncoder().encodeToString(textkey2));
      
        
     }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
 /*  if(jTextField2.getText()!=null){
     String text=jTextField2.getText(); 
      
     byte[] textkey3 = rsa.decryptRSA(Base64.getMimeDecoder().decode(text));
 
       jTextField2.setText(new String(textkey3) );
     }    else */
        if(!jTextArea2.getText().equals(""))  {
       String message=jTextArea2.getText();
         String[] tableau=message.split(":");
         String text=tableau[tableau.length-1];
   //      System.out.println(tableau[tableau.length-1]);
         byte[] textkey4 = rsa.decryptRSA(Base64.getMimeDecoder().decode(text));
    
       jTextField2.setText( new String(textkey4) );   
      
     }    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
  if(!jTextField2.getText().equals(""))  {
        JFileChooser fs=new JFileChooser();
       fs.setDialogTitle("Save the Key");
            int result=fs.showSaveDialog(null);
            if(result== JFileChooser.APPROVE_OPTION){
                String Contenant=jTextField2.getText();
                File file=fs.getSelectedFile();

            try{
                FileWriter fw= new FileWriter(file.getPath());
                fw.write(Contenant);
                fw.flush();
                fw.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
                
            }    }//GEN-LAST:event_jLabel21MouseClicked
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
