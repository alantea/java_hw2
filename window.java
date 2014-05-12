import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.UIManager;

public class window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane textField;
	private JPanel panel;
	private JButton btnWww;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
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
	public window() {
		setTitle("Typing Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextPane();
		textField.setBounds(5, 55, 767, 230);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("Type some text using your keyboard.  The keys you pres swill be highlighted and the text will be displayed.");
		label_3.setAlignmentX(0.5f);
		label_3.setBounds(10, 10, 500, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Note: Clicking the buttons with your mouse will not perform any action.");
		label_4.setAlignmentX(0.5f);
		label_4.setBounds(10, 30, 336, 15);
		contentPane.add(label_4);
		
		JButton button = new JButton("~");
		button.setFont(UIManager.getFont("Button.font"));
		button.setBounds(15, 295, 43, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Tab");
		button_1.setFont(UIManager.getFont("Button.font"));
		button_1.setBounds(15, 336, 63, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Caps");
		button_2.setFont(UIManager.getFont("Button.font"));
		button_2.setBounds(15, 377, 73, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Shift");
		button_3.setFont(UIManager.getFont("Button.font"));
		button_3.setBounds(15, 418, 83, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Z");
		button_4.setFont(UIManager.getFont("Button.font"));
		button_4.setBounds(103, 418, 43, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("C");
		button_5.setFont(UIManager.getFont("Button.font"));
		button_5.setBounds(199, 418, 43, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("X");
		button_6.setFont(UIManager.getFont("Button.font"));
		button_6.setBounds(151, 418, 43, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("A");
		button_7.setFont(UIManager.getFont("Button.font"));
		button_7.setBounds(93, 377, 43, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Q");
		button_8.setFont(UIManager.getFont("Button.font"));
		button_8.setBounds(83, 336, 43, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.setFont(UIManager.getFont("Button.font"));
		button_9.setBounds(63, 295, 43, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.setFont(UIManager.getFont("Button.font"));
		button_10.setBounds(111, 295, 43, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("W");
		button_11.setFont(UIManager.getFont("Button.font"));
		button_11.setBounds(131, 336, 43, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("S");
		button_12.setFont(UIManager.getFont("Button.font"));
		button_12.setBounds(141, 377, 43, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("D");
		button_13.setFont(UIManager.getFont("Button.font"));
		button_13.setBounds(189, 377, 43, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("E");
		button_14.setFont(UIManager.getFont("Button.font"));
		button_14.setBounds(179, 336, 43, 31);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("3");
		button_15.setFont(UIManager.getFont("Button.font"));
		button_15.setBounds(159, 295, 43, 31);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("4");
		button_16.setFont(UIManager.getFont("Button.font"));
		button_16.setBounds(207, 295, 43, 31);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("R");
		button_17.setFont(UIManager.getFont("Button.font"));
		button_17.setBounds(227, 336, 43, 31);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("F");
		button_18.setFont(UIManager.getFont("Button.font"));
		button_18.setBounds(237, 377, 43, 31);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("V");
		button_19.setFont(UIManager.getFont("Button.font"));
		button_19.setBounds(247, 418, 43, 31);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("B");
		button_20.setFont(UIManager.getFont("Button.font"));
		button_20.setBounds(295, 418, 43, 31);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("G");
		button_21.setFont(UIManager.getFont("Button.font"));
		button_21.setBounds(285, 377, 43, 31);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("T");
		button_22.setFont(UIManager.getFont("Button.font"));
		button_22.setBounds(275, 336, 43, 31);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("5");
		button_23.setFont(UIManager.getFont("Button.font"));
		button_23.setBounds(255, 295, 43, 31);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("6");
		button_24.setFont(UIManager.getFont("Button.font"));
		button_24.setBounds(303, 295, 43, 31);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("Y");
		button_25.setFont(UIManager.getFont("Button.font"));
		button_25.setBounds(323, 336, 43, 31);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("H");
		button_26.setFont(UIManager.getFont("Button.font"));
		button_26.setBounds(333, 377, 43, 31);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("N");
		button_27.setFont(UIManager.getFont("Button.font"));
		button_27.setBounds(343, 418, 43, 31);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("M");
		button_28.setFont(UIManager.getFont("Button.font"));
		button_28.setBounds(391, 418, 43, 31);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("J");
		button_29.setFont(UIManager.getFont("Button.font"));
		button_29.setBounds(381, 377, 43, 31);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("U");
		button_30.setFont(UIManager.getFont("Button.font"));
		button_30.setBounds(371, 336, 43, 31);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("7");
		button_31.setFont(UIManager.getFont("Button.font"));
		button_31.setBounds(351, 295, 43, 31);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("8");
		button_32.setFont(UIManager.getFont("Button.font"));
		button_32.setBounds(399, 295, 43, 31);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("I");
		button_33.setFont(UIManager.getFont("Button.font"));
		button_33.setBounds(419, 336, 43, 31);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("K");
		button_34.setFont(UIManager.getFont("Button.font"));
		button_34.setBounds(429, 377, 43, 31);
		contentPane.add(button_34);
		
		JButton button_35 = new JButton(",");
		button_35.setFont(UIManager.getFont("Button.font"));
		button_35.setBounds(439, 418, 43, 31);
		contentPane.add(button_35);
		
		JButton button_36 = new JButton(".");
		button_36.setFont(UIManager.getFont("Button.font"));
		button_36.setBounds(487, 418, 43, 31);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("L");
		button_37.setFont(UIManager.getFont("Button.font"));
		button_37.setBounds(477, 377, 43, 31);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("O");
		button_38.setFont(UIManager.getFont("Button.font"));
		button_38.setBounds(467, 336, 43, 31);
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("9");
		button_39.setFont(UIManager.getFont("Button.font"));
		button_39.setBounds(447, 295, 43, 31);
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("0");
		button_40.setFont(UIManager.getFont("Button.font"));
		button_40.setBounds(495, 295, 43, 31);
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("P");
		button_41.setFont(UIManager.getFont("Button.font"));
		button_41.setBounds(515, 336, 43, 31);
		contentPane.add(button_41);
		
		JButton button_42 = new JButton(";");
		button_42.setFont(UIManager.getFont("Button.font"));
		button_42.setBounds(525, 377, 43, 31);
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("?");
		button_43.setFont(UIManager.getFont("Button.font"));
		button_43.setBounds(535, 418, 43, 31);
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("\"");
		button_44.setFont(UIManager.getFont("Button.font"));
		button_44.setBounds(573, 377, 43, 31);
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("[");
		button_45.setFont(UIManager.getFont("Button.font"));
		button_45.setBounds(563, 336, 43, 31);
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("-");
		button_46.setFont(UIManager.getFont("Button.font"));
		button_46.setBounds(543, 295, 43, 31);
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("+");
		button_47.setFont(UIManager.getFont("Button.font"));
		button_47.setBounds(591, 295, 43, 31);
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("[");
		button_48.setFont(UIManager.getFont("Button.font"));
		button_48.setBounds(611, 336, 43, 31);
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("Enter");
		button_49.setFont(UIManager.getFont("Button.font"));
		button_49.setBounds(621, 377, 83, 31);
		contentPane.add(button_49);
		
		JButton button_50 = new JButton("\\");
		button_50.setFont(UIManager.getFont("Button.font"));
		button_50.setBounds(659, 336, 43, 31);
		contentPane.add(button_50);
		
		JButton button_51 = new JButton("Backspace");
		button_51.setFont(UIManager.getFont("Button.font"));
		button_51.setBounds(639, 295, 123, 31);
		contentPane.add(button_51);
		
		JButton button_52 = new JButton("                         ");
		button_52.setFont(UIManager.getFont("Button.font"));
		button_52.setBounds(200, 459, 283, 31);
		contentPane.add(button_52);
		
		JButton button_53 = new JButton("<");
		button_53.setFont(UIManager.getFont("Button.font"));
		button_53.setBounds(603, 459, 43, 31);
		contentPane.add(button_53);
		
		JButton button_54 = new JButton("^");
		button_54.setFont(UIManager.getFont("Button.font"));
		button_54.setBounds(651, 418, 43, 31);
		contentPane.add(button_54);
		
		JButton btnV = new JButton("v");
		btnV.setFont(UIManager.getFont("Button.font"));
		btnV.setBounds(651, 459, 43, 31);
		contentPane.add(btnV);
		
		JButton button_56 = new JButton(">");
		button_56.setFont(UIManager.getFont("Button.font"));
		button_56.setBounds(699, 459, 43, 31);
		contentPane.add(button_56);
		
	}
	
	public static void btn_light(JButton btn)
	{
		btn.setBackground( Color.orange );
	}
	
	public static void btn_unlight(JButton btn)
	{
		btn.setBackground( null );
	}
}
