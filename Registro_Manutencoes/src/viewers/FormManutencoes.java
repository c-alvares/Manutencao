package viewers;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FormManutencoes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	// Atributos da Tela
	private JPanel panel;
	private JTextField id, data, equipamento, custo, tempo;
	private JButton cadastrar, alterar, excluir, buscar;
	private String texto;
	private JTextArea listar;
	
	Construtor() {
		
	}
	
	public static void maind(String [] args) {
		Manutencao.carregar();
		ProcessaManutencoes.carregar();
		tela.setVisible(true);
	}
}
