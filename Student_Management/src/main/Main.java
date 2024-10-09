package main;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.UIManager;

import view.QLSVView;

public class Main {
		public static void main(String[] args) {
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						QLSVView frame = new QLSVView();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
}

