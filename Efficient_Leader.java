public class Efficient_Leader {
    void Leader1(int[]arr){
        int curr_leader=arr[(arr.length)-1];
        System.out.print(curr_leader+" ");
        for(int i=(arr.length)-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.print(curr_leader+" ");
            }
        }

    }
     public static void main(String[] args) {
        int[]arr={7,10,4,3,6,5,2};
        Efficient_Leader el=new Efficient_Leader();
        el.Leader1(arr);
    }
}
