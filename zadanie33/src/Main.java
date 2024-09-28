public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setMoneyAmount(25600); // Устанавливаем сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");

        // Вызов метода вывода средств
        bankAccount.withdrawAll();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount; // Сумма денег на счету


    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        this.moneyAmount = newMoneyAmount;
    }

    // Метод для снятия всех средств со счета
    public void withdrawAll() {
        System.out.println("Со счёта снято " + moneyAmount + " р.");
        moneyAmount = 0; // Обнуляем счет
    }
}