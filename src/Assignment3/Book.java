package Assignment3;

import Course.OverloadedConstructors;

class Book {
    private int pages;

    public Book(int pages){
        this.pages = pages;
    }

    public boolean compareBooks(Object b){
        return (b instanceof Book) && ((Book)b).pages == pages;
    }

}

class BookMain{
    public static void main(String[] args){
        Book book1 = new Book(200);
        Book book2 = new Book(250);

        if (book1.compareBooks(book2)){
            System.out.println("They have the same nr of pages");
        }else{
            System.out.println("They don't have the same nr of pages");
        }
    }
}
