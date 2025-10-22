// Bridge Abstraction
abstract class AbstractMedia implements Media {
    protected Renderer renderer;

    public AbstractMedia(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void play();
}