package gui9;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUI9 {
	public JFrame ventana;

	public GUI9() {
		ejecutar();
	}

	public void ejecutar() {
		ventana = new JFrame();
		ventana.setBounds(400, 400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setTitle("Ejercicio 9");
		ventana.getContentPane().setLayout(null);
		
		DefaultListModel<Object> modelo = new DefaultListModel<Object>();
		

		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(10, 100, 170, 250);
		ventana.getContentPane().add(jsp);

		JList lista = new JList();
		lista.setModel(modelo);
		jsp.getViewport().add(lista);
		
		//EL COMBO BOX NO SE COMO UTILIZARLO AQUÍ
		JComboBox combo = new JComboBox();
		combo.setBounds(10, 40, 170, 30);
		ventana.getContentPane().add(combo);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Añadir elementos"));
		panel.setBounds(180, 150, 320, 200);
		panel.setLayout(null);
		ventana.getContentPane().add(panel);

		JTextField texto = new JTextField();
		texto.setBounds(50, 50, 240, 30);
		panel.add(texto);
		
		JButton anadir = new JButton("Añadir");
		anadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modelo.addElement(texto.getText());
				texto.setText(null);
			}
			
		});
		anadir.setBounds(50, 130, 90, 30);
		panel.add(anadir);

		JButton borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modelo.remove(lista.getSelectedIndex());
			}
			
		});
		borrar.setBounds(200, 130, 90, 30);
		panel.add(borrar);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					GUI9 g = new GUI9();
				} catch (Exception e) {

				}
			}

		});
	}
}
