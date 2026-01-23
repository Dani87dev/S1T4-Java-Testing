package n1exercice1;

public class Book implements Comparable<Book> {

    private String title;

    public Book(String titleBook) {
        this.title = titleBook;
    }

    public String getTitleBook() {
        return this.title;
    }

    public void setTitleBook(String titleBook) {
        this.title= titleBook;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}
