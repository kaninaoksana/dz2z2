public class Main {
    public static void main(String[] args) {
        int start = 5000;

        int add = 1200;
        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }
        int end = start + add + bonus;

        System.out.println("итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + end);
    }
}
