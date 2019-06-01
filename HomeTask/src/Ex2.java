
public class Ex2 {
	public static void main(String[] args) {
		//4. Дан array {9, -1 , 55, 46 ,77 ,-1 ,500 ,7777 , 9999999}
		//Найти минимальное значение в этом array(в этом случае -1)
		
		int arr[]= {9, 1 , 55, 46 ,77 ,1 ,500 ,7777 , 9999999};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println(min);

	}

}
