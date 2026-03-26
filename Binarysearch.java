class Binarysearch{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int low = 0;
        int high = arr.length - 1;
        int found = 30; // Element to search

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == found) {
                System.out.println("Element " + found + " found at index: " + mid);
                return;
            } else if (arr[mid] < found) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left halfA
            }
        }

        System.out.println("Element " + found + " not found in the array.");
    }
}
