public class HundDice {
    public static void main(String[] args) {
        int i = 0;
        int counter1 = 0;
        int counter2 = 0;
        Dice d = new Dice();

        while (i < 100) {
            i++;
            d.roll();
            int n = d.getTotal();
            System.out.println("Roll " + i + ": " + n); 
            if (n==7 || n==11) {
                counter1++;
            } else if (n==2 || n==3 || n==12) {
                counter2++;
            }
        }

        System.out.println("You rolled a 7 or 11\t\t" + counter1 + "% of the time");
        System.out.println("You rolled a 2,3 or 12\t\t" + counter2 + "% of the time");
    }
}
