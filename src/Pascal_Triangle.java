//git remote add origin https://github.com/R-purushoth/Patterns_Java.git
public class Pascal_Triangle {
    public static void main(String[] args) {
        int row=5;
        for(int i=0; i<row; i++){
            for(int j=0; j<row-i; j++){
                System.out.print(" ");
            }
            int number =1;
            for(int k=0; k<=i;k++){
                System.out.print(number+" ");
                number=number*(i-k)/(k+1);
            }System.out.println();
        }
    }
}
