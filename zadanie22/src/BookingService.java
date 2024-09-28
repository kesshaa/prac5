package ru.yandex.practicum.booking;

import ru.yandex.practicum.model.BedAndBreakfast;
import java.util.Scanner;

public class BookingService {

    public static void main(String[] args) {
        // мини-отель
        BedAndBreakfast hotel = new BedAndBreakfast();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Забронировать номер");
            System.out.println("2 - Освободить номер");
            System.out.println("3 - Проверить наличие свободных номеров");
            System.out.println("0 - Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    hotel.book(); // Бронирование номера
                    break;
                case 2:
                    hotel.free(); // Освобождение номера
                    break;
                case 3:
                    if (hotel.isFull()) { // Проверка на заполненность
                        System.out.println("Больше нет мест ¯\\_(ツ)_/¯");
                    } else {
                        System.out.println("Есть свободные номера!");
                    }
                    break;
                case 0:
                    System.out.println("Выход");
                    System.exit(0); // Завершение программы
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }
}