package n1exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LibraryManager {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBooksList() {
        return Collections.unmodifiableList(bookList);
    }


    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        for (Book element : bookList) {
            if (element.getTitleBook().equalsIgnoreCase(book.getTitleBook())) {
                return;
            }
        }
        bookList.add(book);
    }

    public void insertBook(int index, Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        if (index < 0 || index > bookList.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (Book b : bookList) {
            if (b.getTitleBook().equalsIgnoreCase(book.getTitleBook())) {
                return;
            }
        }

        bookList.add(index, book);
    }

    public String getTitle(int index) {
        String titleBook;
        titleBook = bookList.get(index).getTitleBook();
        return titleBook;
    }


    public void deleteBook(String titleBook) {
        Iterator<Book> iterator = bookList.iterator();

        while (iterator.hasNext()) {
            if (titleBook.equalsIgnoreCase(iterator.next().getTitleBook())) {
                iterator.remove();
            }
        }
    }

    public List<Book> getSortedCopyList() {
        List<Book> sorted = new ArrayList<>(bookList);
        Collections.sort(sorted);
        return sorted;
    }


}
