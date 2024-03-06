class Large {
public static void main(String args[]) {
 int[] arr = {4, 7, 2, 9, 1};
 int i;
 int temp = arr[0];
 for (i = 0; i < arr.length; i++) {
 if (arr[i] <= temp) {
 temp = arr[i];
 }
 }
 System.out.println("The largest is " + temp);
}
}
