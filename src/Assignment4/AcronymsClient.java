package Assignment4;

/*
    3 (optional). Define a class called Acronyms that contains maximum 20
    words along with their acronyms (each word has a corresponding acronym).
    The words together with their acronyms are stored into two arrays of String,
    the maximum capacity of these arrays being 20.
    The class provides two services:
    • adds a word together with the corresponding acronym
    - if 20 words were already added this service fails (the method returns
    false)
    - if the word has already been retained, the associated acronym is
    modified
    - if the word has not been added, it is stored together with its acronym
    • returns the existing word of an acronym given as a parameter or
    "XXXX" for a nonexistent word.
    Create a class AcronymsClient with a main method for exemplifying the
    functionalities provided by the Acronyms class.
 */

class Acronyms{
    private String[] words = new String[20];
    private String[] acronyms = new String[20];
    private static int instance = 0;

    public boolean addInfo(String word, String acronym){
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
            acronyms[instance] = acronym;
        }else{
            acronyms[foundPos] = acronym;
        }

        instance++;
        return true;
    }

    public String giveAcronym(String word){
        // check if the word exists, if it exists we return its acronym
        for (int i = 0; i < words.length; i++){
            try {
                if (words[i].equals(word)) {
                    return acronyms[i];
                }
            }catch (NullPointerException e){

            }
        }

        // for a non existing word
        return "XXXX";
    }
}

class AcronymsClient {
    public static void main(String[] args){
        Acronyms ac = new Acronyms();
        ac.addInfo("Word1", "Acronym1");
        ac.addInfo("Word1", "Acronym2");
        ac.addInfo("Word3", "Acronym3");
        ac.addInfo("Word4", "Acronym4");

        System.out.println(ac.giveAcronym("Word1"));
        System.out.println(ac.giveAcronym("Word5"));
    }
}
