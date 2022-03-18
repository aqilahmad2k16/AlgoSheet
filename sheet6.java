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

        System.out.println("Enter the String");
        String str = scan.nextLine();
        // findTheSubString(str);

        //Question 5
        // System.out.println("enter the number");
        // int n = scan.nextInt();
        // convertZeroToFive(n);

        //Question 6
        checkIsogram(str);
    
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

    public static void checkIsogram(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            isContain(str, ch);
        }

       
    }

    public static void isContain(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            if(ch1 == ch){
                count++;
            }
            if(count>1){
                return false;
            }
            count = 0;
        }

        return true;
    }
}
