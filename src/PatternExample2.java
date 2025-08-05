import java.util.Scanner;

public class PatternExample2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=scanner.nextInt();
        for(int i=rows; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
