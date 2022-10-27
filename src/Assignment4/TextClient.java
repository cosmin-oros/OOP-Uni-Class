package Assignment4;

/*
    2 (optional). Define a class called Text that contains maximum 20 words
    and for each word a number that keeps track of how many times the
    corresponding word appeared in the text is stored.
    The class provides two services for:
    • adding a word
    - if 20 words were already added this service fails (the method returns
    false)
    - if the word has already been stored, the associated number is
    incremented by 1
    - if the word has not been added, it is stored and the associated
    number is 1
    • printing the text: each word is printed together with its number of
    occurrences in the text.
    Create a class TextClient with a main method for exemplifying the
    functionalities provided by the Text class.
 */

class Text {
    private String[] words = new String[20];
    private Integer[] apps = new Integer[20];
    private static int instance = 0;

    public boolean addWord(String word){
        // check if there were 20 words stored already
        if (instance == 20){
            return false;
        }

        int foundPos = -1;
        // check if the word was already stored
        for (int i = 0; i < words.length; i++){
            try {
                if (words[i].equals(word)) {
                    foundPos = i;
                    break;
                }
            }catch (NullPointerException e){

            }
        }

        if (foundPos == -1){
            words[instance] = word;
            apps[instance] = 1;
        }else{
            apps[foundPos]++;
        }

        instance++;
        return true;
    }

    public void printText(){
        for (int i = 0; i < words.length; i++){
            try {
                System.out.println(words[i] + apps[i].toString());
            }catch (NullPointerException e){

            }
        }
    }
}

class TextClient {
    public static void main(String[] args){
        Text text = new Text();
        text.addWord("Liviu");
        text.addWord("Mocan");
        text.addWord("Mocan");
        text.addWord("Jad");

        text.printText();
    }
}
