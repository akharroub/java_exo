package exo4;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DraggableImage extends JPanel{

	  //Variable globale
    private BufferedImage img;
    private Point curPos;
 
    /**
     * Constructor
     */
    public DraggableImage() {
        //Initialisation de la position actuelle
        this.curPos = new Point(0, 0);        
 
        // Charger l'image dans le JPanel
        // !!! Mettre une image existant sur votre poste de travail
        try {
            img = ImageIO.read(new File("C:\\tigre.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(DraggableImage.class.getName()).log(Level.SEVERE, null, ex);            
        }
 
        //Lier l'écouteur de la souris
        MouseAdapterImage mouseAdapterImage = new MouseAdapterImage();
        addMouseListener(mouseAdapterImage);
        addMouseMotionListener(mouseAdapterImage);
    }
 
    /**
     * Dessiner l'image
     * @param g 
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            if (curPos == null) {
                curPos = new Point(0, 0);
            }
            g2d.drawImage(img, curPos.x, curPos.y, this);
            g2d.dispose();
        }
    }
 
    /**
     * Class hérité de MouseAdapter
     */
    class MouseAdapterImage extends MouseAdapter {
 
        private Point newPos;
 
        /**
         * Le bouton gauche est pressé
         * @param e 
         */
        @Override
        public void mousePressed(MouseEvent e) {
            newPos = e.getPoint();
            newPos.x -= curPos.x;
            newPos.y -= curPos.y;
            setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        }
 
        /**
         * Le bouton gauche est relaché
         * @param e 
         */
        @Override
        public void mouseReleased(MouseEvent e) {
            newPos = null;
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
 
        /**
         * Le curseur de la souris est déplacé
         * @param e 
         */
        @Override
        public void mouseDragged(MouseEvent e) {
            Point p = e.getPoint();
            int x = p.x - newPos.x;
            int y = p.y - newPos.y;
            curPos = new Point(x, y);
            repaint();
        }
    };
 
    /**
     * Exemple d'utilisation dans un JFrame
     * @param args 
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Deplacer une image");
        DraggableImage resi = new DraggableImage();
        jFrame.add(resi);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}