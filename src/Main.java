//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1: Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
        int x = 2;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x << 1;
        //The predicted decimal is 4 and predicted binary is 100
        System.out.println("Decimal is: " + x + ", Binary is: " + Integer.toBinaryString(x));

        x = 9;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x << 1;
        //The predicted decimal is 18 and predicted binary is 1001
        System.out.println("Decimal is: " + x + ", Binary is: " + Integer.toBinaryString(x));

        x = 17;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x << 1;
        //The predicted decimal is 34 and predicted binary is 10001
        System.out.println("Decimal is: " + x + ", Binary is: " + Integer.toBinaryString(x));

        x = 88;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x << 1;
        //The predicted decimal is 176 and predicted binary is 1011000
        System.out.println("Decimal is: " + x + ", Binary is: " + Integer.toBinaryString(x));


        //2: Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.

        x = 150;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x >> 2;
        //The predicted decimal is 37 and predicted binary is 100101
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        x = 225;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x >> 2;
        //The predicted decimal is 56 and predicted binary is 111000
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        x = 1555;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x >> 2;
        //The predicted decimal is 388 and predicted binary is 110000100
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

        x = 32456;
        System.out.println("Binary string version of number: " + Integer.toBinaryString(x));
        x = x >> 2;
        //The predicted decimal is 8114 and predicted binary is 1111110110010
        System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));


        //3: Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
        x =7;
        int y = 17;
        int z;
        //I predict the result of the bitwise AND(&) operation on x and y will be 1
        z = x & y;
        System.out.println("After using bitwise AND(&) operator, the result is: " + z);

        //4: Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out.
        //x =7;
        //int y = 17;
        //int z;
        //I predict the result of the bitwise OR(|) operation on x and y will be 10111, which decimal is 23
        z = x | y;
        System.out.println("After using bitwise OR(|) operator, the result is: " + z);


        //5: Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.
        x = 8;
        x++;
        System.out.println("Incremented: " + x);


        //6: Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
        x = 10;
        System.out.println("printing b: " + x);
        x++;
        System.out.println("Incrementing b by 1: " + x);
        x = 10;
        System.out.println("printing b: " + x);
        ++x;
        System.out.println("Incrementing b by 1: " + x);
        x = 10;
        System.out.println("printing b: " + x);
        x += 1;
        System.out.println("Incrementing b by 1: " + x);

        //7: Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x.
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println("Sum should be 14: " + sum);
        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.println("Sum should be 13: " + sum);
        System.out.println("print incremented value of x: " + x);
    }
}
