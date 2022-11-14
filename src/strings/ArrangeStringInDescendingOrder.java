package strings;

public class ArrangeStringInDescendingOrder {

	public static void main(String[] args) {

		String s="toyota";
		//output: yttooa
		
		char[]c= s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i] < c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}
