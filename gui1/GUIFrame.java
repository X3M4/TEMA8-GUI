package gui1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIFrame {
	public JFrame ventana; 
	
	public GUIFrame() {
		arranca();
	}

	private void arranca() {
		// TODO Auto-generated method stub
		ventana = new JFrame();
		ventana.setBounds(400,400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("Perro");
		cb1.setBounds(30, 20, 70, 80);
		ventana.getContentPane().add(cb1);
	
		JCheckBox cb2 = new JCheckBox("Gato");
		cb2.setBounds(30, 70, 70, 80);
		ventana.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Ratón");
		cb3.setBounds(30, 120, 70, 80);
		ventana.getContentPane().add(cb3);
		
		JLabel lResultado = new JLabel("");
		lResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lResultado.setBounds(30, 250, 400, 80);
		ventana.getContentPane().add(lResultado);
		
		JButton bAceptar = new JButton("Aceptar");
		bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mensaje = "";
				if(cb1.isSelected()) mensaje = "Perro";
				if(cb2.isSelected()) mensaje = "Gato";
				if(cb3.isSelected()) mensaje = "Ratón";
				
				lResultado.setText(mensaje);
			}
		});
		
		bAceptar.setBounds(30,200, 90, 20);
		ventana.getContentPane().add(bAceptar);
		
	}
}
