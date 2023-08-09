public class Main {
    public static void main(String[] args) {
        double initialBalance = 100;    // Начальная сумма на счету клиента
        double rechargeAmount = 1100;   // Сумма пополнения

        double bonusPer100Rub = 1;      // Бонус за каждые полные 100 рублей

        if (rechargeAmount > 1000) {
            int bonus = (int) (rechargeAmount / 100) * (int) bonusPer100Rub;  // Рассчет бонуса
            initialBalance += rechargeAmount + bonus;  // Итоговая сумма на счету
            System.out.println("Бонусы: " + bonus + " руб.");
            System.out.println("Итоговая сумма на счету: " + initialBalance + " руб.");
        } else {
            initialBalance += rechargeAmount;  // Итоговая сумма на счету без бонуса
            System.out.println("Бонусы: 0 руб.");
            System.out.println("Итоговая сумма на счету: " + initialBalance + " руб.");
        }
    }
}
