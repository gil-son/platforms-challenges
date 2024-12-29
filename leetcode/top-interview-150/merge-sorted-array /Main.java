import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scanner = new  Scanner(System.in);

        System.out.println("Inform the size of first array:");
        int aux1 = scanner.nextInt();

        System.out.println("Inform the size of second array:");
        int aux2 = scanner.nextInt();

        int[] nums1 =  new int[aux1];
        int[] nums2 =  new int[aux2];

        int count1=0, count2=0;

        System.out.printf("\nFor the first array!\n");
        for(int i = 0; i < nums1.length; i++){System.out.printf("Inform the %dth array:", i+1); nums1[i] = scanner.nextInt();}
        System.out.printf("the first array contains: ");
        Arrays.stream(nums1).forEach(n -> System.out.printf("%d|", n));

        System.out.println("\nFor the second array!");
        for(int i = 0; i < nums2.length; i++){System.out.printf("Inform the %dth array:", i+1); nums2[i] = scanner.nextInt();}
        System.out.printf("the second array contains: ");
        Arrays.stream(nums2).forEach(n -> System.out.printf("%d|", n));

        // Algorithm

    }
}