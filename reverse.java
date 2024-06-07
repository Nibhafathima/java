import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int last_digit=n%10;
            reverse=reverse*10+last_digit;
            n=n/10;
        }
        System.out.println("the reverse of number: "+reverse);
        if(reverse%2==0){
            System.out.println("the reverse of given number is divisible by 2!");
        }
        else if(reverse%3==0){
            System.out.println("the reverse of given number is divisible by 3!");
        }
        else{
            System.out.println("the number either divisble by 2 and 3!");
        }
        
    }
}
