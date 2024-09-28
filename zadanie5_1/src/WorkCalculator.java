package ru.yandex.practicum.work;

public class WorkCalculator {

    int workingHours = 8;
    String workerName;
    public double coefficient;

    public   WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}