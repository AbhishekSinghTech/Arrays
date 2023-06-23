public class Insert{

    static int insert(int arr[],int n,int x,int cap,int position){
        if(n==cap){
            return n;
        }
        int idx=position-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return n+1;
    }
    public static void main(String[] args) {
        int [] arr=new int[5];
        int cap=5;
        int n=3;
        arr[0]=5;arr[1]=25;arr[2]=15;
        System.out.println("Before Insertion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int position=2;
        int x=50;

        n=insert(arr, n, x, cap, position);
        System.out.println("After Insertion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}