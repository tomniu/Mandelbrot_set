package math;

import java.math.BigInteger;

public class Triangle {
	double a,b,c,a1,b1,c1;
	public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
		a = x1;
		a1 = y1;
		b = x2;
		b1 = y2;
		c = x3;
		c1= y3;
	}
	public static double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	public static double area(double a, double b, double c){
		double s = (a+b+c)/2;
		if((s-a)<(Math.pow(10, -5)))return 0;
		else if((s-b)<(Math.pow(10, -5)))return 0;
		else if((s-c)<(Math.pow(10, -5)))return 0;
		else return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public static void main(String[] args) {
		double x1,y1,x2,y2,x3,y3;
		double K=0;
		int count=0;
		for(double i=-4;i<5;i++){
			for(double j=-4;j<5;j++){
				for(double k=-4;k<5;k++){
					for(double l=-4;l<5;l++){
						for(double m=-4;m<5;m++){
							for(double n=-4;n<5;n++){
								x1 =i;
								y1 = j;
								x2 = k;
								y2 = l;
								x3 = m;
								y3 = n;
								K = K+Math.pow (area  (    distance(x1,y1,x2,y2),  distance(x1,y1,x3,y3),  distance(x3,y3,x2,y2)  )       ,     2) ;
								if(K>432148321){
									System.out.println(x1+"\t"+y1+"\t"+x2+"\t"+y2+"\t"+x3+"\t"+y3+"\t"+"\n"+K);
									for(;;)System.out.println();
								}
								else count++;
								System.out.println(x1+"\t"+y1+"\t"+x2+"\t"+y2+"\t"+x3+"\t"+y3+"\t"+"\n"+count);
								
								
							}
						}
					}
				}
			}
		}
		System.out.println(K/(double)(531441));
		
		
		

	}

}
