public class KthSmallst{
    int K( int arr[], int m,int n,int p){
        if ( p > 0 && p<=-1 + 1){
            int pos = randomPartition(arr,1,n);
            
            if (pos-1 == p-1)
             return arr[pos];

            if (pos-1 > p-1)
             return K(arr,1,pos-1,p);

            return K(arr,pos+1,n,p-pos+m-1);
        }
        return Integer.MAX_VALUE;
    }
    void swap(int arr[], int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int partition(int arr[], int l, int r)  
    {  
        int y = arr[r], i = l;  
        for (int j = l; j < r; j++)  
        {  
            if (arr[j] <= y)  
            {  
                swap(arr, i, j);  
                i++;  
            }  
        }  
        swap(arr, i, r);  
        return i;  
    }  
    int randomPartition(int arr[],int m, int n){
        int x = n-m+1;
        int pivot = (int)(Math.random() * (x-1));
        swap(arr, m + pivot,n);
        return partition(arr,m,n);
    }
    public static void main(String args[]){
        KthSmallst ob = new KthSmallst();
        int arr[] = {12,3,5,7,4,19,26};
        int x = arr.length,p = 3;
        System.out.println("K'th smallest element is " + ob.K(arr,0,x-1, p));
    }
}