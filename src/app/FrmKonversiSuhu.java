
/*
 * Created with NetBeans GUI Builder
 */

package app;

public class FrmKonversiSuhu extends javax.swing.JFrame {

    public FrmKonversiSuhu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        cmbDari = new javax.swing.JComboBox<>();
        cmbKe = new javax.swing.JComboBox<>();
        btnKonversi = new javax.swing.JButton();
        lblHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Konversi Suhu");

        jLabel1.setText("Masukkan Suhu:");

        cmbDari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));
        cmbKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        lblHasil.setText("Hasil: -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHasil)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtInput))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cmbDari, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbKe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKonversi)
                .addGap(18, 18, 18)
                .addComponent(lblHasil)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double nilai = Double.parseDouble(txtInput.getText());
            String dari = cmbDari.getSelectedItem().toString();
            String ke = cmbKe.getSelectedItem().toString();
            double c;

            switch (dari) {
                case "Celcius" -> c = nilai;
                case "Fahrenheit" -> c = (nilai - 32) * 5 / 9;
                case "Reamur" -> c = nilai * 5 / 4;
                case "Kelvin" -> c = nilai - 273.15;
                default -> c = nilai;
            }

            double hasil = switch (ke) {
                case "Celcius" -> c;
                case "Fahrenheit" -> (c * 9 / 5) + 32;
                case "Reamur" -> (c * 4 / 5);
                case "Kelvin" -> c + 273.15;
                default -> c;
            };

            lblHasil.setText("Hasil: " + hasil + " " + ke);

        } catch (Exception e) {
            lblHasil.setText("Input tidak valid!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrmKonversiSuhu().setVisible(true);
        });
    }

    private javax.swing.JButton btnKonversi;
    private javax.swing.JComboBox<String> cmbDari;
    private javax.swing.JComboBox<String> cmbKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JTextField txtInput;
}
