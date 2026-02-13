/*
  Name: Ann C.
  Purpose: Check if a point is inside a rectangle 
 centered at (0,0) with width 10 and height 5.
 */

import java.util.Scanner;

public class PointInRectangle {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Rectangle boundaries
    double halfWidth = 5; //half of 10
    double halfHeight = 2.5; // half of 5

    while (true) {
        System.out.print("Enter x and y coordinates (or type 'end' to stop): ");
        String userInput = input.next();  // Read first value as string

        if (userInput.equalsIgnoreCase("end")) {
            System.out.println("Bye!~");
            break;  // Exit loop
        }

        // Convert the string to number
        double x = Double.parseDouble(userInput);
        double y = input.nextDouble();

        // Check if point is inside the rectangle
        if (x >= -halfWidth && x <= halfWidth && y >= -halfHeight && y <= halfHeight) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }

    input.close();
    }
}
