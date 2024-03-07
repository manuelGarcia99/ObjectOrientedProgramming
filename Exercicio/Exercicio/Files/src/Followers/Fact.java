package Followers;

public class Fact {
    public static int factorial(int n){//porque tenho que usar static
        if (n== 0 || n== 1)
            return 1;
        else
            return n* factorial(n-1);
    }
}
