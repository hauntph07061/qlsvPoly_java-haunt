package Polypro;

import dao.nhanVienDAO;
import helper.dialogHelper;
import helper.shareHelper;
import static helper.shareHelper.USER;
import helper.utilityHelper;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.nhanVien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sieu Nhan Bay
 */
public class nhanVienJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form nhanVienJInternalFrame
     */
    public nhanVienJInternalFrame() {
        initComponents();
        init();
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
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtXacNhanMK = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("Mã nhân viên");

        txtMaNV.setName("Mã nhân viên"); // NOI18N

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Xác nhận mật khẩu");

        txtHoTen.setName("Họ và tên"); // NOI18N

        jLabel5.setText("Họ và tên");

        txtXacNhanMK.setName("Xác nhận mật khẩu"); // NOI18N

        txtMatKhau.setName("Mật khẩu"); // NOI18N

        jLabel6.setText("Vai trò");

        buttonGroup1.add(rdoTruongPhong);
        rdoTruongPhong.setSelected(true);
        rdoTruongPhong.setText("Trưởng phòng ");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân viên");

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add to basket.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unordered list.png"))); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(51, 51, 255));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dau.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(51, 51, 255));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lui.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 153, 0));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tien.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(255, 153, 0));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cuoi.png"))); // NOI18N
        btnLast.setToolTipText("");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNV)
                    .addComponent(txtHoTen)
                    .addComponent(txtXacNhanMK)
                    .addComponent(txtMatKhau)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNhanVien))
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addGap(29, 29, 29)
                                .addComponent(btnFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png")), pnlEdit, "Cập nhật"); // NOI18N

        pnlList.setLayout(new java.awt.BorderLayout());

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NV", "MẬT KHẨU", "HỌ VÀ TÊN", "VAI TRÒ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.setEditingRow(1);
        tblGridView.setRowHeight(25);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);
        if (tblGridView.getColumnModel().getColumnCount() > 0) {
            tblGridView.getColumnModel().getColumn(2).setPreferredWidth(140);
        }

        pnlList.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabs.addTab("DANH SÁCH", new javax.swing.ImageIcon(getClass().getResource("/icon/List.png")), pnlList, "Danh sách"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int index = 0; // vị trí của nhân viên đang đc chọn
    nhanVienDAO dao = new nhanVienDAO();

    void init() {
        setFrameIcon(shareHelper.APP_ICON_1);  //set Icon cho JInternalFrame
        tabs.setSelectedIndex(1);  //chuyển tabsPanel sang tab 2
    }

    //lấy list nhanVien từ CSDL điền vào bảng
    //LƯU Ý: CHỈ TRƯỞNG PHÒNG MỚI XEM ĐƯỢC MẬT KHẨU CỦA NGƯỜI KHÁC
    void load() {
        /*
        2 cách kết nối model với bảng:
        cách 1: DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        cách 2: tblGridView.setModel(model);
         */
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);   //đưa số dòng về 0 (xóa bảng)
        try {
            List<nhanVien> list = dao.select();   //lấy tất cả nhân viên trong CSDL đưa vào list
            /*
            3 cách đưa dữ liệu vào bảng:
            cách 1: dùng mảng 2 chiều
                String[] header ={"ten 1", "ten 2",...};
                Object[][] data ={{x1, x2,...}, {c1, c2,...},...};
                DefaultTableModel model = new DefaultTableModel(header, data);
                tblGridView.setModel(model);
            cách 2: dùng mảng 1 chiều (như trong bài này)
                tblGridView.setModel(model);
                for(...){
                    Object[] row ={x1, x2,...}
                    model.addRow(row);
                }
            cách 3: dùng vector   (như cách 2 nhưng vector thay cho mảng 1 chiều
                tblGridView.setModel(model);
                for(...){
                    Vector row=new Vector();
                    row.add(x1);
                    row.add(x2);
                    ...
                    model.addRow(row);
                }
             */
            for (nhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    shareHelper.USER.isVaiTro()?nv.getMatKhau():matKhauToSao(nv.getMatKhau()),
                    nv.getHoTen(),
                    nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    //chỉ trưởng phòng mới đc xem mật khẩu người khác
    public String matKhauToSao(String pass){
        String sao="";
        for(int i=0;i<pass.length();i++){
            sao+="*";
        }
        return sao;
    }
    //lấy thông tin trên form để
    //thêm (đăng kí) nhân viên - trưởng phòng vào CSDL
    void insert() {
        //getModel() viết ở dưới, lấy thông tin trên form điền vào đt model
        nhanVien model = getModel();
        /*
        2 cách so sánh 2 mật khẩu:
        cách 1: chuyển String về char[] rồi so sanh 2 mảng
            char[] x= chuoi.toCharArray();
            so sánh 2 char[]: boolean b = Array.equals(mang1, mang2);
        cách 2: chuyển char[] về String rồi so sanh 2 chuỗi
            String chuoi = new String(mangChar);   (cách dưới)
            hoặc for(char x: mang){
                    chuoi+=x.toString();
                 }
            rồi so sánh 2 chuỗi: boolean b = chuoi1.equals(chuoi2);
         */
        String confirm = new String(txtXacNhanMK.getPassword()); //cách chuyển char[] sang String
        //so sánh mật khẩu và MK xác nhận
        txtXacNhanMK.setBackground(white);
        if (confirm.equals(model.getMatKhau())) {
            try {
                dao.insert(model);
                this.load();    //cập nhật lại bảng nv
                this.clear();   // xóa trắng form và vẫn để insertable
                dialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Thêm mới thất bại!");
            }
        } else {
            txtXacNhanMK.setBackground(pink);
            dialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        }
    }

    //lấy thông tin trên form để
    //cập nhật nhanVien theo maNV
    void update() {
        nhanVien model = getModel();
        String confirm = new String(txtXacNhanMK.getPassword());
        txtXacNhanMK.setBackground(white);
        if (!confirm.equals(model.getMatKhau())) {
            txtXacNhanMK.setBackground(pink);
            dialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                dao.update(model);     //cập nhật nhân viên theo maNV
                this.load();           //điền tt mới vào bảng
                dialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    //lấy maNV trên form, xóa nv theo maNV
    //xóa trắng form chuyển sang insertable
    void delete() {
        if (dialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            String manv = txtMaNV.getText();
            try {
                dao.delete(manv);   //xóa nhân viên theo maNV
                this.load();        //điền tt mới vào bảng
                this.clear();       //xóa trắng form và chỉnh lại status
                dialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                dialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    //điền thông tin đt nhanVien lên form (theo index)
    //chuyển sang chế độ editable
    void edit() {
        setTrang();
        try {
            String manv = (String) tblGridView.getValueAt(this.index, 0);  //lấy maNV từ bảng theo index
            nhanVien model = dao.findById(manv); //dùng maNV tìm ra đối tượng nhanVien
            if (model != null) {
                this.setModel(model);   //điền thông tin đt nhanVien lên form
                this.setStatus(false);  //chuyển sang editable
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void setTrang(){
        txtMaNV.setBackground(white);
        txtMatKhau.setBackground(white);
        txtXacNhanMK.setBackground(white);
        txtHoTen.setBackground(white);
    }
    //xóa trắng form và chuyển sang chế độ insertable
    void clear() {
        setTrang();
        this.setModel(new nhanVien());  //xóa trắng form
        this.setStatus(true);
    }

    //param nhanVien
    //đưa thông tin nhanVien lên form theo model
    void setModel(nhanVien model) {
        txtMaNV.setText(model.getMaNV());
        txtHoTen.setText(model.getHoTen());
        txtMatKhau.setText(model.getMatKhau());
        txtXacNhanMK.setText(model.getMatKhau());
        rdoTruongPhong.setSelected(model.isVaiTro());
        rdoNhanVien.setSelected(!model.isVaiTro());
    }

    //return nhanVien
    //lấy thông tin trên form cho vào đt nhanVien
    nhanVien getModel() {
        nhanVien model = new nhanVien();
        model.setMaNV(txtMaNV.getText());
        model.setHoTen(txtHoTen.getText());
        model.setMatKhau(new String(txtMatKhau.getPassword()));  //chuyển char[] thành String
        model.setVaiTro(rdoTruongPhong.isSelected());
        return model;
    }

    /*
    param: boolean
    insertable: (true)                                 THÊM NHÂN VIÊN MỚI
        enable: txtMaNV, btnInsert
        disable: btnUpdate, btnDelete, 4 nút điều hướng
    editable: (false) ngược lại                         XEM VÀ SỬA   
    btnClear lúc nào cũng enable
    4 nút điều hướng: disble 2 nút tương ứng khi ở đầu và cuối danh sách
     */
    void setStatus(boolean insertable) {
        txtMaNV.setEditable(insertable);    //enable txtMaNV
        btnInsert.setEnabled(insertable);   //enable btnInsert
        btnUpdate.setEnabled(!insertable);  //disable btnUpdate
        btnDelete.setEnabled(!insertable);  //disable brnDelete
        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);//enable 4 nút này khi ở editable
        btnPrev.setEnabled(!insertable && first); //disable khi First, Prev khi ở bản ghi đầu (index = 0)
        btnNext.setEnabled(!insertable && last);  //disable khi Next, Last khi ở bản ghi cuối
        btnLast.setEnabled(!insertable && last);  //index = tblGridView.getRowCount() - 1
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    //sự kiện khi mở JInternalFrame
    //đổ dữ liệu từ CSDL vào bảng
    //để frame sang chế độ insertable
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblGridView.rowAtPoint(evt.getPoint());//lấy vị trí dòng được chọn
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    public boolean checkTrungMa(JTextField txt) {
        txt.setBackground(white);
        if (dao.findById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(pink);
            dialogHelper.alert(this, txt.getName() + " đã bị tồn tại.");
            return false;
        }
    }
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (utilityHelper.checkNullText(txtMaNV)
                && utilityHelper.checkNullPass(txtMatKhau)
                && utilityHelper.checkNullPass(txtXacNhanMK)
                && utilityHelper.checkNullText(txtHoTen)) {
            if (utilityHelper.checkMaNV(txtMaNV)
                    && utilityHelper.checkPass(txtMatKhau)
                    && utilityHelper.checkName(txtHoTen)) {
                if (checkTrungMa(txtMaNV)) {
                    insert();
                }
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (utilityHelper.checkNullPass(txtMatKhau)
                && utilityHelper.checkNullPass(txtXacNhanMK)
                && utilityHelper.checkNullText(txtHoTen)) {
            if (utilityHelper.checkPass(txtMatKhau)
                    && utilityHelper.checkName(txtHoTen)) {
                update();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public boolean checkChinhMinh(JTextField txt){
        nhanVien nv=dao.findById(txt.getText());
        if (nv.getMaNV().equals(USER.getMaNV())) {
            dialogHelper.alert(this, "bạn không được xóa chính mình.");
            return false;
        } else {
            return true;
        }
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(shareHelper.USER.isVaiTro()){
            if(checkChinhMinh(txtMaNV)){
            delete();
        }
        }else{
            dialogHelper.alert(this, "Chỉ trưởng phòng mới được phép xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables
}
