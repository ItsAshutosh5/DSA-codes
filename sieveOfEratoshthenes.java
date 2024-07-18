import java.util.Arrays;
public class sieveOfEratoshthenes {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        boolean[]arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for (int i=2;i<n;i++)
        {
            if (arr[i])
            {
                count++;
                for (int j=i*2;j<n;j=j+i)
                arr[j]=false;
            }
        }
        System.out.println(count);
    }
}
