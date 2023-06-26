public class Reverse {
    void reverse_method(int[]arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println("\nAfter reversing an array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,40};
        System.out.println("Before Removing Duplicate element");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
        Reverse rev=new Reverse();
        rev.reverse_method(arr);
    }
}
