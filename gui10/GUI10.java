package gui10;

import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class GUI10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI10 window = new GUI10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Graphics2D figura = null;
				dibujaCirculo(figura, e.getX(), e.getY(), 20);
			}
		});
		lblNewLabel.setSize(400, 200);
		lblNewLabel.setLocation(50, 70);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setSize(400, 50);
		lblNewLabel_1.setLocation(50, 300);
		lblNewLabel_1.setPreferredSize(new Dimension(70, 10));
		lblNewLabel_1.setOpaque(true);
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.setSize(90, 30);
		btnNewButton.setLocation(200, 20);
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		
	}
	
	public void dibujaCirculo(Graphics2D figura, double x, double y, double radio) {
		Shape circulo = new Ellipse2D.Double(x-radio, y - radio, radio*2, radio*2);
		figura.draw(circulo);
	}

}
