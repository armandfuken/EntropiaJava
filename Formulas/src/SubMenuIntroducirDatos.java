import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;

public class SubMenuIntroducirDatos extends JFrame implements ActionListener{
	private Button salir;
	private Button Triangular;
	private Button Trapezoide;
	private Button Gausiana;
	private Button General;
	private JLabel label = new JLabel("Elige una funcion para introducir los datos");
	public  SubMenuIntroducirDatos() {
		super("Formulas");
		this.getContentPane().setBackground(new Color(0, 188, 212));
		this.label.setBounds(10,10,250,75);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.Triangular = new Button("Triangular");
		this.Triangular.setBounds(100,100,100,30);
		this.Triangular.setBackground(new java.awt.Color(179, 229, 252));
		this.Triangular.addActionListener(this);
		this.Trapezoide = new Button("Trapezoide");
		this.Trapezoide.setBounds(200,100,100,30);
		this.Trapezoide.addActionListener(this);
		this.Trapezoide.setBackground(new java.awt.Color(179, 229, 252));
		this.Gausiana = new Button("Gausiana");
		this.Gausiana.setBounds(300,100,100,30);
		this.Gausiana.addActionListener(this);
		this.Gausiana.setBackground(new java.awt.Color(179, 229, 252));
		this.General = new Button("General");
		this.General.setBounds(400,100,100,30);
		this.General.addActionListener(this);
		this.General.setBackground(new java.awt.Color(179, 229, 252));
		this.add(this.Gausiana);
		this.add(this.Trapezoide);
		this.add(this.Triangular);
		this.add(this.General);
		this.add(this.label);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Functions f = new Functions();
		if(arg0.getSource() == Triangular) {
			double x =Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para X", 0));
			double a =Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para A", 0));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para B", 0));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para C", 0));
			JOptionPane.showMessageDialog(null, "EL grado de pertenencia es: "+ f.triangular(x, a , b, c));
		}else if(arg0.getSource()== Trapezoide) {
			double x =Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para X", 0));
			double a =Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para A", 0));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para B", 0));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para C", 0));
			double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para D", 0));
			JOptionPane.showMessageDialog(null, "EL grado de pertenencia es: "+ f.trapezoidal(x, a, b, c, d));
			
		}else if(arg0.getSource()==Gausiana) {
			double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para X", 0));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para B", 0));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para C", 0));
			JOptionPane.showMessageDialog(null, "EL grado de pertenencia es: "+ f.gaussian(x, b, c));
		}else if(arg0.getSource()==General) {
			double x =Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para X", 0));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para B", 0));
			double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte valor para C", 0));
			f.generalizedB(x, b, c);
		}
	}

}
