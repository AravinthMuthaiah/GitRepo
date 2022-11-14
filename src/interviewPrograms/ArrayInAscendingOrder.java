package interviewPrograms;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {

		int[]a= {80,10,20,60,50,23,45};
		for(int i=0;i<a.length;i++) {//80
			for(int j=i+1;j<a.length;j++) {//20
				if(a[i] > a[j]) {//80>20
					int temp=a[i];//temp=80
					a[i]=a[j];//a[i]=10
					a[j]=temp;//a[j]=80
				}
			}
		}
		//{10,80}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);	
		}
		
	}

}
