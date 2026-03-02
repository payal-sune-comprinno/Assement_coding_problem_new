import java.util.*;
 public class Longest_Consequetive_Sequence {
   

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:a)
        {
            set.add(num);
        }
        int longSeqCount=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int currentnum=num;
                int count=1;
                while(set.contains(currentnum+1))
                {
                    currentnum++;
                    count++;
                }
                longSeqCount=Math.max(longSeqCount,count);

            }
        }
        System.out.println(longSeqCount);
    }
}


