package n1exercice1;

public class Book implements Comparable<Book> {

    private String titleBook;

    public Book(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    @Override
    public String toString() {
        return this.titleBook;
    }

    @Override
    public int compareTo(Book other) {
        return this.titleBook.compareToIgnoreCase(other.titleBook);
    }
}
