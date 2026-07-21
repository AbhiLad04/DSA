public class MoveZerosToEnd{
	
	public static void main(String[] args){

		int[] arr = {0,1,0,3,12};
		
		for (int i=0;i<arr.length;i++){
			for (int j=i+1;j<arr.length;j++){
				if (arr[i]==0){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}