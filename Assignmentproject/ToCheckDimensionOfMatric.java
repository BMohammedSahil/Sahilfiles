package Assignmentproject;

public class ToCheckDimensionOfMatric {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] result =new int[3][3];
		int rowsofarr1 = arr1.length;
		System.out.println(rowsofarr1);
		int columnsofarr1 = arr1[0].length;
		System.out.println(columnsofarr1);
		int rowsofarr2 = arr2.length;
		System.out.println(rowsofarr2);
		int columnsofarr2 = arr2[0].length;
		System.out.println(columnsofarr2);
		
		if(rowsofarr1==rowsofarr2 && columnsofarr1==columnsofarr2) {
			
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j] = (arr1[i][j]+arr2[i][j]);
				
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
			System.out.print(result[i][j]+" ");
		}
			System.out.println();
		}


	}
		else {
			System.out.println("Dimensions are not same");
		}

}
}
