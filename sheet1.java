import java.util.Scanner;

public class sheet1 {
    // Question 2
    // public static void swap(int p, int q){
    // int temp = p;
    // p = q;
    // q = temp;
    // System.out.print(p + " " + q);
    // }
    // public static void main(String[] args) {
    // // int a = 10;
    // // int b = 20;

    // // swap(a, b);

    // }

    // public static void main(String[] args){

    // Question 3
    // int a = 10;
    // int b = 5;

    // if(a%2 == 0){
    // System.out.println("Number is even");
    // }else{
    // System.out.println("Number is odd");
    // }

    // Question 4
    // for(int i=1; i<=100; i++){
    // System.out.println(i + " ");
    // }

    // Question 5

    // int idx = 1;
    // while(idx<=100){
    // System.out.println(idx);
    // idx++;
    // }

    // Question 6

    // int idx = 2;
    // while(idx<=100){
    // System.out.println(idx + " ");
    // idx += 2;
    // }

    // Question 7
    // int idx = 1;
    // while(idx <= 100){
    // System.out.println(idx+ " ");
    // idx +=2;
    // }

    // question 8
    // int x = 25;
    // int y = 50;
    // if(x > y){
    // System.out.println("Largrest of two number is "+ x);
    // }else{
    // System.out.println("Largest of two number is " + y);
    // }

    // question 9

    // int a = 2;
    // int b = 3, c = 1;

    // if(a < b){
    // if(a < c){
    // System.out.println("Smallest of three number is "+ a);
    // }
    // }else if(a > b){
    // if(a < c){
    // System.out.println("Smallest of three number is "+ b);
    // }else{
    // System.out.println("Smallest of three number is "+ c);
    // }
    // // }else if(a > c){
    // // System.out.println("Smallest of three number is "+ c);
    // }

    // question 10;

    // int a = 10;

    // if( a > 0){
    // System.out.println("Number is Positive");
    // }else {
    // System.out.println("Number is Negative");
    // }

    // question 11
    // int sum = 0;
    // int idx = 1;
    // while(idx <= 5){
    // sum += idx;
    // idx++;
    // }

    // System.out.println("sum of five number is "+ sum);

    // question 12

    // int prod = 1;
    // int idx = 1;
    // while(idx <= 5){
    // prod *= idx;
    // idx++;

    // }

    // System.out.println("product of five number is " + prod);

    // question 13
    // }

    // public static void main(String[] args) {
    //     // System.out.println("Enter marks");

    //     // Scanner scan = new Scanner(System.in);

    //     // int marks = scanner.nextInt();
    //     // getMyResult(marks);

    //     // scanner.close();
    

    // }

    // Question 13

    // public static void getMyResult(int marks) {
    //     if (marks > 90) {
    //         System.out.println("excellent");
    //     } else if (marks > 80 && marks < 90) {
    //         System.out.println("good");
    //     } else if (marks > 70 && marks < 80) {
    //         System.out.println("fair");
    //     } else if (marks > 60 && marks < 70) {
    //         System.out.println("meets expectation");
    //     } else {
    //         System.out.println("below par");
    //     }

    // }
    
    public static void main(String[] args) {

        // question 14

        // int a = 10;
        // int b = 5;
        // if(b != 0){

        //     int c = a/b;
        //     System.out.println(c);
        // }

        // question 15

        // char ch = 'a';
        // if(ch >= 'a' && ch < 'z'){
        //     System.out.println(true);
        // }else {
        //     System.out.println(false);
        // }


        // question 17
        // char ch = 'a';
        // char ch = 'b';
        // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //     System.out.println("alphbet is vowel");
        // }else {
        //     System.out.println("alphabet is not vowel");
        // } 

        // question 18
        // String str = "Hello CoEdify";
        // print(str);
        // 
        
        // question 19
        // int idx = 1;
        // printSeries(idx);

        // question 20;
        // int i = 3;
        // printSeries2(i);

        // question 21

        // int k = 1;
        // int j = 1;
        // printSeriesCombination(k, j);

        // question 22

    
        // printTableOffive();


        // question 23

        // int a = 10; int b = 20;
        // System.out.println(calculateSum(a, b));

        // question 24

        // int n = 12354689;
        // System.out.println(calculNOfDigit(n));

        // question 25

        int n = 24523565;
        sumofDigit(n);
    

    }

    public static void print(String str){
        System.out.println(str);
    }

    public static void printSeries(int idx){
        while(idx <= 100){
            System.out.println(idx);
            idx += 3; // given series is AP series and it's commond difference is 3
        }
    }

    public static void printSeries2(int idx){
        while(idx <= 100){
            System.out.println(idx);
            idx += 3;
        }
    }

    public static void printSeriesCombination(int idx1, int idx2){
        // int nidx = idx2;
        int k = 1;
        System.out.print(k + " ");
        while(idx1 <= 100){
            idx1 += 2;
            System.out.print(idx1 + " ");

            idx2 += 1;
            System.out.print(idx2 + " ");
        }
    }

    public static void printTableOffive(){
    for(int idx = 5; idx<=50; idx = idx+5){
        System.out.print(idx + " ");
    }
    }

    public static int calculateSum(int a, int b){
        return a+b;
    }

    public static int calculNOfDigit(int n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }

        return count;
    }

    public static void sumofDigit(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
             n /= 10;
            sum += rem;
        }

        System.out.println(sum);
    }

}
