package model;

import java.time.format.TextStyle;
import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luaChon;

	public QLSVModel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
		this.luaChon = "";
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
		this.dsThiSinh.add(thiSinh);
	}
	
	public void delete(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
	}
	
	public void update(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
		this.dsThiSinh.add(thiSinh);
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai(ThiSinh ts) {
		for(ThiSinh thiSinh: dsThiSinh) {
			if(thiSinh.getMaThiSinh()== ts.getMaThiSinh())
				return true;
		}
		return false;
	}

	
	
	
}
