public class Left_rotate_1{
    void rotate_left(int[]arr){
        int[]temp=new int[arr.length];
        temp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp[0];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={50,10,20,30,40};
        Left_rotate_1 Lr=new Left_rotate_1();
        Lr.rotate_left(arr);
    }
}