package used;

public class Call {
    public static void main(String[] args) {
        Calculator calc = new Add();

        int result = calc.calc(10, 20);
        System.out.println(result);

        // インターフェース依存により、1箇所の変更で、異なるクラスを使用できる
        calc = new Decrease();
        result = calc.calc(10, 20);
        System.out.println(result);
    }
}
