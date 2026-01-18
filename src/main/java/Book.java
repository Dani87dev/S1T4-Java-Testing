public class Book {

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

    @Override public String toString() {
        return this.titleBook;
    }
}
