import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main extends JFrame {
   
    private JTextField r;
    private JTextField g;
    private JTextField d;

    private JButton bcirculo, bcuadrado; 
    private JPanel dibujito; 
    private Control control; 
    public void Botones() {
		this.setTitle("Zharick Aragon");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(7, 2));

        controlPanel.add(new JLabel("R:"));
        r= new JTextField("");
        controlPanel.add(r);

        controlPanel.add(new JLabel("G:"));
        g = new JTextField("");
        controlPanel.add(g);

        controlPanel.add(new JLabel("B:"));
        d = new JTextField("");
        controlPanel.add(d);

        bcuadrado = new JButton("Cuadrado");
        bcirculo = new JButton("Circulo");
        controlPanel.add(bcuadrado);
        controlPanel.add(bcirculo);
        add(controlPanel, BorderLayout.WEST);

        dibujito = new JPanel() {
            
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.WHITE);
            }
        };
        add(dibujito, BorderLayout.CENTER);
		
		
	}
    public JTextField getR() {
        return r;
    }

    public JTextField getG() {
        return g;
    }

    public JTextField getB() {
        return d;
    }

    public JButton getCuadrado() {
        return bcuadrado;
    }

    public JButton getCirculo() {
        return bcirculo;
    }
    public JPanel getDibujo() {
        return dibujito;
    }
	
	public static void main(String[] args) {
        
        LogicaRGB modelo = new LogicaRGB();
        Main vista = new Main();
        vista.Botones();
        Control controlador = new Control(modelo, vista);

        controlador.iniciar();
    }

   

}
