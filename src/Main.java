//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int gematria(String s) {
        int total = 0;
        for (char c : s.toCharArray()) {
            c = Character.toUpperCase(c);
            if ( ! Character.isAlphabetic(c))
                continue;

            if (c < 'J')
                total += c - 'A' + 1;
            else if (c < 'S')
                total +=(c - 'J' + 1) * 10;
            else
                total +=(c - 'S' + 1)*100;
        }
        return total;
    }
}