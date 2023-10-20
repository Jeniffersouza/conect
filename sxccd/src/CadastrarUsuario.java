import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entidade.Usuario;
import src.dao.Usuariodao;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarUsuario frame = new CadastrarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarUsuario() {
		Usuario u = new Usuario();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setBounds(10, 11, 70, 14);
		contentPane.add(lblNewLabel);
		
		
		textField = new JTextField();
		textField.setBounds(10, 97, 122, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		u.setCpf("nomeeee");
		
		
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(10, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		

		textField_1 = new JTextField();
		textField_1.setBounds(10, 36, 122, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		u.setCpf("15151515");
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 162, 122, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SENHA");
		lblNewLabel_2.setBounds(10, 137, 46, 14);
		contentPane.add(lblNewLabel_2);
		u.setSenha("15151515");
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Aqui, você obtém os valores dos campos de texto e os define no objeto Usuario
                String cpf = textField.getText();
                String nome = textField_1.getText();
                String senha = textField_2.getText();

                u.setNome(nome);
                u.setCpf(cpf);
                u.setSenha(senha);

                // Agora você pode usar o objeto u para fazer o que quiser, como salvar no banco de dados.
                new Usuariodao().cadastrarCliente(u);
				
			}
		});
		btnNewButton.setBounds(318, 208, 106, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.setBounds(219, 208, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
