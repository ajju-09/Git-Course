public class Merge_Sort {
    //Time Complexity is O(n log(n))
    // It use divide and concer rule 
    public static void MergeSort(int[] arr, int l, int r){
        if(l < r){
            int mid = (l+r)/2;

            MergeSort(arr, l , mid);
            MergeSort(arr, mid+1 , r);

            Merge(arr, l, mid, r);

        }
    }

    private static void Merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l+1;
        int n2 = r - mid;

        int Larr[] = new int[n1];
        int Rarr[] = new int[n2];

        //To copy the values in array
        for(int x=0; x<n1; x++){
            Larr[x] = arr[l+x];
        }

        for(int x=0; x<n2; x++){
            Rarr[x] = arr[mid+1+x];
        }

        int i=0, j=0, k=l;

        while(i<n1 && j<n2){
            if (Larr[i] <= Rarr[j]) {
                arr[k] = Larr[i];
                i++;
            }
            else{
                arr[k] = Rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k] = Larr[i];
            i++;
            k++;
        }

        while (j<n2) {
            arr[k] = Rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 12, 76, 34, 22};

        System.out.println("Before Sorting: ");
        for(int n : arr){
            System.out.print(n+" ");
        }

        MergeSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println("After Sorting");
        for(int n : arr){
            System.out.print(n+" ");
        }

    }
    
}
