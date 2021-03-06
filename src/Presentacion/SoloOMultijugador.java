package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Partida;
import Logica.StyledButtonUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SoloOMultijugador extends JFrame {

	private JPanel contentPane;

	
	public SoloOMultijugador(Partida partida) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1000, 600);
	
		setSize(1000,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton buttonSolo = new JButton("SOLO");
		buttonSolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solo solo= new Solo(partida);
				solo.setVisible(true);
				SoloOMultijugador.this.dispose();
			}
		});
		buttonSolo.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttonSolo.setBounds(414, 191, 180, 50);
		buttonSolo.setUI(new StyledButtonUI());
		contentPane.add(buttonSolo);
		
		JButton buttonMultiplayer = new JButton("Multijugador");
		buttonMultiplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiplesJugadores multi =new MultiplesJugadores(partida);
				multi.setVisible(true);
				SoloOMultijugador.this.dispose();
				
			}
		});
		buttonMultiplayer.setUI(new StyledButtonUI());
		buttonMultiplayer.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttonMultiplayer.setBounds(414, 259, 180, 50);
		contentPane.add(buttonMultiplayer);
		
		JLabel background;
        ImageIcon img = new ImageIcon("resources/FondoJugadoresvs.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 600);
        contentPane.add(background);
	}
	
	
}
