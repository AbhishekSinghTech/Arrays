public class Largest1{
    static int getLargest(int [] arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={10,5,20,8};
        int n=getLargest(arr);
        System.out.println("Largest element index:"+n);
        
    }
}