import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter size < 20
        int size;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // Enter elements' value
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter " + (i+1) + " element: ");
            arr[i] = input.nextInt();
        }

        // Print out 2 arrays
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}