// -------------------- DECORATOR PATTERN --------------------
abstract class MediaFeatureDecorator implements Media {
    protected Media decoratedMedia;

    public MediaFeatureDecorator(Media media) {
        this.decoratedMedia = media;
    }

    public void play() {
        decoratedMedia.play();
    }
}