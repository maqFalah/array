package array;

public class array1 {
	public static void main(String[] args) {
		
	
	int myArr[]= {1,2,4,3,7,0};
	//print all the array element
	for(int i=0;i< myArr.length;i++) 
System.out.println(myArr[i]);
	//print the sum of all array
	int sum=0;
	for(int a:myArr) 
		sum+=a;
	System.out.println("sum of all the elements is  "+sum);
	//printing maximum value
	int max=myArr[0];
	for(int a:myArr)
	if(a>max) max=a;	
	System.out.println("maximum value is " +max);
	//sorting in ascending order
	for(int i=0;i<myArr.length;i++) {for(int j=i+1;j<myArr.length;j++) {
		
		if(myArr[j]<myArr[i])/*swapping*/ {int temp =myArr[j];
		myArr[j]=myArr[i];
		myArr[i]=temp;}}
		System.out.print(myArr[i]+" ");
	}
	
	}
}
