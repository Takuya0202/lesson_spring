package lesson;

public class NightGreet implements Greet2 {
    @Override
    public void greet() {
        System.out.println("Good night!");
    }
}
