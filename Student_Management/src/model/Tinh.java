package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Tinh implements Serializable {
    private int maTinh;
    private String tenTinh;

    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    // Getter and Setter
    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public String toString() {
        return tenTinh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTinh, tenTinh);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tinh other = (Tinh) obj;
        return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
    }

    // Trả về danh sách tỉnh
    public static ArrayList<Tinh> getDSTinh() {
        String[] arr_tinh = {
            "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu",
            "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận",
            "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên",
            "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh",
            "Hải Dương", "Hải Phòng", "Hậu Giang", "TP. Hồ Chí Minh", "Hòa Bình", "Hưng Yên",
            "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn",
            "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ",
            "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị",
            "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa",
            "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái"
        };

        ArrayList<Tinh> listTinh = new ArrayList<>();
        int i = 1; // Bắt đầu từ 1 thay vì 0 để mã tỉnh hợp lệ
        for (String tenTinh : arr_tinh) {
            listTinh.add(new Tinh(i, tenTinh));
            i++;
        }
        return listTinh;
    }

    // Lấy tỉnh theo ID
    public static Tinh getTinhById(int queQuan) {
        ArrayList<Tinh> listTinh = getDSTinh();
        // Kiểm tra xem queQuan có nằm trong phạm vi hợp lệ không
        for (Tinh tinh : listTinh) {
            if (tinh.getMaTinh() == queQuan) {
                return tinh;  // Trả về tỉnh nếu mã tỉnh khớp
            }
        }
        return null;  // Nếu không tìm thấy, trả về null
    }


    // Lấy tỉnh theo tên
    public static Tinh getTinhByTen(String tenTinh) {
        ArrayList<Tinh> listTinh = getDSTinh();
        if (tenTinh == null) {
            return null;
        }

        for (Tinh tinh : listTinh) {
            if (tinh.tenTinh != null && tinh.tenTinh.trim().equalsIgnoreCase(tenTinh.trim())) {
                return tinh;
            }
        }
        return null; // Trả về null nếu không tìm thấy tỉnh
    }
}
