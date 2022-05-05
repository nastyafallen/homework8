package com.company;

public class Main {

    public static void main(String[] args) {
        int year = 2022;
        int clientOS = 1;
        int clientDeviceYear = 1998;
        int deliveryDistance = 200;
        int deliveryDays = 1;
        showYear(year);
        offerDownload(clientOS, clientDeviceYear);
        calculateDelivery(deliveryDistance, deliveryDays);
    }



    public static void showYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - Год является високосным");
        } else {
            System.out.println(year + " - Год не является високосным");
        }
    }

    public static void offerDownload (int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void calculateDelivery(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + (deliveryDays));
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки не будет :)");
        }
    }

}
