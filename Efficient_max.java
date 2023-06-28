public class Efficient_max {
    int maxdiff(int[]arr){
        int res=arr[1]-arr[0];
        int minvale=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(res, arr[j]-minvale);
            minvale=Math.min(minvale, arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={2,3,10,6,4,8,1};
        Efficient_max Em=new Efficient_max();
        System.out.println(Em.maxdiff(arr));
    }
    
}
