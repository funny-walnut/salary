import java.util.*;

public class Level1
{

public static int [] SynchronizingTables(int N, int [] ids, int [] salary)
    {
        int [] ids2 = new int [N];
        int [] salary2 = new int[N];
        for (int i = 0; i<N; i++)
        {
            ids2[i]= ids[i];
        }
        for (int i = 1; i<N; i++)
        {
            for (int b=N-1; b>=i; b--)
            {
                if (ids2[b-1]>ids2[b])
                {
                    int t = ids2[b - 1];
                    ids2[b - 1] = ids2[b];
                    ids2[b] = t;
                }
            }
        }
        int[]indicate = new int[N];
        for (int j=0;j<N; j++)
        {
            for (int i=0; i<N;i++)
            {
                if (ids2[i]==ids[j])
                {
                    indicate[j]=i;
                }
            }
        }

        for (int i = 1; i<N; i++)
        {
            for (int b=N-1; b>=i; b--)
            {
                if (salary[b-1]>salary[b])
                {
                    int t = salary[b - 1];
                    salary[b - 1] = salary[b];
                    salary[b] = t;
                }
            }
        }
        for (int i = 0; i<N; i++)
        {
            salary2[i]= salary[i];
        }
        for (int i =0; i<N; i++)
        {
            salary [i]=salary2 [indicate[i]];
        }
        return salary;
    }
    }
