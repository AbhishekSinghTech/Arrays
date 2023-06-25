public class Naive_Remove_Duplicate {
    int remDups(int[]arr){
       int temp[]=new int[arr.length];
       temp[0]=arr[0];
       int res=1;
       for(int i=1;i<arr.length;i++){
        if(temp[res-1]!=arr[i]){
            temp[res]=arr[i];
            res++;
        }
       }
       System.out.println("\nAfter Resultent array is:");
       for(int i=0;i<res;i++){
        arr[i]=temp[i];
        System.out.print(arr[i]+" ");
       }
       return res;
    }
    public static void main(String[] args) {
        int []arr={10,20,20,30,30,30,30};
        System.out.println("Before Removing Duplicate element");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Naive_Remove_Duplicate NRD=new Naive_Remove_Duplicate();
        System.out.println("\n"+"Size of Array After Removing Duplicate:"+NRD.remDups(arr));

    }    
}
