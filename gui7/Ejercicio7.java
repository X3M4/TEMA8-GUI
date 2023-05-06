package gui7;

import java.awt.EventQueue;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI7 g = new GUI7();
				}catch(Exception e) {
					e.getMessage();
					System.out.println("ERROR");
				}
			}
			
		});
	}

}
