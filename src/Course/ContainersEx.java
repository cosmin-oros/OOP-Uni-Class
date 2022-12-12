package Course;

import java.util.ArrayList;

class Book {
    private int pages;

    public Book(int p) {
        this.pages = p;
    }

    public boolean equals(Book b) {
        return (b instanceof Book) && (((Book)b).pages == pages);
    }

    public String toString() {
        return "Book " + pages;
    }

    public void setPages(int p) {
        this.pages = p;
    }
}

class ContainersEx {
    public static void main(String[] args) {
        Book b1 = new Book(1);
        Book b2 = new Book(2);
        ArrayList bookList = new ArrayList(3);

        bookList.add(b1);
        bookList.add(b2);

        System.out.println(bookList.size());
        System.out.println(bookList.contains(b1));
        System.out.println(b1.equals(b2));
        System.out.println(bookList);

        for (Object o: bookList) {
            ((Book)o).setPages(10);
        }

        System.out.println(bookList);
    }
}
