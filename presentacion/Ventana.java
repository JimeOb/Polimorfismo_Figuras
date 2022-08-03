package presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    public Ventana(Modelo m) {
         modelo = m;
        initComponents();
        eventos();
        setLocationRelativeTo(null);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if (control == null) {
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getBtnGraficar() {
        return BtnGraficar;
    }

    public JRadioButton getRbtCirculo() {
        return rbtCirculo;
    }

    public JRadioButton getRbtPoligono() {
        return rbtPoligono;
    }

    public JTextField getJtxAltura() {
        return JtxAltura;
    }

    public JLabel getPRUEBA() {
        return PRUEBA;
    }

    public JTextField getJtxLados() {
        return jtxLados;
    }

    public JTextField getJtxLongitud() {
        return jtxLongitud;
    }

    public JLabel getLbArea() {
        return lbArea;
    }

    public JLabel getLbPerimetro() {
        return lbPerimetro;
    }

    public JPanel getPnGrafico() {
        return pnGrafico;
    }

    public void setPRUEBA(JLabel PRUEBA) {
        this.PRUEBA = PRUEBA;
    }

    public void setJtxLados(JTextField jtxLados) {
        this.jtxLados = jtxLados;
    }

    public void setJtxLongitud(JTextField jtxLongitud) {
        this.jtxLongitud = jtxLongitud;
    }

    public void setLbArea(JLabel lbArea) {
        this.lbArea = lbArea;
    }

    public void setLbPerimetro(JLabel lbPerimetro) {
        this.lbPerimetro = lbPerimetro;
    }

    public void setPnGrafico(JPanel pnGrafico) {
        this.pnGrafico = pnGrafico;
    }

    public JTextField getJtxRadcir() {
        return jtxRadcir;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnGraficar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbPerimetro = new javax.swing.JLabel();
        JtxAltura = new javax.swing.JTextField();
        jtxLados = new javax.swing.JTextField();
        jtxLongitud = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();
        pnGrafico = new javax.swing.JPanel();
        PRUEBA = new javax.swing.JLabel();
        rbtCirculo = new javax.swing.JRadioButton();
        rbtPoligono = new javax.swing.JRadioButton();
        jtxRadcir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Graficador de figuras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 440, 60));

        BtnGraficar.setText("Graficar!");
        getContentPane().add(BtnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel2.setText("Tipo de figura: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbPerimetro.setText("PERIMETRO DE LA FIGURA");
        getContentPane().add(lbPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 150, 20));
        getContentPane().add(JtxAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 110, 20));
        getContentPane().add(jtxLados, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 110, 20));
        getContentPane().add(jtxLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 110, 20));

        jLabel7.setText("Altura del poligono (CM):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 180, 20));

        jLabel8.setText("Numero de lados del poligono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 190, 20));

        jLabel9.setText("Longitud de un lado (CM):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, 20));

        lbArea.setText("AREA DE LA FIGURA");
        getContentPane().add(lbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 150, 20));

        PRUEBA.setText("jLabel3");

        javax.swing.GroupLayout pnGraficoLayout = new javax.swing.GroupLayout(pnGrafico);
        pnGrafico.setLayout(pnGraficoLayout);
        pnGraficoLayout.setHorizontalGroup(
            pnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGraficoLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(PRUEBA)
                .addGap(135, 135, 135))
        );
        pnGraficoLayout.setVerticalGroup(
            pnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGraficoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(PRUEBA)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getContentPane().add(pnGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 310, 250));

        rbtCirculo.setText("Circulo");
        getContentPane().add(rbtCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        rbtPoligono.setText("Poligono");
        getContentPane().add(rbtPoligono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        getContentPane().add(jtxRadcir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 20));

        jLabel10.setText("Radio del circulo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGraficar;
    private javax.swing.JTextField JtxAltura;
    private javax.swing.JLabel PRUEBA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtxLados;
    private javax.swing.JTextField jtxLongitud;
    private javax.swing.JTextField jtxRadcir;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbPerimetro;
    private javax.swing.JPanel pnGrafico;
    private javax.swing.JRadioButton rbtCirculo;
    private javax.swing.JRadioButton rbtPoligono;
    // End of variables declaration//GEN-END:variables
    
    private void eventos () {
        
        BtnGraficar.addActionListener(getControl());
        rbtCirculo.addActionListener(getControl());
        rbtPoligono.addActionListener(getControl());

}

}

