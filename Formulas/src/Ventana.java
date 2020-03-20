import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
	private Button CsvButton;
	private Button KeyboardButton;
	private JLabel label = new JLabel("Medio a utilizar para ingresar datos");
	public  Ventana() {
		super("Formulas");
		this.getContentPane().setBackground(new Color(0, 188, 212));
		this.CsvButton = new Button("Csv");
		this.CsvButton.setBounds(100,100,100,30);
		this.CsvButton.setBackground(new java.awt.Color(179, 229, 252));
		this.CsvButton.addActionListener(this);
		
		this.KeyboardButton = new Button("Teclado");
		this.KeyboardButton.setBounds(300,100,100,30);
		this.KeyboardButton.setBackground(new java.awt.Color(179, 229, 252));
		this.KeyboardButton.addActionListener(this);
		this.label.setBounds(10,10,280,95);
		
		
		this.setSize(500,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.add(CsvButton);
		this.add(this.KeyboardButton);
		
		this.add(this.label);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == CsvButton) {
			SubMenuChooseFile chooseFile = new SubMenuChooseFile();
			chooseFile.setVisible(true);
			chooseFile.setSize(600,200);
		}	
		else if(arg0.getSource() == KeyboardButton) {
			SubMenuIntroducirDatos datos = new SubMenuIntroducirDatos();
			datos.setVisible(true);
			datos.setSize(600,200);
		}
		
	}
}