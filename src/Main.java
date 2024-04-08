public class Main {
    public static void main(String[] args) {
        Book book = new Book("Aka");
        BookMover moverAv = new FromAviableStatusMover();
        BookMover moverAr = new FromArchievedStatusMover();
        BookMover moverBr = new FromBorrowedStatusMover();
        BookMover moverOv = new FromOverduedStatusMover();
        moverAv.moveToStatus(book, Type.OVERDUED);
        System.out.println(book.getType());
        moverAv.moveToStatus(book, Type.BORROWED);
        System.out.println(book.getType());
        moverBr.moveToStatus(book, Type.OVERDUED);
        System.out.println(book.getType());

    }
}