// Composite for playlists
class Playlist implements Media {
    private String name;
    private java.util.List<Media> items = new java.util.ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(Media media) {
        items.add(media);
    }

    public void play() {
        System.out.println("\n📀 Playlist: " + name);
        for (Media m : items) {
            m.play();
        }
    }
}