interface Checker {
    boolean check(char c);
}

class Solution {
    public boolean detectCapitalUse(String word) {

        Checker isLower = (c) -> c >= 'a' && c <= 'z';
        Checker isUpper = (c) -> c >= 'A' && c <= 'Z';

        if(IntStream.range(0, word.length()).allMatch(i -> isLower.check(word.charAt(i)))) {
            return true;
        }

        if(IntStream.range(0, word.length()).allMatch(i -> isUpper.check(word.charAt(i)))) {
            return true;
        }

        if(isUpper.check(word.charAt(0)) && IntStream.range(1, word.length()).allMatch(i -> isLower.check(word.charAt(i)))) {
            return true;
        }

        return false;
    }
}