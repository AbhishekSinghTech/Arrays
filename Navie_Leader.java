public class Navie_Leader {
    void leader(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={7,10,4,3,6,5,2};
        Navie_Leader nl=new Navie_Leader();
        nl.leader(arr);
    }
}
