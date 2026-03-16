package prog_pril.lab_1_2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MainWindow {
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private Dimension frameSize = new Dimension(400, 400);
	public JFrame frame;
	
	private JLabel xLabelInput;
	private JLabel yLabelInput;
	private JLabel zLabelInput;
	
	
	private JButton calculateButton;
	
	private JLabel successCalculation;

	private JLabel roLabelOutput;
	private JLabel phiLabelOutput;
	private JLabel zLabelOutput;
	
	public MainWindow() {
		frame = new JFrame("Калькулятор координат");
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setBounds(screenSize.width/2-frameSize.width/2, screenSize.height/2-frameSize.height/2, frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setupUI();
	}
	
	void setValues(int x, int y, int z) {
		xInput.setText(Integer.toString(x));
		yInput.setText(Integer.toString(y));
		zInput.setText(Integer.toString(z));
	}

	JTextField xInput;
	JTextField yInput;
	JTextField zInput;

	double roValue;
	double phiValue;
	double zValue;
	JTextField roOutput;
	JTextField phiOutput;
	JTextField zOutput;
	
	void calculate() {
		double xCoord = 0.0;
		double yCoord = 0.0;
		double zCoord = 0.0;
		try {
			xCoord = Double.valueOf(xInput.getText());
		} catch(NumberFormatException e) {
			xInput.requestFocusInWindow();
			xInput.selectAll();
			successCalculation.setText("Неверное значение x");
			return;
		}
		try {
			yCoord = Double.valueOf(yInput.getText());
		} catch(NumberFormatException e) {
			yInput.requestFocusInWindow();
			yInput.selectAll();
			successCalculation.setText("Неверное значение y");
			return;
		}
		try {
			zCoord = Double.valueOf(zInput.getText());
		} catch(NumberFormatException e) {
			zInput.requestFocusInWindow();
			zInput.selectAll();
			successCalculation.setText("Неверное значение z");
			return;
		}
		roValue = Math.sqrt(Math.pow(xCoord, 2)+Math.pow(yCoord, 2));
		if(xCoord == 0 && yCoord == 0) 
			phiValue = 0.0;
		else
			phiValue = Math.atan(yCoord/xCoord);
		zValue = zCoord;
		roOutput.setText(Double.toString(roValue));
		phiOutput.setText(Double.toString(phiValue));
		zOutput.setText(Double.toString(zValue));
		successCalculation.setText(" ");
	}
	
	private void setupUI() {
		xLabelInput = new JLabel("Координата x");
		yLabelInput = new JLabel("Координата y");
		zLabelInput = new JLabel("Координата z");

		xInput = new JTextField();
		yInput = new JTextField();
		zInput = new JTextField();

		xInput.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				calculate();
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		yInput.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				calculate();
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		zInput.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				calculate();
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		
		calculateButton = new JButton("Завершить");
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		
		successCalculation = new JLabel(" ");
		
		roLabelOutput = new JLabel("Координата ρ");
		phiLabelOutput = new JLabel("Угол φ");
		zLabelOutput = new JLabel("Координата z");

		roOutput = new JTextField("");
		phiOutput = new JTextField("");
		zOutput = new JTextField("");
		
		frame.add(xLabelInput);
		frame.add(xInput);
		frame.add(yLabelInput);
		frame.add(yInput);
		frame.add(zLabelInput);
		frame.add(zInput);
		frame.add(calculateButton);
		frame.add(successCalculation);
		frame.add(roLabelOutput);
		frame.add(roOutput);
		frame.add(phiLabelOutput);
		frame.add(phiOutput);
		frame.add(zLabelOutput);
		frame.add(zOutput);
	}
}
