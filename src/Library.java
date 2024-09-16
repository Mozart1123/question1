import java.util.ArrayList;
import java.util.List;
public class Library {
    private  List<Book> books;
    private  List<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(String isbn,String memberId){
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);
        if (book !=null && member !=null){
            member.BorrowedBooks(book);
        }
        else {
            System.out.println("Book or Member no found.");
        }
    }
    private Book findBookByIsbn(String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
    private Member findMemberById(String memberId){
        for (Member member : members){
            if (member.getMemberId().equals(memberId)){
                return member;
            }
        }
        return null;
    }
}