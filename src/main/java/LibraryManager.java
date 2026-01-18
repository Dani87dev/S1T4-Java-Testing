import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManager {

    private List<Book> bookList = new ArrayList<Book>();

    public LibraryManager(ArrayList bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public String getTitle(int index) {
        String titleBook;
        titleBook = bookList.get(index).getTitleBook();
        return titleBook;
    }

    public void insertBook(int index, Book book) {
        bookList.add(index, book);
    }

    public void deleteBook(String titleBook) {
      Iterator<Book> iterator = bookList.iterator();

      while(iterator.hasNext()) {
          if(titleBook.equalsIgnoreCase(iterator.next().getTitleBook())) {
              iterator.remove();
          }
      }
    }


}
