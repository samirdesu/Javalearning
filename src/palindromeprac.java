public class palindromeprac {
    public static void main(String[] args) {
    int num =151,reminder,reversenum=0;
    int mainnum=num;

    while(num>0){
        reminder=num%10;
        reversenum=reversenum*10+reminder;
        num=num/10;

        }if(mainnum==reversenum){
            System.out.println("This is a palindrome");
        }
    else {
            System.out.println("This is not palindrome");
    }
    }
}
