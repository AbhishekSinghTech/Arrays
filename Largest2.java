public class Largest2 {
    int Largest2ndway(int []arr){
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                large=i;
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[]={10,5,20,8};
        Largest2 l2=new Largest2();
        System.out.println(l2.Largest2ndway(arr));
    }    
}
