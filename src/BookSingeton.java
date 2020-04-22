public class BookSingeton {
    private String author;
    private String title;
    private static BookSingeton book;
    private static boolean isLoanedOut;

    public BookSingeton() {
        author = "Gamma, Helm, Johnson, and Vlissiders";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingeton borrowBook(){
        if (!isLoanedOut){
            if (book == null){
                book = new BookSingeton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook (BookSingeton bookReturned){
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
