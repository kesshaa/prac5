package ru.yandex.practicum.model;

public class BedAndBreakfast {
    private int capacity;  // Количество номеров
    private boolean full;   // Статус занятости

    public BedAndBreakfast() {
        this.capacity = 0;  // Изначально нет номеров
        this.full = false;  // Изначально нет занятых номеров
    }

    public boolean isFull() {
        return full;  // Проверяем, заполнены ли номера
    }

    public void book() {
        if (!full) {  // Проверяем, есть ли свободные номера
            capacity++;  // Увеличиваем количество занятых номеров
            if (capacity >= 10) {  // Если достигли максимума
                full = true;  // Устанавливаем флаг заполненности
            }
            System.out.println("Номер забронирован. Общее количество занятых номеров: " + capacity);
        } else {
            System.out.println("Нет свободных номеров.");
        }
    }

    public void free() {
        if (capacity > 0) {
            capacity--;
            full = false;
            if (capacity < 10) {
                System.out.println("Осталось свободных номеров: " + (10 - capacity));
            }
        } else {
            System.out.println("Нет занятых номеров для освобождения.");
        }
    }

    private void printRooms() {
        System.out.println("Текущее количество занятых номеров: " + capacity);
    }
}