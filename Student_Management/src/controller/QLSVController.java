package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener {
	
	public QLSVView view;
	
	
	
	public QLSVController(QLSVView view) {
		this.view = view;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String acctionCommand = e.getActionCommand();
		//JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+ acctionCommand);
		
		if(acctionCommand.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (acctionCommand.equals("Lưu")) {
			try {
				this.view.thucHienThemThiSinh();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (acctionCommand.equals("Cập nhật")) {
			this.view.hienThiThongTinThiSinhDaChon();
		} else if (acctionCommand.equals("Xoá")) {
			this.view.thucHienXoa();
		} else if (acctionCommand.equals("Huỷ bỏ")) {
			this.view.xoaForm();
		} else if (acctionCommand.equals("Tìm")) {
			this.view.thucHienTimKiem();
		} else if (acctionCommand.equals("Huỷ tìm")) {
			this.view.thucHienTaiLaiDuLieu();
		} else if (acctionCommand.equals("About me")) {
			this.view.hienThiAbout();
		} else if (acctionCommand.equals("Exit")) {
			this.view.thoatChuongTrinh();
		} else if (acctionCommand.equals("Save")) {
			this.view.thucHienSaveFile();
		} else if (acctionCommand.equals("Open")) {
			this.view.thucHienOpenFile();
		}
	}
}
