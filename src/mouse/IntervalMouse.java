package mouse;

import java.util.Arrays;

public class IntervalMouse {
    public static void main(String[] args) {
        Mouse last = new Mouse(-2, 2);
        System.out.println("Distance between first pair of clicks : " + last.click(1, 6));
        Mouse next = new Mouse(1, 6);
        System.out.println("Distance between next pair of  clicks : " + next.click(7, -2));


    }
}
