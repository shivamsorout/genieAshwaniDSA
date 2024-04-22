package Array;

public class PivotEle {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int index=findPivot( arr);
        System.out.println(index);
    }

    public static int findPivot(int arr[])
    {
        int Tsum=0;  //totalSum
        for(int i=0;i<arr.length;i++)
        {
            Tsum+=arr[i];
        }

        int Tls=0; //leftSum
        for(int i=0;i<arr.length;i++)
        {
            int Trs=Tsum-Tls-arr[i]; //rightSum
            if(Tls==Trs)
            {
                return i;
            }
            Tls+=arr[i]; //leftSum

        }
        return -1;

    }
}
