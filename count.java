package Mathematical;

import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        int collection=0;
        int temp=a;
        while(temp!=0){
            temp=temp/10;
            collection++;
        }
        System.out.println(collection);
    }
    
}