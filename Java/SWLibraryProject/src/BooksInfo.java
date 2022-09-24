
public class BooksInfo {

    private int id;
    private String bookName;
    private String authorName;
    private String publisherName;
    private String numberPage;

    public BooksInfo(int id, String bookName, String authorName, String publisherName, String numberPage) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.numberPage = numberPage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(String numberPage) {
        this.numberPage = numberPage;
    }
    
    
    
}
