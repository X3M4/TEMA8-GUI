package gui6;

import java.awt.EventQueue;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI6 g = new GUI6();
				}catch(Exception e) {
					e.getMessage();
					System.out.println("ERROR");
				}
			}
			
		});
	}

}
