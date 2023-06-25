public class  Naive_Largest2nd{
    int get1st_Largest(int[]arr){
        int Large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[Large]){
                Large = i;
            }
        }
        return Large;
    }
    int get2nd_Largest(int[] arr){
        int compare=get1st_Largest(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[compare]){
                if(res==-1){
                    res=i;
                }
                else if(arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;   
    }

    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        Naive_Largest2nd l2nd=new Naive_Largest2nd();
        System.out.println(l2nd.get2nd_Largest(arr));
    }
}
