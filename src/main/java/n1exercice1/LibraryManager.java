package n1exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LibraryManager {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        boolean exist = false;

        for (Book element : bookList) {
            if (element.getTitleBook().equalsIgnoreCase(book.getTitleBook())) {
                exist = true;
            }
        }

        if (!exist) {
            bookList.add(book);
        }
    }

    public String getTitle(int index) {
        String titleBook;
        titleBook = bookList.get(index).getTitleBook();
        return titleBook;
    }

    public void insertBook(int index, Book book) {
        boolean exists = false;

        for (Book b : bookList) {
            if (b.getTitleBook().equalsIgnoreCase(book.getTitleBook())) {
                exists = true;
            }
        }

        if (!exists) {
            bookList.add(index, book);
        }
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
