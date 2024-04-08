public class FromArchievedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Type requestedStatus) {
        if(requestedStatus.equals(Type.AVIABLE)){
            book.type = Type.AVIABLE;
            System.out.println("Книга успешно переведа в статус " + requestedStatus);
        }else{
            System.out.println("Перевод книги из статуса 'Archived' в статус " + requestedStatus + " невозможен");
        }
    }

}
