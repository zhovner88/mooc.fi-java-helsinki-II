public class Book implements ToBeStored {

    private String writer;
    private String name;
    private Double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }
}
