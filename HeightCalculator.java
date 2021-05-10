package RockPapersScissors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HeightCalculator extends JFrame implements ActionListener {
	
	static String height = " ";
	JFrame frame;
    JButton button;
    JTextField heightinput;
    JLabel label;
    JPanel panel;
    JFrame calculatedHeight;
    JLabel heightcal;
	
	public HeightCalculator() {
		frame = new JFrame("height calculator");
		button = new JButton("submit");
		heightinput = new JTextField(" ", 16);
		label = new JLabel("Enter your height in cm: ");
		calculatedHeight = new JFrame("Your height has been calculated you moron");
		heightcal = new JLabel();
		panel = new JPanel();
		
		 button.addActionListener(this);
	        panel.add(label);
	        panel.add(heightinput);
	        panel.add(button);
	        frame.add(panel);
	        frame.setSize(500, 500);
	        frame.show();
	        calculatedHeight.setSize(600, 600);
	        calculatedHeight.add(heightcal);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (button.isEnabled()) {
					//height = Integer.parseInt(heightinput.getText());
					height = heightinput.getText();
					heightcal.setText("You are " + height + "cm tall");
					//heightinput.setText(Integer.toString(height));
					
					calculatedHeight.show();
				}
				
			}});
    }
	
	
	
	
	
	public static void main(String[] args) {
		new HeightCalculator();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
