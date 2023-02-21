package Day1;

public class Exno20 {

	public static void main(String[] args) {
		int arr[][]= {{4,10,3},{7,15,9},{17,12,6}};
		int max;
		for(int i=0;i<3;i++) {
			max=arr[i][0];
			for(int j=0;j<3;j++) {
				if(max<arr[i][j])
					max=arr[i][j];
			}
			System.out.println("Maximum in Row"+(i+1)+": "+max);
		}

	}

}
