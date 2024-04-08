public class FromAviableStatusMover extends BookMover{
    @Override
    public void moveToStatus(Book book, Type requestedStatus) {
        if(requestedStatus.equals(Type.BORROWED)){
            book.type = Type.BORROWED;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else if (requestedStatus.equals(Type.ARCHIVED)) {
            book.type = Type.ARCHIVED;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else{
            System.out.println("Перевод книги из статуса 'Aviable' в статус " + requestedStatus + " невозможен");
        }
    }
}
