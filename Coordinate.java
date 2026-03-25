
public class Coordinates {

    // Attributes (private for encapsulation)
    private int x;
    private int y;


    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public double distance(Coordinates p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }


    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }


    public void scale(int factor, boolean sign) {
        if (sign) {
            this.x *= factor;
            this.y *= factor;
        } else {

            if (factor != 0) {
                this.x /= factor;
                this.y /= factor;
            } else {
                System.out.println("Error: factor cannot be zero.");
            }
        }
    }

    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}
