package gui3;

import java.awt.EventQueue;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI3 g = new GUI3();
				}catch(Exception e) {
					e.getMessage();
				}
			}
			
		});
	}

}
