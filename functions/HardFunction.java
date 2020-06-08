package functions;

import com.model.Function;

public class HardFunction extends Function {

    public HardFunction(int topValue, int bottomValue, int aParam)
    {
        super(topValue, 2, aParam);
    }

    void compAndSwap(int a[], int i, int j, int dir)
    {
        if ( (a[i] > a[j] && dir == 1) ||
                (a[i] < a[j] && dir == 0))
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    void bitonicMerge(int a[], int low, int cnt, int dir)
    {
        if (cnt>1)
        {
            int k = cnt/2;
            for (int i=low; i<low+k; i++)
                compAndSwap(a,i, i+k, dir);
            bitonicMerge(a,low, k, dir);
            bitonicMerge(a,low+k, k, dir);
        }
    }

    void bitonicSort(int a[], int low, int cnt, int dir)
    {
        if (cnt>1)
        {
            int k = cnt/2;

            bitonicSort(a, low, k, 1);

            bitonicSort(a,low+k, k, 0);

            bitonicMerge(a, low, cnt, dir);
        }
    }

    void sort(int a[], int N, int up)
    {
        bitonicSort(a, 0, N, up);
    }


    @Override
    public double calculateY(double x) {

        int up = 1;
        int[] arr = new int[(int)x];
        for (int i = 0; i < (int)x; i++){
            arr[i] = (int)(Math.random()*10+1);
        }

        if (x == 6){
            int b = 5;
        }

        long start = System.nanoTime();
        sort(arr, arr.length, up);
        long finish = System.nanoTime();

        return (double)(finish-start)/1000;
    }
}
