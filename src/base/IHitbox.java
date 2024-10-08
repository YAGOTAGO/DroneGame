package base;

import player.Player;

import java.awt.Rectangle;

public interface IHitbox {  
    Rectangle getHitbox();
    void onHit(Player player);
    default boolean intersects(IHitbox target) {
        return this.getHitbox().intersects(target.getHitbox());
    }
    default boolean canCollide() { return true; }

}
