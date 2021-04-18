package TokoMF;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;


public class TokoMF extends javax.swing.JFrame {
    int id_selected;
    public TokoMF() {
        initComponents();
        readData("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        rbMakanan = new javax.swing.JRadioButton();
        rbMinuman = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnExportPdf = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(894, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Toko MF", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setText("NAMA BARANG");

        jLabel2.setText("HARGA");

        jLabel3.setText("STOK");

        jLabel4.setText("KATEGORI");

        buttonGroup.add(rbMakanan);
        rbMakanan.setSelected(true);
        rbMakanan.setText("MAKANAN");

        buttonGroup.add(rbMinuman);
        rbMinuman.setText("MINUMAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbMakanan)
                        .addGap(18, 18, 18)
                        .addComponent(rbMinuman))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtStok, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(txtHarga)
                        .addComponent(txtNamaBarang)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbMakanan)
                    .addComponent(rbMinuman)))
        );

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("RESET FORM");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(894, 50));

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExportPdf.setText("EXPORT PDF");
        btnExportPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportPdfActionPerformed(evt);
            }
        });

        btnExportExcel.setText("EXPORT EXCEL");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addComponent(btnExportExcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportPdf)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnExportPdf)
                    .addComponent(btnExportExcel))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        search();
    }//GEN-LAST:event_txtCariKeyReleased

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        tabelClick();
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExportPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportPdfActionPerformed
        exportPdf();
    }//GEN-LAST:event_btnExportPdfActionPerformed

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnExportExcelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokoMF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnExportPdf;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbMakanan;
    private javax.swing.JRadioButton rbMinuman;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
    
    
    private void readData(String where){
        try {
            Object[] kolom = {"","NAMA BARANG","HARGA","STOK","KATEGORI"};
            Object[][] data = null;
            DefaultTableModel model = new DefaultTableModel(data,kolom);
            tblData.setModel(model);
            
            Connection konek = connector.konekDb();
            Statement st = konek.createStatement();
            String query = "SELECT * FROM data_barang "+where;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int id_barang = rs.getInt("id_barang");
                String nama_barang = rs.getString("nama_barang");
                int harga = rs.getInt("harga");
                int stok = rs.getInt("stok");
                String kategori = rs.getString("kategori").equals("MAKANAN") ? 
                        "MAKANAN" : "MINUMAN";
                Object[] datas = {id_barang,nama_barang,harga,stok,kategori};
                model.addRow(datas);
            }
            tblData.getColumnModel().getColumn(0).setMinWidth(0);
            tblData.getColumnModel().getColumn(0).setMaxWidth(0);
        } catch (SQLException e) {
        }
    }
    private void insert(){
        try {
            String nama_barang = txtNamaBarang.getText();
            String harga = txtHarga.getText();
            String stok  = txtStok.getText();
            String kategori = rbMakanan.isSelected() ? "MAKANAN" : "MINUMAN";
            if(nama_barang.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi nama barang");
            }else if(harga.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi harga barang");
            }else if(stok.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi stok barang");
            }else{
                int hargabaru = Integer.parseInt(harga);
                int stokbaru = Integer.parseInt(stok);
                
                Connection konek = connector.konekDb();
                Statement st = konek.createStatement();
                String query = "INSERT INTO data_barang (nama_barang,harga,stok,kategori)"
                        + "VALUES ('"+nama_barang+"','"+hargabaru+"','"+stokbaru+"','"+kategori+"')";
                st.executeUpdate(query);
                readData("");
                resetForm();
                JOptionPane.showMessageDialog(this,"Data berhasil ditambahkan");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void search(){
        try {
            String key = txtCari.getText();
            String where = key.isEmpty() ? "" : ""
                    + " WHERE "
                    + "nama_barang LIKE '%"+key+"%' OR "
                    + "harga LIKE '%"+key+"%' OR "
                    + "stok LIKE '%"+key+"%' OR "
                    + "kategori LIKE '%"+key+"%'";
            readData(where);
        } catch (Exception e) {
        }
    }
    private void tabelClick() {
        try {
            int baris = tblData.getSelectedRow();
            if(baris != -1){
                String id_barang  = tblData.getValueAt(baris, 0).toString();
                String nama_barang  = tblData.getValueAt(baris, 1).toString();
                String harga  = tblData.getValueAt(baris, 2).toString();
                String stok  = tblData.getValueAt(baris, 3).toString();
                String kategori  = tblData.getValueAt(baris, 4).toString();
                
                id_selected = Integer.parseInt(id_barang);
                txtNamaBarang.setText(nama_barang);
                txtHarga.setText(harga);
                txtStok.setText(stok);
                if(kategori.equalsIgnoreCase("MAKANAN")){
                    rbMakanan.setSelected(true);
                }else{
                    rbMinuman.setSelected(true);
                }
                btnInsert.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
            }
        } catch (Exception e) {
        }
    }        
    private void delete() {
        try {
            Connection konek = connector.konekDb();
            Statement st = konek.createStatement();
            st.executeUpdate("DELETE FROM data_barang WHERE id_barang="+id_selected);
            readData("");
            resetForm();
            JOptionPane.showMessageDialog(this, "Data Telah Terhapus");
        } catch (SQLException e) {
        }
    }
    private void resetForm() {
        
        txtNamaBarang.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        rbMakanan.setSelected(true);
        btnInsert.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    private void update() {
        try {
            String nama_barang = txtNamaBarang.getText();
            String harga = txtHarga.getText();
            String stok  = txtStok.getText();
            String kategori = rbMakanan.isSelected() ? "MAKANAN" : "MINUMAN";
            if(nama_barang.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi nama barang");
            }else if(harga.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi harga barang");
            }else if(stok.isEmpty()){
                JOptionPane.showMessageDialog(this, "Anda belum mengisi stok barang");
            }else{
                int hargabaru = Integer.parseInt(harga);
                int stokbaru = Integer.parseInt(stok);
                Connection konek = connector.konekDb();
                Statement st = konek.createStatement();
                String query = "UPDATE data_barang SET "
                        + "nama_barang='"+nama_barang+"',"
                        + "harga='"+hargabaru+"',"
                        + "stok='"+stokbaru+"',"
                        + "kategori='"+kategori+"' "
                        + "WHERE id_barang="+id_selected;
                st.executeUpdate(query);
                readData("");
                resetForm();
                JOptionPane.showMessageDialog(this,"Data berhasil diubah");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }       

    private void exportPdf() {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x== JFileChooser.APPROVE_OPTION){
            path= j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"DataGudang.pdf"));
            doc.open();
        
        PdfPTable tbl = new PdfPTable(4);
        
        tbl.addCell("Nama Barang");
        tbl.addCell("Harga");
        tbl.addCell("Stok");
        tbl.addCell("Kategori");
        
        for (int baris = 0; baris < tblData.getRowCount(); baris++) {
            
                String nama_barang= tblData.getValueAt(baris, 1).toString();
                String harga = tblData.getValueAt(baris, 2).toString();
                String stok = tblData.getValueAt(baris, 3).toString();
                String kategori = tblData.getValueAt(baris, 4).toString();
                
                tbl.addCell(nama_barang);
                tbl.addCell(harga);
                tbl.addCell(stok);
                tbl.addCell(kategori);
                
        }
        doc.add(tbl);
        JOptionPane.showMessageDialog(this, "Data sudah diexport kedalam Pdf");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(TokoMF.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
        
    }

    private void exportExcel() {
        FileWriter fileWriter;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                TableModel tModel = tblData.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
         
                for(int i = 1; i < tModel.getColumnCount(); i++){
                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
           
                for(int i=0; i < tModel.getRowCount(); i++) {
                for(int j=1; j < tModel.getColumnCount(); j++) {
                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                JOptionPane.showMessageDialog(rootPane,"Data sudah diexport kedalam excel");
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }
    }
    
}
