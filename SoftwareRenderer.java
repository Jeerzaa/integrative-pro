class SoftwareRenderer implements Renderer {
    public void render(String mediaData) {
        System.out.println("[SoftwareRenderer] Rendering via CPU: " + mediaData);
    }
}
