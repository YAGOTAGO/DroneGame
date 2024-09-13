import java.awt.Image;

public final class SpriteGO extends GameObject {
    private final Image sprite;

    public SpriteGO(String folder, String fileName, int x, int y){
        super(x, y);
        sprite = ImageHelper.getImage(folder, fileName);
    }
    
    @Override
    public Image display() {
        return sprite;
    }
    
}