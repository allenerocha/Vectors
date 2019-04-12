/************************
 *
 * Created and maintained
 * by Allen Rocha
 * For more information
 * please visit:
 * https://github.com/allenerocha
 *
 * *********************/

public class Vector implements VectorInterface {
    private double x, y, z;
    private double magnitude;
    private double[] direction;

    /**
     * Empty constructor
     */
    public Vector() {}

    /**
     * 2D Vector
     * @param x component of this vector
     * @param y component of this vector
     */
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
        CalculateMagnitude();
    }

    /**
     * 3D Vector
     * @param x component of this vector
     * @param y component of this vector
     * @param z component of this vector
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        CalculateMagnitude();
    }

    /**
     * 2D Vector
     * @param x component of this vector
     * @param y component of this vector
     */
    public Vector(String x, String y) {
        this.x = new java.math.BigDecimal(x).doubleValue();
        this.y = new java.math.BigDecimal(y).doubleValue();
        this.z = 0;
        CalculateMagnitude();
    }

    /**
     * @param x component of this vector
     * @param y component of this vector
     * @param z component of this vector
     */
    public Vector(String x, String y, String z) {
        this.x = new java.math.BigDecimal(x).doubleValue();
        this.y = new java.math.BigDecimal(y).doubleValue();
        this.z = new java.math.BigDecimal(z).doubleValue();
        CalculateMagnitude();
    }

    /**
     * @param components of the vector
     */
    public Vector(double... components) {
        if (components.length == 2 ) {
            this.x = components[0];
            this.y = components[1];
            this.z = 0.0;
        } else {
            this.x = components[0];
            this.y = components[1];
            this.y = components[2];

        }
        CalculateMagnitude();
    }

    public void PointToVector(double initialX, double finalX, double initialY, double finalY) {
        this.x = finalX - initialX;
        this.y = finalY - initialY;
        this.z = 0;
        CalculateMagnitude();
    }

    public void PointToVector(double initialX, double finalX, double initialY, double finalY, double initialZ, double finalZ) {
        this.x = finalX - initialX;
        this.y = finalY - initialY;
        this.z = finalZ - initialZ;
        CalculateMagnitude();
    }

    public void PointToVector(String initialX, String finalX, String initialY, String finalY) {
        java.math.BigDecimal xComp = new java.math.BigDecimal(initialX);
        xComp = xComp.subtract(new java.math.BigDecimal(finalX));
        this.x = xComp.doubleValue();

        java.math.BigDecimal yComp = new java.math.BigDecimal(initialY);
        yComp = yComp.subtract(new java.math.BigDecimal(finalY));
        this.y = yComp.doubleValue();
        CalculateMagnitude();
    }

    public void PointToVector(String initialX, String finalX, String initialY, String finalY, String initialZ, String finalZ) {
        java.math.BigDecimal xComp = new java.math.BigDecimal(initialX);
        xComp = xComp.subtract(new java.math.BigDecimal(finalX));
        this.x = xComp.doubleValue();

        java.math.BigDecimal yComp = new java.math.BigDecimal(initialY);
        yComp = yComp.subtract(new java.math.BigDecimal(finalY));
        this.y = yComp.doubleValue();

        java.math.BigDecimal zComp = new java.math.BigDecimal(initialZ);
        zComp = zComp.subtract(new java.math.BigDecimal(finalZ));
        this.z = zComp.doubleValue();
        CalculateMagnitude();
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }

    @Override
    public double[] getComponenets() {
        return new double[]{this.x, this.y, this.z};
    }

    @Override
    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setX(String x) {
        this.x = new java.math.BigDecimal(x).doubleValue();
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void setY(String y) {
        this.y = new java.math.BigDecimal(y).doubleValue();
    }

    @Override
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void setZ(String z) {
        this.z = new java.math.BigDecimal(z).doubleValue();
    }

    @Override
    public double[] getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return String.format("<%f, %f, %f>\tmag: %f\tdirection (in degrees) [%f, %f, %f]\n", this.x, this.y, this.z, magnitude, direction[0], direction[1], direction[2]);
    }

    /**
     * Recalculates the magnitude of this vector
     */
    private void CalculateMagnitude() {
        magnitude = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y , 2) + Math.pow(this.z, 2));
        CalculateDirection();
    }

    /**
     * Recalculates the direction (AKA angle of this vector
     */
    private void CalculateDirection() {
        this.direction = new double[]{Math.acos(this.x/magnitude) * (180 / Math.PI), Math.acos(this.y/magnitude) * (180 / Math.PI), Math.acos(this.z/magnitude) * (180 / Math.PI)};
    }
}
