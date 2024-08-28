package block_initialisation;

import java.util.Arrays;

public class InstanceOfInitialisation {
    public static void main(String[] args) {
        BlockInitialisation block = new BlockInitialisation();
        int[] ints = block.numbers;
        System.out.println(Arrays.toString(ints));
//TODO ints and ints1 dublicate !!!!!
        BlockInitialisation block1 = new BlockInitialisation();
        int[] ints1 = block.numbers;
        System.out.println(Arrays.toString(ints1));
    }
}
