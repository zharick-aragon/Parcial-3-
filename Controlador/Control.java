//import Logica.LogicaRGB; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Control {
	private LogicaRGB modelo;
    private Main vista;
  
    public Control(LogicaRGB modelo, Main vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.getCirculo().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dibujarForma("Circulo");  
            } });
        vista.getCuadrado().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dibujarForma("Cuadrado");  } });
    }

    private void dibujarForma(String forma) {
        try {
            int red = Integer.parseInt(vista.getR().getText());
            int green = Integer.parseInt(vista.getG().getText());
            int blue = Integer.parseInt(vista.getB().getText());

            modelo.setColores(red, green, blue);
            Color color = modelo.insertarcolores();

            Graphics g = vista.getDibujo().getGraphics();
            g.setColor(color);

            int size = 400;
            int x = (vista.getDibujo().getWidth() - size) / 2;
            int y = (vista.getDibujo().getHeight() - size) / 2;
            System.out.println(x);

            if (forma.equals("Cuadrado")) {
                g.fillRect(x, y, size, size);
            } else if (forma.equals("Circulo")) {
                g.fillOval(x, y, size, size);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "error");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(vista, ex.getMessage());
        }
    }

    public void iniciar() {
        vista.setVisible(true);
    }
    

}
