package interviewPrograms;

public class SearchAnElementInArray {

	public static void main(String[] args) {
//How to search an element in an array
		int[]a= {10,20,30,40,50};
		int element=50;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
			System.out.println("The Element 50 is founded in "+i+" th index position");
			}
		}
	}

}
