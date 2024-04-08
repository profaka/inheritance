public class FromBorrowedStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Type requestedStatus) {
        if(requestedStatus.equals(Type.OVERDUED)){
            book.type = Type.OVERDUED;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else if (requestedStatus.equals(Type.ARCHIVED)) {
            book.type = Type.ARCHIVED;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else{
            System.out.println("Перевод книги из статуса 'Borrowed' в статус " + requestedStatus + " невозможен");
        }
    }
}
