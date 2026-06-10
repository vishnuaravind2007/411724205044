/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            char[] t = sc.nextLine().toCharArray();
        for (int i =0; i<t.length; i++) {
           System.out.print(t[i]+" ");
        }System.out.println();
        int vowlescount = 0;
        int digitscount = 0;
        for (int i =0; i<t.length; i++) {
            if (t[i] == 'a'|| t[i] == 'A'|| t[i] == 'e' || t[i] == 'E' || t[i] == 'i' || t[i] == 'I' || t[i] == 'o' || t[i] == 'O' || t[i] == 'u' || t[i] == 'U') {
                vowlescount++;            
            }
            if(t[i] >= '0' && t[i] <= '9'){
                digitscount++;
            }
    }System.out.println("Number of vowels: " + vowlescount);
    System.out.println("Number of digits: " + digitscount);
    int uppercasecount = 0;
    int lowercasecount = 0;
    for (int i =0; i<t.length; i++) {
        if (t[i] >= 'A' && t[i] <= 'Z') {       
            uppercasecount++;
        }
        if (t[i] >= 'a' && t[i] <= 'z'){
            lowercasecount++;
        }
}System.out.println("Number of uppercase letters " + uppercasecount);
 System.out.println("Number of lowercase letters " + lowercasecount);
     int xcount = 0;
     for (int i = 0; i < t.length; i++) {
        if (t[i] == 'x' || t[i] == 'X') {
            xcount++;
        }
    }
    System.out.println("Number of x: " + xcount);
        }
} */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //Math Methods:

    /*  System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        double c = 5.831;
        System.out.println("Maximum value : "+Math.max(a,b));
        System.out.println("Minimum value : "+Math.min(a,b));
        System.out.println("Absolute value : "+Math.abs(c));
        System.out.println("power value : "+Math.pow(a,b));
        System.out.println("Round value : "+Math.round(c));
        System.out.println("ceil Value : "+Math.ceil(c));
        System.out.println("Floor value : "+Math.floor(c));
        System.out.println("Square root value : "+Math.sqrt(a)); 

    //Sum of factors to find perfect number:

    System.out.println("enter element to find sum of the factors : ");
    int n = sc.nextInt();
    int sum =0;
    for(int i=1; i<n ; i++){
        if(n%i ==0)
            sum = sum + i;
    }if(sum == n)
        System.out.println("It is an perfect number!!");
    else
        System.out.println("It is not a perfect number!!"); 

    //Armstrong number:
    System.out.println("Enter a number to check if it is an armstrong number or not : ");
    int num = sc.nextInt();
    int originalnum = num;
    int original= num;
    int sum = 0;
    int count = 0;
    while(num != 0){
        num = num / 10; 
        count++;
    }while(originalnum != 0){
        int digit = originalnum % 10;
        sum = sum + (int)Math.pow(digit, count);
        originalnum = originalnum / 10; 
    }
    if(sum == original)
        System.out.println("It is an armstrong number!!");
    else
        System.out.println("It is not an armstrong number!!");     */
    int pn = sc.nextInt();
    int l=0;
    for(int i=2; i<=pn; i++){
        if( pn % i ==0 ){ 
            l++;
            break;
        }
        else{
            l=0;
        }
    }
    if(l==0){
        System.out.println("Its an prime number");
    }
    else{
        System.out.print("not");
       
}
    }
}
