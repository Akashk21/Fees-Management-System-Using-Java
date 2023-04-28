
package feemanagement;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentLogged extends javax.swing.JDialog {

    
    public StudentLogged() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Bg_ScrollPane2 = new javax.swing.JScrollPane();
        items = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        rad = new javax.swing.JTextField();
        sm = new javax.swing.JTextField();
        labf = new javax.swing.JTextField();
        lb = new javax.swing.JTextField();
        ef = new javax.swing.JTextField();
        im = new javax.swing.JTextField();
        msf = new javax.swing.JTextField();
        ff = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        logout = new javax.swing.JLabel();
        Student_Name = new javax.swing.JLabel();
        Batch = new javax.swing.JLabel();
        RegNo = new javax.swing.JLabel();
        Roll = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        rn = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        rln = new javax.swing.JTextField();
        totalcost = new javax.swing.JTextField();
        tc = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        total = new javax.swing.JButton();
        getrecipt = new javax.swing.JButton();
        printrecipt = new javax.swing.JButton();
        print_area = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        total1 = new javax.swing.JButton();
        total2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        body.setBackground(new java.awt.Color(0, 204, 204));

        items.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Admission Fee");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox18.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox18.setText("Re-Admission Fee");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox19.setText("Semester Fee");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox20.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox20.setText("Lab Fee");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox21.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox21.setText("Library Fee");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox22.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox22.setText("Examinatiom Fee");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox23.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox23.setText("Improvement Fee");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox24.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox24.setText("Marks Sheet Fee ");
        jCheckBox24.setActionCommand(" Chicken BBQ");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox25.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox25.setText("Fine/ Late Fee");
        jCheckBox25.setActionCommand("");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        rad.setEditable(false);
        rad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        rad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rad.setText("0");
        rad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActionPerformed(evt);
            }
        });

        sm.setEditable(false);
        sm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        sm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sm.setText("0");
        sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smActionPerformed(evt);
            }
        });

        labf.setEditable(false);
        labf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labf.setText("0");
        labf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labfActionPerformed(evt);
            }
        });

        lb.setEditable(false);
        lb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lb.setText("0");
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });

        ef.setEditable(false);
        ef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ef.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ef.setText("0");
        ef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efActionPerformed(evt);
            }
        });

        im.setEditable(false);
        im.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        im.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        im.setText("0");
        im.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imActionPerformed(evt);
            }
        });

        msf.setEditable(false);
        msf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        msf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        msf.setText("0");
        msf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msfActionPerformed(evt);
            }
        });

        ff.setEditable(false);
        ff.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ff.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ff.setText("0");
        ff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffActionPerformed(evt);
            }
        });

        ad.setEditable(false);
        ad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ad.setText("0");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsLayout = new javax.swing.GroupLayout(items);
        items.setLayout(itemsLayout);
        itemsLayout.setHorizontalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161)
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ad)
                            .addComponent(rad)))
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCheckBox21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ff, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(msf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(labf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        itemsLayout.setVerticalGroup(
            itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(rad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(labf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox21)
                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox22)
                    .addComponent(ef, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox23)
                    .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox24)
                    .addComponent(msf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox25)
                    .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Bg_ScrollPane2.setViewportView(items);

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        Student_Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        Student_Name.setForeground(new java.awt.Color(255, 255, 255));
        Student_Name.setText("Student Name :");

        Batch.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        Batch.setForeground(new java.awt.Color(255, 255, 255));
        Batch.setText("Batch No:");

        RegNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        RegNo.setForeground(new java.awt.Color(255, 255, 255));
        RegNo.setText("Registation No:");

        Roll.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        Roll.setForeground(new java.awt.Color(255, 255, 255));
        Roll.setText("Roll No:");

        Department.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        Department.setForeground(new java.awt.Color(255, 255, 255));
        Department.setText("Department:");

        sn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        sn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        rn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        rn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        bn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        bn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        rln.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        rln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlnActionPerformed(evt);
            }
        });

        totalcost.setEditable(false);
        totalcost.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        totalcost.setText(" Total Cost");
        totalcost.setBorder(null);
        totalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostActionPerformed(evt);
            }
        });

        tc.setEditable(false);
        tc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        getrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getrecipt.setText("Get Receipt");
        getrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getreciptActionPerformed(evt);
            }
        });

        printrecipt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        printrecipt.setText("Print Receipt");
        printrecipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreciptActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        area.setRows(5);
        print_area.setViewportView(area);

        total1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        total1.setText("Exit");
        total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total1ActionPerformed(evt);
            }
        });

        total2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        total2.setText("Pay");
        total2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Batch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Student_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Bg_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bodyLayout.createSequentialGroup()
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sn)
                                .addComponent(rn)
                                .addComponent(bn)
                                .addComponent(rln)
                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyLayout.createSequentialGroup()
                        .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(getrecipt)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(logout))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(printrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(print_area, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Student_Name))
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegNo))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Batch))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Roll)
                            .addComponent(rln, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Department)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Bg_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(total)
                                    .addComponent(total1)))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Reset)
                                    .addComponent(total2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(print_area, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getrecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1185, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            ad.setEditable(true);
            ad.setText("20000");
            ad.requestFocus();
        } else {
            ad.setEditable(false);
            ad.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        if (jCheckBox18.isSelected()) {
            rad.setEditable(true);
            rad.setText("20000");
            rad.requestFocus();
        } else {
            rad.setEditable(false);
            rad.setText("0");
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        if (jCheckBox19.isSelected()) {
            sm.setEditable(true);
            sm.setText("10500");
            sm.requestFocus();
        } else {
            sm.setEditable(false);
            sm.setText("0");
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        if (jCheckBox20.isSelected()) {
            labf.setEditable(true);
            labf.setText("500");
            labf.requestFocus();
        } else {
            labf.setEditable(false);
            labf.setText("0");
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        if (jCheckBox21.isSelected()) {
            lb.setEditable(true);
            lb.setText("2000");
            lb.requestFocus();
        } else {
            lb.setEditable(false);
            lb.setText("0");
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        if (jCheckBox22.isSelected()) {
            ef.setEditable(true);
            ef.setText("500");
            ef.requestFocus();
        } else {
            ef.setEditable(false);
            ef.setText("0");
        }
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        if (jCheckBox23.isSelected()) {
            im.setEditable(true);
            im.setText("2500");
            im.requestFocus();
        } else {
            im.setEditable(false);
            im.setText("0");
        }
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        if (jCheckBox24.isSelected()) {
            msf.setEditable(true);
            msf.setText("500");
            msf.requestFocus();
        } else {
            msf.setEditable(false);
            msf.setText("0");
        }
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        if (jCheckBox25.isSelected()) {
            ff.setEditable(true);
            ff.setText("100");
            ff.requestFocus();
        } else {
            ff.setEditable(false);
            ff.setText("0");
        }
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void radActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radActionPerformed

    private void smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smActionPerformed

    private void labfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labfActionPerformed

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void efActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efActionPerformed

    private void imActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imActionPerformed

    private void msfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msfActionPerformed

    private void ffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ffActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Home log = new Home();
            this.dispose();
            log.show();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void rlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlnActionPerformed

    private void totalcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcostActionPerformed

    private void tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        //area null
        area.setText(null);
        bn.setText(null);
        rln.setText(null);
        sn.setText(null);
        d.setText(null);
        rn.setText(null);

        ff.setText("0");

        ef.setText("0");

        lb.setText("0");
        rad.setText("0");

        im.setText("0");
        msf.setText("0");

        ad.setText("0");

        sm.setText("0");

        labf.setText("0");

        tc.setText(null);

        //checkbox null

        jCheckBox1.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);

        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);

    }//GEN-LAST:event_ResetActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

        double EFR = Double.parseDouble(ad.getText());

        double BM = Double.parseDouble(ff.getText());

        double CC = Double.parseDouble(ef.getText());

        double CF = Double.parseDouble(lb.getText());
        double CFR = Double.parseDouble(rad.getText());

        double CS = Double.parseDouble(im.getText());
        double CSK = Double.parseDouble(msf.getText());

        double PFR = Double.parseDouble(sm.getText());

        double SFR = Double.parseDouble(labf.getText());

        //.................calculation.................................

        double total =BM +CC+CF+CFR+CS+CSK+EFR+PFR+SFR ;

        //.................show values in text fild...................

        String item_total = String.format("%3f", total);
        tc.setText((String) item_total);
    }//GEN-LAST:event_totalActionPerformed

    private void getreciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getreciptActionPerformed

        // decoration
        area.setText("*********************************\n");
        area.setText(area.getText() + "******   Payment Recipt   *******\n");
        area.setText(area.getText() + "*********************************\n");

        //Date
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "" + date + "\n");

        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + "---------------------------------\n");
        // items

        area.setText(area.getText() + " Name: " + sn.getText() + "\n");
        area.setText(area.getText() + " Department: " + d.getText() + "\n");
        area.setText(area.getText() + " Batch No: " + bn.getText() + "\n");
        area.setText(area.getText() + " Registation No: " + rn.getText() + "\n");
        area.setText(area.getText() + " Roll no: " + rln.getText() + "\n\n");
        area.setText(area.getText() + " Discriptation         Amounts\n");
        area.setText(area.getText() + "---------------------------------\n");
        if (jCheckBox1.isSelected()) {
            area.setText(area.getText() + " Admission Fee............" + ad.getText() + "\n");
        }

        if (jCheckBox18.isSelected()) {
            area.setText(area.getText() + " Re-Admission Fee........." + rad.getText() + "\n");
        }
        if (jCheckBox19.isSelected()) {
            area.setText(area.getText() + " Semester Fee............." + sm.getText() + "\n");
        }
        if (jCheckBox20.isSelected()) {
            area.setText(area.getText() + " Lab Fee.................." + labf.getText() + "\n");
        }
        if (jCheckBox21.isSelected()) {
            area.setText(area.getText() + " Library Fee.............." + lb.getText() + "\n");
        }
        if (jCheckBox22.isSelected()) {
            area.setText(area.getText() + " Examination Fee.........." + ef.getText() + "\n");
        }
        if (jCheckBox23.isSelected()) {
            area.setText(area.getText() + " Improvement Fee.........." + im.getText() + "\n");
        }
        if (jCheckBox24.isSelected()) {
            area.setText(area.getText() + " Marks Sheet Fee.........." + msf.getText() + "\n");
        }
        if (jCheckBox25.isSelected()) {
            area.setText(area.getText() + " Fine/Late fee............" + ff.getText() + "\n");
        }

        area.setText(area.getText() + "---------------------------------\n");

        //bill

        area.setText(area.getText() + " Total Cost       " + tc.getText()+"BDT" + "\n");
        area.setText(area.getText() + "---------------------------------\n\n");
    }//GEN-LAST:event_getreciptActionPerformed

    private void printreciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreciptActionPerformed
        try {
            area.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printreciptActionPerformed

    private void total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total1ActionPerformed

        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_total1ActionPerformed

    private void total2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total2ActionPerformed
        JOptionPane.showMessageDialog(null, "Payment Successful! Have A Good Day!!");
    }//GEN-LAST:event_total2ActionPerformed
  
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
            java.util.logging.Logger.getLogger(StudentLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                StudentLogged dialog = new StudentLogged(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogged().setVisible(true);
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Batch;
    private javax.swing.JScrollPane Bg_ScrollPane2;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel RegNo;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Roll;
    private javax.swing.JLabel Student_Name;
    private javax.swing.JTextField ad;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField bn;
    private javax.swing.JPanel body;
    private javax.swing.JTextField d;
    private javax.swing.JTextField ef;
    private javax.swing.JTextField ff;
    private javax.swing.JButton getrecipt;
    private javax.swing.JTextField im;
    private javax.swing.JPanel items;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JTextField labf;
    private javax.swing.JTextField lb;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField msf;
    private javax.swing.JScrollPane print_area;
    private javax.swing.JButton printrecipt;
    private javax.swing.JTextField rad;
    private javax.swing.JTextField rln;
    private javax.swing.JTextField rn;
    private javax.swing.JTextField sm;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField tc;
    private javax.swing.JButton total;
    private javax.swing.JButton total1;
    private javax.swing.JButton total2;
    private javax.swing.JTextField totalcost;
    // End of variables declaration//GEN-END:variables
}
