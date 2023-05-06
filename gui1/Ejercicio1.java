package gui1;

import java.awt.EventQueue;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUIFrame gf = new  GUIFrame();
					gf.ventana.setVisible(true);
				}catch(Exception e) {
					e.getMessage();
				}
			}
			
		});
	}

}
