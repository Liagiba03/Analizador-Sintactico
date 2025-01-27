
package codigo;

import java.awt.Color;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


/**
 *
 * @author suset
 */
public class FrmAnalizar extends javax.swing.JFrame{

    FrmPrincipal fr = new FrmPrincipal();
    /**
     * Creates new form FrmAnalizar
     */
    public FrmAnalizar() throws IOException {
        initComponents();
        imgBien.setVisible(false);
        imgMal.setVisible(false);
        txtFrase.setText(fr.getFrase());
        analizarLexico();
        AnalizarSin();
    }

        private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) fr.getFrase();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while(true){
            Tokens token = lexer.yylex();
            if(token == null){
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch(token){
                case Subject:
                    cont++;
                    resultado += "  <Subject>\t" + lexer.lexeme + "\n";
                    break;
                case Adverb:
                    cont++;
                    resultado += "  <Adverb>\t" + lexer.lexeme + "\n";
                    break;
                case Adjective:
                    resultado += "  <Adjetive>\t" + lexer.lexeme + "\n";
                    break;
                case Time_Expression:
                    resultado += "  <Time Expression>\t" + lexer.lexeme + "\n";
                    break;
                case Verb:
                    resultado += "  <Verb>\t" + lexer.lexeme + "\n";
                    break;
                case Verb_Past:
                    resultado += "  <Verb Past>\t" + lexer.lexeme + "\n";
                    break;
                case Article:
                    resultado += "  <Article>\t" + lexer.lexeme + "\n";
                    break;
                case Noun:
                    resultado += "  <Noun>\t" + lexer.lexeme + "\n";
                    break;
                case Conector:
                    resultado += "  <Conector>\t" + lexer.lexeme + "\n";
                    break;
                case Interrogative_Pronoun:
                    resultado += "  <Interrogative Pronoun>\t" + lexer.lexeme + "\n";
                    break;
                case Possessive_Pronoun:
                    resultado += "  <Possessive Pronoun>\t" + lexer.lexeme + "\n";
                    break;
                case Question_Mark:
                    resultado += "  <Question Mark>\t" + lexer.lexeme + "\n";
                    break;
                case Auxiliary_Past_Negative:
                    resultado += "  <Auxiliary Past Negative>\t" + lexer.lexeme + "\n";
                    break;
                case Auxiliary_Past:
                    resultado += "  <Auxiliary Past>\t" + lexer.lexeme + "\n";
                    break;
                case Auxiliary_Future:
                    resultado += "  <Auxiliary Future>\t" + lexer.lexeme + "\n";
                    break;
                case Auxiliary_Future_Negative:
                    resultado += "  <Auxiliary Future Negative>\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Identificador>\t" + lexer.lexeme + "\n";
                    break;               
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
        
        public void AnalizarSin(){
            String ST = fr.getFrase();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Frase escrita correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
            imgBien.setVisible(true);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Frase mal escrita. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
            imgMal.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        imgBien = new javax.swing.JLabel();
        imgMal = new javax.swing.JLabel();
        txtFrase = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnVoz = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        imgBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N

        imgMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N

        txtFrase.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFrase.setText(".");

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setBackground(new java.awt.Color(204, 204, 204));
        txtAnalizarLex.setColumns(16);
        txtAnalizarLex.setRows(5);
        jScrollPane1.setViewportView(txtAnalizarLex);

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setBackground(new java.awt.Color(204, 204, 204));
        txtAnalizarSin.setColumns(16);
        txtAnalizarSin.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarSin);

        btnVoz.setText("Voz");
        btnVoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVozActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(imgBien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgMal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgMal)
                    .addComponent(imgBien))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFrase)
                    .addComponent(btnVoz))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        //FrmPrincipal fr = new FrmPrincipal();
        //fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnVozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVozActionPerformed
        // Configurar la voz
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");
        voice.allocate();

        // Convertir textso a voz
        voice.speak(fr.getFrase());

        // Liberar recursos
        voice.deallocate();
    }//GEN-LAST:event_btnVozActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmAnalizar().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrmAnalizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVoz;
    private javax.swing.JLabel imgBien;
    private javax.swing.JLabel imgMal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JLabel txtFrase;
    // End of variables declaration//GEN-END:variables
}
