 import java.util.*;
public class Subarray_With_Given_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
           prefixsum=prefixsum+arr[i];
           if(map.containsKey(prefixsum-target))
            {
                count=count+map.get(prefixsum-target);
            } 
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        System.out.println(count);
    }
}


