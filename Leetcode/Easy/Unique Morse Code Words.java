class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    Set<String> map = new HashSet();
    for (String word: words) {
        StringBuilder code = new StringBuilder();
        for (char c: word.toCharArray())
            code.append(MORSE[c - 'a']);
        map.add(code.toString());
    }

    return map.size();
}
}