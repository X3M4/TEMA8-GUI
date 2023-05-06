package gui7;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GUI7 {
	public JFrame ventana;
	
	public GUI7() {
		ejecutar();
	}
	
	public void ejecutar() {
		ventana = new JFrame();
		ventana.setBounds(400,400,500,400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		ventana.setVisible(true);
		
		JLabel fondo = new JLabel();
		fondo.setBounds(10,10,480,330);
		fondo.setBackground(Color.GREEN);
		fondo.setOpaque(true);
		ventana.getContentPane().add(fondo);
		
		JLabel mensaje = new JLabel();
		mensaje.setBounds(10,340, 480, 30);
		mensaje.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ventana.getContentPane().add(mensaje);
		
		fondo.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Point p = ventana.getMousePosition();
				mensaje.setText(String.format("Click en coordenadas (%f, %f)", p.getX(), p.getY()));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				mensaje.setText("El ratón ha entrado al panel");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				mensaje.setText("El ratón ha salido del panel");
			}
			
		});
		
		
	}
}
