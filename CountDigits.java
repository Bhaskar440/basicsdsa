public class CountDigits{
    public static int main(String[] args) {
        int a  = 12356;
        int count = 0;
        while(a>0)
        {
            count++;
            a = a/10;
        }
        return count;
    }
}