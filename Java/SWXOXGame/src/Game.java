
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sivri
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    private int pScore1 = 0;
    private int pScore2 = 0;
    
    public Game() {
        initComponents();
        
        BBox1.setEnabled(false);
        BBox2.setEnabled(false);
        BBox3.setEnabled(false);
        BBox4.setEnabled(false);
        BBox5.setEnabled(false);
        BBox6.setEnabled(false);
        BBox7.setEnabled(false);
        BBox8.setEnabled(false);
        BBox9.setEnabled(false);
        
        BScoreAdd1.setEnabled(false);
        BScoreAdd2.setEnabled(false);
        
        BRTable.setVisible(false);
        BRTable.setEnabled(false);
        
        BRGame.setVisible(false);
        BRTable.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFPName1 = new javax.swing.JTextField();
        TFPName2 = new javax.swing.JTextField();
        BStart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BBox3 = new javax.swing.JButton();
        BBox1 = new javax.swing.JButton();
        BBox2 = new javax.swing.JButton();
        BBox4 = new javax.swing.JButton();
        BBox5 = new javax.swing.JButton();
        BBox6 = new javax.swing.JButton();
        BBox7 = new javax.swing.JButton();
        BBox8 = new javax.swing.JButton();
        BBox9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LPName2 = new javax.swing.JLabel();
        LPName1 = new javax.swing.JLabel();
        LPScore1 = new javax.swing.JLabel();
        LPScore2 = new javax.swing.JLabel();
        LMessage = new javax.swing.JLabel();
        BScoreAdd1 = new javax.swing.JButton();
        BScoreAdd2 = new javax.swing.JButton();
        BRTable = new javax.swing.JButton();
        BRGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XOX Game");
        setBounds(new java.awt.Rectangle(550, 100, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player 2 Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 1 Name :");

        BStart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BStart.setText("Start Game");
        BStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TFPName1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BStart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TFPName2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFPName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(BStart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        BBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox3ActionPerformed(evt);
            }
        });

        BBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox1ActionPerformed(evt);
            }
        });

        BBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox2ActionPerformed(evt);
            }
        });

        BBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox4ActionPerformed(evt);
            }
        });

        BBox5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox5ActionPerformed(evt);
            }
        });

        BBox6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox6ActionPerformed(evt);
            }
        });

        BBox7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox7ActionPerformed(evt);
            }
        });

        BBox8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox8ActionPerformed(evt);
            }
        });

        BBox9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 51));

        LPName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LPName2.setForeground(new java.awt.Color(255, 255, 255));
        LPName2.setText("Player 2 Score :");

        LPName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LPName1.setForeground(new java.awt.Color(255, 255, 255));
        LPName1.setText("Player 1 Score :");

        LPScore1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LPScore1.setForeground(new java.awt.Color(255, 255, 255));
        LPScore1.setText("0");

        LPScore2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LPScore2.setForeground(new java.awt.Color(255, 255, 255));
        LPScore2.setText("0");

        LMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LMessage.setForeground(new java.awt.Color(255, 0, 0));

        BScoreAdd1.setText("Add");
        BScoreAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BScoreAdd1ActionPerformed(evt);
            }
        });

        BScoreAdd2.setText("Add");
        BScoreAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BScoreAdd2ActionPerformed(evt);
            }
        });

        BRTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BRTable.setText("Reset Table");
        BRTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRTableActionPerformed(evt);
            }
        });

        BRGame.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BRGame.setText("Reset Game");
        BRGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LPName1)
                            .addComponent(LPName2))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LPScore2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BScoreAdd2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LPScore1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BScoreAdd1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BRTable)
                        .addGap(18, 18, 18)
                        .addComponent(BRGame)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPName1)
                    .addComponent(LPScore1)
                    .addComponent(BScoreAdd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPName2)
                    .addComponent(LPScore2)
                    .addComponent(BScoreAdd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(LMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRGame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRGameActionPerformed
        
        LMessage.setText("");
        
        BStart.setEnabled(true);
        TFPName1.setEnabled(true);
        TFPName2.setEnabled(true);
        
        TFPName1.setText("");
        TFPName2.setText("");
        
        BBox1.setEnabled(false);
        BBox2.setEnabled(false);
        BBox3.setEnabled(false);
        BBox4.setEnabled(false);
        BBox5.setEnabled(false);
        BBox6.setEnabled(false);
        BBox7.setEnabled(false);
        BBox8.setEnabled(false);
        BBox9.setEnabled(false);
        
        BBox1.setText("");
        BBox2.setText("");
        BBox3.setText("");
        BBox4.setText("");
        BBox5.setText("");
        BBox6.setText("");
        BBox7.setText("");
        BBox8.setText("");
        BBox9.setText("");
        
        BScoreAdd1.setEnabled(false);
        BScoreAdd2.setEnabled(false);
        
        BRTable.setVisible(false);
        BRTable.setEnabled(false);
        
        BRGame.setVisible(false);
        BRTable.setVisible(false);
        
        pScore1 = 0;
        pScore2 = 0;
        
        LPScore1.setText(String.valueOf(pScore1));
        LPScore2.setText(String.valueOf(pScore2));
        
        LPName1.setText("Player 1 Name :");
        LPName2.setText("Player 2 Name :");
    }//GEN-LAST:event_BRGameActionPerformed

    private void BBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox1ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox1.setForeground(Color.BLACK);
            BBox1.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox1.setForeground(Color.RED);
            BBox1.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox1ActionPerformed

    private void BBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox2ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox2.setForeground(Color.BLACK);
            BBox2.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox2.setForeground(Color.RED);
            BBox2.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox2ActionPerformed

    private void BBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox3ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox3.setForeground(Color.BLACK);
            BBox3.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox3.setForeground(Color.RED);
            BBox3.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox3ActionPerformed

    private void BBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox4ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox4.setForeground(Color.BLACK);
            BBox4.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox4.setForeground(Color.RED);
            BBox4.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox4ActionPerformed

    private void BBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox5ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox5.setForeground(Color.BLACK);
            BBox5.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox5.setForeground(Color.RED);
            BBox5.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox5ActionPerformed

    private void BBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox6ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox6.setForeground(Color.BLACK);
            BBox6.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox6.setForeground(Color.RED);
            BBox6.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox6ActionPerformed

    private void BBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox7ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox7.setForeground(Color.BLACK);
            BBox7.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox7.setForeground(Color.RED);
            BBox7.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox7ActionPerformed

    private void BBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox8ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox8.setForeground(Color.BLACK);
            BBox8.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox8.setForeground(Color.RED);
            BBox8.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox8ActionPerformed

    private void BBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBox9ActionPerformed
        
        String nMove = JOptionPane.showInputDialog("Enter Your Next Move (X or O) :");
        
        if (nMove.equals("X") || nMove.equals("x"))
        {
            BBox9.setForeground(Color.BLACK);
            BBox9.setText("X");
        }
        else if (nMove.equals("O") || nMove.equals("o"))
        {
            BBox9.setForeground(Color.RED);
            BBox9.setText("O");
        }
        else if (nMove.equals(""))
        {
            LMessage.setText("Please Enter Your Move!");
        }
        else if (!nMove.equals("X") && !nMove.equals("O"))
        {
            LMessage.setText("Please Enter Your Move Correctly!");
        }
        
        xoxControl();
        tableControl();
    }//GEN-LAST:event_BBox9ActionPerformed

    private void BScoreAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BScoreAdd1ActionPerformed
        
        pScore1++;
        
        LPScore1.setText(String.valueOf(pScore1));
    }//GEN-LAST:event_BScoreAdd1ActionPerformed

    private void BScoreAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BScoreAdd2ActionPerformed
       
        pScore2++;
        
        LPScore2.setText(String.valueOf(pScore2));
    }//GEN-LAST:event_BScoreAdd2ActionPerformed

    private void BStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BStartActionPerformed
        
        if (!TFPName1.getText().equals("") && !TFPName2.getText().equals(""))
        {
            String p1Name = TFPName1.getText();
            String p2Name = TFPName2.getText();
        
            LPName1.setText(p1Name + " Score :");
            LPName2.setText(p2Name + " Score :");
            
            BBox1.setEnabled(true);
            BBox2.setEnabled(true);
            BBox3.setEnabled(true);
            BBox4.setEnabled(true);
            BBox5.setEnabled(true);
            BBox6.setEnabled(true);
            BBox7.setEnabled(true);
            BBox8.setEnabled(true);
            BBox9.setEnabled(true);
        
            BScoreAdd1.setEnabled(true);
            BScoreAdd2.setEnabled(true);
        
            BStart.setEnabled(false);
            TFPName1.setEnabled(false);
            TFPName2.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Fill the Fields for Starting!");
        }
        
        
    }//GEN-LAST:event_BStartActionPerformed

    private void BRTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRTableActionPerformed
        
        BBox1.setText("");
        BBox2.setText("");
        BBox3.setText("");
        BBox4.setText("");
        BBox5.setText("");
        BBox6.setText("");
        BBox7.setText("");
        BBox8.setText("");
        BBox9.setText("");
        
        BBox1.setEnabled(true);
        BBox2.setEnabled(true);
        BBox3.setEnabled(true);
        BBox4.setEnabled(true);
        BBox5.setEnabled(true);
        BBox6.setEnabled(true);
        BBox7.setEnabled(true);
        BBox8.setEnabled(true);
        BBox9.setEnabled(true);
        
    }//GEN-LAST:event_BRTableActionPerformed

    public void tableControl()
    {
        if(!BBox1.getText().equals("") && !BBox2.getText().equals("") && !BBox3.getText().equals("") &&
                !BBox4.getText().equals("") && !BBox5.getText().equals("") && !BBox6.getText().equals("") &&
                !BBox7.getText().equals("") && !BBox8.getText().equals("") && !BBox9.getText().equals(""))
        {
            BRTable.setVisible(true);
            BRTable.setEnabled(true);
            
            BRGame.setVisible(true);
            BRGame.setEnabled(true);
            
        }
        
    }
    
    public void xoxControl()
    {
        if(BBox1.getText().equals("X") && BBox2.getText().equals("O") && BBox3.getText().equals("X"))
        {
            BBox1.setEnabled(false);
            BBox2.setEnabled(false);
            BBox3.setEnabled(false);
        }
        if(BBox4.getText().equals("X") && BBox5.getText().equals("O") && BBox6.getText().equals("X"))
        {
            BBox4.setEnabled(false);
            BBox5.setEnabled(false);
            BBox6.setEnabled(false);
        }
        if(BBox7.getText().equals("X") && BBox8.getText().equals("O") && BBox9.getText().equals("X"))
        {
            BBox7.setEnabled(false);
            BBox8.setEnabled(false);
            BBox9.setEnabled(false);
        }
        if(BBox1.getText().equals("X") && BBox4.getText().equals("O") && BBox7.getText().equals("X"))
        {
            BBox1.setEnabled(false);
            BBox4.setEnabled(false);
            BBox7.setEnabled(false);
        }
        if(BBox2.getText().equals("X") && BBox5.getText().equals("O") && BBox8.getText().equals("X"))
        {
            BBox2.setEnabled(false);
            BBox5.setEnabled(false);
            BBox8.setEnabled(false);
        }
        if(BBox3.getText().equals("X") && BBox6.getText().equals("O") && BBox9.getText().equals("X"))
        {
            BBox3.setEnabled(false);
            BBox6.setEnabled(false);
            BBox9.setEnabled(false);
        }
        if(BBox1.getText().equals("X") && BBox5.getText().equals("O") && BBox9.getText().equals("X"))
        {
            BBox1.setEnabled(false);
            BBox5.setEnabled(false);
            BBox9.setEnabled(false);
        }
        if(BBox3.getText().equals("X") && BBox5.getText().equals("O") && BBox7.getText().equals("X"))
        {
            BBox3.setEnabled(false);
            BBox5.setEnabled(false);
            BBox7.setEnabled(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBox1;
    private javax.swing.JButton BBox2;
    private javax.swing.JButton BBox3;
    private javax.swing.JButton BBox4;
    private javax.swing.JButton BBox5;
    private javax.swing.JButton BBox6;
    private javax.swing.JButton BBox7;
    private javax.swing.JButton BBox8;
    private javax.swing.JButton BBox9;
    private javax.swing.JButton BRGame;
    private javax.swing.JButton BRTable;
    private javax.swing.JButton BScoreAdd1;
    private javax.swing.JButton BScoreAdd2;
    private javax.swing.JButton BStart;
    private javax.swing.JLabel LMessage;
    private javax.swing.JLabel LPName1;
    private javax.swing.JLabel LPName2;
    private javax.swing.JLabel LPScore1;
    private javax.swing.JLabel LPScore2;
    private javax.swing.JTextField TFPName1;
    private javax.swing.JTextField TFPName2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
