package com.campusdual.classroom;

public class Exercise {

    public static int[] createAndInitializeArray(int totalElements) {
        int[] numbers = new int[totalElements];
        for (int index = 0; index < totalElements; index++) {
            numbers[index] = index + 1;
        }
        return numbers;
    }

    public static void displayArrayInline(int[] data) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            output.append(data[i]);
            if (i < data.length - 1) {
                output.append(" ");
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int[] result = createAndInitializeArray(5);
        displayArrayInline(result);
    }
}
