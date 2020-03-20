import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.opencsv.exceptions.CsvValidationException;

public class SubMenuChooseFile  extends JFrame implements ActionListener{
	private Button salir;
	private Button Triangular;
	private Button Trapezoide;
	private Button Gausiana;
	private Button General;
	private JLabel label = new JLabel("Elige una funcion para introducir los datos");
	public  SubMenuChooseFile() {
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
			JFrame fm = new JFrame();
			fm.setBackground(new Color(0, 188, 212));
			JPanel jp = new JPanel();
			JTable tabla = new JTable();
			DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
			modelo.addColumn("X");
			modelo.addColumn("A");
			modelo.addColumn("B");
			modelo.addColumn("C");
			modelo.addColumn("Resultado");
			ChooseFile choose = new ChooseFile();
			try {
				LeerCSV csv = new LeerCSV();
				Iterator<Vector> datosCsv =csv.LeerCSV(choose.ChooseFile(),1).iterator();
				while(datosCsv.hasNext()) {
					//System.out.println(datosCsv.next());
					modelo.addRow(datosCsv.next());		
				}

			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(new JScrollPane(tabla));
			fm.add(jp);
			fm.setSize(500,600);
			fm.setVisible(true);
			
		}else if(arg0.getSource()== Trapezoide) {
			JFrame fm = new JFrame();
			fm.setBackground(new Color(0, 188, 212));
			JPanel jp = new JPanel();
			JTable tabla = new JTable();
			DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
			modelo.addColumn("X");
			modelo.addColumn("A");
			modelo.addColumn("B");
			modelo.addColumn("C");
			modelo.addColumn("D");
			modelo.addColumn("Resultado");
			ChooseFile choose = new ChooseFile();
			try {
				LeerCSV csv = new LeerCSV();
				Iterator<Vector> datosCsv =csv.LeerCSV(choose.ChooseFile(),2).iterator();
				while(datosCsv.hasNext()) {
					//System.out.println(datosCsv.next());
					modelo.addRow(datosCsv.next());		
				}

			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(new JScrollPane(tabla));
			fm.add(jp);
			fm.setSize(500,600);
			fm.setVisible(true);
			
			//Grafica g = new Grafica();
		}else if(arg0.getSource()==Gausiana) {
			JFrame fm = new JFrame();
			fm.setBackground(new Color(0, 188, 212));
			JPanel jp = new JPanel();
			JTable tabla = new JTable();
			DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
			modelo.addColumn("X");
			modelo.addColumn("B");
			modelo.addColumn("C");
			modelo.addColumn("Resultado");
			ChooseFile choose = new ChooseFile();
			try {
				LeerCSV csv = new LeerCSV();
				Iterator<Vector> datosCsv =csv.LeerCSV(choose.ChooseFile(),3).iterator();
				while(datosCsv.hasNext()) {
					//System.out.println(datosCsv.next());
					modelo.addRow(datosCsv.next());		
				}

			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(new JScrollPane(tabla));
			fm.add(jp);
			fm.setSize(500,600);
			fm.setVisible(true);
		
		}else if(arg0.getSource()==General) {
			JFrame fm = new JFrame();
			JPanel jp = new JPanel();
			jp.setBackground(new Color(0, 188, 212));
			JTable tabla = new JTable();
			DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
			modelo.addColumn("X");
			modelo.addColumn("A");
			modelo.addColumn("B");
			modelo.addColumn("C");
			modelo.addColumn("D");
			modelo.addColumn("Resultado");
			ChooseFile choose = new ChooseFile();
			try {
				LeerCSV csv = new LeerCSV();
				Iterator<Vector> datosCsv =csv.LeerCSV(choose.ChooseFile(),4).iterator();
				while(datosCsv.hasNext()) {
					//System.out.println(datosCsv.next());
					modelo.addRow(datosCsv.next());		
				}

			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(new JScrollPane(tabla));
			fm.add(jp);
			fm.setSize(500,600);
			fm.setVisible(true);
			
	}
}
}
