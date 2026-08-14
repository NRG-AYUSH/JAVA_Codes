public class cylinder {
    private double radius, height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public cylinder() {
        radius = 1.0;
        height = 1.0;
    }

    public double surfacearea() {
        double sa;
        sa = ((2 * Math.PI * (Math.pow(getRadius(), 2))) + 2 * Math.PI * getHeight() * getRadius());
        return sa;

    }

    public double volume() {
        double vol;
        vol = Math.PI * getHeight() * Math.pow(getRadius(), 2);
        return vol;
    }

    public static void main(String[] args) {
        {
            cylinder r = new cylinder();
            r.setHeight(12.54);
            r.setRadius(6.5);
            System.out.println(r.surfacearea());
            System.out.println(r.volume());

        }
    }
}
