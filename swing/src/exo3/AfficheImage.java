package exo3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;


class AfficheImage extends JPanel{

	Image img;
	int x = 1;
	int y = 1;

	public AfficheImage(String s){

		img = getToolkit().getImage(s);
		ThreadImage ti = new ThreadImage(this);
		ti.start();

	}

	
	
	
	public void paintComponent(Graphics g){
	
		super.paintComponent(g);
		g.drawImage(img, x, y, 200, 300, this);
	}

	public void bouge() {
		x+=1;
		y+=2;
	}

	public Image getImg() {
		return img;
	}
	
	

	static class ThreadImage extends Thread{

		private AfficheImage aff;
		public ThreadImage(AfficheImage a){
			aff = a;
		}
		public void run(){
			while(true){
				try{
					Thread.sleep(10);
					aff.bouge();
					aff.repaint();                
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}



		public static void main(String[] args){
			Programme test = new Programme();

		}
	}


}

