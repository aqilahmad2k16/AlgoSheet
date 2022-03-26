import java.util.ArrayList;
import java.util.Scanner;

public class sheet6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array");

        // int n = scan.nextInt();
        // int[] arr = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = scan.nextInt();
        // }

        //Question 1
        // findTheMissingElement(arr); 

        //Question 2
        // deleteTheDuplicateTheArray(arr);

        //Question 3

        // System.out.println("Enter the String");
        // String str = scan.nextLine();
        // findTheSubString(str);
        
        // Question 4
        // System.out.println("Enter a String");
        // String str = scan.next();
        // System.out.println("Enter a subString");
        // String sbs = scan.next();
        // checkWhetherSubString(str, sbs);

        //Question 5
        // System.out.println("enter the number");
        // int n = scan.nextInt();
        // convertZeroToFive(n);

        //Question 6
        // System.out.println(checkIsogram(str));

        // Question 7
        // arrangeZerosToTheArray(arr);

        //Question 8
        // toggleTheString(str);

        //Question 9
        // returnMaximumProduct(arr);

        //Question 10
        // System.out.println("Enter the value of a, b and c");
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // int c = scan.nextInt();
        // whetherPythagorianTriplet(a, b,c);
        

        // Wraper Class: these class is generally use to include the premitive values to the object family in order to behave truely object oriented programming.

        // .parseXxx(): static method and use to convert from one data type to Xxx data type
        int j = Integer.parseInt("123"); //
        Integer jk = Integer.valueOf("123");
        // System.out.println(jk);
        int c = jk.intValue();// here .xxxValue() return primitive data types;
        // System.out.println(c);



    
    }

    public static void findTheMissingElement(int[] arr){
        int i = 1;
        while(i<=arr.length){

            for(int j=0; j<arr.length; j++){
                if(arr[j] != i){
                    System.out.println(i);
                    return;
                }else{
                    i++;
                }
            }
        }
        
    }


    public static void deleteTheDuplicateTheArray(int[] arr){
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(arr[0]);
        for(int i=1; i<arr.length; i++){
           int val = arr[i];
           if(isArrayContain(lst, val) == false){
                lst.add(val);
           }
        }

        System.out.println(lst);
    }

    public static boolean isArrayContain(ArrayList<Integer> arr, int val){
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == val){
                return true;
            }
        }

        return false;
    }

    public static void checkWhetherSubString(String str, String sbs){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.substring(i,j) == sbs){
                    System.out.println(true);
                }
            }
         
        }
        System.out.println(false);

        

    }

    public static void findTheSubString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
            System.out.println();
        }
    }

    public static void convertZeroToFive(int n){
        String str = n +"";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '0'){
                sb.append(5);
            }else{
                sb.append(ch);
            }
        }
        
        System.out.println(sb);
        

    }

    public static int checkIsogram(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(isContain(str, ch) == false){
                return 0;
            }
        }

        return 1;

       
    }

    public static boolean isContain(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            if(ch1 == ch){
                count++;
            }
            if(count>1){
                return false;
                
            }
        }

        return true;
    }

    public static void arrangeZerosToTheArray(int[] arr){
        int[] arr1 = new int[arr.length];
        int i=0, j = arr.length-1;
        for(int k=0; k<arr.length; k++){
            if(arr[k] != 0){
                arr1[i] = arr[k];
                i++;
            }else{
                arr1[j] = arr[k];
                j--;
            }
        }

        display(arr1);
    }

    public static void display(int[] arr1){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

    public static void toggleTheString(String str){
        String rstr = " ";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                rstr += (char)(ch-32);//uppercase;
            }else{
                rstr += (char)(ch+32); // lowercase;
            }
        }

        System.out.println(rstr);
    }

    public static void returnMaximumProduct(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            int max1 = arr[i] * arr[i-1]; 
            if(max1 > max){
                max = max1;
            }
        }

        System.out.println(max);
    }

    public static void whetherPythagorianTriplet(int a, int b, int c){
        if(a<b){
            if(b>c){
                int temp = a;
                a = b;
                b = temp;
            }else if(c>b){
                int temp = a;
                a = c;
                c = temp;
            }
        }else if(a>b){
            if(a<c){
                int temp = a;
                a = c;
                c = temp;
            }
        }

        if(a*a == (b*b + c*c)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
