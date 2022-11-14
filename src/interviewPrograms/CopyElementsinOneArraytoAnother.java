package interviewPrograms;

public class CopyElementsinOneArraytoAnother {

	public static void main(String[] args) {

		//Copy of elements of one array in to another Array:
		
		int[]originalArray= {10,20,30,40,50,60};
		
		int[]copyArray=originalArray;
		
		System.out.println("Original Array is ");
		
		for(int i=0;i<originalArray.length;i++) {
			System.out.print(originalArray[i]+" ");	
		}
		
		System.out.println("\nCopy Array is ");
		
		for(int i=0;i<copyArray.length;i++) {
			System.out.print(copyArray[i]+" ");	
		}
		
	}

}
