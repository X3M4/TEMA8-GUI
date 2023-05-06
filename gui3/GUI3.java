package gui3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI3 {
	
	public JFrame ventana;
	
	public GUI3() {
		ejecuta();
	}
	
	public void ejecuta() {
		ventana = new JFrame();
		ventana.setBounds(400,400,500,400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		ventana.setVisible(true);
		
		JLabel lbResultado = new JLabel();
		lbResultado.setBounds(30,270,400,80);
		lbResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lbResultado.setOpaque(true);
		ventana.getContentPane().add(lbResultado);
		
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(20,30,170,180);
		ventana.getContentPane().add(jsp);
		
		//LOS COLORES LOS PONGO CON UN ARRAY PORQUE NO ME ACLARO CON MODEL
		String[] colores = {"Rojo", "Verde", "Azul"};
		JList lstColores = new JList(colores);
		jsp.getViewport().add(lstColores);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lstColores.getSelectedValue() == null) {
					lbResultado.setText("No se ha seleccciona ningún color");
				}else {
					lbResultado.setText(String.format("El color seleccionado es: %s", 
							lstColores.getSelectedValue()));
				}
			}
			
		});
		
		aceptar.setBounds(30,230,90,20);
		ventana.getContentPane().add(aceptar);
	}
}
