import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,i,min;
        System.out.println("Nhap vao hai so:");
        a = input.nextInt();
        b = input.nextInt();
        min=a>b?b:a;
        for(i = 2;i<min;++i)
            if(((a%i)==0)&&((b%i)==0)) break;
        if(i==min)
        {
            System.out.println("Khong co mau chung nho nhat");
        }
        System.out.println("Mau chung nho nhat la "+i);
    }
}