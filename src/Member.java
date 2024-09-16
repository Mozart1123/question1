import java.util.ArrayList;
import java.util.List;
public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId){
        this.name=name;
        this.memberId= memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    public String getMemberId(){
        return memberId;
    }
    public void BorrowedBooks(Book book){
        if (book.getCopiesAvailable()>0){
            addBookToBorrowedList(book);
            book.setCopiesAvailable(book.getCopiesAvailable()-1);
        }
        else {
            System.out.println("no copies available for this book");
        }
    }
    private void addBookToBorrowedList(Book book){
        borrowedBooks.add(book);
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}