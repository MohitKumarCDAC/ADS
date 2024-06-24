import java.util.Arrays;
import java.util.Collections;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,1,45,6};
		//int max=Arrays.stream(arr).max().getAsInt();
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		
		System.out.println("display sorted array");
		for(int num:arr)
		{
			System.out.println(num);
		}
	}

}
