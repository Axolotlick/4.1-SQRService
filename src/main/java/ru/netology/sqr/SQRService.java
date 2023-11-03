package ru.netology.sqr;

public class SQRService {
    public int SQRCalculate(int minRange, int maxRange) {
        int caseCount = 0;
        for (int i = 10; i <= 99; i++) {
            int s = i * i;
            if (s >= minRange && s <= maxRange) {
                System.out.println(i);
                caseCount++;
            }

        }

        return caseCount;
    }
}

    // i - исходное значение перебора в диапазоне от 10 до 99
    // minRange - нижняя граница квадратного диапазона
    // maxRange - верхняя граница квадратного диапазона
    // caseCount - количество случаев попадания в диапазон квадрата
