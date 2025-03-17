import java.util.Scanner;
public class Exception{
    public static int divideNums(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator: ");
            int num = sc.nextInt();
            System.out.println("Enter denominator: ");
            int den = sc.nextInt();
            
            int result = divideNums(num, den);
            System.out.println("Result: "+result);
            System.out.println("Enter age");
            int b = sc.nextInt();
            if(b<=0){
                throw new NumberFormatException("Age is Positive");
            }
            int[] arr = {10,20,30};
            System.out.println("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Array element: "+ arr[index]);
        }catch(ArithmeticException e){
            System.out.println("Exception cought: "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception cought: Invalid array index!");
        }finally{
            System.out.println("Execution finished. Closing resource.");
            sc.close();
        }
    }
}