class HlsStreamAdapter implements MediaSource {
    private String url;

    public HlsStreamAdapter(String url) {
        this.url = url;
    }

    @Override
    public String fetch() {
        return "[HLS Stream] " + url;
    }
}