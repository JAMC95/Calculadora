import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	double uno,dos;
	String operacion;
	String CE;
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"0");
				
			}
		});
		button.setBounds(32, 77, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"1");
			}
		});
		button_1.setBounds(32, 123, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"2");
			}
		});
		button_2.setBounds(32, 171, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"3");
			}
		});
		button_3.setBounds(152, 77, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"4");
			}
		});
		button_4.setBounds(152, 123, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"5");
			}
		});
		button_5.setBounds(152, 171, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"6");
			}
		});
		button_6.setBounds(262, 77, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"7");
			}
		});
		button_7.setBounds(262, 123, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"8");
			}
		});
		button_8.setBounds(262, 171, 89, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+"9");
			}
		});
		button_9.setBounds(32, 203, 89, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CE=textField.getText();
				textField.setText(CE+".");
			}
		});
		button_10.setBounds(152, 205, 89, 23);
		contentPane.add(button_10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
			}
		});
		btnC.setBounds(262, 205, 89, 23);
		contentPane.add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(CE);
			
			}
		});
		btnCe.setBounds(32, 237, 89, 23);
		contentPane.add(btnCe);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				operacion="Sumar";
				uno=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		button_11.setBounds(152, 239, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacion="Restar";
				uno=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		button_12.setBounds(262, 239, 89, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacion="Dividir";
				uno=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		button_13.setBounds(32, 284, 89, 23);
		contentPane.add(button_13);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacion="Multiplicar";
				uno=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		btnX.setBounds(152, 284, 89, 23);
		contentPane.add(btnX);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dos=Double.parseDouble(textField.getText());
				double resultado=0;
				switch(operacion){
				case "Sumar": resultado=uno+dos; break;
				case "Restar": resultado=uno-dos; break;
				case "Multiplicar": resultado=uno*dos; break;
				case "Dividir": resultado=uno/dos; break;
				}
				textField.setText(resultado+"");
				
				
			}
		});
		button_15.setBounds(32, 340, 89, 23);
		contentPane.add(button_15);
		
		textField = new JTextField();
		textField.setBounds(32, 29, 355, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
