
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object s) {
        if (this == s) {
            return true;
        }

        
        if (!(s instanceof Song)) {
            return false;
        }

        
        Song s1 = (Song)s;

        
        if (this.artist.equals(s1.artist)
                && this.name.equals(s1.name)
                && this.durationInSeconds == s1.durationInSeconds) {
            return true;
        }

        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
