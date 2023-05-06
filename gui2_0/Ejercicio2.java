package gui2;

import java.awt.EventQueue;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI2 g = new GUI2();
					g.ventana.setVisible(true);
				}catch(Exception e) {
					e.getMessage();
				}
			}
			
		});
	}

}
