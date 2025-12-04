
public class Main {
    void main(String[] args) {
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(sentence);
        System.out.println("The number of vowels in the sentence: "+countVowels(sentence));
    }
    int countVowels(String str) {
        int vowels = 0;
        for(int i = 0; i < str.length(); i++) { //in English y is not considered a vowel
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
                    ||str.charAt(i)=='o' ||str.charAt(i)=='u'||
            str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
                    ||str.charAt(i)=='O'||str.charAt(i)=='U') {
                vowels++;
            }

        }
        return vowels;
    }
}