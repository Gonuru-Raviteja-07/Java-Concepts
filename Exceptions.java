//Exceptions : Unexpected events occurs during the execution on the program
//-> leads to the sudden stop of the program
//-> We cannot use only try block but we can use try with catch (or) try with finally
//-> We can also declare a try catch block inside a try block (Nested try blocks)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exceptions {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        int arr[] = { 1, 3, 5, 7, 9 };
        try {
            System.out.println(i / j);
            System.out.println(arr[2]);
            throw new StringIndexOutOfBoundsException();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        //-> finally block is used to close the resource
        //-> lines after finally block will be executed
        finally {
            System.out.println("from finally block");
        }

        // Try with resource
        // ->It is a short cut instead of using try with finally block
        // ->The resources are closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
