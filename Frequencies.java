public class Frequencies {
    void printFrequence(int[]arr){
        int frequen=1;
        int i=1;
        while(i<arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                frequen++;
                i++;
            }
            System.out.println(arr[i-1]+" "+frequen);
            i++;
            frequen=1;
            
        }
        if(arr.length==1||arr[arr.length-1]==arr[arr.length-2]){
            System.out.print(arr[arr.length-1]+" "+1);
        }

    }
    public static void main(String[] args) {
        int[]arr={10,10,10,20,20,30,40,50,50,60};
        Frequencies Fre=new Frequencies();
        Fre.printFrequence(arr);
    }
}
