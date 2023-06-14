public class Largest {
    int Secarch(int[]arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int a[]={3,2,1,5,2};
        Largest l=new Largest();
        System.out.println(l.Secarch(a));
    } 
}
