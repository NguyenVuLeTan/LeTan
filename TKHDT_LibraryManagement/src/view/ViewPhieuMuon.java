package view;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewPhieuMuon extends JPanel {
    private JButton btnTimPhieu, btnThemPhieu, btnXoaPhieu, btnCapNhatSachMuon;
    private JTable table;
    private JScrollPane scrollPane;
    private JTextField txtMaPhieu;

    public ViewPhieuMuon() {
        initializeComponents();
    }

    private void initializeComponents() {
        setLayout(new BorderLayout());

        // Panel chứa các button và ô nhập liệu
        JPanel buttonPanel = new JPanel();
        btnTimPhieu = new JButton("Tìm phiếu");
        btnThemPhieu = new JButton("Thêm phiếu");
        btnXoaPhieu = new JButton("Xóa phiếu");
        btnCapNhatSachMuon = new JButton("Chỉnh sửa phiếu");
        buttonPanel.add(btnTimPhieu);
        buttonPanel.add(btnThemPhieu);
        buttonPanel.add(btnXoaPhieu);
        buttonPanel.add(btnCapNhatSachMuon);

        JPanel inputPanel = new JPanel();
        JLabel lblMaPhieu = new JLabel("Mã phiếu:");
        txtMaPhieu = new JTextField(10);
        inputPanel.add(lblMaPhieu);
        inputPanel.add(txtMaPhieu);

        // Bảng dữ liệu
        String[] columnNames = {"Mã phiếu", "Mã khách hàng", "Thông tin sách", "Tiền mượn sách", "Ngày mượn", "Ngày dự kiến trả", "Tình trạng"};
        Object[][] data = {};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        // Thêm thanh cuộn ngang và dọc cho bảng
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Thêm các component vào panel
        add(buttonPanel, BorderLayout.SOUTH);
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Tạo frame để hiển thị panel
        JFrame frame = new JFrame("ViewPhieuMuon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ViewPhieuMuon());
        frame.setSize(800, 400); // Cài đặt kích thước giao diện
        frame.setVisible(true);
    }
}