package com.company;

class Main {
    public static void main(String[] args) {
        double num[] = {-5.2, 8.5, 1.2, 1.8, -5.4, 8.4, 3.5, -1.7, -3.7, 8.4, -2.9, -5.7, 4.5, -7.3, -3.3};

        double sum = 0.0;
        double kolichestvo = 0;
        boolean knopka = false;

        for (double x : num) {
            if (x < 0) {
                knopka = true;
            }
            if (knopka) {
                if (x > 0){
                    sum += x;
                    kolichestvo += 1;
                }
            }


        }

        System.out.print("среднее арифметическое чисел равно: " + sum / kolichestvo);

    }
}
