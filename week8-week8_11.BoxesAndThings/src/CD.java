public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishing;
    private double weight;

    public CD(String artist, String title, int publishing) {
        this.artist = artist;
        this.title = title;
        this.publishing = publishing;
        weight = 0.1;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishing + ")";
    }
}
