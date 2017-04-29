package poo.heritage;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import pooo.agregation.forte.Question;
import pooo.agregation.forte.Questionnaire;
import pooo.agregation.forte.Reponse;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenQcm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblEnonce;
	private JButton btnSuivant;

	private int score;
	private Questionnaire qcm;
	private int questionEC;

	/**
	 * Create the frame.
	 */
	public FenQcm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblEnonce = new JLabel("Enoncé");
		lblEnonce.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnonce.setBounds(62, 33, 370, 39);
		contentPane.add(lblEnonce);

		panel = new JPanel();
		panel.setBounds(37, 83, 429, 187);
		contentPane.add(panel);

		btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qcmSuivant();
			}
		});
		btnSuivant.setBounds(423, 313, 112, 32);
		contentPane.add(btnSuivant);
		// ____________________________________

		qcm = Questionnaire.genererExemple();
		this.setTitle(qcm.getSujet());
		afficherQuestion();
	}

	protected void qcmSuivant() {
		Component[] tab = panel.getComponents();
		int indiceSel = -1, i = 0;
		for (Component com : tab) {
			JRadioButton rb = (JRadioButton) com;
			if (rb.isSelected()) {
				indiceSel = i;
				break;
			}
			i++;
		}

		if (indiceSel != -1) {
			Question qx = qcm.getListeQestion().get(questionEC);
			Reponse reCh = qx.getListeReponses().get(indiceSel);
			if (reCh.isCorrecte()) {
				score++;
			}
		}

		if (questionEC < qcm.getListeQestion().size() - 1) {
			questionEC++;
			afficherQuestion();
		} else {
			btnSuivant.setVisible(false);
			panel.setVisible(false);
			lblEnonce.setText("Score = " + score);
		}
	}

	private void afficherQuestion() {
		Question qu = qcm.getListeQestion().get(questionEC);
		lblEnonce.setText(qu.getEnonce());
		ButtonGroup bg = new ButtonGroup();
		panel.removeAll();
		for (Reponse re : qu.getListeReponses()) {
			JRadioButton rb = new JRadioButton(re.getTexte());
			bg.add(rb);
			panel.add(rb);

		}

	}
}
