public class ReverseNumber {
    public static int main(String[] args)
    {
        int a = 12345;
        int n = 0;
        while(a>0)
        {
            int lastDigit = a%10;
            n = n*10 + lastDigit;
            a = a/10;
        }
        return n;
    }
}
