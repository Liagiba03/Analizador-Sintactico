/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;
import java.awt.Desktop;
import java.io.File;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author suset
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public static String frase;

    public String getFrase() {
        return frase;
    }
    
    public static void reproducirConReproductorPredeterminado(String filePath) throws IOException {
        File videoFile = new File(filePath);

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
            Desktop.getDesktop().open(videoFile);
        } else {
            System.out.println("La apertura del reproductor predeterminado no es compatible en este sistema.");
        }
    }
    public FrmPrincipal() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnI = new javax.swing.JButton();
        btnKevin = new javax.swing.JButton();
        btnyou = new javax.swing.JButton();
        btnShakespeare = new javax.swing.JButton();
        btnAristotle = new javax.swing.JButton();
        btnThey = new javax.swing.JButton();
        btnIt = new javax.swing.JButton();
        btnwell = new javax.swing.JButton();
        btntomorrow = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnnever = new javax.swing.JButton();
        btnmany = new javax.swing.JButton();
        btnGreek = new javax.swing.JButton();
        btnelect = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnight = new javax.swing.JButton();
        btnthis = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnmonth = new javax.swing.JButton();
        btnsleep = new javax.swing.JButton();
        btnlike = new javax.swing.JButton();
        btnenjoy = new javax.swing.JButton();
        btngo = new javax.swing.JButton();
        btnrepair = new javax.swing.JButton();
        btnsnow = new javax.swing.JButton();
        btnbegin = new javax.swing.JButton();
        btnbe = new javax.swing.JButton();
        btnguess = new javax.swing.JButton();
        btnwrote = new javax.swing.JButton();
        btnwas = new javax.swing.JButton();
        btnthe = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btngame = new javax.swing.JButton();
        btnweekend = new javax.swing.JButton();
        btnplays = new javax.swing.JButton();
        btnsonnets = new javax.swing.JButton();
        btnphilosopher = new javax.swing.JButton();
        btnvacation = new javax.swing.JButton();
        btnTV = new javax.swing.JButton();
        btnperiod = new javax.swing.JButton();
        btnanswer = new javax.swing.JButton();
        btnpresident = new javax.swing.JButton();
        btndinner = new javax.swing.JButton();
        btnand = new javax.swing.JButton();
        btnuntil = new javax.swing.JButton();
        btnon = new javax.swing.JButton();
        btnfor = new javax.swing.JButton();
        btnWhere = new javax.swing.JButton();
        btnmy = new javax.swing.JButton();
        btnhis = new javax.swing.JButton();
        btnpregunta = new javax.swing.JButton();
        btndidnt = new javax.swing.JButton();
        btndid = new javax.swing.JButton();
        btnwill = new javax.swing.JButton();
        btnwont = new javax.swing.JButton();
        btnComprobar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game: Future and Past Simple", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnKevin.setText("Kevin");
        btnKevin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKevinActionPerformed(evt);
            }
        });

        btnyou.setText("you");
        btnyou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyouActionPerformed(evt);
            }
        });

        btnShakespeare.setText("Shakespeare");
        btnShakespeare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShakespeareActionPerformed(evt);
            }
        });

        btnAristotle.setText("Aristotle");
        btnAristotle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAristotleActionPerformed(evt);
            }
        });

        btnThey.setText("They");
        btnThey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheyActionPerformed(evt);
            }
        });

        btnIt.setText("It");
        btnIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItActionPerformed(evt);
            }
        });

        btnwell.setText("well");
        btnwell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwellActionPerformed(evt);
            }
        });

        btntomorrow.setText("tomorrow");
        btntomorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntomorrowActionPerformed(evt);
            }
        });

        btnhome.setText("home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnnever.setText("never");
        btnnever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnneverActionPerformed(evt);
            }
        });

        btnmany.setText("many");
        btnmany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanyActionPerformed(evt);
            }
        });

        btnGreek.setText("Greek");
        btnGreek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreekActionPerformed(evt);
            }
        });

        btnelect.setText("elect");
        btnelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelectActionPerformed(evt);
            }
        });

        btnlast.setText("last");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnight.setText("night");
        btnnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnightActionPerformed(evt);
            }
        });

        btnthis.setText("this");
        btnthis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthisActionPerformed(evt);
            }
        });

        btnnext.setText("next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnmonth.setText("month");
        btnmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonthActionPerformed(evt);
            }
        });

        btnsleep.setText("sleep");
        btnsleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsleepActionPerformed(evt);
            }
        });

        btnlike.setText("like");
        btnlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlikeActionPerformed(evt);
            }
        });

        btnenjoy.setText("enjoy");
        btnenjoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenjoyActionPerformed(evt);
            }
        });

        btngo.setText("go");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });

        btnrepair.setText("repair");
        btnrepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepairActionPerformed(evt);
            }
        });

        btnsnow.setText("snow");
        btnsnow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsnowActionPerformed(evt);
            }
        });

        btnbegin.setText("begin");
        btnbegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeginActionPerformed(evt);
            }
        });

        btnbe.setText("be");
        btnbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeActionPerformed(evt);
            }
        });

        btnguess.setText("guess");
        btnguess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguessActionPerformed(evt);
            }
        });

        btnwrote.setText("wrote");
        btnwrote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwroteActionPerformed(evt);
            }
        });

        btnwas.setText("was");
        btnwas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwasActionPerformed(evt);
            }
        });

        btnthe.setText("the");
        btnthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntheActionPerformed(evt);
            }
        });

        btna.setText("a");
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });

        btngame.setText("game");
        btngame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngameActionPerformed(evt);
            }
        });

        btnweekend.setText("weekend");
        btnweekend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnweekendActionPerformed(evt);
            }
        });

        btnplays.setText("plays");
        btnplays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaysActionPerformed(evt);
            }
        });

        btnsonnets.setText("sonnets");
        btnsonnets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsonnetsActionPerformed(evt);
            }
        });

        btnphilosopher.setText("philosopher");
        btnphilosopher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphilosopherActionPerformed(evt);
            }
        });

        btnvacation.setText("vacation");
        btnvacation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvacationActionPerformed(evt);
            }
        });

        btnTV.setText("TV");
        btnTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVActionPerformed(evt);
            }
        });

        btnperiod.setText("period");
        btnperiod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperiodActionPerformed(evt);
            }
        });

        btnanswer.setText("answer");
        btnanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanswerActionPerformed(evt);
            }
        });

        btnpresident.setText("president");
        btnpresident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpresidentActionPerformed(evt);
            }
        });

        btndinner.setText("dinner");
        btndinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndinnerActionPerformed(evt);
            }
        });

        btnand.setText("and");
        btnand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnandActionPerformed(evt);
            }
        });

        btnuntil.setText("until");
        btnuntil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuntilActionPerformed(evt);
            }
        });

        btnon.setText("on");
        btnon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnonActionPerformed(evt);
            }
        });

        btnfor.setText("for");
        btnfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforActionPerformed(evt);
            }
        });

        btnWhere.setText("Where");
        btnWhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhereActionPerformed(evt);
            }
        });

        btnmy.setText("my");
        btnmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmyActionPerformed(evt);
            }
        });

        btnhis.setText("his");
        btnhis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhisActionPerformed(evt);
            }
        });

        btnpregunta.setText("?");
        btnpregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreguntaActionPerformed(evt);
            }
        });

        btndidnt.setText("didn´t");
        btndidnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndidntActionPerformed(evt);
            }
        });

        btndid.setText("did");
        btndid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndidActionPerformed(evt);
            }
        });

        btnwill.setText("will");
        btnwill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwillActionPerformed(evt);
            }
        });

        btnwont.setText("won´t");
        btnwont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwontActionPerformed(evt);
            }
        });

        btnComprobar.setBackground(new java.awt.Color(51, 255, 0));
        btnComprobar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnComprobar.setText("Comprobar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 0));
        btnReiniciar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jButton1.setText("Video Past Simple");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jButton2.setText("Video Future Simple");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Future Simple");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Past Simple");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("<html>Hola¡ Aquí puedes hacer frases en pasado<br>\ny futuro simple. Las palabras aceptadas se <br>\nencuentran en los botones a la izquierda.</html>\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnI)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnAristotle)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnThey)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnIt))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnKevin)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnyou)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnShakespeare))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(btnWhere))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btndidnt)
                                    .addGap(18, 18, 18)
                                    .addComponent(btndid)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnwas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(239, 239, 239)
                                    .addComponent(btnpregunta)))
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnComprobar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReiniciar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalir)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnwill)
                                        .addComponent(btnsleep))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnwont)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnlike)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnenjoy)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btngo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnrepair))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnsnow)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnbegin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnbe)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnguess)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnwrote))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btngame)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnweekend)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnplays)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnsonnets)
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnphilosopher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnvacation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnperiod))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnanswer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnpresident)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btndinner))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnthe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnuntil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnfor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmy)
                        .addGap(12, 12, 12)
                        .addComponent(btnhis)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnwell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntomorrow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnever))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnmany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGreek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnelect))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmonth)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnComprobar)
                            .addComponent(btnReiniciar)
                            .addComponent(btnSalir)
                            .addComponent(btnpregunta))
                        .addGap(25, 25, 25)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnI)
                            .addComponent(btnKevin)
                            .addComponent(btnyou)
                            .addComponent(btnShakespeare))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAristotle)
                            .addComponent(btnThey)
                            .addComponent(btnIt))
                        .addGap(12, 12, 12)
                        .addComponent(btnWhere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnwill)
                            .addComponent(btnwont))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndidnt)
                            .addComponent(btndid)
                            .addComponent(btnwas))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsleep)
                            .addComponent(btnlike)
                            .addComponent(btnenjoy)
                            .addComponent(btngo)
                            .addComponent(btnrepair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsnow)
                            .addComponent(btnbegin)
                            .addComponent(btnbe)
                            .addComponent(btnguess)
                            .addComponent(btnwrote))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthe)
                            .addComponent(btna)
                            .addComponent(btnand)
                            .addComponent(btnuntil)
                            .addComponent(btnon)
                            .addComponent(btnfor)
                            .addComponent(btnmy)
                            .addComponent(btnhis))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlast)
                            .addComponent(btnnight)
                            .addComponent(btnthis)
                            .addComponent(btnnext)
                            .addComponent(btnmonth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnwell)
                            .addComponent(btntomorrow)
                            .addComponent(btnhome)
                            .addComponent(btnnever))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmany)
                            .addComponent(btnGreek)
                            .addComponent(btnelect))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btngame)
                            .addComponent(btnweekend)
                            .addComponent(btnplays)
                            .addComponent(btnsonnets))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnphilosopher)
                            .addComponent(btnvacation)
                            .addComponent(btnTV)
                            .addComponent(btnperiod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnanswer)
                            .addComponent(btnpresident)
                            .addComponent(btndinner))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        String text = btnI.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnIActionPerformed

    private void btnKevinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKevinActionPerformed
        String text = btnKevin.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnKevinActionPerformed

    private void btnyouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyouActionPerformed
        String text = btnyou.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnyouActionPerformed

    private void btnShakespeareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShakespeareActionPerformed
        String text = btnShakespeare.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnShakespeareActionPerformed

    private void btnAristotleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAristotleActionPerformed
        String text = btnAristotle.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnAristotleActionPerformed

    private void btnTheyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheyActionPerformed
        String text = btnThey.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnTheyActionPerformed

    private void btnItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItActionPerformed
        String text = btnIt.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnItActionPerformed

    private void btnwellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwellActionPerformed
        String text = btnwell.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnwellActionPerformed

    private void btntomorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntomorrowActionPerformed
        String text = btntomorrow.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btntomorrowActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        String text = btnhome.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnneverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnneverActionPerformed
        String text = btnnever.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnneverActionPerformed

    private void btnmanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanyActionPerformed
        String text = btnmany.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnmanyActionPerformed

    private void btnGreekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreekActionPerformed
        String text = btnGreek.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnGreekActionPerformed

    private void btnelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelectActionPerformed
        String text = btnelect.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnelectActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        String text = btnlast.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnightActionPerformed
        String text = btnnight.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnnightActionPerformed

    private void btnthisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthisActionPerformed
        String text = btnthis.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnthisActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        String text = btnnext.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonthActionPerformed
        String text = btnmonth.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnmonthActionPerformed

    private void btnsleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsleepActionPerformed
        String text = btnsleep.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnsleepActionPerformed

    private void btnlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlikeActionPerformed
        String text = btnlike.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnlikeActionPerformed

    private void btnenjoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenjoyActionPerformed
        String text = btnenjoy.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnenjoyActionPerformed

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoActionPerformed
        String text = btngo.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btngoActionPerformed

    private void btnrepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepairActionPerformed
        String text = btnrepair.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnrepairActionPerformed

    private void btnsnowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsnowActionPerformed
        String text = btnsnow.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnsnowActionPerformed

    private void btnbeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeginActionPerformed
        String text = btnbegin.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnbeginActionPerformed

    private void btnbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeActionPerformed
        String text = btnbe.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnbeActionPerformed

    private void btnguessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguessActionPerformed
        String text = btnguess.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnguessActionPerformed

    private void btnwroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwroteActionPerformed
        String text = btnwrote.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnwroteActionPerformed

    private void btnwasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwasActionPerformed
        String text = btnwas.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnwasActionPerformed

    private void btntheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntheActionPerformed
        String text = btnthe.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btntheActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
        String text = btna.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnaActionPerformed

    private void btngameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngameActionPerformed
        String text = btngame.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btngameActionPerformed

    private void btnweekendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnweekendActionPerformed
        String text = btnweekend.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnweekendActionPerformed

    private void btnplaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaysActionPerformed
        String text = btnplays.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnplaysActionPerformed

    private void btnsonnetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsonnetsActionPerformed
        String text = btnsonnets.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnsonnetsActionPerformed

    private void btnphilosopherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphilosopherActionPerformed
       String text = btnphilosopher.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnphilosopherActionPerformed

    private void btnvacationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvacationActionPerformed
        String text = btnvacation.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnvacationActionPerformed

    private void btnTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVActionPerformed
        String text = btnTV.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnTVActionPerformed

    private void btnperiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperiodActionPerformed
        String text = btnperiod.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnperiodActionPerformed

    private void btnanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanswerActionPerformed
        String text = btnanswer.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnanswerActionPerformed

    private void btnpresidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpresidentActionPerformed
        String text = btnpresident.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnpresidentActionPerformed

    private void btndinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndinnerActionPerformed
        String text = btndinner.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btndinnerActionPerformed

    private void btnandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnandActionPerformed
        String text = btnand.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnandActionPerformed

    private void btnuntilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuntilActionPerformed
        String text = btnuntil.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnuntilActionPerformed

    private void btnonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnonActionPerformed
        String text = btnon.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnonActionPerformed

    private void btnforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforActionPerformed
        String text = btnfor.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnforActionPerformed

    private void btnWhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhereActionPerformed
        String text = btnWhere.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnWhereActionPerformed

    private void btnmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmyActionPerformed
        String text = btnmy.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnmyActionPerformed

    private void btnhisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhisActionPerformed
        String text = btnhis.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnhisActionPerformed

    private void btnpreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreguntaActionPerformed
        String text = btnpregunta.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnpreguntaActionPerformed

    private void btndidntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndidntActionPerformed
        String text = btndidnt.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btndidntActionPerformed

    private void btndidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndidActionPerformed
        String text = btndid.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btndidActionPerformed

    private void btnwillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwillActionPerformed
        String text = btnwill.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnwillActionPerformed

    private void btnwontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwontActionPerformed
        String text = btnwont.getText();
        txtResultado.setText(txtResultado.getText()+ " "+text);
    }//GEN-LAST:event_btnwontActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        frase = txtResultado.getText();
        FrmAnalizar fr;
        try {
            fr = new FrmAnalizar();
            fr.setVisible(true);
            //this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        txtResultado.setText(null);
        /*frase = txtResultado.getText();
        txtAnalizarSin.setText(getFrase());
        System.out.println(getFrase());*/
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String  videoPath= "C:/Users/suset/Documents/TESJI/5_Semestre/LenAutomatas/Proyecto/Game/src/img/PS.mp4"; 
        try {
            reproducirConReproductorPredeterminado(videoPath);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String  videoPath= "C:/Users/suset/Documents/TESJI/5_Semestre/LenAutomatas/Proyecto/Game/src/img/FS.mp4"; 
        try {
            reproducirConReproductorPredeterminado(videoPath);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
               
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAristotle;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnGreek;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnIt;
    private javax.swing.JButton btnKevin;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnShakespeare;
    private javax.swing.JButton btnTV;
    private javax.swing.JButton btnThey;
    private javax.swing.JButton btnWhere;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnand;
    private javax.swing.JButton btnanswer;
    private javax.swing.JButton btnbe;
    private javax.swing.JButton btnbegin;
    private javax.swing.JButton btndid;
    private javax.swing.JButton btndidnt;
    private javax.swing.JButton btndinner;
    private javax.swing.JButton btnelect;
    private javax.swing.JButton btnenjoy;
    private javax.swing.JButton btnfor;
    private javax.swing.JButton btngame;
    private javax.swing.JButton btngo;
    private javax.swing.JButton btnguess;
    private javax.swing.JButton btnhis;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnlike;
    private javax.swing.JButton btnmany;
    private javax.swing.JButton btnmonth;
    private javax.swing.JButton btnmy;
    private javax.swing.JButton btnnever;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnnight;
    private javax.swing.JButton btnon;
    private javax.swing.JButton btnperiod;
    private javax.swing.JButton btnphilosopher;
    private javax.swing.JButton btnplays;
    private javax.swing.JButton btnpregunta;
    private javax.swing.JButton btnpresident;
    private javax.swing.JButton btnrepair;
    private javax.swing.JButton btnsleep;
    private javax.swing.JButton btnsnow;
    private javax.swing.JButton btnsonnets;
    private javax.swing.JButton btnthe;
    private javax.swing.JButton btnthis;
    private javax.swing.JButton btntomorrow;
    private javax.swing.JButton btnuntil;
    private javax.swing.JButton btnvacation;
    private javax.swing.JButton btnwas;
    private javax.swing.JButton btnweekend;
    private javax.swing.JButton btnwell;
    private javax.swing.JButton btnwill;
    private javax.swing.JButton btnwont;
    private javax.swing.JButton btnwrote;
    private javax.swing.JButton btnyou;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
