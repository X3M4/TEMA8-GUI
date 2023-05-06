package gui2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI2 {
	
	public JFrame ventana;
	
	public GUI2() {
		arranca();
	}
	
	public void arranca() {
		ventana = new JFrame();
		ventana.setBounds(400, 400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JLabel lbResultado = new JLabel();
		lbResultado.setBounds(30,270,400,80);
		lbResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lbResultado.setOpaque(true);
		ventana.getContentPane().add(lbResultado);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("colores"));
		panel.setBounds(20,30,170,180);
		ventana.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rbRojo = new JRadioButton("Rojo");
		rbRojo.setBounds(30,20,70,80);
		panel.add(rbRojo);
		
		JRadioButton rbVerde = new JRadioButton("Verde");
		rbVerde.setBounds(30,70,70,80);
		panel.add(rbVerde);
		
		JRadioButton rbAzul = new JRadioButton("Azul");
		rbAzul.setBounds(30,120,70,80);
		panel.add(rbAzul);
		
		JButton aceptar = new JButton("aceptar");
		aceptar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mensaje = "";
				
				if(rbRojo.isSelected()) {
					mensaje = "Rojo";
					lbResultado.setBackground(Color.RED);
				}else if(rbVerde.isSelected()){
					mensaje = "Verde";
					lbResultado.setBackground(Color.GREEN);
				}else if(rbAzul.isSelected()) {
					mensaje = "Azul";
					lbResultado.setBackground(Color.BLUE);
				}
				
				lbResultado.setText(mensaje);
			}
		});
		
		aceptar.setBounds(30,230,90,20);
		ventana.getContentPane().add(aceptar);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbAzul);
		bg.add(rbVerde);
		bg.add(rbRojo);
	}
}
