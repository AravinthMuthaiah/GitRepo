package interviewPrograms;

public class MergingTwoArrays {

	public static void main(String[] args) {
		//How to merge two arrays
		int []a= {10,20,30,40,50};
		
		int []b= {100,200,300,400,500};
		
		int[]c= new int[a.length+b.length];
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			
			//c[0]=a[0]=10
			//c[1]=a[1]=20,1
			//c[2]=a[2]=30,2
			//c[3]=a[3]=40,3
			//c[4]=a[4]=60,4
			count++;//4
		}
		for(int j=0;j<b.length;j++) {
			c[count++]=b[j];
			
			//c[5]=a[0]=100
			//c[6]=a[1]=200
			//c[7]=a[2]=300
			//c[8]=a[3]=400
			//c[9]=a[4]=500
		}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
		
		
	}

}
