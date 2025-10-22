
class HardwareRenderer implements Renderer {
    public void render(String mediaData) {
        System.out.println("[HardwareRenderer] Rendering via GPU: " + mediaData);
    }
}
