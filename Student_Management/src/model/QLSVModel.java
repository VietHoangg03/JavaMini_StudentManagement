package model;

import java.time.format.TextStyle;
import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luaChon;
	private String tenFile;

	public QLSVModel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.luaChon = "";
		this.tenFile = "";
	}

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}
	
	public void insert(ThiSinh thiSinh) {
		if (!kiemTraTonTai(thiSinh)) {
	        dsThiSinh.add(thiSinh);  // Chỉ thêm nếu thí sinh chưa tồn tại
	    }
	}
	
	public void delete(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
	}
	
	public void update(ThiSinh ts) {
	    for (int i = 0; i < dsThiSinh.size(); i++) {
	        if (dsThiSinh.get(i).getMaThiSinh().equals(ts.getMaThiSinh())) {
	            dsThiSinh.set(i, ts);  // Cập nhật thí sinh tại vị trí đúng
	            break;
	        }
	    }
	}


	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai(ThiSinh ts) {
	    for (ThiSinh thiSinh : dsThiSinh) {
	        if (thiSinh.getMaThiSinh() != null && ts.getMaThiSinh() != null && 
	            thiSinh.getMaThiSinh().trim().equals(ts.getMaThiSinh().trim())) {
	            return true;
	        }
	    }
	    return false;
	}


	
	
	
}
