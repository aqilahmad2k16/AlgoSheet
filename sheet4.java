import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;
import java.util.Scanner;

public class sheet4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n  = scan.nextInt();
        // System.out.println("Enter the value of k");

        // int k = scan.nextInt();
        // Question 1
        // rotateANumber(n, k);

        // Question 2
        // System.out.println("Enter the first Number");
        // int n1 = scan.nextInt();
        // System.out.println("Enter the second Number");
        // int n2 = scan.nextInt();

        // findTheGCDAndLCM(n1, n2);


        // Question 3

        // System.out.println("Enter the String");
        // String str = scan.nextLine();
        // printPalindromic(str);

        // Question 4
        // printAllPanlindromicSubString(str);

        // Question 5
        // firstCompression(str);
        // secondCompression(str);

        // Question 6
        // findAllPermutation(str);
      
        //Question 7
        // findUpperAndLowerCase(str);

        //Question 8
        System.out.println("Enter the size of first arrays");
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];

        for(int i=0; i<n1; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the size of second arrays");
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        
        for(int i=0; i<n2; i++){
            arr2[i] = scan.nextInt();
        }
        findTheUnionOfTwoArrays(arr1, arr2);




    }

    public static void rotateANumber(int n, int k){
        int m = n;
        int d = 0;
        while(n!=0){
            n /= 10;
            d++;
        }

        k = k%d;
        if(k<0){
            k = k+d;
        }

        int pow1  = (int)Math.pow(10, k);
        int pow2 = (int)Math.pow(10, d-k);
        int n1 = m % pow1;
            m  /= pow1;
        
        int resNum = n1*pow2 + m;
        System.out.println("0"+resNum);

    }

    public static void findTheGCDAndLCM(int n1, int n2) {

        if(n1<n2){
            int temp = n1; 
            n1 = n2;
            n2 = temp;
        }
        int a = n1;
        int b = n2;
        
        while(n2!=0){
             int rem = n1%n2;
             n1 = n2;
             n2 = rem;
        }

            System.out.println("GCD of the numberis "+ n1);

            int lcm = (a*b)/n1;
            System.out.println("LCM of the numberis "+ lcm);


        
    }


    public static void printPalindromic(String str) {
        int i = 0;
        int j = str.length()-1;

        while(i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                System.out.println("Given String is not palindromic");
                return;
            }else{
                i++;
                j--;
            }
        }

        System.out.println("String is Palindromic");
    }


    public static void printAllPanlindromicSubString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isPalindromic(str, i, j)){
                    System.out.println(str.substring(i, j));

                }
            }
            System.out.println();
        }
    }

    public static boolean isPalindromic(String str, int i, int j){
        while(i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j-1);
            if(ch1 != ch2){
               return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }


    public static void firstCompression(String str){
        // StringBuilder sb = new StringBuilder();
        String str1 = "" +'a';
        int i=1;
        while(i<str.length()){
            if(str.charAt(i) == str.charAt(i-1)){
                i++;
            }else{
                str1 += str.charAt(i);
                i++;
            }
        }
        // str1 += str.charAt(str.length());

        System.out.println(str1);
    }

    public static void secondCompression(String str){
        String str1 = "" +'a';
        int count = 1;
        int i=1;
       while(i<str.length()){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                i++;
            }else{
                if(count>1){

                    str1 += count;
                }
                
                str1 += str.charAt(i);
                i++;
                count = 1;
            }
        }

        str1 += count;
        System.out.println(str1);
    }

    public static void findAllPermutation(String str){
        
        int f = factorial(str);

        for(int i = 0; i<f; i++){
            StringBuilder sb = new StringBuilder(str);
            int n = i;
            for(int j = str.length(); j>=1; j--){
                int rem = n%j;
                int ques = n/j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                n = ques;
            }
            System.out.println();
        }
    }

    public static int factorial(String str){
        int val = 1;
        for(int i=str.length(); i>=1; i--){
            val = val*i;
        }

        return val;
    }

    public static void findUpperAndLowerCase(String str){
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch <= 'z'){
                str1 += (char)(ch-32);//upperCase
            }else{
                str1 += (char)(ch+32);// lowerCase
            }
        }
        System.out.print(str1);
    }


    public static void findTheUnionOfTwoArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> lst = new ArrayList<>();
        int i=0;
        lst.add(arr1[0]);
        while(i<arr1.length){  
            ++i; 
            if (isArraysContain(lst, i, arr1) == false){

                lst.add(arr1[i]);
            }
        
        }
        System.out.println(lst);    
    }

    public static boolean isArraysContain( ArrayList<Integer> arr, int i , int[] arr1){
        for(int j=0; j<arr.size(); j++){
            if(arr.get(j) == arr1[i]){
                return true;
            }
        }
        return false;
    }

}
