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

class File{
    private String information;
    private String name;

    public File(String info, String name){
        this.information = info;
        this.name = name;
    }

    public String getContent(){
        return this.information;
    }
}

class Folder{
    File[] entries = new File[1000];
    private static int entryNr = 0;

    public void addFile(File file){

    }
}

class FileAndFolderModeling {
    public static void main(String[] args){

    }
}
