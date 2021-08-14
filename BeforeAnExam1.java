import java.util.*;
import java.io.*;

public class BeforeAnExam1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sum = sc.nextInt();
        int[] mins = new int[30];
        int[] maxes = new int[30];
        int min_time = 0;
        int max_time = 0;
        for (int i = 0; i < d; i++)
        {
            int min = sc.nextInt();
            int max = sc.nextInt();
            min_time += min;
            max_time += max;
            mins[i] = min;
            maxes[i] = max;
        }
        if (min_time <= sum && sum <= max_time)
        {
            System.out.println("YES");
            for (int i = 0; i < d; i++)
            {
                int time = Math.min(maxes[i], mins[i] + sum - min_time);
                sum -= (time - mins[i]);
                System.out.print(time + " ");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}