public class Bai2 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Cac bo so thoa man: ");

            for(c = 500; c>0; c--){
                for(b = 500; b>0; b--){
                    for(a = 500; a>0; a--){
                        if(a*a+b*b == c*c) System.out.printf("(%d;%d;%d)\n",a,b,c);
                    }
                }
            }
        }
    }
