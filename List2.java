import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        // question 1
        // System.out.println("Enter the year");
        // int yr = scan.nextInt();
        // findTheleapyr(yr);
        // question 2


        // char ch = 'a';
        // printAllSmallestAlphabet(ch);


        // question 3
        
        // String str = "aeiou";
        // printVowels(str);

        // Question 4****************************************Doubt

        // char ch = 'a';
        // printAllConsonants(ch);

        // question 5

        // System.out.println("Enter the number");
        // int n = scan.nextInt();

        // System.out.println(factorial(n));

        // Question 6

        // System.out.println("Enter the number");
        // int n = scan.nextInt();
        // whetherPrimeOrNot(n);

        // question 7
        // System.out.println("Enter the number");
        // int n = scan.nextInt();
        // whetherPrimeByEfficientMethod(n);

        // Question 8

        // System.out.println("Enter the size of the array");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }

        // displayAllArrayElements(arr);

        // question 9

        // System.out.println("Enter the size of the Array");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }

        // System.out.println("enter the matching number");
        // int k = scan.nextInt();

        // matchingTheElem(arr, k);

        // question 10;
        // System.out.println("Enter the size of the Array");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }
        // int max = Integer.MIN_VALUE;

        // System.out.println(findMaxOfArray(arr, max));

       
        // System.out.println("Enter the size of the Array");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }
         // Question 11
        // findLargestOfArray(arr);

        // Question 12
        // findSmallestOfArray(arr);

        // Question 13

        // findDiffBtLargestAndSmallest(arr);

        // Question 14
        // ReverseTheArray(arr);

        // Question 15
        // findTheFrequency(arr); // Doubt

        // Question 16

        // copyArrayToArray(arr);

        // Question 17
        // int a = 0, b = 1; 
        // System.out.print(a + " ");
        // System.out.print(b + " ");

        // for(int i=1; i<=40; i++){
        //     int c = a+b;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }

        // Question 18 Fabunacci Series
        // System.out.print("Enter the size of fabunacci series");
        // int n = scan.nextInt();
        // int a = 0, b = 1; 
        // ArrayList<Integer> lst = new ArrayList<>();
        // lst.add(a);
        // lst.add(b);
        // for(int i=1; i<=n; i++){
        //     int c = a+b;
        //     lst.add(c);
        // //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }

        // System.out.println("Enter ith position of Fabunacci Number");
        // int ith = scan.nextInt();
        // System.out.println(lst.get(ith));


        //Question 19 Square pattern
        // System.out.println("Enter the size of patter");
        // int n = scan.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         System.out.print("#" + " ");
        //     }
        //     System.out.println();
        // }

        // Question 20 triangular pattern

        // System.out.println("Enter the size of pattern");
        // int n = scan.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("#" + " ");
        //     }
        //     System.out.println();
        // }

        // Question 21 number pattern

        // System.out.println("Enter the size of pattern");
        // int n = scan.nextInt();
        // int val = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<i; j++){
        //         System.out.print(val+ " ");
        //         val++;
        //     }
        //     val = 1;
        //     System.out.println();
        // }

        // question 22
        
        // System.out.println("Enter the string");
        // String str = scan.nextLine();

        // System.out.println(str);

        // Question 23

        // System.out.println("Enter the string");
        // String str = scan.nextLine();
        // System.out.println(str.length());

        // Question 24 /// Doubt
        // System.out.println("Enter the string");
        // String str = scan.nextLine();

        // reverseTheString(str);

        // Question 25
        System.out.println("Enter the string");
        String str = scan.nextLine();
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                c1++;
            }else{
                c2++;
            }

            
        }

        System.out.println(c1);
        System.out.print(c2);

        








        

    }

    public static void findTheleapyr(int year){
        if(year%4 == 0){
            if(year%40 == 0){
                if(year%400 == 0){
                    System.out.println("Given year is leap year");
                }
            }
        }else{
            System.out.println("Given year is not leap year");
        }
    }

    public static void printAllSmallestAlphabet(char ch){
        while(ch <= 'z'){
            System.out.print(ch + " ");
            ++ch;
        }
    }

    public static void printVowels(String str){
        // StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }
    }

    public static void printAllConsonants(char ch){
        while(ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                break;
            }else{
                System.out.print(ch + " ");
            }

            ++ch;
        }
    }

    public static int factorial(int n){
        if( n == 0){
            return 1;
        }
        int fac = factorial(n-1);
        return n*fac;
    }

    public static void whetherPrimeOrNot(int n){

        // you can emrove time complexity
        int count = 0;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }


    public static void whetherPrimeByEfficientMethod(int n){
        int count = 0;
        for(int div = 2; div*div<n; div++){
            if(n%div == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println("prime");
        }else {
            System.out.println("not priime");
        }
    }

    public static void displayAllArrayElements(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void matchingTheElem(int[] arr, int k){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k){
                System.out.println(true);
                return;
            }else{
                System.out.println(false);
            }
        }
    }

    public static int findMaxOfArray(int[] arr, int max){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }


        return max;
    }

    public static void findLargestOfArray(int[] arr){
     int max = Integer.MIN_VALUE;
     for(int i=0; i<arr.length; i++){
         if(arr[i] > max){
             max = arr[i];
            }
     }

     System.out.println(max);

    }

    public static void findSmallestOfArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }


    public static void findDiffBtLargestAndSmallest(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // System.out.println("Largest of Array "+max);
        // System.out.println("Smallest of Array "+min);

        int diff = max-min;
        System.out.println(diff);

    }


    public static void ReverseTheArray(int[] arr){
        int l = 0, r = arr.length-1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp; 
            l++;
            r--;
        }

        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i] + " ");   
        }
    }

    public static void findTheFrequency(int[] arr){
        // withou 2nd loop we have to find ...   doubt
        ArrayList<Integer> lst = new ArrayList<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int k = arr[i];
            for(int j=0; j<arr.length; j++){
                if(arr[j] == k){
                    count++;
                }

            }
            lst.add(count);
            count = 0;
        }

        System.out.print(lst);
    }

    public static void copyArrayToArray(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

    // public static void reverseTheString(String str){
    //     StringBuilder sb = new StringBuilder(str);

    //     int i = sb.length() - 1;
    //     int j = 0;
    //     while(j<i){
    //         char ch2 = sb.charAt(j);
    //         sb.charAt(j) = sb.charAt(i);
    //             sb[i] = ch2;

    //         i--;
    //         j++;
    //     }
    //     System.out.print(sb + " ");


    // }





    

}
