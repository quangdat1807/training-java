package manageBook;

public class AptechBook extends Book {
    private String language;
    private int semester;

    public AptechBook(String bookName, String bookAuthor, String producer, int yearPublishing, float price, String language, int semester) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    public AptechBook() {
        super();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString() + '-' + language + '-' + +semester;
    }

    @Override
    void inBook() {
        super.inBook();
        System.out.printf("%-10s %-10s\n", language, semester);
    }

    @Override
    public int compareTo(Book o) {
        return super.compareTo(o);
    }
}
