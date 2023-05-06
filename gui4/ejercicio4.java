package gui4;

import java.awt.EventQueue;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				GUI4 g = new GUI4();
				g.ventana.setVisible(true);
			}
			
		});
	}

}
