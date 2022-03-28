package api;



public class Split {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); //"," 를 기준으로 잘라준다  
		//System.out.println(Arrays.toString(arr));
		
		
		for(String s:arr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		String animals1 = "dog cat bear";
		String[] arr1 = animals1.split(" "); //" " 을 기준으로 잘라준다 
		for(String s:arr1) {
			System.out.println(s);
		}
		
		
	}
}
