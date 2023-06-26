public class Naive_check_sorted {
    boolean insorted(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,70,50};
        System.out.println("This is current Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Naive_check_sorted ncs=new Naive_check_sorted();
        System.out.println("\n"+"Is this sorted array:"+ncs.insorted(arr));
    }
}
