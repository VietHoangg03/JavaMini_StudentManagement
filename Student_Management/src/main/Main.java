package main;

import java.awt.EventQueue;

import view.QLSVView;

public class Main {
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						QLSVView frame = new QLSVView();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}
