public class CountTheNumberOfVowels {
    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        System.out.println(vowels(words,1,4));
    }
    public static int vowels(String[] words, int left, int right){
        int count=0;
        for (int i=left; i<=right; i++){
            int start = words[i].charAt(0);
            int end = words[i].charAt(words[i].length()-1);
            if (start=='a' || start=='e' || start=='i' || start=='o' || start=='u'){
                if (end=='a' || end=='e' || end=='i' || end=='o' || end=='u'){
                    count++;
                }
            }
        }
        return count;
    }
}
