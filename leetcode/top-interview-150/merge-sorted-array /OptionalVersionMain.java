import java.util.Arrays;
import java.util.Scanner;

public class OptionalVersionMain {
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

        //for (int num: nums1){if(num==0){count1++;}}
        //for (int num: nums2){if(num==0){count2++;}}

        int[] merge = new int[aux1+aux2];

        int exchange = nums1.length;
        int support = 0;

        int maxsize = 0;

        if(nums1.length>nums2.length){
            maxsize=nums1.length;
        }else{
            maxsize=nums2.length;
        }


        for(int i = 0; i < maxsize; i++){

            for(int j=0; j < maxsize-1; j++){
                if(nums1[j]==0 && nums1.length>j){
                    support=nums1[exchange]; // pass the last value of last position
                    nums1[exchange]=nums1[j];  // pass the current value of the current position to last position
                    nums1[j]=support; // received the last value to current position
                    exchange--;
                }
                if(nums2[j]==0 && nums2.length>j){
                    support=nums2[exchange]; // pass the last value of last position
                    nums2[exchange]=nums2[j];  // pass the current value of the current position to last position
                    nums2[j]=support; // received the last value to current position
                    exchange--;
                }

            }

        }
         //1 2 0 0 0 3 0 1 2 6 5 0

        //0 1 0 1 3

        //3 1 0 1 0
        //  3 1 1 0 0

            //12+5-5-2
              //      10

    }
}