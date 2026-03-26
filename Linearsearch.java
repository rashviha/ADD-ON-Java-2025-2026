import java.util.Scanner;
class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Enter the element to search: ");
        int found = sc.nextInt();
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) {
               
                System.out.println("Element " + found + " found at index: " + i);
                return;
            }
            
            }
             System.out.println("Element " + found + " not found in the array.");
        }

        
            
        
    }
