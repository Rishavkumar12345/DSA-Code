package Main;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class gamepanel extends JPanel implements Runnable{

	//screen setting
	final int originalTileSize=16;  //16x16 tiles
	final int scale=3;
	
	final int tilesize=originalTileSize*scale; //48*48 tile
	final int maxscreencol=16;
	final int maxscreenrow=12;
	final int screenwidth=tilesize*maxscreencol;
	final int screenheight=tilesize*maxscreenrow;
	
	static Thread gamethread;
	
	public gamepanel() {
		this.setPreferredSize(new Dimension(screenwidth,screenheight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
	
	public static void startgamethread() {
		gamethread=new Thread();
		gamethread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(gamethread!=null) {
			System.out.println("The game loop is running");
		}
	}
}
