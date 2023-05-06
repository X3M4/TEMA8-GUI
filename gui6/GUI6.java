package gui6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class GUI6 {
	public JFrame ventana;
	
	public GUI6() {
		ejecutar();
	}
	
	public void ejecutar() {
		ventana = new JFrame();
		ventana.setBounds(400, 400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		ventana.setVisible(true);
		
		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(20,30,170,180);
		ventana.getContentPane().add(jsp);
		
		JList lstNombres = new JList();
		jsp.setViewportView(lstNombres);
		
		JLabel lbResultado = new JLabel();
		lbResultado.setBounds(200,30,270,30);
		lbResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lbResultado.setOpaque(true);
		ventana.getContentPane().add(lbResultado);
		
		//CREACION DE LOS BOTONES
		JButton curso1 = new JButton("Curso 1");
		curso1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("María");
				modelo.addElement("Luis");
				lstNombres.setModel(modelo);

			}
			
		});
		curso1.setBounds(30,250,90,30);
		ventana.getContentPane().add(curso1);
		
		JButton curso2 = new JButton("Curso 2");
		curso2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lstNombres.setModel(modelo);

			}
			
		});
		curso2.setBounds(30,300,90,30);
		ventana.getContentPane().add(curso2);
		
		lstNombres.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(lstNombres.getSelectedValue() == null) {
					lbResultado.setText("Ningún nombre seleccionado");
				}else {
					lbResultado.setText(lstNombres.getSelectedValue().toString());
				}
			}
		});
		
	}
}
