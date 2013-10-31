import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;
public class Mandelbrot extends JApplet{
private final double center_x = 2,center_y=1.25;

public void paint(Graphics p){
	Complex c = new Complex(0,0);
	
	p.drawLine(0, 525, 1680, 525);
	p.drawLine(840, 0, 840, 1050);
	
	p.drawLine(420, 500, 420, 550);
	p.drawLine(1260, 500, 1260, 550);
	
	p.drawLine(815, 420+525, 865, 420+525);
	p.drawLine(815, 525-420, 865, 525-420);
	int r=0,g=0,b=0;
	for(double i=-2;i<=1;i = i+.002){
		for(double j = -1;j<=1;j = j+.002){
			c.setImag(j);
			c.setReal(i);
			
			if(Mandelbrot.isStable(c)){
				Color color = new Color(r,g,b);
				p.setColor(color);
				p.drawOval((int)((center_x+c.real())*420), (int)((center_y-c.imag())*420), 1, 1);
				if(r<255)r++;
				else r = 0;
				}
			System.out.println(c);
		
		}	
	}

}
public static boolean isStable(Complex c){
	int stable=0;
	Complex z=new Complex(0,0);
	Complex []com=new Complex[500];
	for(int i =0;i<20;i++){
		com[i]=z;
		z = (z.times(z)).plus(c);	
	}
	for(int i = 0;i<20;i++){
		if(com[i].isEqual(com[5]))stable++;	
	}
	if(stable>=3)return true;
	else return false;
}

}