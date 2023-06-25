public class Efficient_Remove_Duplicate {
    int remDups1(int[]arr){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        System.out.println("\nAfter Resultent array is:");
        for(int i=0;i<arr.length;i++){
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
        Efficient_Remove_Duplicate ERD=new Efficient_Remove_Duplicate();
        System.out.println("\n"+"Size of Array After Removing Duplicate:"+ERD.remDups1(arr));
    }   
}
