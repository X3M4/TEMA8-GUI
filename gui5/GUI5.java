package gui5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI5 {
	public JFrame ventana;
	public JComboBox cboNumeros;
	
	public GUI5() {
		ejecuta();
	}
	
	public void ejecuta() {
		ventana = new JFrame();
		ventana.setBounds(400,400,500,400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		JLabel lbResultado = new JLabel();
		lbResultado.setBounds(30,270,400,80);
		lbResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lbResultado.setOpaque(true);
		ventana.getContentPane().add(lbResultado);
		
		//BOTÓN DE PARES
		JButton pares = new JButton("Pares");
		pares.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=0; i <10; i+= 2)
				modelo.addElement("No " + i);
				cboNumeros.setModel(modelo);

			}
			
		});
		pares.setBounds(200, 30, 90, 20);
		ventana.getContentPane().add(pares);
		
		//BOTÓN DE IMPARES
		JButton impares = new JButton("Impares");
		impares.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for(i=1; i<10; i+=2) {
					modelo.addElement("No " + i);
					cboNumeros.setModel(modelo);
				}
			}
			
		});
		impares.setBounds(300, 30, 90, 20);
		ventana.getContentPane().add(impares);
		
		//BOTÓN VACIAR
		JButton vaciar = new JButton("Vaciar");
		vaciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cboNumeros.removeAllItems();
			}
			
		});
		vaciar.setBounds(250, 60, 90, 20);
		ventana.getContentPane().add(vaciar);
		lbResultado.setText("Ningún elemento en la lista");
		
		
		//COMBOBOX
		cboNumeros = new JComboBox();
		cboNumeros.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cboNumeros.getSelectedItem() == null) {
					lbResultado.setText("Ningún elemento en la lista");
				}else {
					lbResultado.setText(cboNumeros.getSelectedItem().toString());
					}
				}
		});
		cboNumeros.setBounds(20,30,90,30);
		ventana.getContentPane().add(cboNumeros);
		
	}
}
