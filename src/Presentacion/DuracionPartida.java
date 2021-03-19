package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DuracionPartida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DuracionPartida() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JButton btnCorta = new JButton("PARTIDA CORTA");
		btnCorta.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCorta.setUI(new StyledButtonUI());
		btnCorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamada a partida asignando corta
			}
		});
		btnCorta.setBounds(71, 141, 222, 71);
		contentPane.add(btnCorta);
		
		JButton btnMedia = new JButton("PARTIDA MEDIA");
		btnMedia.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMedia.setUI(new StyledButtonUI());
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamada partida asignando media
				
			}
		});
		btnMedia.setBounds(71, 243,222, 71);
		contentPane.add(btnMedia);
		
		JButton btnLarga = new JButton("PARTIDA LARGA");
		btnLarga.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLarga.setUI(new StyledButtonUI());
		btnLarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamada a partida asignando larga
			}
		});
		btnLarga.setBounds(71, 342, 222, 71);
		contentPane.add(btnLarga);
		
		JLabel background;
        ImageIcon img = new ImageIcon("resources/jordihurtado.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 600);
        contentPane.add(background);
	}

}
