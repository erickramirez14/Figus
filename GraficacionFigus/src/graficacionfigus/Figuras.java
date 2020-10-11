package graficacionfigus;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel{
    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    // inicializar la ventana
    public Figuras(){
      ventana = new JFrame("Dibujando Figuras");
        // definir tamaño a ventana
        ventana.setSize(1000, 700);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);  
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Interfaz
        g.drawRoundRect(10, 10, 950, 725, 35, 35);
        g.drawRect(30, 30, 250, 250);
        g.drawRect(350, 30, 250, 250);
        g.drawRect(670, 30, 250, 250);
        g.drawRect(30, 330, 250, 250);
        g.drawRect(350, 330, 250, 250);
        g.drawRect(670, 330, 250, 250);
        
        //Lineas
        g.setColor(Color.RED);
        g.drawLine(100, 125, 200, 125);
        g.drawLine(200, 125, 200, 175);
        g.drawLine(100, 125, 100, 175);
        g.drawLine(100, 175, 200, 175);
        
        g.drawLine(125, 175, 125,145);
        g.drawLine(150, 175, 150,145);
        g.drawLine(150, 145, 125,145);
        g.drawLine(125, 175, 95,195);
        g.drawLine(150, 175, 125,195);
        
       g.drawLine(100, 125, 150, 105);
       g.drawLine(200, 125, 150, 105);
        g.drawString("Dibujando lineas", 100, 235);
        
        //Rectangulos
        g.drawRect(360, 150, 25, 50);
        g.drawRect(410, 125, 25, 75);
        g.drawRect(460, 100, 25, 100);
        g.drawRect(510, 75, 25, 125);
        g.drawRect(560, 50, 25, 150);
        g.drawString("Dibujando rectangulos", 410, 235);
                
        //Óvalos con rectangulos
        g.drawRoundRect(775, 50, 50, 150, 250, 250);
        g.drawRoundRect(762, 65, 75, 35, 250, 250);
        g.drawRoundRect(725, 85, 150, 50, 150, 250);
        g.drawString("Dibujando Óvalos con rectangulos", 710, 235);
        
        //Circulos
        g.drawOval(105, 365, 100, 100);
        g.drawOval(135, 395, 15, 15);
        g.drawOval(165, 395, 15, 15);
        g.fillOval(139, 399, 7, 7);
        g.fillOval(169, 399, 7, 7);
        g.drawOval(145, 418, 25, 25);
        g.drawString("Dibujando con Circulos ", 85, 500);
        
        //Óvalos con circulos
        g.drawOval(455, 350, 50, 150);
        g.drawOval(442, 365, 75, 35);
        g.drawOval(405, 385, 150, 50);
        g.drawString("Dibujando óvalos con circulos", 390, 540);
        
        //Triangulos
        g.drawLine(745, 485, 805, 455);
        g.drawLine(805, 455, 855, 485);
        g.drawLine(745, 485, 855, 485);

        g.drawLine(805, 455, 805, 435);
        g.drawLine(805, 455, 855, 455);
        g.drawLine(855, 455, 805, 435);

        g.drawLine(735, 465, 735, 425);
        g.drawLine(765, 465, 735, 465);
        g.drawLine(765, 465, 735, 425);
        g.drawString("Dibujando Triangulos", 735, 520);
    }
}
