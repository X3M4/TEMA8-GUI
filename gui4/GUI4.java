package gui4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class GUI4 {

	public JFrame ventana;

	public GUI4() {
		ejecutar();
	}

	public void ejecutar() {
		ventana = new JFrame();
		ventana.setBounds(400, 400, 500, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		ventana.setVisible(true);

		JLabel lbResultado = new JLabel();
		lbResultado.setBounds(30, 270, 400, 80);
		lbResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lbResultado.setOpaque(true);
		ventana.getContentPane().add(lbResultado);

		JScrollPane jsp = new JScrollPane();
		jsp.setBounds(20, 30, 170, 180);
		ventana.getContentPane().add(jsp);

		// LOS COLORES LOS PONGO CON UN ARRAY PORQUE NO ME ACLARO CON MODEL
		String[] colores = { "Rojo", "Verde", "Azul" };

		JList lstColores = new JList(colores);
		jsp.getViewport().add(lstColores);

		lstColores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (lstColores.getSelectedValue() == null) {
					lbResultado.setText("No se ha seleccciona ningún color");
				} else {
					lbResultado.setText(String.format("El color seleccionado es: %s", 
							lstColores.getSelectedValue()));
				}

			}
		});

	}

}
