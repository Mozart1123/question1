public class LibraryTest {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("PUBG","MOZART TOBI", "+256705507066",50);
        Book book2 = new Book("CALL OF DUTY","CAP JACKSON", "+243817191084",30);

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("JOSEPH  ","M1");
        Member member2 = new Member("MICHEL ","M2");

        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("+256705507066","M1");
        library.lendBook("+243817191084", "M2");
    }
}