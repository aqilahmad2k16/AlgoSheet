import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class sheet5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter the size of the Array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter which largest do you want");
        int k = scan.nextInt();

        //Question 1
        // findTheKthLargestFromArray(arr, k);
        //Question 2
        // findTheKthSmallestFromArray(arr, k);

        // System.out.println("Enter the size of the array");
        // int n = scan.nextInt();
        // double[] arr = new double[n];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = scan.nextInt();
        // }
        // Question 3
        // rotateTheElementOnePosition(arr);

        // Question 5=4
        // System.out.println("Enter the value of k");
        // int k = scan.nextInt();
        //// swapTheKthelem(arr, k);//

        // Question 5
        // System.out.println(whetherArrayPerfectOrNot(arr));

        /// Question 6
        // findTheAverageOfStream(arr);

        //Question 7
        // String[] names = new String[n];
        // for(int i=0; i<names.length; i++){
        //     names[i] = scan.next();
        // }
        
        // displayTheLongestName(names);

        //Question 8
        // System.out.println("enter the string");
        // String str = scan.next();

        // deleteCharacterAtOdd(str);

        //Question 9
        // formTheThreeString(str);

        // Question 10//
        // formTheTriangleOfString(str);

        

    }

    public static void rotateTheElementOnePosition(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void swapTheKthelem(int[] arr, int k){
        int temp = arr[k-1];
        arr[k-1] = arr[arr.length - k];
        arr[arr.length - k] = temp;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static String whetherArrayPerfectOrNot(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i] != arr[j]){
                return "Not Perfect";
            }

            i++;
            j--;
        }

        return "Perfect";
    }

    public static void findTheAverageOfStream(double[] arr){
        double[] arr1 = new double[arr.length];
        int sum = 0;
        for(int i=1; i<=arr.length; i++){
            sum += arr[i-1];
            arr1[i-1] = sum/i;
            
             
        }

        // String.format("%.2f", arr1);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
    }

    public static void displayTheLongestName(String[] names){
        int[] arr = new int[names.length];
        
        for(int i=0; i<names.length; i++){
            String str = names[i];
            arr[i] = str.length();
        }

        int max = findTheMaxOfArray(arr);
        for(int i=0; i<names.length; i++){
            String str = names[i];
            if(str.length() == max){
                System.out.println(str);
                return;
            }
        }  
    }

    public static  int findTheMaxOfArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int max1 = arr[i];
            if(max1>max){
                max = max1;
            }
        }
        return max;
    }

    public static void deleteCharacterAtOdd(String str){
        Queue<Character> st = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i%2 == 0){
                st.add(ch);
            }
        }

        while(st.size() != 0){
            System.out.print(st.remove());
        }

    }

    public static void formTheThreeString(String str){
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                s1 += ch;
            }else if(ch >= '0' && ch <= '9'){
                s2 += ch;
            }else{
                s3 += ch;
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

    public static void formTheTriangleOfString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<i; j++){
                System.out.print(".");
            }

            System.out.print(str.substring(i,str.length()));
            System.out.println();

        }
    }
    
    public static void findTheKthLargestFromArray(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println("The " + k+ "th largest is "+ arr[arr.length - k]);

    }
    public static void findTheKthSmallestFromArray(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println("The " + k+ "th Smallest is "+ arr[k-1]);
    }
}
