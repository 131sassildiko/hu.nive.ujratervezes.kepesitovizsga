package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        int sum = 0;
        if (input == null || input == "") {
            return sum = -1;
        }
        ;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c;
            }
        }
        return sum;
    }
}
