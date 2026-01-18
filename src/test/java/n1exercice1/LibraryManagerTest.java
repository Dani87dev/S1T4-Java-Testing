package n1exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryManagerTest {

    @Test
    void bookListIsNotNull() {
        LibraryManager library = new LibraryManager();
        assertNotNull(library.getBookList());
    }

    @Test
    void sizeIsCorrect() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Mistborn 1: The Final Empire"));
        library.addBook(new Book("Mistborn 2: The Well of Ascension"));
        library.addBook(new Book("Mistborn 3: The Hero of Ages"));

        assertEquals(3, library.getBookList().size());
    }

    @Test
    void correctAdd() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Harry Potter 1"));
        library.addBook(new Book("Harry Potter 2"));
        library.addBook(new Book("Harry Potter 3"));


        assertEquals("Harry Potter 1", library.getTitle(0));
        assertEquals("Harry Potter 2", library.getTitle(1));
        assertEquals("Harry Potter 3", library.getTitle(2));
    }

    @Test
    void returnsCorrectTitle() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Book1"));
        library.addBook(new Book("Book2"));
        library.addBook(new Book("Book3"));

        assertEquals("Book3", library.getTitle(2));
    }


    @Test
    void correctAddConcretPosition() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Harry Potter 1"));
        library.addBook(new Book("Harry Potter 3"));
        library.insertBook(1, new Book("Harry Potter 2"));

        assertEquals("Harry Potter 1", library.getTitle(0));
        assertEquals("Harry Potter 2", library.getTitle(1));
        assertEquals("Harry Potter 3", library.getTitle(2));
    }

    @Test
    void correctDelete() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Book1"));
        library.addBook(new Book("Book2"));
        library.addBook(new Book("Book3"));
        library.deleteBook("Book3");

        assertEquals(2, library.getBookList().size());
    }

    @Test
    void sortedList() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Lord of the Rings"));
        library.addBook(new Book("V for Vendetta"));
        library.addBook(new Book("Alice's Adventures in Wonderland"));

        assertEquals("Alice's Adventures in Wonderland", library.getSortedCopyList().getFirst().getTitleBook());

    }

    @Test
    void notDuplicateTitles() {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("Mistborn 1: The Final Empire"));
        library.addBook(new Book("Mistborn 1: The Final Empire"));

        assertEquals(1, library.getBookList().size());

    }
}