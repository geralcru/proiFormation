package poo.heritage;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import poo.exo1.CompteBancaire;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;

public class FenPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NumeroMontant;
	private JLabel lbl;
	private JLabel labelSolde;

	private JRadioButton rdbtnDepot;
	private JRadioButton rdbtnRetrait;

	CompteBancaire cb = new CompteBancaire();

	/**
	 * Create the frame.
	 */
	public FenPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 459);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);

		JSeparator separator = new JSeparator();
		mnFichier.add(separator);

		JMenuItem mnExoQcm = new JMenuItem("Exo QCM");
		mnExoQcm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionToBeDone();
			}
		});
		mnFichier.add(mnExoQcm);

		JMenuItem mnQuitter = new JMenuItem("Quitter");
		mnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fenQuitter();
			}
		});
		mnFichier.add(mnQuitter);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		rdbtnRetrait = new JRadioButton("Retrait");
		rdbtnRetrait.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnRetrait.setBounds(182, 324, 109, 23);
		contentPane.add(rdbtnRetrait);

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionValider();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(480, 322, 89, 23);
		contentPane.add(btnNewButton);

		rdbtnDepot = new JRadioButton("Depot");
		rdbtnDepot.setSelected(true);
		rdbtnDepot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnDepot.setBounds(56, 324, 109, 23);
		contentPane.add(rdbtnDepot);

		labelSolde = new JLabel("0");
		labelSolde.setBounds(126, 68, 144, 34);
		contentPane.add(labelSolde);

		NumeroMontant = new JTextField();
		NumeroMontant.setBounds(126, 136, 86, 20);
		contentPane.add(NumeroMontant);
		NumeroMontant.setColumns(10);

		JLabel lblMontant = new JLabel(" Montant :");
		lblMontant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMontant.setBounds(36, 136, 96, 20);
		contentPane.add(lblMontant);

		lbl = new JLabel("Solde :");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl.setBounds(56, 76, 46, 14);
		contentPane.add(lbl);

		cb = new CompteBancaire(" ZZZ ", 0);

		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnDepot);
		btn.add(rdbtnRetrait);
	}

	protected void actionToBeDone() {
		FenQcm fenQcm = new FenQcm();
		fenQcm.setVisible(true);

	}

	protected void fenQuitter() {
		this.dispose();

	}

	protected void actionValider() {
		try {
			double montant = Double.parseDouble(NumeroMontant.getText());
			if (rdbtnDepot.isSelected())
				cb.depot(montant);
			else
				cb.retrait(montant);
			labelSolde.setText(String.valueOf(cb.solde));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur de saisie!!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
