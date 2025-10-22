class WatermarkFeature extends MediaFeatureDecorator {
    public WatermarkFeature(Media media) { super(media); }

    public void play() {
        super.play();
        System.out.println("   + Watermark added");
    }
}