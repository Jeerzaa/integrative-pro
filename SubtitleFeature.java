class SubtitleFeature extends MediaFeatureDecorator {
    public SubtitleFeature(Media media) { super(media); }

    public void play() {
        super.play();
        System.out.println("   + Subtitles enabled");
    }
}