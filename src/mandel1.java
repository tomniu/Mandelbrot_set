import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class mandel1 extends Applet{
	private final int center_x = 840,center_y=525;
public void paint(Graphics p){
	p.drawLine(0, 525, 1680, 525);
	p.drawLine(840, 0, 840, 1050);
	
	p.drawOval(center_x-3, center_y-3, 6, 6);
	int r,g,b;
	for(long i = 1;i<199;i++){
	int x = (int)(Math.random()*1679)+1;
	int y = (int)(Math.random()*1049)+1;
	r = (int)(Math.random()*255);
	g = (int)(Math.random()*255);
	b = (int)(Math.random()*255);
	p.setColor(new Color(r,g,b));
	p.drawLine(center_x, center_y, x, y);
	}
}
}

