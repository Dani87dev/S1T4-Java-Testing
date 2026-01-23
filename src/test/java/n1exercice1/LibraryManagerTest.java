package n1exercice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

    private LibraryManager library;

    @BeforeEach
    void setUp() {
        library = new LibraryManager();
    }

    @Test
    void shouldInitializeWithNonNullBookList() {
        assertNotNull(library.getBooksList());
    }

    @Test
    void shouldIncreaseSizeWhenAddingBooks() {
        library.addBook(new Book("Mistborn 1: The Final Empire"));
        library.addBook(new Book("Mistborn 2: The Well of Ascension"));
        library.addBook(new Book("Mistborn 3: The Hero of Ages"));

        assertEquals(3, library.getBooksList().size());
    }

    @Test
    void shouldStoreBooksInInsertionOrder() {
        library.addBook(new Book("Harry Potter 1"));
        library.addBook(new Book("Harry Potter 2"));
        library.addBook(new Book("Harry Potter 3"));

        assertEquals("Harry Potter 1", library.getTitle(0));
        assertEquals("Harry Potter 2", library.getTitle(1));
        assertEquals("Harry Potter 3", library.getTitle(2));
    }

    @Test
    void shouldReturnCorrectTitleByIndex() {
        library.addBook(new Book("Book1"));
        library.addBook(new Book("Book2"));
        library.addBook(new Book("Book3"));

        assertEquals("Book3", library.getTitle(2));
    }

    @Test
    void shouldInsertBookAtSpecificPosition() {
        library.addBook(new Book("Harry Potter 1"));
        library.addBook(new Book("Harry Potter 3"));

        library.insertBook(1, new Book("Harry Potter 2"));

        assertEquals("Harry Potter 1", library.getTitle(0));
        assertEquals("Harry Potter 2", library.getTitle(1));
        assertEquals("Harry Potter 3", library.getTitle(2));
    }

    @Test
    void shouldRemoveBookByTitle() {
        library.addBook(new Book("Book1"));
        library.addBook(new Book("Book2"));
        library.addBook(new Book("Book3"));

        library.deleteBook("Book3");

        assertEquals(2, library.getBooksList().size());
    }

    @Test
    void shouldReturnSortedCopyWithoutModifyingOriginal() {
        library.addBook(new Book("Lord of the Rings"));
        library.addBook(new Book("V for Vendetta"));
        library.addBook(new Book("Alice's Adventures in Wonderland"));

        assertEquals(
                "Alice's Adventures in Wonderland",
                library.getSortedCopyList().getFirst().getTitleBook()
        );

        assertEquals("Lord of the Rings", library.getTitle(0));
        assertEquals("V for Vendetta", library.getTitle(1));
        assertEquals("Alice's Adventures in Wonderland", library.getTitle(2));
    }

    @Test
    void shouldNotAllowDuplicateTitles() {
        library.addBook(new Book("Mistborn 1: The Final Empire"));
        library.addBook(new Book("Mistborn 1: The Final Empire"));

        assertEquals(1, library.getBooksList().size());
    }

    @Test
    void shouldThrowExceptionWhenInsertingWithInvalidIndex() {
        library.addBook(new Book("Book1"));

        try {
            library.insertBook(5, new Book("Book2"));
            fail("Expected IndexOutOfBoundsException was not thrown");
        } catch (IndexOutOfBoundsException e) {
        }
    }


    @Test
    void shouldThrowExceptionWhenGettingTitleWithNegativeIndex() {
        library.addBook(new Book("Book1"));

        try {
            library.getTitle(-1);
            fail("Expected IndexOutOfBoundsException was not thrown");
        } catch (IndexOutOfBoundsException e) {
            
        }
    }

}
