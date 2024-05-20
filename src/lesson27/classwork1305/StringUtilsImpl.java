package lesson27.classwork1305;

public class StringUtilsImpl implements StringUtils{

    @Override
    public boolean isPalindrome(String word) {
        return  word.equalsIgnoreCase(reverse(word));
    }

    @Override
    public boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] found = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int code = sentence.charAt(i) - 'a';
            if (code >= 0 && code < 26) {
                found[code] = true;
            }
        }
        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public byte[] parseIp(String ip) {

        return new byte[0];
    }

    @Override
    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            sb.append((char)(ch + 3));
        }
        return sb.toString();
    }

    @Override
    public String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            sb.append((char)(ch + 3));
        }
        return sb.toString();
    }

    @Override
    public int countOccurencies(String text, char letter) {

        if (text == null) {
            return 0;
        }

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i > 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String wordReverse(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toCamelCase(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue;
            }
            if (i == 0) {
                sb.append(words[i].toLowerCase());
            } else {
                sb.append(words[i].substring(0, 1).toLowerCase())
                        .append(words[i].substring(0, 1).toLowerCase());
            }
        }
        return null;
    }
}
