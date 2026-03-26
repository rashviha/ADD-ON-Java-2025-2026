public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {2,5,7,8,9};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int midindex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[midindex]){
                    midindex = j;
                }
            }
            int temp = arr[midindex];
            arr[midindex] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}