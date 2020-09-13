/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.ui;

import com.ttms.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author personal
 */
public class manageReports extends javax.swing.JDialog {

    /**
     * Creates new form editBatch
     *
     * @param parent
     * @param modal
     * @param batchPrimaryKey
     */
    public manageReports(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void printMasterTimeTable() {
        try {
            HashMap<String, Object> hm = new HashMap<>();
            Connection con = DatabaseConnection.getDatabaseConnection();
            JasperDesign jsd = JRXmlLoader.load("reports\\time_table_2020.jrxml"); //src\\cazzendra\\pos\\
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
//          JasperViewer jasperViewer = new JasperViewer(jp, false);
//          JasperPrintManager.printReport(jp, false);
            JasperViewer jasperViewer = new JasperViewer(jp, false);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printLevelSchedule() {
        try {
            String Level = comboLevel.getSelectedItem().toString();
            HashMap<String, Object> hm = new HashMap<>();
            Connection con = DatabaseConnection.getDatabaseConnection();
            JasperDesign jsd = JRXmlLoader.load("reports\\level_wise_time_table.jrxml"); //src\\cazzendra\\pos\\
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            hm.put("level", Level);
            JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
//          JasperViewer jasperViewer = new JasperViewer(jp, false);
//          JasperPrintManager.printReport(jp, false);
            JasperViewer jasperViewer = new JasperViewer(jp, false);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void printLecturerSchedule() {
        try {
            String Level = comboLevel.getSelectedItem().toString();
            HashMap<String, Object> hm = new HashMap<>();
            Connection con = DatabaseConnection.getDatabaseConnection();
            JasperDesign jsd = JRXmlLoader.load("reports\\lecturer_wise_time_table.jrxml"); //src\\cazzendra\\pos\\
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            hm.put("level", Level);
            JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
//          JasperViewer jasperViewer = new JasperViewer(jp, false);
//          JasperPrintManager.printReport(jp, false);
            JasperViewer jasperViewer = new JasperViewer(jp, false);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void printRoomSchedule() {
        try {
            String Level = comboLevel.getSelectedItem().toString();
            HashMap<String, Object> hm = new HashMap<>();
            Connection con = DatabaseConnection.getDatabaseConnection();
            JasperDesign jsd = JRXmlLoader.load("reports\\lecturer_wise_time_table.jrxml"); //src\\cazzendra\\pos\\
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            hm.put("level", Level);
            JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
//          JasperViewer jasperViewer = new JasperViewer(jp, false);
//          JasperPrintManager.printReport(jp, false);
            JasperViewer jasperViewer = new JasperViewer(jp, false);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        calWeekBeginningDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboLevel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        comboLecturer = new javax.swing.JComboBox<>();
        btSearchLecturer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        comboLocation = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboModuleCode = new javax.swing.JComboBox<>();
        btSearchModule = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        calWeekBeginningDate1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        calWeekBeginningDate2 = new com.toedter.calendar.JDateChooser();
        calWeekBeginningDate3 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        calWeekBeginningDate4 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Reports");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Print Master Time Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 44));

        jButton2.setText("Print Level Schedule");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 200, 44));

        jButton3.setText("Print Room Schedule");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 200, 44));

        jButton4.setText("Print Lecturer Schedule");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 200, 44));

        jButton5.setText("Print Module Schedule");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 200, 44));

        calWeekBeginningDate.setToolTipText("Week Begining Date");
        calWeekBeginningDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calWeekBeginningDateFocusLost(evt);
            }
        });
        calWeekBeginningDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calWeekBeginningDateMouseExited(evt);
            }
        });
        calWeekBeginningDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calWeekBeginningDatePropertyChange(evt);
            }
        });
        calWeekBeginningDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calWeekBeginningDateKeyReleased(evt);
            }
        });
        jPanel4.add(calWeekBeginningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 44));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Master Time Table");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 18, 220, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 11, 290));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Level");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Level Schedule");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 200, -1));

        comboLevel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 4", "Level 5", "Level 6" }));
        comboLevel.setToolTipText("Level");
        comboLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLevelActionPerformed(evt);
            }
        });
        jPanel4.add(comboLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 200, 44));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Semester Starting Date");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 62, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 11, 290));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lecturer Schedule");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Lecturer Name");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 200, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 11, 290));

        comboLecturer.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboLecturer.setToolTipText("Lecturer");
        jPanel4.add(comboLecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 150, 44));

        btSearchLecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/labelIcons2/searchIcon.png"))); // NOI18N
        btSearchLecturer.setToolTipText("Search");
        jPanel4.add(btSearchLecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 40, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Room Schedule");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 200, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Room Name");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 11, 290));

        comboLocation.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "room" }));
        comboLocation.setToolTipText("Location");
        jPanel4.add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 200, 44));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Module Schedule");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 200, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Module Name");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 200, -1));

        comboModuleCode.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        comboModuleCode.setToolTipText("Module Code");
        comboModuleCode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(comboModuleCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 150, 44));

        btSearchModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/labelIcons2/searchIcon.png"))); // NOI18N
        btSearchModule.setToolTipText("Search");
        jPanel4.add(btSearchModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Semester Starting Date");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, -1));

        calWeekBeginningDate1.setToolTipText("Week Begining Date");
        calWeekBeginningDate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calWeekBeginningDate1FocusLost(evt);
            }
        });
        calWeekBeginningDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calWeekBeginningDate1MouseExited(evt);
            }
        });
        calWeekBeginningDate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calWeekBeginningDate1PropertyChange(evt);
            }
        });
        calWeekBeginningDate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calWeekBeginningDate1KeyReleased(evt);
            }
        });
        jPanel4.add(calWeekBeginningDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, 44));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Semester Starting Date");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 200, -1));

        calWeekBeginningDate2.setToolTipText("Week Begining Date");
        calWeekBeginningDate2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calWeekBeginningDate2FocusLost(evt);
            }
        });
        calWeekBeginningDate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calWeekBeginningDate2MouseExited(evt);
            }
        });
        calWeekBeginningDate2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calWeekBeginningDate2PropertyChange(evt);
            }
        });
        calWeekBeginningDate2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calWeekBeginningDate2KeyReleased(evt);
            }
        });
        jPanel4.add(calWeekBeginningDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 44));

        calWeekBeginningDate3.setToolTipText("Week Begining Date");
        calWeekBeginningDate3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calWeekBeginningDate3FocusLost(evt);
            }
        });
        calWeekBeginningDate3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calWeekBeginningDate3MouseExited(evt);
            }
        });
        calWeekBeginningDate3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calWeekBeginningDate3PropertyChange(evt);
            }
        });
        calWeekBeginningDate3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calWeekBeginningDate3KeyReleased(evt);
            }
        });
        jPanel4.add(calWeekBeginningDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 200, 44));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Semester Starting Date");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 200, -1));

        calWeekBeginningDate4.setToolTipText("Week Begining Date");
        calWeekBeginningDate4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calWeekBeginningDate4FocusLost(evt);
            }
        });
        calWeekBeginningDate4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calWeekBeginningDate4MouseExited(evt);
            }
        });
        calWeekBeginningDate4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calWeekBeginningDate4PropertyChange(evt);
            }
        });
        calWeekBeginningDate4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calWeekBeginningDate4KeyReleased(evt);
            }
        });
        jPanel4.add(calWeekBeginningDate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 200, 44));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Semester Starting Date");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 200, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printMasterTimeTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calWeekBeginningDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calWeekBeginningDateFocusLost

    }//GEN-LAST:event_calWeekBeginningDateFocusLost

    private void calWeekBeginningDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calWeekBeginningDateMouseExited

    }//GEN-LAST:event_calWeekBeginningDateMouseExited

    private void calWeekBeginningDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calWeekBeginningDatePropertyChange
    }//GEN-LAST:event_calWeekBeginningDatePropertyChange

    private void calWeekBeginningDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calWeekBeginningDateKeyReleased

    }//GEN-LAST:event_calWeekBeginningDateKeyReleased

    private void comboLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLevelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printLevelSchedule();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void calWeekBeginningDate1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calWeekBeginningDate1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate1FocusLost

    private void calWeekBeginningDate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calWeekBeginningDate1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate1MouseExited

    private void calWeekBeginningDate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calWeekBeginningDate1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate1PropertyChange

    private void calWeekBeginningDate1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calWeekBeginningDate1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate1KeyReleased

    private void calWeekBeginningDate2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calWeekBeginningDate2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate2FocusLost

    private void calWeekBeginningDate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calWeekBeginningDate2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate2MouseExited

    private void calWeekBeginningDate2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calWeekBeginningDate2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate2PropertyChange

    private void calWeekBeginningDate2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calWeekBeginningDate2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate2KeyReleased

    private void calWeekBeginningDate3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calWeekBeginningDate3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate3FocusLost

    private void calWeekBeginningDate3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calWeekBeginningDate3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate3MouseExited

    private void calWeekBeginningDate3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calWeekBeginningDate3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate3PropertyChange

    private void calWeekBeginningDate3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calWeekBeginningDate3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate3KeyReleased

    private void calWeekBeginningDate4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calWeekBeginningDate4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate4FocusLost

    private void calWeekBeginningDate4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calWeekBeginningDate4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate4MouseExited

    private void calWeekBeginningDate4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calWeekBeginningDate4PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate4PropertyChange

    private void calWeekBeginningDate4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calWeekBeginningDate4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_calWeekBeginningDate4KeyReleased

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
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                manageReports dialog = new manageReports(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSearchLecturer;
    private javax.swing.JButton btSearchModule;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser calWeekBeginningDate;
    private com.toedter.calendar.JDateChooser calWeekBeginningDate1;
    private com.toedter.calendar.JDateChooser calWeekBeginningDate2;
    private com.toedter.calendar.JDateChooser calWeekBeginningDate3;
    private com.toedter.calendar.JDateChooser calWeekBeginningDate4;
    private javax.swing.JComboBox<String> comboLecturer;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JComboBox<String> comboModuleCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
