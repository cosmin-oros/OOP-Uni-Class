package Assignment3;

import java.util.Objects;

class Set{
    private int maxElem;
    private static int bookNr = 0;
    private MyBook[] books = new MyBook[maxElem];

    public Set(int max){
        this.maxElem = max;
    }

    public boolean addBook(String title, String author){
        if (maxElem == 0){
            return false;
        }

        if (bookNr >= maxElem){
            return false;
        }

        // check if it was already stored
        for (int i = 0; i < books.length; i++){
            if (Objects.equals(books[i].title, title) && Objects.equals(books[i].author, author)){
                return false;
            }
        }

        books[bookNr] = new MyBook(title, author);
        bookNr++;

        return true;
    }

    public void printBooks(){
        for (int i = 0; i < books.length; i++){
            System.out.print("Book nr " + i + " title " + books[i].title + " author " + books[i].author);
        }
    }
}

class MyBook{
    public String title;
    public String author;

    public MyBook(String title, String author){
        this.author = author;
        this.title = title;
    }
}

class SetMain{
    public static void main(String[] args){
        Set set = new Set(5);

        if (!set.addBook("aaa", "bbb")){
            System.out.println("Couldn't store the book!");
        }
        if(!set.addBook("bbb", "ccc")){
            System.out.println("Couldn't store the book!");
        }
        if(!set.addBook("aaba", "bbdb")){
            System.out.println("Couldn't store the book!");
        }
        if(!set.addBook("bbb", "ccc")){
            System.out.println("Couldn't store the book!");
        }
        if(!set.addBook("aac", "bcb")){
            System.out.println("Couldn't store the book!");
        }
        if(!set.addBook("bdb", "cdc")){
            System.out.println("Couldn't store the book!");
        }

        set.printBooks();
    }
}
