public class Efficient_check_sorted {
    boolean insorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={5,10,12,13};
        Efficient_check_sorted ecs=new Efficient_check_sorted();
        System.out.println(ecs.insorted(arr));
    }
}
