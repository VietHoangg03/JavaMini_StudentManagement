package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_MaThiSinh_TimKiem;
	public JTable table;
	public JTextField textField_ID;
	public JTextField textField_HoVaTen;
	public JTextField textField_NgaySinh;
	public JTextField textField_Mon1;
	public JTextField textField_Mon2;
	public JTextField textField_Mon3;
	public ButtonGroup buttonGroup_GioiTinh;
	public JComboBox comboBox_queQuan;
	public JRadioButton radioButton_Nam;
	public JRadioButton radioButton_Nu;
	public JComboBox comboBox_queQuan_timKiem;

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 669);
		setLocationRelativeTo(null);
		
		
		
		// Action listener
		ActionListener actionListener = new QLSVController(this);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(actionListener);
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(actionListener);
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(actionListener);
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.addActionListener(actionListener);
		menuBar.add(menuAbout);
		
		JMenuItem menuItemAbout = new JMenuItem("About me");
		menuItemAbout.addActionListener(actionListener);
		menuAbout.add(menuItemAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueQuan = new JLabel("Quê quán:");
		lblQueQuan.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblQueQuan.setBounds(35, 6, 94, 39);
		contentPane.add(lblQueQuan);
		
		JLabel lblMaThiSinh = new JLabel("Mã thí sinh:");
		lblMaThiSinh.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMaThiSinh.setBounds(296, 6, 121, 39);
		contentPane.add(lblMaThiSinh);
		
		textField_MaThiSinh_TimKiem = new JTextField();
		textField_MaThiSinh_TimKiem.setColumns(10);
		textField_MaThiSinh_TimKiem.setBounds(376, 7, 167, 39);
		contentPane.add(textField_MaThiSinh_TimKiem);
		
		JButton button_Tim = new JButton("Tìm");
		button_Tim.addActionListener(actionListener);
		button_Tim.setBounds(577, 9, 81, 36);
		contentPane.add(button_Tim);
		
		JButton buttonHuyTim = new JButton("Huỷ tìm");
		buttonHuyTim.addActionListener(actionListener);
		buttonHuyTim.setBounds(670, 9, 81, 36);
		contentPane.add(buttonHuyTim);
		
		comboBox_queQuan_timKiem = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_queQuan_timKiem.addItem("Tất cả");
		for (Tinh tinh : listTinh) {
			comboBox_queQuan_timKiem.addItem(tinh.getTenTinh());
		}
		comboBox_queQuan_timKiem.setBounds(108, 8, 167, 39);
		contentPane.add(comboBox_queQuan_timKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 46, 716, 12);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Danh sách thí sinh");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(35, 67, 167, 16);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					
				},new String[] {
						"Mã thí sinh", "Họ tên", "Quê quán","Ngày Sinh", "Giới tính", "Điểm 1","Điểm 2","Điểm 3"
				}));
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(35, 95, 716, 205);
		contentPane.add(scrollPane);
		
		JLabel lblMaThiSinh_1 = new JLabel("Mã thí sinh:");
		lblMaThiSinh_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMaThiSinh_1.setBounds(35, 358, 121, 39);
		contentPane.add(lblMaThiSinh_1);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(132, 359, 198, 39);
		contentPane.add(textField_ID);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(35, 312, 716, 12);
		contentPane.add(separator_1_1);
		
		JLabel lblThngTinTh = new JLabel("Thông tin thí sinh");
		lblThngTinTh.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblThngTinTh.setBounds(35, 336, 167, 16);
		contentPane.add(lblThngTinTh);
		
		JLabel lblHoVaTen = new JLabel("Họ và tên:");
		lblHoVaTen.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblHoVaTen.setBounds(35, 401, 121, 39);
		contentPane.add(lblHoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(132, 402, 198, 39);
		contentPane.add(textField_HoVaTen);
		
		JLabel lblQueQuan_1 = new JLabel("Quê quán:");
		lblQueQuan_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblQueQuan_1.setBounds(35, 452, 94, 39);
		contentPane.add(lblQueQuan_1);
		
		comboBox_queQuan = new JComboBox();
		comboBox_queQuan.addItem("Chọn quê quán");
		for (Tinh tinh : listTinh) {
			comboBox_queQuan.addItem(tinh.getTenTinh());
		}
		comboBox_queQuan.setBounds(132, 452, 198, 39);
		contentPane.add(comboBox_queQuan);
		
		JLabel lblNgaySinh = new JLabel("Ngày Sinh:");
		lblNgaySinh.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNgaySinh.setBounds(35, 503, 121, 39);
		contentPane.add(lblNgaySinh);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setText("dd/MM/yyyy");
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(132, 504, 198, 39);
		contentPane.add(textField_NgaySinh);
		
		JLabel lblMaThiSinh_1_1 = new JLabel("Giới tính:");
		lblMaThiSinh_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMaThiSinh_1_1.setBounds(422, 358, 81, 39);
		contentPane.add(lblMaThiSinh_1_1);
		
		
		
		// Chọn giới tính
		radioButton_Nam = new JRadioButton("Nam");
		radioButton_Nam.setBounds(503, 366, 65, 23);
		contentPane.add(radioButton_Nam);
		
		radioButton_Nu = new JRadioButton("Nữ");
		radioButton_Nu.setBounds(610, 366, 65, 23);
		contentPane.add(radioButton_Nu);
		
		// Chỉ chọn được một giới tính
		buttonGroup_GioiTinh = new ButtonGroup();
		buttonGroup_GioiTinh.add(radioButton_Nam);
		buttonGroup_GioiTinh.add(radioButton_Nu);
		
		
		
		// Điểm các môn học
		JLabel lblMon_1 = new JLabel("Môn 1");
		lblMon_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMon_1.setBounds(422, 401, 121, 39);
		contentPane.add(lblMon_1);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(503, 402, 198, 39);
		contentPane.add(textField_Mon1);
		
		JLabel lblMon_2 = new JLabel("Môn 2");
		lblMon_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMon_2.setBounds(422, 452, 121, 39);
		contentPane.add(lblMon_2);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(503, 453, 198, 39);
		contentPane.add(textField_Mon2);
		
		JLabel lblMon_3 = new JLabel("Môn 3");
		lblMon_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMon_3.setBounds(422, 502, 121, 39);
		contentPane.add(lblMon_3);
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(503, 504, 198, 39);
		contentPane.add(textField_Mon3);
		
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(35, 554, 716, 12);
		contentPane.add(separator_2);
		
		
		
		// Thêm xoá hết dữ liệu để điền mới
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(actionListener);
		btnThem.setBounds(39, 568, 117, 45);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xoá");
		btnXoa.addActionListener(actionListener);
		btnXoa.setBounds(189, 568, 117, 45);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(actionListener);
		btnCapNhat.setBounds(340, 568, 117, 45);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(actionListener);
		btnLuu.setBounds(489, 568, 117, 45);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Huỷ bỏ");
		btnHuyBo.addActionListener(actionListener);
		btnHuyBo.setBounds(634, 568, 117, 45);
		contentPane.add(btnHuyBo);
		
	}
	
	/**
	 * Format ngày sinh.
	 */
	public String formatNgaySinh(ThiSinh ts) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatNgaySinh = simpleDateFormat.format(ts.getNgaySinh());
		
		return formatNgaySinh;
	}
	
	/**
	 * Format giới tính
	 */
	public String formatGioiTinh(ThiSinh ts) {
		if (ts.isGioiTinh()) {
			return "Nam";
		} else {
			return "Nữ";
		}
	}
	
	
	/**
	 * Reset form điền thông tin.
	 */
	public void xoaForm() {
		textField_ID.setText("");
		textField_HoVaTen.setText("");
		textField_MaThiSinh_TimKiem.setText("");
		textField_NgaySinh.setText("");
		textField_Mon1.setText("");
		textField_Mon2.setText("");
		textField_Mon3.setText("");
		comboBox_queQuan.setSelectedIndex(-1);
		buttonGroup_GioiTinh.clearSelection();
	}
	
	
	/**
	 * Hiển thị thí sinh lên bảng.
	 * @param ts
	 */
	public void themThiSinhVaoTaBle(ThiSinh ts) {
		
		//Format ngày về dạng dd/MM/yyyy
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatNgaySinh = simpleDateFormat.format(ts.getNgaySinh());
		// Kiểm tra queQuan không bị null
	 	String tenTinh = (ts.getQueQuan() != null) ? ts.getQueQuan().getTenTinh() : "N/A";
		
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				ts.getMaThiSinh()+"", ts.getTenThiSinh(), tenTinh,
				formatNgaySinh, formatGioiTinh(ts),
				ts.getDiemMon1()+"", ts.getDiemMon2()+"", ts.getDiemMon3()+""
		});
	}
	
	
	/**
	 * Kiểm tra để thêm hoặc cập nhật.
	 * @param ts
	 */
	public void themHoacCapNhatSinhVien(ThiSinh ts) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatNgaySinh = simpleDateFormat.format(ts.getNgaySinh());
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		
		if(!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);
			this.themThiSinhVaoTaBle(ts);
			JOptionPane.showMessageDialog(this, "Đã thêm thí sinh thành công!");
		} else {
			int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thay đổi dữ liệu thí sinh có mã: "+ts.getMaThiSinh());
			
			if (option == JOptionPane.YES_OPTION) {
				this.model.update(ts);
				int soLuongDong = model_table.getRowCount();
				
				//Kiểm tra trùng lặp để cập nhật
				for (int i = 0; i<soLuongDong; i++) {
					String id = model_table.getValueAt(i, 0)+"";
					if(id.equals(ts.getMaThiSinh().toString().trim())) {

						model_table.setValueAt(ts.getMaThiSinh()+"", i, 0);
						model_table.setValueAt(ts.getTenThiSinh()+"", i, 1);
						model_table.setValueAt(ts.getQueQuan().getTenTinh()+"", i, 2);
						model_table.setValueAt(formatNgaySinh+"", i, 3);
						model_table.setValueAt(ts.isGioiTinh()?"Nam":"Nữ", i, 4);
						model_table.setValueAt(ts.getDiemMon1()+"", i, 5);
						model_table.setValueAt(ts.getDiemMon2()+"", i, 6);
						model_table.setValueAt(ts.getDiemMon3()+"", i, 7);
					}
				}
				thucHienTaiLaiDuLieu();
			}
			JOptionPane.showMessageDialog(this, "Thí sinh " +ts.getMaThiSinh()+" đã được cập nhật dữ liệu!");
		}
	}
	
	
	/**
	 * Lấy thông tin thí sinh từ table.
	 * @return
	 */
	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		//Get thông tin
		String maThiSinh = model_table.getValueAt(i_row, 0)+"";
		String tenThiSinh = model_table.getValueAt(i_row, 1)+"";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		Date ngaySinh = new Date(model_table.getValueAt(i_row, 3)+"");
		String textGioiTinh = model_table.getValueAt(i_row, 4) +"";
		Boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		//Create đối tượng mới.
		ThiSinh ts = new ThiSinh(maThiSinh,tenThiSinh,tinh,ngaySinh,gioiTinh,diemMon1,diemMon2,diemMon3);
		return ts;
	}
	
	/**
	 * Hiển thị thông tin thí sinh đang chọn xuống các textField.
	 */
	public void hienThiThongTinThiSinhDaChon() {
		ThiSinh ts = getThiSinhDangChon();
		this.textField_ID.setText(ts.getMaThiSinh()+"");
		this.textField_HoVaTen.setText(ts.getTenThiSinh()+"");
		this.comboBox_queQuan.setSelectedItem(ts.getQueQuan().getTenTinh());
		
		//Format ngày sinh
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatNgaySinh = simpleDateFormat.format(ts.getNgaySinh());
		
		this.textField_NgaySinh.setText(formatNgaySinh+"");
		if (ts.isGioiTinh()) {
			radioButton_Nam.setSelected(true);
		} else {
			radioButton_Nu.setSelected(true);
		}
		this.textField_Mon1.setText(ts.getDiemMon1()+"");
		this.textField_Mon2.setText(ts.getDiemMon2()+"");
		this.textField_Mon3.setText(ts.getDiemMon3()+"");
	}
	
	/**
	 * Xoá thí sinh.
	 */
	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xoá thí sinh đã chọn?");
		
		if (luaChon == JOptionPane.YES_OPTION)  {
			ThiSinh ts = getThiSinhDangChon();
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
	}
	
	/**
	 * Thêm thí sinh vào dữ liệu và table.
	 */
	public void thucHienThemThiSinh() {
		try {
		
		// Kiểm tra thông tin đầu vào
		boolean thongBao;
		if (this.textField_ID.getText().trim().isEmpty() ||this.textField_HoVaTen.getText().trim().isEmpty()
				||this.comboBox_queQuan.getSelectedIndex() <= 0 ||
				this.textField_NgaySinh.getText().trim().isEmpty() ||
				this.textField_NgaySinh.getText().trim().equals("dd/MM/yyyy") ||
				this.buttonGroup_GioiTinh.getSelection() == null||
				textField_Mon1.getText().trim().isEmpty()||
				textField_Mon2.getText().trim().isEmpty()||
				textField_Mon2.getText().trim().isEmpty()) {
			thongBao = true;
		} else {
			thongBao = false;
		}
		if(thongBao == true) {
			JOptionPane.showMessageDialog(this, "Bạn hãy điền đầy đủ thông tin thí sinh!");
		}
		
		
		//Get dữ liệu
		String maThiSinh = this.textField_ID.getText()+"";
		String tenThiSinh = this.textField_HoVaTen.getText();
		int queQuan = this.comboBox_queQuan.getSelectedIndex();
		Tinh tinh = Tinh.getTinhById(queQuan);
		Date ngaySinh = new Date(this.textField_NgaySinh.getText());

		Boolean gioiTinh = true;
		String chonGioiTinh = this.buttonGroup_GioiTinh.getSelection()+"";
		if(chonGioiTinh.trim().equals("Nam")) {
			gioiTinh = true;
		} else {
			gioiTinh = false;
		}
		
		float diemMon1 = Float.valueOf(this.textField_Mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_Mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_Mon3.getText());
		
		
		//Create new Thí Sinh
		ThiSinh ts = new ThiSinh(maThiSinh,tenThiSinh,tinh,ngaySinh,gioiTinh,diemMon1,diemMon2,diemMon3);
		
		this.themHoacCapNhatSinhVien(ts);
		} catch (Exception e) {
		}
	}
	
	/**
	 * Tìm kiếm thí sinh theo quê quán và bằng MSV.
	 */
	public void thucHienTimKiem() {
		//Gọi hàm huỷ tìm kiếm
		this.thucHienTaiLaiDuLieu();
		
		// Thực hiện tìm kiếm
		int queQuan = this.comboBox_queQuan_timKiem.getSelectedIndex();
		String maThiSinhTimKiem = this.textField_MaThiSinh_TimKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();
		
		Set<String> idCuaThiSinhCanXoa = new TreeSet<String>();
		
		// Tìm kiếm bằng quê quán.
		if(queQuan > 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
			
			for (int i = 0; i < soLuongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2) + "";
				String id = model_table.getValueAt(i, 0) +"";
				if (!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idCuaThiSinhCanXoa.add(id);
				}
			}
			
			int soLuongThiSinhTimThay = soLuongDong - idCuaThiSinhCanXoa.size();
			if (soLuongThiSinhTimThay > 0) {
				JOptionPane.showMessageDialog(this, "Đã tìm thấy "+soLuongThiSinhTimThay+" thí sinh có quê là "+tinhDaChon.getTenTinh());
			} else {
				JOptionPane.showMessageDialog(this, "Không tìm thấy thí sinh có quê là "+tinhDaChon.getTenTinh());
			}
		}
		
		// Tìm kiếm bằng msv.
		if (maThiSinhTimKiem.length() > 0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(maThiSinhTimKiem)) {
					idCuaThiSinhCanXoa.add(id);
				}
			}
			
			int soLuongThiSinhTimThay = soLuongDong - idCuaThiSinhCanXoa.size();
			if (soLuongThiSinhTimThay  == 1) {
				JOptionPane.showMessageDialog(this, "Đã tìm thấy thí sinh có mã là: "+maThiSinhTimKiem);
			} else {
				JOptionPane.showMessageDialog(this, "Không tìm thấy thí sinh có mã là: " +maThiSinhTimKiem);
			}
		}
		
		// Xoá sinh viên thừa ra khỏi bảng.
		for (String idCanXoa : idCuaThiSinhCanXoa) {
			soLuongDong = model_table.getRowCount();
			for (int i = soLuongDong - 1; i >= 0; i--) {
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				if (idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
		
	}
	

	/**
	 * Huỷ tìm kiếm và tạo mới toàn bộ dữ liệu trong bảng.
	 */
	public void thucHienTaiLaiDuLieu() {
		while(true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else {
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		for(ThiSinh ts :this.model.getDsThiSinh()) {
			this.themThiSinhVaoTaBle(ts);
		}
	}
	
	/**
	 * MenuBar About.
	 */
	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
	}
	
	/**
	 * MenuBar Exit.
	 */
	public void thoatChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(
				this,
				"Bạn có muốn thoát khỏi chương trình?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
		if (luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	/**
	 * MenuBar save: thực hiện tạo file và tên.
	 */
	public void thucHienSaveFile() {
		 int a=JOptionPane.showConfirmDialog(this,"Nhấn 'Yes' để xác nhận lưu dữ liệu ");  
		 if(a==JOptionPane.YES_OPTION) {
			 	if (this.model.getTenFile().length() > 0) {
			 		saveFile(this.model.getTenFile());
			 	} else {
				JFileChooser fc = new JFileChooser();	
					int returnVal = fc.showSaveDialog(this);

					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						saveFile(file.getAbsolutePath());
					} 
			 	}
			 	JOptionPane.showMessageDialog(this, "Đã lưu dữ liệu thành công!");
		 }
	}
	
	/**
	 * Thực hiện lưu file.
	 * @param path
	 */
	private void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");
			BufferedWriter writer = new BufferedWriter(osw);
			
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				String tenTinh = (ts.getQueQuan() != null) ? ts.getQueQuan().getTenTinh() : "Không rõ";
				
				String data = ts.getMaThiSinh() + ";" + 
                        	ts.getTenThiSinh() + ";" + 
                        	tenTinh + ";" + 
                        	formatNgaySinh(ts) + ";" + 
                        	formatGioiTinh(ts) + ";" + 
                        	ts.getDiemMon1() + ";" + 
                        	ts.getDiemMon2() + ";" + 
                        	ts.getDiemMon3();
			writer.write(data);
			writer.newLine(); // Xuống dòng cho mỗi thí sinh
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Thực hiện mở file.
	 */
	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		try {
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
			openFile(file);
			
			if (this.model.getDsThiSinh().isEmpty()) {
                JOptionPane.showMessageDialog(this, "File không có dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Mở file thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
			} 
		}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "Lỗi khi mở file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
            thucHienTaiLaiDuLieu();
        } 

	private void openFile(File file){
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		
		try {
			this.model.setTenFile(file.getAbsolutePath());
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				// Tách các thông tin của thí sinh bằng dấu ;
				String[] data = line.split(";");
				
				// Get dữ liệu
				String maThiSinh = data[0];
				String tenThiSinh = data[1];
				String tenTinh = data [2];
				
	            Tinh queQuan = Tinh.getTinhByTen(tenTinh);  
	            
	            Date ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(data[3]);
	            boolean gioiTinh = data[4].equalsIgnoreCase("Nam");
	            float diemMon1 = Float.parseFloat(data[5]);
	            float diemMon2 = Float.parseFloat(data[6]);
	            float diemMon3 = Float.parseFloat(data[7]);
				
	            ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
	            ds.add(ts);
			}
		}
			catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsThiSinh(ds);
		
	}
}
