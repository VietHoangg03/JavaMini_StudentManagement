package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;

	public QLSVModel() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
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
}
