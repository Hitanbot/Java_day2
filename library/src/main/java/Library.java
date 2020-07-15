import java.util.ArrayList;
import java.util.HashMap;

public class Library {




    private Integer capacity;
    private ArrayList<Book> library;
    private HashMap<String,Integer> bookGenres; 

    public Library(Integer capacity) {

        this.library = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if (this.getBookCount()<this.capacity){
            this.library.add(book);
//            String genre = book.getGenre();
//            if (bookGenres.get(genre) == null){
//                bookGenres.put(genre,1);
//            }
//            else{
//                bookGenres.put(genre,bookGenres.get(genre)+1);
//            }
            
            
        }

    }

    public ArrayList<Book> getBooks() {
        return library;
    }

    public Integer getBookCount() {
        return this.library.size();
    }

    public Boolean removeBook(Book book) {
        return this.library.remove(book);
    }





}
