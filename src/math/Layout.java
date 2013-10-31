package math;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;


public class Layout extends JPanel{

	public Layout(){

		setLayout(new GridLayout(19,19));
		Piece [][]list = new Piece[19][19];
		for(int i=0;i<19;i++){
			for(int j = 0;j<19;j++){
			add(list[i][j]= new Piece(i,j,Color.OPAQUE));
		}
			
		}
		setPreferredSize(new Dimension(1680,1050));

	}
	public static void main(String[] args) {
		Layout l = new Layout();
		JFrame window = new JFrame("GO");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(l);
		window.pack();
		window.setVisible(true);
		
	}
	public class Piece extends JButton{
		int x,y;
		int color;
		int liberty;
	public Piece(int x,int y,int c){
		this.x = x;
		this.y = y;
		color =c;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getLiberty() {
		return liberty;
	}

	public void setLiberty(int liberty) {
		this.liberty = liberty;
	}

	}

}