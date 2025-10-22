class LocalFileAdapter implements MediaSource {
    private String filePath;

    public LocalFileAdapter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String fetch() {
        return "[LocalFile] " + filePath;
    }
}