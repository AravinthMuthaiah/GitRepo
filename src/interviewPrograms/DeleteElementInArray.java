package interviewPrograms;

public class DeleteElementInArray {

	public static void main(String[] args) {
		
		//How to delete an element in an array
		int[]a= {10,20,30,40,50};
		
		
		int[]b=new int[a.length-1];
		
		//Deleting the 40 i.e 3 index position
		int count=0;
		int index=40;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==index) {
				continue;//40
			}
			b[count++]=a[i];
			//b[0]=10
			//b[1]=20
			//b[2]=30
			//b[3]=50
			
			
		}
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");	
		}
		
	}

}
