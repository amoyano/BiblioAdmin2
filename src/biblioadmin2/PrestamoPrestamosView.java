/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrestamosView.java
 *
 * Created on 14-may-2011, 18:54:40
 */

package biblioadmin2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import locators.ModelLocator;
import managers.PrestamoManager;
import models.Prestamo;
import org.jdesktop.application.Action;

/**
 *
 * @author agustinmoyano
 */
public class PrestamoPrestamosView extends javax.swing.JFrame {

    /** Creates new form PrestamosView */
    public PrestamoPrestamosView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnSala = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(biblioadmin2.BiblioAdmin2App.class).getContext().getResourceMap(PrestamoPrestamosView.class);
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        txtLibro.setEditable(false);
        txtLibro.setText(resourceMap.getString("txtLibro.text")); // NOI18N
        txtLibro.setName("txtLibro"); // NOI18N

        txtAutor.setEditable(false);
        txtAutor.setText(resourceMap.getString("txtAutor.text")); // NOI18N
        txtAutor.setName("txtAutor"); // NOI18N

        txtEditorial.setEditable(false);
        txtEditorial.setText(resourceMap.getString("txtEditorial.text")); // NOI18N
        txtEditorial.setName("txtEditorial"); // NOI18N

        txtDNI.setEditable(false);
        txtDNI.setText(resourceMap.getString("txtDNI.text")); // NOI18N
        txtDNI.setName("txtDNI"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(biblioadmin2.BiblioAdmin2App.class).getContext().getActionMap(PrestamoPrestamosView.class, this);
        jButton1.setAction(actionMap.get("showSocioView")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        txtNombre.setEditable(false);
        txtNombre.setText(resourceMap.getString("txtNombre.text")); // NOI18N
        txtNombre.setName("txtNombre"); // NOI18N

        txtApellido.setEditable(false);
        txtApellido.setText(resourceMap.getString("txtApellido.text")); // NOI18N
        txtApellido.setName("txtApellido"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jButton2.setAction(actionMap.get("realizarPrestamo")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setAction(actionMap.get("cancelar")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        btnReservar.setAction(actionMap.get("reservar")); // NOI18N
        btnReservar.setText(resourceMap.getString("btnReservar.text")); // NOI18N
        btnReservar.setName("btnReservar"); // NOI18N

        btnSala.setAction(actionMap.get("enSala")); // NOI18N
        btnSala.setText(resourceMap.getString("btnSala.text")); // NOI18N
        btnSala.setName("btnSala"); // NOI18N

        jButton6.setAction(actionMap.get("showLibroView")); // NOI18N
        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnSala, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnReservar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel1)
                                            .add(jLabel3)
                                            .add(jLabel2))
                                        .add(22, 22, 22)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(txtAutor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .add(txtLibro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .add(txtEditorial, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel4)
                                            .add(jLabel6)
                                            .add(jLabel5))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(txtNombre, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .add(txtDNI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .add(txtApellido, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButton6)
                                    .add(jButton1)))
                            .add(layout.createSequentialGroup()
                                .add(143, 143, 143)
                                .add(jLabel7)))
                        .add(28, 28, 28)))
                .add(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtLibro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtAutor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtEditorial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(txtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtApellido, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnReservar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Action
    public void cancelar() {
        this.dispose();
    }

    @Action
    public void showLibroView() {

        if ( seleccionarLibroView == null) {
            JFrame mainFrame = BiblioAdmin2App.getApplication().getMainFrame();
            seleccionarLibroView = new PrestamoSeleccionarLibroView();
            seleccionarLibroView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            seleccionarLibroView.addWindowListener(new WindowAdapter() {
                
                
                 public void windowClosed(WindowEvent e) {
                   setDatosLibro(ModelLocator.getInstance().libroPrestamo.titulo,
                   ModelLocator.getInstance().libroPrestamo.autor ,
                   ModelLocator.getInstance().libroPrestamo.editorial);
            }
                 
            });
            seleccionarLibroView.setLocationRelativeTo(mainFrame);
        }
        seleccionarLibroView.show();

    }

        @Action
    public void showSocioView() {

        if ( seleccionarSocioView == null) {
            JFrame mainFrame = BiblioAdmin2App.getApplication().getMainFrame();
            seleccionarSocioView = new PrestamoSeleccionarSocioView();
            seleccionarSocioView.setLocationRelativeTo(mainFrame);
            seleccionarSocioView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            seleccionarSocioView.addWindowListener(new WindowAdapter() {
                
                
                 public void windowClosed(WindowEvent e) {
            
            if (ModelLocator.getInstance().socioPrestamo != null) {
                setDatosSocio(ModelLocator.getInstance().socioPrestamo.dni,
                   ModelLocator.getInstance().socioPrestamo.nombre ,
                   ModelLocator.getInstance().socioPrestamo.apellido);
            }
             
                 }
            });
                    
        }
        seleccionarSocioView.show();

    }

    @Action
    public void realizarPrestamo() {
        if (!this.txtLibro.getText().isEmpty() && !this.txtDNI.getText().isEmpty()){
        Prestamo prestamo = new Prestamo();
        prestamo.fechaEntrega = new Date();
        prestamo.libro = ModelLocator.getInstance().libroPrestamo;
        prestamo.socio = ModelLocator.getInstance().socioPrestamo;
        Boolean b = PrestamoManager.getInstance().prestamo(prestamo.socio,prestamo.libro);
        if(b){
           JOptionPane.showMessageDialog(this, "Se realizo el prestamo");
             this.cancelar();
       }
       else
       {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la prestamo");
       }
       

        }
        else{
            System.out.println("Seleccione libro y/o socio");
        }
        
    }
    public  void  setDatosLibro(String titulo, String autor, String editorial){
        this.txtLibro.setText(titulo);
        this.txtAutor.setText(autor);
        this.txtEditorial.setText(editorial);
        
    }

    public  void  setDatosSocio(String dni, String nombre, String apellido){
        this.txtDNI.setText(dni);
        this.txtApellido.setText(apellido);
        this.txtNombre.setText(nombre);
    }

    @Action
    public void enSala() {
        if (!this.txtLibro.getText().isEmpty() && !this.txtDNI.getText().isEmpty()){
         Prestamo prestamo = new Prestamo();
        prestamo.fechaEntrega = new Date();
        prestamo.libro = ModelLocator.getInstance().libroPrestamo;
        prestamo.socio = ModelLocator.getInstance().socioPrestamo;
        Boolean b = PrestamoManager.getInstance().prestamoEnSala(prestamo.socio,prestamo.libro);
        if(b){
           JOptionPane.showMessageDialog(this, "Se realizo el prestamo EN SALA");
             this.cancelar();

       }
       else
       {
            JOptionPane.showMessageDialog(this, "No se pudo realizar el prestamo EN SALA");
       }
      
        }
        else{
             JOptionPane.showMessageDialog(this,"Seleccione libro y/o socio");
        }
    }

    @Action
    public void reservar() {
      if (!this.txtLibro.getText().isEmpty() && !this.txtDNI.getText().isEmpty()){
        Prestamo prestamo = new Prestamo();
        prestamo.fechaEntrega = new Date();
        prestamo.libro = ModelLocator.getInstance().libroPrestamo;
        prestamo.socio = ModelLocator.getInstance().socioPrestamo;
        Boolean b = PrestamoManager.getInstance().prestamoReserva(prestamo.socio,prestamo.libro);
        if(b){
           JOptionPane.showMessageDialog(this, "Se realizo la reserva");
             this.cancelar();
       }
       else
       {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la reserva");
       }
        }
        else{
             JOptionPane.showMessageDialog(this,"Seleccione libro y/o socio");
        }
        
       
      
      
    }

    private JFrame seleccionarLibroView;
    private JFrame seleccionarSocioView;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
