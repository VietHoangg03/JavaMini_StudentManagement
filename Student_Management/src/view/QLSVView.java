package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	QLSVModel model;
	private JTextField textField_MaThiSinh;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_HoVaTen;
	private JTextField textField_NgaySinh;
	private JTextField textField_Mon1;
	private JTextField textField_Mon2;
	private JTextField textField_Mon3;

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 669);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuBar.add(menuAbout);
		
		JMenuItem menuItemAbout = new JMenuItem("About me");
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
		lblMaThiSinh.setBounds(324, 6, 121, 39);
		contentPane.add(lblMaThiSinh);
		
		textField_MaThiSinh = new JTextField();
		textField_MaThiSinh.setColumns(10);
		textField_MaThiSinh.setBounds(422, 7, 198, 39);
		contentPane.add(textField_MaThiSinh);
		
		JButton button_Tim = new JButton("Tìm");
		button_Tim.setBounds(645, 9, 106, 36);
		contentPane.add(button_Tim);
		
		JComboBox comboBox_queQuan = new JComboBox();
		comboBox_queQuan.setBounds(108, 8, 198, 39);
		contentPane.add(comboBox_queQuan);
		
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
						"STT", "Mã thí sinh", "Họ tên", "Quê quán", "Giới tính", "Điểm 1","Điểm 2","Điểm 3"
				}));
		
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
		
		JComboBox comboBox_queQuan_1 = new JComboBox();
		comboBox_queQuan_1.setBounds(132, 452, 198, 39);
		contentPane.add(comboBox_queQuan_1);
		
		JLabel lblNgaySinh = new JLabel("Ngày Sinh:");
		lblNgaySinh.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNgaySinh.setBounds(35, 503, 121, 39);
		contentPane.add(lblNgaySinh);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(132, 504, 198, 39);
		contentPane.add(textField_NgaySinh);
		
		JLabel lblMaThiSinh_1_1 = new JLabel("Giới tính:");
		lblMaThiSinh_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblMaThiSinh_1_1.setBounds(422, 358, 81, 39);
		contentPane.add(lblMaThiSinh_1_1);
		
		JRadioButton rdbtnNewRadioButton_Nam = new JRadioButton("Nam");
		rdbtnNewRadioButton_Nam.setBounds(503, 366, 141, 23);
		contentPane.add(rdbtnNewRadioButton_Nam);
		
		JRadioButton rdbtnNewRadioButton_Nu = new JRadioButton("Nữ");
		rdbtnNewRadioButton_Nu.setBounds(610, 366, 141, 23);
		contentPane.add(rdbtnNewRadioButton_Nu);
		
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
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(39, 568, 117, 45);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xoá");
		btnXoa.setBounds(189, 568, 117, 45);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(340, 568, 117, 45);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuu.setBounds(489, 568, 117, 45);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Huỷ bỏ");
		btnHuyBo.setBounds(634, 568, 117, 45);
		contentPane.add(btnHuyBo);
	}
}
