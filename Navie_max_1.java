public class Navie_max_1{
    static int maxConsecutiveOnes(int arr[])
    {
        int res = 0;
    	for(int i = 0; i <arr.length; i++)
    	{
    		int curr = 0;
    		for(int j = i; j <arr.length; j++)
    		{
    			if(arr[j] == 1) curr++;
    			else break;
    		}
    		res = Math.max(res, curr);
    	}
    	return res;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 1,1,1,0,0, 0, 1, 1};
       System.out.println(maxConsecutiveOnes(arr));

    } 
}
