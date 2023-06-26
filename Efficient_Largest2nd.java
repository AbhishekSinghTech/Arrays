public class Efficient_Largest2nd {
    int Second_highest(int[]arr){
        int res=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1|| arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,60,70};
        Efficient_Largest2nd El=new Efficient_Largest2nd();
        System.out.println(El.Second_highest(arr));
    }
}
