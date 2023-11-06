import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bai3 {
    public static  void taomang(int arrInt[],int n,int a, int b){
        for(int i=0;i<n;i++){
            Random rand = new Random();
            int rannum = rand.nextInt(b-a)+a;
            arrInt[i] = rannum;
        }
    }
    public static  void inmang(int arrInt[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arrInt[i]+" ");
        }
        System.out.println(".");
    }
    public static void findduongMin(int arrInt[],int n,int a, int b) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (arrInt[i] > 0 && arrInt[i] < min) {
                min = arrInt[i];
            }
        }
        if (min == Double.NEGATIVE_INFINITY || b <= 0) {
            System.out.println("Khong co so duong nho nhat");
        } else {
            System.out.println("So duong nho nhat la: " + min);
        }
    }
    public static void findamMax(int arrInt[],int n,int a, int b){
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<n;i++){
            if(arrInt[i]<0 && arrInt[i]>max){
                max = arrInt[i];
            }
        }
        if(max==Double.NEGATIVE_INFINITY || a>=0) System.out.println("Khong co so am lon nhat");
        else System.out.println("So am lon nhat la: "+max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n= input.nextInt();
        System.out.print("Nhap a:");
        int a = input.nextInt();
        System.out.print("Nhap b:");
        int b =input.nextInt();
        int [] arrInt= new int[n];
        System.out.println("Mang tao duoc la:");
        taomang(arrInt,n,a,b);
        inmang(arrInt,n);
        findduongMin(arrInt,n,a,b);
        findamMax(arrInt,n,a,b);

    }
}