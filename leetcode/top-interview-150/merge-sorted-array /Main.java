import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        int i = 0;  int countn1 = 0; int countn2 = 0;

        while(nums1.length > i){
            if(nums1[i] == 0){countn1++;}
            i++;
        }

        i=0;
        while(nums2.length > i){
            if(nums2[i] == 0){countn2++;}
            i++;
        }

        int size = (nums1.length-countn1)+(nums2.length-countn2);
        int mergerArrays[] = new int[size];

        i = 0;

        while(nums1.length > i){
            if(nums1[i] > 0){
                mergerArrays[i] = nums1[i];
            }
            i++;
        }

        int j = 0;

        while(nums2.length > j){
            if(nums2[j] > 0){
                mergerArrays[i+j] = nums2[i];
            }
            j++;
        }

        System.out.printf("\n-------------");

        for(int k = 0; k < mergerArrays.length; k++){
            System.out.printf("\n | %d", mergerArrays[k]);
        }




        for (int x = 0; x < mergerArrays.length; x++) {
            boolean swapped = false;
            for (int z = 0; z < mergerArrays.length - x - 1; z++) {
                if (mergerArrays[z] > mergerArrays[z + 1]) {

                    int aux = mergerArrays[z];
                    mergerArrays[z] = mergerArrays[z + 1];
                    mergerArrays[z + 1] = aux;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.printf("\n-------------");

        for(int k = 0; k < mergerArrays.length; k++){
            System.out.printf("\n | %d", mergerArrays[k]);
        }




    }


}