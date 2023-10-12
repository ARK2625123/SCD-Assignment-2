
import java.util.*;

public class Q3 {

    public static void mergeIntervals(List<int[]> intervals)
    {
        if (intervals.isEmpty())
        {
            return ;
        }

        else
        {
          
        

        for (int i = 1; i < intervals.size(); i++) {
            int[] current = intervals.get(i-1);
            int[] next = intervals.get(i);

            if (current[1] >= next[0]) {
               
                if (next[1]>current[1])
                {
                    current[1]=next[1];
                    intervals.remove(next);
                }
                ;
            } 

        }
        for (int j=0;j<intervals.size();j++)
        {System.out.println("["+intervals.get(j)[0]+","+intervals.get(j)[1]+"]");}
        
        }

    }
    public static void main(String args[])
    {
        List<int[]> intervals = new ArrayList<int[]>(10);//([1,3],[2,6],[8,10],[15,18]);
        int[] a={1,3};
        int[] b={2,6};
        int[] c={8,10};
        int[] d={9,18};      
        intervals.add(a);
        intervals.add(b);
        intervals.add(c);
        intervals.add(d);

        mergeIntervals(intervals);
        
    }
}
