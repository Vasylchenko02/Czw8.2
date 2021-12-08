package com.company;

public class ZadanieDwa {

    public static void main(String[] args) {
        int[] tablica1 = {4, 6, 3, 6, 9};
        int[] tablica2 = {2, 0, 3, 2};

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Dzieli " + tablica1[i] + " przez " + tablica2[i] + ". Wynik: " + tablica1[i] / tablica2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Nie mozesz podzielić przez zero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wyszedłeś poza granicę indeksów tablicy.");
            } finally {
                System.out.println("To koniec.");
            }
        }
    }
}
