package Ejercicio3Procesos;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botonCalculadora = new JButton("Calculadora");
		botonCalculadora.setIcon(new ImageIcon("D:\\23-24\\JesusViejo\\Programacion de servicios y procesos\\fotos\\fotoCalculadora.png"));
		botonCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\calc";
				
				LanzadorProcesos lp = new LanzadorProcesos();
			    lp.ejecutar(ruta);
			}
		});
		botonCalculadora.setBounds(24, 109, 169, 79);
		frame.getContentPane().add(botonCalculadora);
		
		JButton botonBlocdeNotas = new JButton("Bloc de notas");
		botonBlocdeNotas.setIcon(new ImageIcon("D:\\23-24\\JesusViejo\\Programacion de servicios y procesos\\fotos\\fotoBlocdeNotas.png"));
		botonBlocdeNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";
				
				LanzadorProcesos lp = new LanzadorProcesos();
			    lp.ejecutar(ruta);
			}
		});
		botonBlocdeNotas.setBounds(231, 109, 179, 79);
		frame.getContentPane().add(botonBlocdeNotas);
	}
}
