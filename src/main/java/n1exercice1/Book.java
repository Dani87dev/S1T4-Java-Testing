package n1exercice1;

public class Book implements Comparable<Book> {

    private String title;

    public Book(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be null or empty");
        }
        this.title = title;
    }

    public String getTitleBook() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be null or empty");
        }
        this.title = title;
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
