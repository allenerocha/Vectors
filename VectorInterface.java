/************************
 *
 * Created and maintained
 * by Allen Rocha
 * For more information
 * please visit:
 * https://github.com/allenerocha
 *
 * *********************/

public interface VectorInterface {
    /**
     * 2D Vector
     * @param initialX the initial x-position
     * @param finalX the final x-position
     * @param initialY the initial y-position
     * @param finalY the final y-position
     */
    public void PointToVector(double initialX, double finalX, double initialY, double finalY);

    /**
     * 3D Vector
     * @param initialX the initial x-position
     * @param finalX the final x-position
     * @param initialY the initial y-position
     * @param finalY the final y-position
     * @param initialZ the initial z-position
     * @param finalZ the final z-position
     */
    public void PointToVector(double initialX, double finalX, double initialY, double finalY, double initialZ, double finalZ);

    /**
     * 2D Vector
     * @param initialX the initial x-position
     * @param finalX the final x-position
     * @param initialY the initial y-position
     * @param finalY the final y-position
     */
    public void PointToVector(String initialX, String finalX, String initialY, String finalY);

    /**
     * 3D Vector
     * @param initialX the initial x-position
     * @param finalX the final x-position
     * @param initialY the initial y-position
     * @param finalY the final y-position
     * @param initialZ the initial z-position
     * @param finalZ the final z-position
     */
    public void PointToVector(String initialX, String finalX, String initialY, String finalY, String initialZ, String finalZ);

    /**
     * @return the x-component of the vector
     */
    public double getX();

    /**
     * @return the y-component of the vector
     */
    public double getY();

    /**
     * @return the z-component of the vector
     */
    public double getZ();

    /**
     * @return an array of the components
     */
    public double[] getComponenets();

    /**
     * @return the magnitude of the vector
     */
    public double getMagnitude();


    /**
     * @param x the x-component of the vector
     */
    public void setX(double x);

    /**
     * @param x the x-component of the vector
     */
    public void setX(String x);

    /**
     * @param y the y-component of the vector
     */
    public void setY(double y);

    /**
     * @param y the y-component of the vector
     */
    public void setY(String y);

    /**
     * @param z the z-component of the vector
     */
    public void setZ(double z);

    /**
     * @param z the z-component of the vector
     */
    public void setZ(String z);

    /**
     * @return the direction (as an array) of this vector
     */
    public double[] getDirection();

    public String toString();
}
