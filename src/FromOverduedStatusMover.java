public class FromOverduedStatusMover extends BookMover{

    @Override
    public void moveToStatus(Book book, Type requestedStatus) {
        if(requestedStatus.equals(Type.AVIABLE)){
            book.type = Type.AVIABLE;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else if (requestedStatus.equals(Type.ARCHIVED)) {
            book.type = Type.ARCHIVED;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        } else{
            System.out.println("Перевод книги из статуса 'Overdued' в статус " + requestedStatus + " невозможен");
        }
    }
}
