package gui8;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI8 {
	public JFrame ventana;
	
	public GUI8() {
		ejecutar();
	}
	
	public void ejecutar() {
		ventana = new JFrame();
		ventana.setBounds(400, 400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setTitle("Ejercicio 8");
		ventana.getContentPane().setLayout(null);;
		
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(10,100,170,250);
		ventana.getContentPane().add(jsp);
		
		JList lista = new JList();
		jsp.getViewport().add(lista);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Añadir elementos"));
		panel.setBounds(180,150,320,200);
		panel.setLayout(null);
		ventana.getContentPane().add(panel);
		
		JButton anadir = new JButton("Añadir");
		anadir.setBounds(50,130,90,30);
		panel.add(anadir);
		
		JButton borrar = new JButton("Borrar");
		borrar.setBounds(200,130,90,30);
		panel.add(borrar);
		
		JTextField texto = new JTextField();
		texto.setBounds(50,50,240, 30);
		panel.add(texto);
		
		JComboBox combo = new JComboBox();
		combo.setBounds(10,40,170,30);
		ventana.getContentPane().add(combo);
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI8 g = new GUI8();
				}catch(Exception e) {
					
				}
			}
			
		});
	}
}


