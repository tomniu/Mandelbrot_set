package math;

public class test {
	public static void main(String[]args){
		int count=0;
		for(int i =1;i<=1992;i++){
			String s = Integer.toString(i, 3);
			System.out.println(s);
			if(!s.contains("2"))count++;
		}
		System.out.println(count);
	}
}
