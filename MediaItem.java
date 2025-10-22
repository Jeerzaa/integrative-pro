// Concrete Abstraction
class MediaItem extends AbstractMedia {
    private String title;
    private MediaSource source;

    public MediaItem(String title, MediaSource source, Renderer renderer) {
        super(renderer);
        this.title = title;
        this.source = source;
    }

    public void play() {
        String data = source.fetch();
        System.out.println("\n▶ Playing: " + title);
        renderer.render(data);
    }
}