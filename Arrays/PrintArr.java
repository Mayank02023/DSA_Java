package Arrays;

public class PrintArr {

    public static void printArray(int[] arr) {
    System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
            System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println();
    }    
}
