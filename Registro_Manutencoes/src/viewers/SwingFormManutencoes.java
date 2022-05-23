package viewers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class SwingFormManutencoes extends Jframe implements ActionListener {

	private JFrame frame;
	private JTextField id;
	private JTextField data;
	private JTextField equipamento;
	private JTextField custo;
	private JTextField tempo;
	private JButton cadastrar;
	private JButton alterar;
	private JButton excluir;
	private JButton buscar;
	private JTextArea listar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingFormManutencoes window = new SwingFormManutencoes();
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
	public SwingFormManutencoes() {
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
		
		buscar = new JButton("buscar");
		buscar.setBounds(359, 113, 65, 23);
		frame.getContentPane().add(buscar);
		
		excluir = new JButton("excluir");
		excluir.setBounds(361, 79, 63, 23);
		frame.getContentPane().add(excluir);
		
		alterar = new JButton("alterar");
		alterar.setBounds(359, 45, 65, 23);
		frame.getContentPane().add(alterar);
		
		cadastrar = new JButton("cadastrar");
		cadastrar.setBounds(345, 11, 79, 23);
		frame.getContentPane().add(cadastrar);
		
		custo = new JTextField();
		custo.setBounds(21, 58, 86, 20);
		frame.getContentPane().add(custo);
		custo.setColumns(10);
		
		tempo = new JTextField();
		tempo.setBounds(21, 30, 86, 20);
		frame.getContentPane().add(tempo);
		tempo.setColumns(10);
		
		data = new JTextField();
		data.setBounds(21, 114, 86, 20);
		frame.getContentPane().add(data);
		data.setColumns(10);
		
		equipamento = new JTextField();
		equipamento.setBounds(21, 93, 86, 20);
		frame.getContentPane().add(equipamento);
		equipamento.setColumns(10);
		
		id = new JTextField();
		id.setBounds(21, 159, 86, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		listar = new JTextArea();
		listar.setBounds(21, 190, 403, 60);
		frame.getContentPane().add(listar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
	}
}
