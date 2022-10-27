package Assignment4;

/*
    1. Create a program useful for modelling files and folders, as it follows:
    Class File contains
    • a String attribute named information; the content of this attribute is
    specific to each file
    • a String attribute named name
    • a constructor for setting the values of the attributes
    • getContent returns the value of the attribute (information)
    Class Folder contains
    • an attribute named entries whose type is File[]. This attribute is
    specific to each instance of this class and is initialised with an
    empty array
    • a method for adding a file into the existing array. The class should not
    store the same file more than once
    • getContent calls getContent for each stored file in the attribute whose
    type is File[] and the result is a concatenation of the results
    provided by each called method
    Implement the mentioned classes and create inside a main method some
    instances of each class.
 */

import java.util.Arrays;

class File{
    private String information;
    private String name;

    public File(String info, String name){
        this.information = info;
        this.name = name;
    }

    public boolean equals(Object o){
        return (o instanceof File) && ((File)o).information == information;
    }

    public String getContent(){
        return this.information;
    }
}

class Folder{
    private File[] entries;
    private static int entryNr = 0;

    public Folder(){
        entries = new File[1000];
    }
    public Folder(int n){
        entries = new File[n];
    }

    public void addFile(File file){
        // check if the file was already stored
        boolean stored = false;

        for (int i = 0; i < entries.length; i++){
            try {
                if (entries[i].equals(file)) {
                    stored = true;
                    break;
                }
            }catch (NullPointerException e){

            }
        }

        if (!stored){
            entries[entryNr] = file;
            entryNr++;
        }else{
            System.out.println("File already stored!");
        }
    }

    public String getContent(){
        String s = "";

        try {
            for (int i = 0; i < entries.length; i++) {
                s = s + entries[i].getContent();
            }
        }catch (NullPointerException e){

        }

        return s;
    }
}

class FileAndFolderModeling {
    public static void main(String[] args){
        File f1 = new File("info1", "name1");
        File f2 = new File("info2", "name2");
        File f3 = new File("info3", "name3");
        Folder folder = new Folder();

        folder.addFile(f1);
        folder.addFile(f2);
        folder.addFile(f3);

        System.out.println(f1.getContent());
        System.out.println(f2.getContent());
        System.out.println(f3.getContent());
        System.out.println(folder.getContent());
    }
}
