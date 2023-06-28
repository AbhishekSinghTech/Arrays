public class Navie_0_end{
    void movetoend(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                      int temp=arr[j];
                      arr[j]=arr[i];
                      arr[i]=temp;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={0,0,0,0,0,4,3,0,5,2};
        Navie_0_end ne=new Navie_0_end();
        ne.movetoend(arr);
    }
}