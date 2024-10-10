package main;

import javax.swing.UIManager;
import view.QLSVView;

public class Main {
    public static void main(String[] args) {
        try {
            // Kiểm tra hệ điều hành
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("mac")) {
                // Sử dụng giao diện macOS và đặt các thuộc tính đặc biệt cho macOS
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Tùy chỉnh thêm cho macOS
                System.setProperty("apple.awt.application.appearance", "system");
                System.setProperty("apple.awt.application.name", "QLSVApp");
                System.setProperty("apple.laf.useScreenMenuBar", "true");
                System.setProperty("apple.awt.graphics.UseQuartz", "true");

            } else if (os.contains("win")) {
                // Sử dụng giao diện hệ thống Windows
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else {
                // Đối với hệ điều hành khác (Linux, v.v.), sử dụng giao diện chéo nền tảng
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }

            // Hiển thị giao diện chính
            QLSVView frame = new QLSVView();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
