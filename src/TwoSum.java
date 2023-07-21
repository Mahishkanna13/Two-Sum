import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size= scanner.nextInt();
        int Array[]=new int[Size];
        for (int i=0;i<Size;i++)
        {
            Array[i]= scanner.nextInt();
        }
        int sum= scanner.nextInt();
        for (int i=0;i<Size;i++)
        {
            for (int j=i+1;j<Size;j++)
            {
                if(Array[i]+Array[j]==sum)
                {
                    System.out.println(Array[i]+" "+Array[j]);
                }
            }
        }

    }
}
