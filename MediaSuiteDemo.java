// === Laboratory 2: Structural Design Patterns ===
// Patterns used: Adapter, Proxy, Bridge, Decorator, Composite
// -------------------- CLIENT DEMO --------------------
public class MediaSuiteDemo {
    public static void main(String[] args) {
        // --- Create Media Sources (Adapters + Proxy)
        MediaSource local = new LocalFileAdapter("C:/music/song.mp3");
        MediaSource hls = new HlsStreamAdapter("https://stream/hls123.m3u8");
        MediaSource remote = new CachedRemoteProxy(new RemoteApiAdapter("https://api.media.com/movie/42"));

        // --- Create Renderers (Bridge Implementors)
        Renderer hardware = new HardwareRenderer();
        Renderer software = new SoftwareRenderer();

        // --- Create Media Items (Bridge Abstractions)
        MediaItem song = new MediaItem("Local Song", local, hardware);
        MediaItem stream = new MediaItem("Live Concert", hls, software);
        MediaItem movie = new MediaItem("Online Movie", remote, hardware);

        // --- Add Runtime Features (Decorators)
        Media enhancedSong = new EqualizerFeature(new SubtitleFeature(song));
        Media enhancedMovie = new WatermarkFeature(new EqualizerFeature(movie));

        // --- Combine into a Playlist (Composite)
        Playlist playlist = new Playlist("My Favorites");
        playlist.add(enhancedSong);
        playlist.add(stream);
        playlist.add(enhancedMovie);

        // --- Play all
        playlist.play();

        // --- Demonstrate Proxy caching
        System.out.println("\nReplaying movie to show cache reuse:");
        enhancedMovie.play(); // cached stream used
    }
}



