public class Deletion {
    int deletelement(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                break;
            }
        if(i==arr.length){
            return arr.length;
        }
        for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
    }
        return (arr.length-1);
    }
    public static void main(String[] args) {
        int []arr={3,8,12,5,6};
        int x=12;
        Deletion del=new Deletion();
        System.out.println(del.deletelement(arr, x));

        
        

    }
}
