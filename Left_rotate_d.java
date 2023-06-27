public class Left_rotate_d {
     void rotate_left(int[]arr){
        int[]temp=new int[arr.length];
        temp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp[0];
    }
    void rotateleft1(int[]arr,int d){
        for(int i=0;i<d;i++){
            rotate_left(arr);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
  
    public static void main(String[] args) {
        int[]arr={50,10,20,30,40};
        int d=2;
       Left_rotate_d Lr=new Left_rotate_d();
       Lr.rotateleft1(arr, d);
    }
}
