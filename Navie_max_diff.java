public class Navie_max_diff {
    int maxDiff(int[]arr){
        int res=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;  
    }
    public static void main(String[] args) {
        int[]arr={2,3,10,6,4,8,1};
        Navie_max_diff Nmd=new Navie_max_diff();
        System.out.println(Nmd.maxDiff(arr));
    }
    
}
