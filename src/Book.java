public class Book {
    String title;
    Type type;

    public Book(String title){
        this.title = title;
        type = Type.AVIABLE;
    }

    public String getType() {
        return "Название книги: " + title + " Статус: " + type;
    }
}

enum Type{

    AVIABLE,
    ARCHIVED,
    BORROWED,
    OVERDUED
}
