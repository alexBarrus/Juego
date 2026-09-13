/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package FrontEnd;

import BackEnd.Personaje;
import BackEnd.Enemigo;
import BackEnd.Jefe;
import BackEnd.Protagonista;
import BackEnd.Armas;
import BackEnd.Arco;
import BackEnd.Baston;
import BackEnd.Escudo;
import BackEnd.Espada;
import BackEnd.Habilidad;
import BackEnd.Ataque;
import BackEnd.Buffo;
import BackEnd.Curacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class GUIPersonaje extends javax.swing.JFrame {


    private Enemigo enemigoActual;
    private Jefe jefeActual;
    private Protagonista protagonistaActual;
    private Arco arcoActual;
    private Baston bastonActual;
    private Escudo escudoActual;
    private Espada espadaActual;
    private Ataque ataqueActual;
    private Buffo buffoActual;
    private Curacion curacionActual;

    public GUIPersonaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        BtnCrearEnemigo = new javax.swing.JButton();
        BtnBuscarEnemigo = new javax.swing.JButton();
        BtnMostrarEnemigo = new javax.swing.JButton();
        BtnActualizarEnemigo = new javax.swing.JButton();
        BtnBorrarEnemigo = new javax.swing.JButton();
        BtnDestruirEnemigo = new javax.swing.JButton();
        BtnPolimorfismoEnemigo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        BtnCrearProtagonista = new javax.swing.JButton();
        BtnBuscarProtagonista = new javax.swing.JButton();
        BtnMostrarProtagonista = new javax.swing.JButton();
        BtnActualizarProtagonista = new javax.swing.JButton();
        BtnBorrarProtagonista = new javax.swing.JButton();
        BtnDestruirProtagonista = new javax.swing.JButton();
        BtnPolimorfismoProtagonista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        BtnCrearJefe = new javax.swing.JButton();
        BtnBuscarJefe = new javax.swing.JButton();
        BtnMostrarJefe = new javax.swing.JButton();
        BtnActualizarJefe = new javax.swing.JButton();
        BtnBorrarJefe = new javax.swing.JButton();
        BtnDestruirJefe = new javax.swing.JButton();
        BtnPolimorfismoJefe = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Personajes del Juego");

        // ---------- Pestaña Enemigo ----------
        jTextField1.setName("TXTNombreEnemigo");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Común", "Élite", "Especial" }));
        jComboBox1.setName("CBTipoEnemigo");
        jTextField2.setName("TXTVidaEnemigo");
        jTextField3.setName("TXTNivelEnemigo");
        jTextField4.setName("TXTDanoEnemigo");
        jTextField5.setName("TXTDefensaEnemigo");
        jCheckBox1.setText("Está vivo");
        jCheckBox1.setSelected(true);
        jCheckBox1.setName("CHKVivoEnemigo");
        jTextField6.setName("TXTDistanciaEnemigo");
        jTextField7.setName("TXTRecompensaEnemigo");

        jLabel1.setText("Nombre (atributo primario):");
        jLabel2.setText("Tipo:");
        jLabel3.setText("Vida:");
        jLabel4.setText("Nivel:");
        jLabel5.setText("Daño:");
        jLabel6.setText("Defensa:");
        jLabel7.setText("Estado:");
        jLabel8.setText("Distancia de detección:");
        jLabel9.setText("Recompensa XP:");

        jPanel4.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel4.add(jLabel1);
        jPanel4.add(jTextField1);
        jPanel4.add(jLabel2);
        jPanel4.add(jComboBox1);
        jPanel4.add(jLabel3);
        jPanel4.add(jTextField2);
        jPanel4.add(jLabel4);
        jPanel4.add(jTextField3);
        jPanel4.add(jLabel5);
        jPanel4.add(jTextField4);
        jPanel4.add(jLabel6);
        jPanel4.add(jTextField5);
        jPanel4.add(jLabel7);
        jPanel4.add(jCheckBox1);
        jPanel4.add(jLabel8);
        jPanel4.add(jTextField6);
        jPanel4.add(jLabel9);
        jPanel4.add(jTextField7);

        BtnCrearEnemigo.setText("Crear");
        BtnCrearEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearEnemigoActionPerformed(evt);
            }
        });
        BtnBuscarEnemigo.setText("Buscar");
        BtnBuscarEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarEnemigoActionPerformed(evt);
            }
        });
        BtnMostrarEnemigo.setText("Mostrar");
        BtnMostrarEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEnemigoActionPerformed(evt);
            }
        });
        BtnActualizarEnemigo.setText("Actualizar");
        BtnActualizarEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarEnemigoActionPerformed(evt);
            }
        });
        BtnBorrarEnemigo.setText("Borrar");
        BtnBorrarEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarEnemigoActionPerformed(evt);
            }
        });
        BtnDestruirEnemigo.setText("Destruir");
        BtnDestruirEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirEnemigoActionPerformed(evt);
            }
        });
        BtnPolimorfismoEnemigo.setText("Demostrar Polimorfismo");
        BtnPolimorfismoEnemigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoEnemigoActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel5.add(BtnCrearEnemigo);
        jPanel5.add(BtnBuscarEnemigo);
        jPanel5.add(BtnMostrarEnemigo);
        jPanel5.add(BtnActualizarEnemigo);
        jPanel5.add(BtnBorrarEnemigo);
        jPanel5.add(BtnDestruirEnemigo);
        jPanel5.add(BtnPolimorfismoEnemigo);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(6);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setName("AreaInfoEnemigo");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Enemigo", jPanel1);

        // ---------- Pestaña Protagonista ----------
        jTextField8.setName("TXTNombreProtagonista");
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guerrero", "Mago", "Arquero" }));
        jComboBox2.setName("CBTipoProtagonista");
        jTextField9.setName("TXTVidaProtagonista");
        jTextField10.setName("TXTNivelProtagonista");
        jTextField11.setName("TXTDanoProtagonista");
        jTextField12.setName("TXTDefensaProtagonista");
        jCheckBox2.setText("Está vivo");
        jCheckBox2.setSelected(true);
        jCheckBox2.setName("CHKVivoProtagonista");
        jTextField13.setName("TXTExperienciaProtagonista");
        jTextField14.setName("TXTInventarioProtagonista");

        jLabel10.setText("Nombre (atributo primario):");
        jLabel11.setText("Tipo:");
        jLabel12.setText("Vida:");
        jLabel13.setText("Nivel:");
        jLabel14.setText("Daño:");
        jLabel15.setText("Defensa:");
        jLabel16.setText("Estado:");
        jLabel17.setText("Experiencia:");
        jLabel18.setText("Inventario (separado por comas):");

        jPanel6.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel6.add(jLabel10);
        jPanel6.add(jTextField8);
        jPanel6.add(jLabel11);
        jPanel6.add(jComboBox2);
        jPanel6.add(jLabel12);
        jPanel6.add(jTextField9);
        jPanel6.add(jLabel13);
        jPanel6.add(jTextField10);
        jPanel6.add(jLabel14);
        jPanel6.add(jTextField11);
        jPanel6.add(jLabel15);
        jPanel6.add(jTextField12);
        jPanel6.add(jLabel16);
        jPanel6.add(jCheckBox2);
        jPanel6.add(jLabel17);
        jPanel6.add(jTextField13);
        jPanel6.add(jLabel18);
        jPanel6.add(jTextField14);

        BtnCrearProtagonista.setText("Crear");
        BtnCrearProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearProtagonistaActionPerformed(evt);
            }
        });
        BtnBuscarProtagonista.setText("Buscar");
        BtnBuscarProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProtagonistaActionPerformed(evt);
            }
        });
        BtnMostrarProtagonista.setText("Mostrar");
        BtnMostrarProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarProtagonistaActionPerformed(evt);
            }
        });
        BtnActualizarProtagonista.setText("Actualizar");
        BtnActualizarProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarProtagonistaActionPerformed(evt);
            }
        });
        BtnBorrarProtagonista.setText("Borrar");
        BtnBorrarProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarProtagonistaActionPerformed(evt);
            }
        });
        BtnDestruirProtagonista.setText("Destruir");
        BtnDestruirProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirProtagonistaActionPerformed(evt);
            }
        });
        BtnPolimorfismoProtagonista.setText("Demostrar Polimorfismo");
        BtnPolimorfismoProtagonista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoProtagonistaActionPerformed(evt);
            }
        });

        jPanel7.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel7.add(BtnCrearProtagonista);
        jPanel7.add(BtnBuscarProtagonista);
        jPanel7.add(BtnMostrarProtagonista);
        jPanel7.add(BtnActualizarProtagonista);
        jPanel7.add(BtnBorrarProtagonista);
        jPanel7.add(BtnDestruirProtagonista);
        jPanel7.add(BtnPolimorfismoProtagonista);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(6);
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setName("AreaInfoProtagonista");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Protagonista", jPanel2);

        // ---------- Pestaña Jefe ----------
        jTextField15.setName("TXTNombreJefe");
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe de zona", "Semi-jefe", "Jefe final" }));
        jComboBox3.setName("CBTipoJefe");
        jTextField16.setName("TXTVidaJefe");
        jTextField17.setName("TXTNivelJefe");
        jTextField18.setName("TXTDanoJefe");
        jTextField19.setName("TXTDefensaJefe");
        jCheckBox3.setText("Está vivo");
        jCheckBox3.setSelected(true);
        jCheckBox3.setName("CHKVivoJefe");
        jTextField20.setName("TXTFasesJefe");
        jTextField21.setName("TXTFuriaJefe");

        jLabel19.setText("Nombre (atributo primario):");
        jLabel20.setText("Tipo:");
        jLabel21.setText("Vida:");
        jLabel22.setText("Nivel:");
        jLabel23.setText("Daño:");
        jLabel24.setText("Defensa:");
        jLabel25.setText("Estado:");
        jLabel26.setText("Número de fases:");
        jLabel27.setText("Multiplicador de furia:");

        jPanel8.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel8.add(jLabel19);
        jPanel8.add(jTextField15);
        jPanel8.add(jLabel20);
        jPanel8.add(jComboBox3);
        jPanel8.add(jLabel21);
        jPanel8.add(jTextField16);
        jPanel8.add(jLabel22);
        jPanel8.add(jTextField17);
        jPanel8.add(jLabel23);
        jPanel8.add(jTextField18);
        jPanel8.add(jLabel24);
        jPanel8.add(jTextField19);
        jPanel8.add(jLabel25);
        jPanel8.add(jCheckBox3);
        jPanel8.add(jLabel26);
        jPanel8.add(jTextField20);
        jPanel8.add(jLabel27);
        jPanel8.add(jTextField21);

        BtnCrearJefe.setText("Crear");
        BtnCrearJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearJefeActionPerformed(evt);
            }
        });
        BtnBuscarJefe.setText("Buscar");
        BtnBuscarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarJefeActionPerformed(evt);
            }
        });
        BtnMostrarJefe.setText("Mostrar");
        BtnMostrarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarJefeActionPerformed(evt);
            }
        });
        BtnActualizarJefe.setText("Actualizar");
        BtnActualizarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarJefeActionPerformed(evt);
            }
        });
        BtnBorrarJefe.setText("Borrar");
        BtnBorrarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarJefeActionPerformed(evt);
            }
        });
        BtnDestruirJefe.setText("Destruir");
        BtnDestruirJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirJefeActionPerformed(evt);
            }
        });
        BtnPolimorfismoJefe.setText("Demostrar Polimorfismo");
        BtnPolimorfismoJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoJefeActionPerformed(evt);
            }
        });

        jPanel9.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel9.add(BtnCrearJefe);
        jPanel9.add(BtnBuscarJefe);
        jPanel9.add(BtnMostrarJefe);
        jPanel9.add(BtnActualizarJefe);
        jPanel9.add(BtnBorrarJefe);
        jPanel9.add(BtnDestruirJefe);
        jPanel9.add(BtnPolimorfismoJefe);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(6);
        jTextArea3.setEditable(false);
        jTextArea3.setLineWrap(true);
        jTextArea3.setName("AreaInfoJefe");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jefe", jPanel3);

        // ---------- Pestaña Arco ----------
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        BtnCrearArco = new javax.swing.JButton();
        BtnBuscarArco = new javax.swing.JButton();
        BtnMostrarArco = new javax.swing.JButton();
        BtnActualizarArco = new javax.swing.JButton();
        BtnBorrarArco = new javax.swing.JButton();
        BtnDestruirArco = new javax.swing.JButton();
        BtnPolimorfismoArco = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        jTextField22.setName("TXTNombreArco");
        jTextField23.setName("TXTDanoArco");
        jTextField24.setName("TXTAlcanceArco");
        jTextField46.setName("TXTDurabilidadArco");
        jLabel28.setText("Nombre (atributo primario):");
        jLabel29.setText("Daño:");
        jLabel30.setText("Alcance:");
        jLabel52.setText("Durabilidad:");

        jPanel11.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel11.add(jLabel28);
        jPanel11.add(jTextField22);
        jPanel11.add(jLabel29);
        jPanel11.add(jTextField23);
        jPanel11.add(jLabel52);
        jPanel11.add(jTextField46);
        jPanel11.add(jLabel30);
        jPanel11.add(jTextField24);

        BtnCrearArco.setText("Crear");
        BtnCrearArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearArcoActionPerformed(evt);
            }
        });
        BtnBuscarArco.setText("Buscar");
        BtnBuscarArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarArcoActionPerformed(evt);
            }
        });
        BtnMostrarArco.setText("Mostrar");
        BtnMostrarArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarArcoActionPerformed(evt);
            }
        });
        BtnActualizarArco.setText("Actualizar");
        BtnActualizarArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarArcoActionPerformed(evt);
            }
        });
        BtnBorrarArco.setText("Borrar");
        BtnBorrarArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarArcoActionPerformed(evt);
            }
        });
        BtnDestruirArco.setText("Destruir");
        BtnDestruirArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirArcoActionPerformed(evt);
            }
        });
        BtnPolimorfismoArco.setText("Demostrar Polimorfismo");
        BtnPolimorfismoArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoArcoActionPerformed(evt);
            }
        });

        jPanel12.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel12.add(BtnCrearArco);
        jPanel12.add(BtnBuscarArco);
        jPanel12.add(BtnMostrarArco);
        jPanel12.add(BtnActualizarArco);
        jPanel12.add(BtnBorrarArco);
        jPanel12.add(BtnDestruirArco);
        jPanel12.add(BtnPolimorfismoArco);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(6);
        jTextArea4.setEditable(false);
        jTextArea4.setLineWrap(true);
        jTextArea4.setName("AreaInfoArco");
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createSequentialGroup()
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Arco", jPanel10);

        // ---------- Pestaña Baston ----------
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        BtnCrearBaston = new javax.swing.JButton();
        BtnBuscarBaston = new javax.swing.JButton();
        BtnMostrarBaston = new javax.swing.JButton();
        BtnActualizarBaston = new javax.swing.JButton();
        BtnBorrarBaston = new javax.swing.JButton();
        BtnDestruirBaston = new javax.swing.JButton();
        BtnPolimorfismoBaston = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        jTextField25.setName("TXTNombreBaston");
        jTextField26.setName("TXTDanoMagicoBaston");
        jTextField27.setName("TXTBonusManaBaston");
        jTextField47.setName("TXTDurabilidadBaston");
        jLabel31.setText("Nombre (atributo primario):");
        jLabel32.setText("Daño mágico:");
        jLabel33.setText("Bonus de maná:");
        jLabel53.setText("Durabilidad:");

        jPanel14.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel14.add(jLabel31);
        jPanel14.add(jTextField25);
        jPanel14.add(jLabel32);
        jPanel14.add(jTextField26);
        jPanel14.add(jLabel53);
        jPanel14.add(jTextField47);
        jPanel14.add(jLabel33);
        jPanel14.add(jTextField27);

        BtnCrearBaston.setText("Crear");
        BtnCrearBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearBastonActionPerformed(evt);
            }
        });
        BtnBuscarBaston.setText("Buscar");
        BtnBuscarBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarBastonActionPerformed(evt);
            }
        });
        BtnMostrarBaston.setText("Mostrar");
        BtnMostrarBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarBastonActionPerformed(evt);
            }
        });
        BtnActualizarBaston.setText("Actualizar");
        BtnActualizarBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarBastonActionPerformed(evt);
            }
        });
        BtnBorrarBaston.setText("Borrar");
        BtnBorrarBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarBastonActionPerformed(evt);
            }
        });
        BtnDestruirBaston.setText("Destruir");
        BtnDestruirBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirBastonActionPerformed(evt);
            }
        });
        BtnPolimorfismoBaston.setText("Demostrar Polimorfismo");
        BtnPolimorfismoBaston.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoBastonActionPerformed(evt);
            }
        });

        jPanel15.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel15.add(BtnCrearBaston);
        jPanel15.add(BtnBuscarBaston);
        jPanel15.add(BtnMostrarBaston);
        jPanel15.add(BtnActualizarBaston);
        jPanel15.add(BtnBorrarBaston);
        jPanel15.add(BtnDestruirBaston);
        jPanel15.add(BtnPolimorfismoBaston);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(6);
        jTextArea5.setEditable(false);
        jTextArea5.setLineWrap(true);
        jTextArea5.setName("AreaInfoBaston");
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createSequentialGroup()
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Baston", jPanel13);

        // ---------- Pestaña Escudo ----------
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        BtnCrearEscudo = new javax.swing.JButton();
        BtnBuscarEscudo = new javax.swing.JButton();
        BtnMostrarEscudo = new javax.swing.JButton();
        BtnActualizarEscudo = new javax.swing.JButton();
        BtnBorrarEscudo = new javax.swing.JButton();
        BtnDestruirEscudo = new javax.swing.JButton();
        BtnPolimorfismoEscudo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        jTextField28.setName("TXTNombreEscudo");
        jTextField29.setName("TXTDefensaExtraEscudo");
        jTextField30.setName("TXTDurabilidadEscudo");
        jLabel34.setText("Nombre (atributo primario):");
        jLabel35.setText("Defensa extra:");
        jLabel36.setText("Durabilidad:");

        jPanel17.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel17.add(jLabel34);
        jPanel17.add(jTextField28);
        jPanel17.add(jLabel35);
        jPanel17.add(jTextField29);
        jPanel17.add(jLabel36);
        jPanel17.add(jTextField30);

        BtnCrearEscudo.setText("Crear");
        BtnCrearEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearEscudoActionPerformed(evt);
            }
        });
        BtnBuscarEscudo.setText("Buscar");
        BtnBuscarEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarEscudoActionPerformed(evt);
            }
        });
        BtnMostrarEscudo.setText("Mostrar");
        BtnMostrarEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEscudoActionPerformed(evt);
            }
        });
        BtnActualizarEscudo.setText("Actualizar");
        BtnActualizarEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarEscudoActionPerformed(evt);
            }
        });
        BtnBorrarEscudo.setText("Borrar");
        BtnBorrarEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarEscudoActionPerformed(evt);
            }
        });
        BtnDestruirEscudo.setText("Destruir");
        BtnDestruirEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirEscudoActionPerformed(evt);
            }
        });
        BtnPolimorfismoEscudo.setText("Demostrar Polimorfismo");
        BtnPolimorfismoEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoEscudoActionPerformed(evt);
            }
        });

        jPanel18.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel18.add(BtnCrearEscudo);
        jPanel18.add(BtnBuscarEscudo);
        jPanel18.add(BtnMostrarEscudo);
        jPanel18.add(BtnActualizarEscudo);
        jPanel18.add(BtnBorrarEscudo);
        jPanel18.add(BtnDestruirEscudo);
        jPanel18.add(BtnPolimorfismoEscudo);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(6);
        jTextArea6.setEditable(false);
        jTextArea6.setLineWrap(true);
        jTextArea6.setName("AreaInfoEscudo");
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createSequentialGroup()
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Escudo", jPanel16);

        // ---------- Pestaña Espada ----------
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        BtnCrearEspada = new javax.swing.JButton();
        BtnBuscarEspada = new javax.swing.JButton();
        BtnMostrarEspada = new javax.swing.JButton();
        BtnActualizarEspada = new javax.swing.JButton();
        BtnBorrarEspada = new javax.swing.JButton();
        BtnDestruirEspada = new javax.swing.JButton();
        BtnPolimorfismoEspada = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();

        jTextField31.setName("TXTNombreEspada");
        jTextField32.setName("TXTDanoEspada");
        jTextField33.setName("TXTFiloEspada");
        jTextField48.setName("TXTDurabilidadEspada");
        jLabel37.setText("Nombre (atributo primario):");
        jLabel38.setText("Daño:");
        jLabel39.setText("Filo:");
        jLabel54.setText("Durabilidad:");

        jPanel20.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel20.add(jLabel37);
        jPanel20.add(jTextField31);
        jPanel20.add(jLabel38);
        jPanel20.add(jTextField32);
        jPanel20.add(jLabel54);
        jPanel20.add(jTextField48);
        jPanel20.add(jLabel39);
        jPanel20.add(jTextField33);

        BtnCrearEspada.setText("Crear");
        BtnCrearEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearEspadaActionPerformed(evt);
            }
        });
        BtnBuscarEspada.setText("Buscar");
        BtnBuscarEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarEspadaActionPerformed(evt);
            }
        });
        BtnMostrarEspada.setText("Mostrar");
        BtnMostrarEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEspadaActionPerformed(evt);
            }
        });
        BtnActualizarEspada.setText("Actualizar");
        BtnActualizarEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarEspadaActionPerformed(evt);
            }
        });
        BtnBorrarEspada.setText("Borrar");
        BtnBorrarEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarEspadaActionPerformed(evt);
            }
        });
        BtnDestruirEspada.setText("Destruir");
        BtnDestruirEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirEspadaActionPerformed(evt);
            }
        });
        BtnPolimorfismoEspada.setText("Demostrar Polimorfismo");
        BtnPolimorfismoEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoEspadaActionPerformed(evt);
            }
        });

        jPanel21.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel21.add(BtnCrearEspada);
        jPanel21.add(BtnBuscarEspada);
        jPanel21.add(BtnMostrarEspada);
        jPanel21.add(BtnActualizarEspada);
        jPanel21.add(BtnBorrarEspada);
        jPanel21.add(BtnDestruirEspada);
        jPanel21.add(BtnPolimorfismoEspada);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(6);
        jTextArea7.setEditable(false);
        jTextArea7.setLineWrap(true);
        jTextArea7.setName("AreaInfoEspada");
        jScrollPane7.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createSequentialGroup()
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Espada", jPanel19);

        // ---------- Pestaña Ataque ----------
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        BtnCrearAtaque = new javax.swing.JButton();
        BtnBuscarAtaque = new javax.swing.JButton();
        BtnMostrarAtaque = new javax.swing.JButton();
        BtnActualizarAtaque = new javax.swing.JButton();
        BtnBorrarAtaque = new javax.swing.JButton();
        BtnDestruirAtaque = new javax.swing.JButton();
        BtnPolimorfismoAtaque = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();

        jTextField34.setName("TXTNombreAtaque");
        jTextField35.setName("TXTCostoAtaque");
        jTextField36.setName("TXTPoderAtaque");
        jTextField37.setName("TXTDanoExtraAtaque");
        jLabel40.setText("Nombre (atributo primario):");
        jLabel41.setText("Costo:");
        jLabel42.setText("Poder:");
        jLabel43.setText("Daño extra:");

        jPanel23.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel23.add(jLabel40);
        jPanel23.add(jTextField34);
        jPanel23.add(jLabel41);
        jPanel23.add(jTextField35);
        jPanel23.add(jLabel42);
        jPanel23.add(jTextField36);
        jPanel23.add(jLabel43);
        jPanel23.add(jTextField37);

        BtnCrearAtaque.setText("Crear");
        BtnCrearAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearAtaqueActionPerformed(evt);
            }
        });
        BtnBuscarAtaque.setText("Buscar");
        BtnBuscarAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarAtaqueActionPerformed(evt);
            }
        });
        BtnMostrarAtaque.setText("Mostrar");
        BtnMostrarAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarAtaqueActionPerformed(evt);
            }
        });
        BtnActualizarAtaque.setText("Actualizar");
        BtnActualizarAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarAtaqueActionPerformed(evt);
            }
        });
        BtnBorrarAtaque.setText("Borrar");
        BtnBorrarAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarAtaqueActionPerformed(evt);
            }
        });
        BtnDestruirAtaque.setText("Destruir");
        BtnDestruirAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirAtaqueActionPerformed(evt);
            }
        });
        BtnPolimorfismoAtaque.setText("Demostrar Polimorfismo");
        BtnPolimorfismoAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoAtaqueActionPerformed(evt);
            }
        });

        jPanel24.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel24.add(BtnCrearAtaque);
        jPanel24.add(BtnBuscarAtaque);
        jPanel24.add(BtnMostrarAtaque);
        jPanel24.add(BtnActualizarAtaque);
        jPanel24.add(BtnBorrarAtaque);
        jPanel24.add(BtnDestruirAtaque);
        jPanel24.add(BtnPolimorfismoAtaque);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(6);
        jTextArea8.setEditable(false);
        jTextArea8.setLineWrap(true);
        jTextArea8.setName("AreaInfoAtaque");
        jScrollPane8.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createSequentialGroup()
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Ataque", jPanel22);

        // ---------- Pestaña Buffo ----------
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        BtnCrearBuffo = new javax.swing.JButton();
        BtnBuscarBuffo = new javax.swing.JButton();
        BtnMostrarBuffo = new javax.swing.JButton();
        BtnActualizarBuffo = new javax.swing.JButton();
        BtnBorrarBuffo = new javax.swing.JButton();
        BtnDestruirBuffo = new javax.swing.JButton();
        BtnPolimorfismoBuffo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();

        jTextField38.setName("TXTNombreBuffo");
        jTextField39.setName("TXTCostoBuffo");
        jTextField40.setName("TXTPoderBuffo");
        jTextField41.setName("TXTDuracionTurnosBuffo");
        jLabel44.setText("Nombre (atributo primario):");
        jLabel45.setText("Costo:");
        jLabel46.setText("Poder:");
        jLabel47.setText("Duración (turnos):");

        jPanel26.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel26.add(jLabel44);
        jPanel26.add(jTextField38);
        jPanel26.add(jLabel45);
        jPanel26.add(jTextField39);
        jPanel26.add(jLabel46);
        jPanel26.add(jTextField40);
        jPanel26.add(jLabel47);
        jPanel26.add(jTextField41);

        BtnCrearBuffo.setText("Crear");
        BtnCrearBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearBuffoActionPerformed(evt);
            }
        });
        BtnBuscarBuffo.setText("Buscar");
        BtnBuscarBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarBuffoActionPerformed(evt);
            }
        });
        BtnMostrarBuffo.setText("Mostrar");
        BtnMostrarBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarBuffoActionPerformed(evt);
            }
        });
        BtnActualizarBuffo.setText("Actualizar");
        BtnActualizarBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarBuffoActionPerformed(evt);
            }
        });
        BtnBorrarBuffo.setText("Borrar");
        BtnBorrarBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarBuffoActionPerformed(evt);
            }
        });
        BtnDestruirBuffo.setText("Destruir");
        BtnDestruirBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirBuffoActionPerformed(evt);
            }
        });
        BtnPolimorfismoBuffo.setText("Demostrar Polimorfismo");
        BtnPolimorfismoBuffo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoBuffoActionPerformed(evt);
            }
        });

        jPanel27.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel27.add(BtnCrearBuffo);
        jPanel27.add(BtnBuscarBuffo);
        jPanel27.add(BtnMostrarBuffo);
        jPanel27.add(BtnActualizarBuffo);
        jPanel27.add(BtnBorrarBuffo);
        jPanel27.add(BtnDestruirBuffo);
        jPanel27.add(BtnPolimorfismoBuffo);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(6);
        jTextArea9.setEditable(false);
        jTextArea9.setLineWrap(true);
        jTextArea9.setName("AreaInfoBuffo");
        jScrollPane9.setViewportView(jTextArea9);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createSequentialGroup()
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Buffo", jPanel25);

        // ---------- Pestaña Curacion ----------
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        BtnCrearCuracion = new javax.swing.JButton();
        BtnBuscarCuracion = new javax.swing.JButton();
        BtnMostrarCuracion = new javax.swing.JButton();
        BtnActualizarCuracion = new javax.swing.JButton();
        BtnBorrarCuracion = new javax.swing.JButton();
        BtnDestruirCuracion = new javax.swing.JButton();
        BtnPolimorfismoCuracion = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();

        jTextField42.setName("TXTNombreCuracion");
        jTextField43.setName("TXTCostoCuracion");
        jTextField44.setName("TXTPoderCuracion");
        jTextField45.setName("TXTPuntosRestauradosCuracion");
        jLabel48.setText("Nombre (atributo primario):");
        jLabel49.setText("Costo:");
        jLabel50.setText("Poder:");
        jLabel51.setText("Puntos restaurados:");

        jPanel29.setLayout(new java.awt.GridLayout(0, 2, 8, 8));
        jPanel29.add(jLabel48);
        jPanel29.add(jTextField42);
        jPanel29.add(jLabel49);
        jPanel29.add(jTextField43);
        jPanel29.add(jLabel50);
        jPanel29.add(jTextField44);
        jPanel29.add(jLabel51);
        jPanel29.add(jTextField45);

        BtnCrearCuracion.setText("Crear");
        BtnCrearCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCuracionActionPerformed(evt);
            }
        });
        BtnBuscarCuracion.setText("Buscar");
        BtnBuscarCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCuracionActionPerformed(evt);
            }
        });
        BtnMostrarCuracion.setText("Mostrar");
        BtnMostrarCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarCuracionActionPerformed(evt);
            }
        });
        BtnActualizarCuracion.setText("Actualizar");
        BtnActualizarCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarCuracionActionPerformed(evt);
            }
        });
        BtnBorrarCuracion.setText("Borrar");
        BtnBorrarCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarCuracionActionPerformed(evt);
            }
        });
        BtnDestruirCuracion.setText("Destruir");
        BtnDestruirCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDestruirCuracionActionPerformed(evt);
            }
        });
        BtnPolimorfismoCuracion.setText("Demostrar Polimorfismo");
        BtnPolimorfismoCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPolimorfismoCuracionActionPerformed(evt);
            }
        });

        jPanel30.setLayout(new java.awt.GridLayout(0, 4, 6, 6));
        jPanel30.add(BtnCrearCuracion);
        jPanel30.add(BtnBuscarCuracion);
        jPanel30.add(BtnMostrarCuracion);
        jPanel30.add(BtnActualizarCuracion);
        jPanel30.add(BtnBorrarCuracion);
        jPanel30.add(BtnDestruirCuracion);
        jPanel30.add(BtnPolimorfismoCuracion);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(6);
        jTextArea10.setEditable(false);
        jTextArea10.setLineWrap(true);
        jTextArea10.setName("AreaInfoCuracion");
        jScrollPane10.setViewportView(jTextArea10);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createSequentialGroup()
            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jTabbedPane1.addTab("Curacion", jPanel28);


        // ---------- Layout del frame ----------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // =====================================================================
    // ===========================  ENEMIGO  ==============================
    // =====================================================================

    private void BtnCrearEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearEnemigoActionPerformed
        if (enemigoActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Enemigo, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField1.getText());
            String tipo = (String) jComboBox1.getSelectedItem();
            int vida = validarEntero(jTextField2.getText(), "Vida", 1, 100000);
            int nivel = validarEntero(jTextField3.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField4.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField5.getText(), "Defensa", 0, 100000);
            float distancia = (float) validarDecimal(jTextField6.getText(), "Distancia de detección", 0, 10000);
            int recompensa = validarEntero(jTextField7.getText(), "Recompensa XP", 0, 1000000);
            boolean vivo = jCheckBox1.isSelected();

            enemigoActual = new Enemigo(distancia, recompensa, tipo, nombre, vida, nivel, dano, defensa, vivo);
            jTextArea1.setText(enemigoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Enemigo creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearEnemigoActionPerformed

    private void BtnBuscarEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Enemigo creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del enemigo a buscar:");
        if (buscado == null) {
            return;
        }
        if (enemigoActual.getNombre() != null && enemigoActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea1.setText(enemigoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Enemigo encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un enemigo con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarEnemigoActionPerformed

    private void BtnMostrarEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Enemigo creado.");
            jTextArea1.setText("");
        } else {
            jTextArea1.setText(enemigoActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarEnemigoActionPerformed

    private void BtnActualizarEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Enemigo para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField1.getText());
            String tipo = (String) jComboBox1.getSelectedItem();
            int vida = validarEntero(jTextField2.getText(), "Vida", 1, 100000);
            int nivel = validarEntero(jTextField3.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField4.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField5.getText(), "Defensa", 0, 100000);
            float distancia = (float) validarDecimal(jTextField6.getText(), "Distancia de detección", 0, 10000);
            int recompensa = validarEntero(jTextField7.getText(), "Recompensa XP", 0, 1000000);
            boolean vivo = jCheckBox1.isSelected();

            enemigoActual.setNombre(nombre);
            enemigoActual.setTipo(tipo);
            enemigoActual.setVida(vida);
            enemigoActual.setNivel(nivel);
            enemigoActual.setDaño(dano);
            enemigoActual.setDefensa(defensa);
            enemigoActual.setEstaVivo(vivo);
            enemigoActual.setDistanciaDeteccion(distancia);
            enemigoActual.setRecompensaXP(recompensa);

            jTextArea1.setText(enemigoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Enemigo actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarEnemigoActionPerformed

    private void BtnBorrarEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Enemigo para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este Enemigo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            enemigoActual.setNombre("");
            enemigoActual.setTipo("");
            enemigoActual.setVida(0);
            enemigoActual.setNivel(0);
            enemigoActual.setDaño(0);
            enemigoActual.setDefensa(0);
            enemigoActual.setEstaVivo(false);
            enemigoActual.setDistanciaDeteccion(0f);
            enemigoActual.setRecompensaXP(0);
            limpiarCamposEnemigo();
            jTextArea1.setText(enemigoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del enemigo borrados.");
        }
    }//GEN-LAST:event_BtnBorrarEnemigoActionPerformed

    private void BtnDestruirEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Enemigo para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este Enemigo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            enemigoActual = null;
            limpiarCamposEnemigo();
            jTextArea1.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Enemigo ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirEnemigoActionPerformed

    private void BtnPolimorfismoEnemigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoEnemigoActionPerformed
        if (enemigoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Enemigo para demostrar el polimorfismo.");
            return;
        }
        Personaje ref = enemigoActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Personaje\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.realizarAccion() -> ").append(ref.realizarAccion()).append("\n");
        sb.append("ref.calcularPoderAtaque() -> ").append(ref.calcularPoderAtaque()).append("\n");
        sb.append("ref.obtenerEstado() -> ").append(ref.obtenerEstado());
        jTextArea1.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoEnemigoActionPerformed

    private void limpiarCamposEnemigo() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jCheckBox1.setSelected(false);
        jComboBox1.setSelectedIndex(0);
    }

    // =====================================================================
    // =========================  PROTAGONISTA  ============================
    // =====================================================================

    private void BtnCrearProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearProtagonistaActionPerformed
        if (protagonistaActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Protagonista, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField8.getText());
            String tipo = (String) jComboBox2.getSelectedItem();
            int vida = validarEntero(jTextField9.getText(), "Vida", 1, 100000);
            int nivel = validarEntero(jTextField10.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField11.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField12.getText(), "Defensa", 0, 100000);
            int experiencia = validarEntero(jTextField13.getText(), "Experiencia", 0, 10000000);
            boolean vivo = jCheckBox2.isSelected();
            List<String> inventario = parsearInventario(jTextField14.getText());

            protagonistaActual = new Protagonista(experiencia, inventario, tipo, nombre, vida, nivel, dano, defensa, vivo);
            jTextArea2.setText(protagonistaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Protagonista creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearProtagonistaActionPerformed

    private void BtnBuscarProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Protagonista creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del protagonista a buscar:");
        if (buscado == null) {
            return;
        }
        if (protagonistaActual.getNombre() != null && protagonistaActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea2.setText(protagonistaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Protagonista encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un protagonista con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarProtagonistaActionPerformed

    private void BtnMostrarProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Protagonista creado.");
            jTextArea2.setText("");
        } else {
            jTextArea2.setText(protagonistaActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarProtagonistaActionPerformed

    private void BtnActualizarProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Protagonista para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField8.getText());
            String tipo = (String) jComboBox2.getSelectedItem();
            int vida = validarEntero(jTextField9.getText(), "Vida", 1, 100000);
            int nivel = validarEntero(jTextField10.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField11.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField12.getText(), "Defensa", 0, 100000);
            int experiencia = validarEntero(jTextField13.getText(), "Experiencia", 0, 10000000);
            boolean vivo = jCheckBox2.isSelected();
            List<String> inventario = parsearInventario(jTextField14.getText());

            protagonistaActual.setNombre(nombre);
            protagonistaActual.setTipo(tipo);
            protagonistaActual.setVida(vida);
            protagonistaActual.setNivel(nivel);
            protagonistaActual.setDaño(dano);
            protagonistaActual.setDefensa(defensa);
            protagonistaActual.setEstaVivo(vivo);
            protagonistaActual.setExperiencia(experiencia);
            protagonistaActual.setInventario(inventario);

            jTextArea2.setText(protagonistaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Protagonista actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarProtagonistaActionPerformed

    private void BtnBorrarProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Protagonista para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este Protagonista?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            protagonistaActual.setNombre("");
            protagonistaActual.setTipo("");
            protagonistaActual.setVida(0);
            protagonistaActual.setNivel(0);
            protagonistaActual.setDaño(0);
            protagonistaActual.setDefensa(0);
            protagonistaActual.setEstaVivo(false);
            protagonistaActual.setExperiencia(0);
            protagonistaActual.setInventario(new ArrayList<>());
            limpiarCamposProtagonista();
            jTextArea2.setText(protagonistaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del protagonista borrados.");
        }
    }//GEN-LAST:event_BtnBorrarProtagonistaActionPerformed

    private void BtnDestruirProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Protagonista para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este Protagonista?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            protagonistaActual = null;
            limpiarCamposProtagonista();
            jTextArea2.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Protagonista ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirProtagonistaActionPerformed

    private void BtnPolimorfismoProtagonistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoProtagonistaActionPerformed
        if (protagonistaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Protagonista para demostrar el polimorfismo.");
            return;
        }
        Personaje ref = protagonistaActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Personaje\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.realizarAccion() -> ").append(ref.realizarAccion()).append("\n");
        sb.append("ref.calcularPoderAtaque() -> ").append(ref.calcularPoderAtaque()).append("\n");
        sb.append("ref.obtenerEstado() -> ").append(ref.obtenerEstado());
        jTextArea2.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoProtagonistaActionPerformed

    private void limpiarCamposProtagonista() {
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jCheckBox2.setSelected(false);
        jComboBox2.setSelectedIndex(0);
    }

    private List<String> parsearInventario(String texto) {
        List<String> lista = new ArrayList<>();
        if (texto == null || texto.trim().isEmpty()) {
            return lista;
        }
        for (String parte : texto.split(",")) {
            String limpio = parte.trim();
            if (!limpio.isEmpty()) {
                lista.add(limpio);
            }
        }
        return lista;
    }

    // =====================================================================
    // =============================  JEFE  ================================
    // =====================================================================

    private void BtnCrearJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearJefeActionPerformed
        if (jefeActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Jefe, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField15.getText());
            String tipo = (String) jComboBox3.getSelectedItem();
            int vida = validarEntero(jTextField16.getText(), "Vida", 1, 1000000);
            int nivel = validarEntero(jTextField17.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField18.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField19.getText(), "Defensa", 0, 100000);
            int fases = validarEntero(jTextField20.getText(), "Número de fases", 1, 10);
            double furia = validarDecimal(jTextField21.getText(), "Multiplicador de furia", 0.1, 100);
            boolean vivo = jCheckBox3.isSelected();

            jefeActual = new Jefe(fases, furia, tipo, nombre, vida, nivel, dano, defensa, vivo);
            jTextArea3.setText(jefeActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Jefe creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearJefeActionPerformed

    private void BtnBuscarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Jefe creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del jefe a buscar:");
        if (buscado == null) {
            return;
        }
        if (jefeActual.getNombre() != null && jefeActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea3.setText(jefeActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Jefe encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un jefe con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarJefeActionPerformed

    private void BtnMostrarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Jefe creado.");
            jTextArea3.setText("");
        } else {
            jTextArea3.setText(jefeActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarJefeActionPerformed

    private void BtnActualizarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Jefe para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField15.getText());
            String tipo = (String) jComboBox3.getSelectedItem();
            int vida = validarEntero(jTextField16.getText(), "Vida", 1, 1000000);
            int nivel = validarEntero(jTextField17.getText(), "Nivel", 1, 100);
            int dano = validarEntero(jTextField18.getText(), "Daño", 0, 100000);
            int defensa = validarEntero(jTextField19.getText(), "Defensa", 0, 100000);
            int fases = validarEntero(jTextField20.getText(), "Número de fases", 1, 10);
            double furia = validarDecimal(jTextField21.getText(), "Multiplicador de furia", 0.1, 100);
            boolean vivo = jCheckBox3.isSelected();

            jefeActual.setNombre(nombre);
            jefeActual.setTipo(tipo);
            jefeActual.setVida(vida);
            jefeActual.setNivel(nivel);
            jefeActual.setDaño(dano);
            jefeActual.setDefensa(defensa);
            jefeActual.setEstaVivo(vivo);
            jefeActual.setFases(fases);
            jefeActual.setMultiplicadorFuria(furia);

            jTextArea3.setText(jefeActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Jefe actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarJefeActionPerformed

    private void BtnBorrarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Jefe para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este Jefe?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            jefeActual.setNombre("");
            jefeActual.setTipo("");
            jefeActual.setVida(0);
            jefeActual.setNivel(0);
            jefeActual.setDaño(0);
            jefeActual.setDefensa(0);
            jefeActual.setEstaVivo(false);
            jefeActual.setFases(0);
            jefeActual.setMultiplicadorFuria(0);
            limpiarCamposJefe();
            jTextArea3.setText(jefeActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del jefe borrados.");
        }
    }//GEN-LAST:event_BtnBorrarJefeActionPerformed

    private void BtnDestruirJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Jefe para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este Jefe?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            jefeActual = null;
            limpiarCamposJefe();
            jTextArea3.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Jefe ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirJefeActionPerformed

    private void BtnPolimorfismoJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoJefeActionPerformed
        if (jefeActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Jefe para demostrar el polimorfismo.");
            return;
        }
        Personaje ref = jefeActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Personaje\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.realizarAccion() -> ").append(ref.realizarAccion()).append("\n");
        sb.append("ref.calcularPoderAtaque() -> ").append(ref.calcularPoderAtaque()).append("\n");
        sb.append("ref.obtenerEstado() -> ").append(ref.obtenerEstado());
        jTextArea3.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoJefeActionPerformed

    private void limpiarCamposJefe() {
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jCheckBox3.setSelected(false);
        jComboBox3.setSelectedIndex(0);
    }

    private void BtnCrearArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearArcoActionPerformed
        if (arcoActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Arco, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField22.getText());
            int v1 = validarEntero(jTextField23.getText(), "Daño", 0, 100000);
            float v2 = (float) validarDecimal(jTextField24.getText(), "Alcance", 0, 1000);
            int durabilidad = validarEntero(jTextField46.getText(), "Durabilidad", 0, 1000);
            arcoActual = new Arco(nombre, v1, durabilidad, v2);
            jTextArea4.setText(arcoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Arco creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearArcoActionPerformed

    private void BtnBuscarArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Arco creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la arco a buscar:");
        if (buscado == null) {
            return;
        }
        if (arcoActual.getNombre() != null && arcoActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea4.setText(arcoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Arco encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) arco con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarArcoActionPerformed

    private void BtnMostrarArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Arco creado.");
            jTextArea4.setText("");
        } else {
            jTextArea4.setText(arcoActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarArcoActionPerformed

    private void BtnActualizarArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Arco para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField22.getText());
            int v1 = validarEntero(jTextField23.getText(), "Daño", 0, 100000);
            float v2 = (float) validarDecimal(jTextField24.getText(), "Alcance", 0, 1000);
            int durabilidad = validarEntero(jTextField46.getText(), "Durabilidad", 0, 1000);
            arcoActual.setNombre(nombre);
            arcoActual.setDaño(v1);
            arcoActual.setDurabilidad(durabilidad);
            arcoActual.setAlcance(v2);
            jTextArea4.setText(arcoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Arco actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarArcoActionPerformed

    private void BtnBorrarArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Arco para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Arco?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            arcoActual.setNombre("");
            arcoActual.setDaño(0);
            arcoActual.setDurabilidad(0);
            arcoActual.setAlcance(0f);
            limpiarCamposArco();
            jTextArea4.setText(arcoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la arco borrados.");
        }
    }//GEN-LAST:event_BtnBorrarArcoActionPerformed

    private void BtnDestruirArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Arco para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Arco?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            arcoActual = null;
            limpiarCamposArco();
            jTextArea4.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Arco ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirArcoActionPerformed

    private void BtnPolimorfismoArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoArcoActionPerformed
        if (arcoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Arco para demostrar el polimorfismo.");
            return;
        }
        Armas ref = arcoActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Armas\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularValorCombate() -> ").append(ref.calcularValorCombate()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea4.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoArcoActionPerformed

    private void limpiarCamposArco() {
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField46.setText("");
    }

    private void BtnCrearBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearBastonActionPerformed
        if (bastonActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Baston, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField25.getText());
            int v1 = validarEntero(jTextField26.getText(), "Daño mágico", 0, 100000);
            int v2 = validarEntero(jTextField27.getText(), "Bonus de maná", 0, 100000);
            int durabilidad = validarEntero(jTextField47.getText(), "Durabilidad", 0, 1000);
            bastonActual = new Baston(nombre, v1, durabilidad, v2);
            jTextArea5.setText(bastonActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Baston creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearBastonActionPerformed

    private void BtnBuscarBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Baston creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la baston a buscar:");
        if (buscado == null) {
            return;
        }
        if (bastonActual.getNombre() != null && bastonActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea5.setText(bastonActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Baston encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) baston con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarBastonActionPerformed

    private void BtnMostrarBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Baston creado.");
            jTextArea5.setText("");
        } else {
            jTextArea5.setText(bastonActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarBastonActionPerformed

    private void BtnActualizarBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Baston para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField25.getText());
            int v1 = validarEntero(jTextField26.getText(), "Daño mágico", 0, 100000);
            int v2 = validarEntero(jTextField27.getText(), "Bonus de maná", 0, 100000);
            int durabilidad = validarEntero(jTextField47.getText(), "Durabilidad", 0, 1000);
            bastonActual.setNombre(nombre);
            bastonActual.setDaño(v1);
            bastonActual.setDurabilidad(durabilidad);
            bastonActual.setBonusMana(v2);
            jTextArea5.setText(bastonActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Baston actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarBastonActionPerformed

    private void BtnBorrarBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Baston para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Baston?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            bastonActual.setNombre("");
            bastonActual.setDaño(0);
            bastonActual.setDurabilidad(0);
            bastonActual.setBonusMana(0);
            limpiarCamposBaston();
            jTextArea5.setText(bastonActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la baston borrados.");
        }
    }//GEN-LAST:event_BtnBorrarBastonActionPerformed

    private void BtnDestruirBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Baston para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Baston?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            bastonActual = null;
            limpiarCamposBaston();
            jTextArea5.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Baston ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirBastonActionPerformed

    private void BtnPolimorfismoBastonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoBastonActionPerformed
        if (bastonActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Baston para demostrar el polimorfismo.");
            return;
        }
        Armas ref = bastonActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Armas\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularValorCombate() -> ").append(ref.calcularValorCombate()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea5.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoBastonActionPerformed

    private void limpiarCamposBaston() {
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField47.setText("");
    }

    private void BtnCrearEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearEscudoActionPerformed
        if (escudoActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Escudo, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField28.getText());
            int v1 = validarEntero(jTextField29.getText(), "Defensa extra", 0, 100000);
            int v2 = validarEntero(jTextField30.getText(), "Durabilidad", 0, 100000);
            escudoActual = new Escudo(nombre, v1, v2);
            jTextArea6.setText(escudoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Escudo creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearEscudoActionPerformed

    private void BtnBuscarEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Escudo creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la escudo a buscar:");
        if (buscado == null) {
            return;
        }
        if (escudoActual.getNombre() != null && escudoActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea6.setText(escudoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Escudo encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) escudo con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarEscudoActionPerformed

    private void BtnMostrarEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Escudo creado.");
            jTextArea6.setText("");
        } else {
            jTextArea6.setText(escudoActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarEscudoActionPerformed

    private void BtnActualizarEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Escudo para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField28.getText());
            int v1 = validarEntero(jTextField29.getText(), "Defensa extra", 0, 100000);
            int v2 = validarEntero(jTextField30.getText(), "Durabilidad", 0, 100000);
            escudoActual.setNombre(nombre);
            escudoActual.setDefensaExtra(v1);
            escudoActual.setDurabilidad(v2);
            jTextArea6.setText(escudoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Escudo actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarEscudoActionPerformed

    private void BtnBorrarEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Escudo para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Escudo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            escudoActual.setNombre("");
            escudoActual.setDefensaExtra(0);
            escudoActual.setDurabilidad(0);
            limpiarCamposEscudo();
            jTextArea6.setText(escudoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la escudo borrados.");
        }
    }//GEN-LAST:event_BtnBorrarEscudoActionPerformed

    private void BtnDestruirEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Escudo para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Escudo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            escudoActual = null;
            limpiarCamposEscudo();
            jTextArea6.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Escudo ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirEscudoActionPerformed

    private void BtnPolimorfismoEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoEscudoActionPerformed
        if (escudoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Escudo para demostrar el polimorfismo.");
            return;
        }
        Armas ref = escudoActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Armas\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularValorCombate() -> ").append(ref.calcularValorCombate()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea6.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoEscudoActionPerformed

    private void limpiarCamposEscudo() {
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
    }

    private void BtnCrearEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearEspadaActionPerformed
        if (espadaActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Espada, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField31.getText());
            int v1 = validarEntero(jTextField32.getText(), "Daño", 0, 100000);
            float v2 = (float) validarDecimal(jTextField33.getText(), "Filo", 0, 100);
            int durabilidad = validarEntero(jTextField48.getText(), "Durabilidad", 0, 1000);
            espadaActual = new Espada(nombre, v1, durabilidad, v2);
            jTextArea7.setText(espadaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Espada creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearEspadaActionPerformed

    private void BtnBuscarEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Espada creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la espada a buscar:");
        if (buscado == null) {
            return;
        }
        if (espadaActual.getNombre() != null && espadaActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea7.setText(espadaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Espada encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) espada con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarEspadaActionPerformed

    private void BtnMostrarEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Espada creado.");
            jTextArea7.setText("");
        } else {
            jTextArea7.setText(espadaActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarEspadaActionPerformed

    private void BtnActualizarEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Espada para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField31.getText());
            int v1 = validarEntero(jTextField32.getText(), "Daño", 0, 100000);
            float v2 = (float) validarDecimal(jTextField33.getText(), "Filo", 0, 100);
            int durabilidad = validarEntero(jTextField48.getText(), "Durabilidad", 0, 1000);
            espadaActual.setNombre(nombre);
            espadaActual.setDaño(v1);
            espadaActual.setDurabilidad(durabilidad);
            espadaActual.setFilo(v2);
            jTextArea7.setText(espadaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Espada actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarEspadaActionPerformed

    private void BtnBorrarEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Espada para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Espada?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            espadaActual.setNombre("");
            espadaActual.setDaño(0);
            espadaActual.setDurabilidad(0);
            espadaActual.setFilo(0f);
            limpiarCamposEspada();
            jTextArea7.setText(espadaActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la espada borrados.");
        }
    }//GEN-LAST:event_BtnBorrarEspadaActionPerformed

    private void BtnDestruirEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Espada para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Espada?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            espadaActual = null;
            limpiarCamposEspada();
            jTextArea7.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Espada ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirEspadaActionPerformed

    private void BtnPolimorfismoEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoEspadaActionPerformed
        if (espadaActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Espada para demostrar el polimorfismo.");
            return;
        }
        Armas ref = espadaActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Armas\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularValorCombate() -> ").append(ref.calcularValorCombate()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea7.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoEspadaActionPerformed

    private void limpiarCamposEspada() {
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField48.setText("");
    }

    private void BtnCrearAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearAtaqueActionPerformed
        if (ataqueActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Ataque, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField34.getText());
            int v1 = validarEntero(jTextField35.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField36.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField37.getText(), "Daño extra", 0, 100000);
            ataqueActual = new Ataque(nombre, v1, v2, v3);
            jTextArea8.setText(ataqueActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Ataque creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearAtaqueActionPerformed

    private void BtnBuscarAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Ataque creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la ataque a buscar:");
        if (buscado == null) {
            return;
        }
        if (ataqueActual.getNombre() != null && ataqueActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea8.setText(ataqueActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Ataque encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) ataque con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarAtaqueActionPerformed

    private void BtnMostrarAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Ataque creado.");
            jTextArea8.setText("");
        } else {
            jTextArea8.setText(ataqueActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarAtaqueActionPerformed

    private void BtnActualizarAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Ataque para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField34.getText());
            int v1 = validarEntero(jTextField35.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField36.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField37.getText(), "Daño extra", 0, 100000);
            ataqueActual.setNombre(nombre);
            ataqueActual.setCosto(v1);
            ataqueActual.setPoder(v2);
            ataqueActual.setDañoExtra(v3);
            jTextArea8.setText(ataqueActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Ataque actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarAtaqueActionPerformed

    private void BtnBorrarAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Ataque para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Ataque?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            ataqueActual.setNombre("");
            ataqueActual.setCosto(0);
            ataqueActual.setPoder(0);
            ataqueActual.setDañoExtra(0);
            limpiarCamposAtaque();
            jTextArea8.setText(ataqueActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la ataque borrados.");
        }
    }//GEN-LAST:event_BtnBorrarAtaqueActionPerformed

    private void BtnDestruirAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Ataque para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Ataque?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            ataqueActual = null;
            limpiarCamposAtaque();
            jTextArea8.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Ataque ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirAtaqueActionPerformed

    private void BtnPolimorfismoAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoAtaqueActionPerformed
        if (ataqueActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Ataque para demostrar el polimorfismo.");
            return;
        }
        Habilidad ref = ataqueActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Habilidad\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularEfecto() -> ").append(ref.calcularEfecto()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea8.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoAtaqueActionPerformed

    private void limpiarCamposAtaque() {
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
    }

    private void BtnCrearBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearBuffoActionPerformed
        if (buffoActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Buffo, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField38.getText());
            int v1 = validarEntero(jTextField39.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField40.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField41.getText(), "Duración (turnos)", 1, 20);
            buffoActual = new Buffo(nombre, v1, v2, v3);
            jTextArea9.setText(buffoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Buffo creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearBuffoActionPerformed

    private void BtnBuscarBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Buffo creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la buffo a buscar:");
        if (buscado == null) {
            return;
        }
        if (buffoActual.getNombre() != null && buffoActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea9.setText(buffoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Buffo encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) buffo con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarBuffoActionPerformed

    private void BtnMostrarBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Buffo creado.");
            jTextArea9.setText("");
        } else {
            jTextArea9.setText(buffoActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarBuffoActionPerformed

    private void BtnActualizarBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Buffo para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField38.getText());
            int v1 = validarEntero(jTextField39.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField40.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField41.getText(), "Duración (turnos)", 1, 20);
            buffoActual.setNombre(nombre);
            buffoActual.setCosto(v1);
            buffoActual.setPoder(v2);
            buffoActual.setDuracionTurnos(v3);
            jTextArea9.setText(buffoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Buffo actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarBuffoActionPerformed

    private void BtnBorrarBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Buffo para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Buffo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            buffoActual.setNombre("");
            buffoActual.setCosto(0);
            buffoActual.setPoder(0);
            buffoActual.setDuracionTurnos(0);
            limpiarCamposBuffo();
            jTextArea9.setText(buffoActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la buffo borrados.");
        }
    }//GEN-LAST:event_BtnBorrarBuffoActionPerformed

    private void BtnDestruirBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Buffo para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Buffo?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            buffoActual = null;
            limpiarCamposBuffo();
            jTextArea9.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Buffo ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirBuffoActionPerformed

    private void BtnPolimorfismoBuffoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoBuffoActionPerformed
        if (buffoActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Buffo para demostrar el polimorfismo.");
            return;
        }
        Habilidad ref = buffoActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Habilidad\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularEfecto() -> ").append(ref.calcularEfecto()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea9.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoBuffoActionPerformed

    private void limpiarCamposBuffo() {
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
    }

    private void BtnCrearCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCuracionActionPerformed
        if (curacionActual != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ya existe un objeto Curacion, primero debes destruirlo.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField42.getText());
            int v1 = validarEntero(jTextField43.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField44.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField45.getText(), "Puntos restaurados", 0, 100000);
            curacionActual = new Curacion(nombre, v1, v2, v3);
            jTextArea10.setText(curacionActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Curacion creado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCrearCuracionActionPerformed

    private void BtnBuscarCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún objeto Curacion creado.");
            return;
        }
        String buscado = javax.swing.JOptionPane.showInputDialog(this, "Escribe el nombre del/de la curacion a buscar:");
        if (buscado == null) {
            return;
        }
        if (curacionActual.getNombre() != null && curacionActual.getNombre().trim().equalsIgnoreCase(buscado.trim())) {
            jTextArea10.setText(curacionActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Curacion encontrado.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un(a) curacion con ese nombre.");
        }
    }//GEN-LAST:event_BtnBuscarCuracionActionPerformed

    private void BtnMostrarCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay un objeto Curacion creado.");
            jTextArea10.setText("");
        } else {
            jTextArea10.setText(curacionActual.toString());
        }
    }//GEN-LAST:event_BtnMostrarCuracionActionPerformed

    private void BtnActualizarCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Curacion para actualizar.");
            return;
        }
        try {
            String nombre = validarNombre(jTextField42.getText());
            int v1 = validarEntero(jTextField43.getText(), "Costo", 0, 1000);
            int v2 = validarEntero(jTextField44.getText(), "Poder", 0, 100000);
            int v3 = validarEntero(jTextField45.getText(), "Puntos restaurados", 0, 100000);
            curacionActual.setNombre(nombre);
            curacionActual.setCosto(v1);
            curacionActual.setPoder(v2);
            curacionActual.setPuntosRestaurados(v3);
            jTextArea10.setText(curacionActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Curacion actualizado correctamente.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnActualizarCuracionActionPerformed

    private void BtnBorrarCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Curacion para borrar.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Borrar los datos de este/a Curacion?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            curacionActual.setNombre("");
            curacionActual.setCosto(0);
            curacionActual.setPoder(0);
            curacionActual.setPuntosRestaurados(0);
            limpiarCamposCuracion();
            jTextArea10.setText(curacionActual.toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del/de la curacion borrados.");
        }
    }//GEN-LAST:event_BtnBorrarCuracionActionPerformed

    private void BtnDestruirCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDestruirCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Curacion para destruir.");
            return;
        }
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Destruir este/a Curacion?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            curacionActual = null;
            limpiarCamposCuracion();
            jTextArea10.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "El objeto Curacion ha sido destruido.");
        }
    }//GEN-LAST:event_BtnDestruirCuracionActionPerformed

    private void BtnPolimorfismoCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPolimorfismoCuracionActionPerformed
        if (curacionActual == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un objeto Curacion para demostrar el polimorfismo.");
            return;
        }
        Habilidad ref = curacionActual;
        StringBuilder sb = new StringBuilder();
        sb.append("[Demostración de Polimorfismo]\n");
        sb.append("Tipo de referencia declarado: Habilidad\n");
        sb.append("Tipo real del objeto en memoria: ").append(ref.getClass().getSimpleName()).append("\n");
        sb.append("ref.toString() -> ").append(ref.toString()).append("\n");
        sb.append("ref.ejecutar() -> ").append(ref.ejecutar()).append("\n");
        sb.append("ref.calcularEfecto() -> ").append(ref.calcularEfecto()).append("\n");
        sb.append("ref.obtenerCategoria() -> ").append(ref.obtenerCategoria());
        jTextArea10.setText(sb.toString());
    }//GEN-LAST:event_BtnPolimorfismoCuracionActionPerformed

    private void limpiarCamposCuracion() {
        jTextField42.setText("");
        jTextField43.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
    }

    // =====================================================================
    // ==========================  VALIDACIONES  ===========================
    // =====================================================================

    private String validarNombre(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre (atributo primario) no puede estar vacío.");
        }
        String limpio = texto.trim();
        if (!limpio.matches("[\\p{L} ]{2,30}")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios, entre 2 y 30 caracteres.");
        }
        return limpio;
    }

    private int validarEntero(String texto, String nombreCampo, int minimo, int maximo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" no puede estar vacío.");
        }
        int valor;
        try {
            valor = Integer.parseInt(texto.trim());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" debe ser un número entero válido.");
        }
        if (valor < minimo || valor > maximo) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" debe estar entre " + minimo + " y " + maximo + ".");
        }
        return valor;
    }

    private double validarDecimal(String texto, String nombreCampo, double minimo, double maximo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" no puede estar vacío.");
        }
        double valor;
        try {
            valor = Double.parseDouble(texto.trim());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" debe ser un número válido.");
        }
        if (valor < minimo || valor > maximo) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" debe estar entre " + minimo + " y " + maximo + ".");
        }
        return valor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarArco;
    private javax.swing.JButton BtnActualizarAtaque;
    private javax.swing.JButton BtnActualizarBaston;
    private javax.swing.JButton BtnActualizarBuffo;
    private javax.swing.JButton BtnActualizarCuracion;
    private javax.swing.JButton BtnActualizarEnemigo;
    private javax.swing.JButton BtnActualizarEscudo;
    private javax.swing.JButton BtnActualizarEspada;
    private javax.swing.JButton BtnActualizarJefe;
    private javax.swing.JButton BtnActualizarProtagonista;
    private javax.swing.JButton BtnBorrarArco;
    private javax.swing.JButton BtnBorrarAtaque;
    private javax.swing.JButton BtnBorrarBaston;
    private javax.swing.JButton BtnBorrarBuffo;
    private javax.swing.JButton BtnBorrarCuracion;
    private javax.swing.JButton BtnBorrarEnemigo;
    private javax.swing.JButton BtnBorrarEscudo;
    private javax.swing.JButton BtnBorrarEspada;
    private javax.swing.JButton BtnBorrarJefe;
    private javax.swing.JButton BtnBorrarProtagonista;
    private javax.swing.JButton BtnBuscarArco;
    private javax.swing.JButton BtnBuscarAtaque;
    private javax.swing.JButton BtnBuscarBaston;
    private javax.swing.JButton BtnBuscarBuffo;
    private javax.swing.JButton BtnBuscarCuracion;
    private javax.swing.JButton BtnBuscarEnemigo;
    private javax.swing.JButton BtnBuscarEscudo;
    private javax.swing.JButton BtnBuscarEspada;
    private javax.swing.JButton BtnBuscarJefe;
    private javax.swing.JButton BtnBuscarProtagonista;
    private javax.swing.JButton BtnCrearArco;
    private javax.swing.JButton BtnCrearAtaque;
    private javax.swing.JButton BtnCrearBaston;
    private javax.swing.JButton BtnCrearBuffo;
    private javax.swing.JButton BtnCrearCuracion;
    private javax.swing.JButton BtnCrearEnemigo;
    private javax.swing.JButton BtnCrearEscudo;
    private javax.swing.JButton BtnCrearEspada;
    private javax.swing.JButton BtnCrearJefe;
    private javax.swing.JButton BtnCrearProtagonista;
    private javax.swing.JButton BtnDestruirArco;
    private javax.swing.JButton BtnDestruirAtaque;
    private javax.swing.JButton BtnDestruirBaston;
    private javax.swing.JButton BtnDestruirBuffo;
    private javax.swing.JButton BtnDestruirCuracion;
    private javax.swing.JButton BtnDestruirEnemigo;
    private javax.swing.JButton BtnDestruirEscudo;
    private javax.swing.JButton BtnDestruirEspada;
    private javax.swing.JButton BtnDestruirJefe;
    private javax.swing.JButton BtnDestruirProtagonista;
    private javax.swing.JButton BtnMostrarArco;
    private javax.swing.JButton BtnMostrarAtaque;
    private javax.swing.JButton BtnMostrarBaston;
    private javax.swing.JButton BtnMostrarBuffo;
    private javax.swing.JButton BtnMostrarCuracion;
    private javax.swing.JButton BtnMostrarEnemigo;
    private javax.swing.JButton BtnMostrarEscudo;
    private javax.swing.JButton BtnMostrarEspada;
    private javax.swing.JButton BtnMostrarJefe;
    private javax.swing.JButton BtnMostrarProtagonista;
    private javax.swing.JButton BtnPolimorfismoArco;
    private javax.swing.JButton BtnPolimorfismoAtaque;
    private javax.swing.JButton BtnPolimorfismoBaston;
    private javax.swing.JButton BtnPolimorfismoBuffo;
    private javax.swing.JButton BtnPolimorfismoCuracion;
    private javax.swing.JButton BtnPolimorfismoEnemigo;
    private javax.swing.JButton BtnPolimorfismoEscudo;
    private javax.swing.JButton BtnPolimorfismoEspada;
    private javax.swing.JButton BtnPolimorfismoJefe;
    private javax.swing.JButton BtnPolimorfismoProtagonista;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
