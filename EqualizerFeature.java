class EqualizerFeature extends MediaFeatureDecorator {
    public EqualizerFeature(Media media) { super(media); }

    public void play() {
        super.play();
        System.out.println("   + Equalizer applied");
    }
}