package array;

public class ReverseArray {
	public static void main(String []args) {
		int myArr[]= {2,7,4,9,3,1};
		reverse(int myArr[]);
	}
public static int[] reverse(int []myArr){
	int [] Reverse=new int[myArr.length];
	for(int i=0,j= Reverse.length-1;i<myArr.length;i++,j--)
		myArr[i]=Reverse[j];return Reverse;
	
}
}
