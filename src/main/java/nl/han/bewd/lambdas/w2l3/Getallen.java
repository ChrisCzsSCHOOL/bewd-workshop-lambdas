package nl.han.bewd.lambdas.w2l3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Getallen {

    private int[] cijfers = {1,2,3,4};

    public static void main(String[] args) {
        Getallen getallen = new Getallen();
//      Arrays.stream(getallen.cijfers).forEach(i -> System.out.println(i));
        getallen.printGetallen(getallen.cijfers);
    }

    private void printGetallen(int[] cijfers){
        ArrayList<Integer> evenCijfers = new ArrayList<>();
        for (int i : cijfers) {
            if(i % 2 == 0){
                i = i / 2;
                evenCijfers.add(i);
            }
        }
        System.out.println(evenCijfers);
    }
}
