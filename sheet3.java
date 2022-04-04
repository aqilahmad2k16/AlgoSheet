import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sheet3 {

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of first array");
        // int n = scan.nextInt();

        // int[] arr1 = new int[n];
        // for(int i=0; i<n; i++){
        //     arr1[i] = scan.nextInt();
        // }

        // System.out.println("Enter the size of second array");
        // int m = scan.nextInt();
        // int[] arr2 = new int[m];
        // for(int i=0; i<m; i++){
        //     arr2[i] = scan.nextInt();
        // }

        


        // Question 3
        // findAverageOfArray(arr);

        // Question 4
        // findAgainAvge(arr);

        // Question 5
        // displayNumberOfOddAndEven(arr);

        // Question 6
        // mergeTwoArrays(arr1, arr2);

        // Question 7

        // compareTwoArrays(arr1, arr2);

        // Question 8 Doubt
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }




        // System.out.println("Enter element that's you want to remove from the array");
        // int k = scan.nextInt();

        // removeArraysElement(arr,k);

        // Question 9 (ascending order/bubble sort)
        // sortAnArray(arr);

        // Question 10 (descending order)

        // sortDescendingOrder(arr); 

        // Question 1
        // findTheSecondLargest(arr);

        // Question 2
        // findTheSecondSmallest(arr);





    }

    public static void findAgainavge(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        // int avge = (sum/arr.length);
        // System.out.println(avge);
    }

    public static void findAgainAvge(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
            
        }

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }

        // for(int i=0; i<arr.length; i++){
        //     sum += arr[i];
        // }


        sum = sum - max - min;
        float avge = (sum/(arr.length-2));
        System.out.println(avge);
    }

    public static void displayNumberOfOddAndEven(int[] arr){
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                c1++;
            }else{
                c2++;
            }
        }

        System.out.println("number of even number "+ c1);
        System.out.println("number of odd number "+ c2);

    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i<=arr1.length-1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j<=arr2.length-1){
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        for(int l=0; l<arr3.length; l++){
            System.out.print(arr3[l]+ " ");
        }
    }

    public static boolean compareTwoArrays(int[] arr1, int[]arr2){
        if(arr1.length == arr2.length){
            int i = 0, j = 0;
            while(i<arr1.length){
                if(arr1[i] != arr2[j]){
                    // System.out.println(false);
                    return false;
                }
                i++;
                j++;
            }

            // System.out.println(true);
            return true;
        }
        return false;
    }

    public static void removeArraysElement(int[] arr, int k){
        ArrayList<Integer> ast = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            ast.add(arr[i]);
        }

        System.out.print(ast+ " ");
        System.out.print(ast.remove(k));

    }

    public static void sortAnArray(int[] arr) {
        for(int i=arr.length-1; i>=1; i--){
            for(int j=0; j<i; j++){
                if(isSmaller(arr,j+1, j)){
                    swap(arr, j+1, j);
                }
            }
        }

        display(arr);
    }

    public static boolean isSmaller(int[] arr, int i, int j){
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortDescendingOrder(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(isGreater(arr,j+1, j)){
                    swap(arr, j+1, j);
                }
            }
        }

        display(arr);

    }

    public static boolean isGreater(int[] arr, int i, int j){
        if(arr[i] > arr[j]){
            return true;
        }else{
            return false;
        }
    }

    public static void findTheSecondLargest(int[] arr){
        //use two variable concept
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        
    }

    public static void findTheSecondSmallest(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }


}
