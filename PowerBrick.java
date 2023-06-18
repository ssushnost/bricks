import java.awt.Rectangle;

public class PowerBrick extends Brick {

    public PowerBrick(PlayField pf, BrickStorage brickPile, Rectangle bounds) {
        super(pf, brickPile, bounds, images.get(Type.POWER));
    }

    @Override
    public void hitBy(Ball ball) {
        super.hitBy(ball);
        Velocity ballVelocity = ball.getVelocity();
        ball.setDelay(Math.abs(ball.getDelay()-2));
    }
}