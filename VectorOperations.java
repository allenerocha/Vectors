/************************
 *
 * Created and maintained
 * by Allen Rocha
 * For more information
 * please visit:
 * https://github.com/allenerocha
 *
 * *********************/
public class VectorOperations {

    /**
     * @param v first vector
     * @param u second vector
     * @return first vector dotted with the second vector
     */
    public double Dot(Vector v, Vector u) {
        return (v.getX() * u.getX()) + (v.getY() * u.getY()) + (v.getZ() * u.getZ());
    }

    /**
     * @param v first vector
     * @param u second vector
     * @return first vector crossed with the second vector
     */
    public Vector Cross(Vector v, Vector u) {
        return new Vector(((v.getY() * u.getZ()) - (v.getZ() * u.getY())),
                        ((v.getZ() * u.getY()) - (v.getX() * u.getZ())),
                        ((v.getX() * u.getY()) - (v.getY() * u.getX())));
    }

    /**
     * @param v first vector
     * @param u second vector
     * @return [a project b, b project a]
     */
    public double[] ScalarProjection(Vector v , Vector u) {
        return new double[]{Dot(v, u)/v.getMagnitude(), Dot(v, u)/u.getMagnitude()};
    }


    /**
     * @param v first vector
     * @param u second vector
     * @param mode true->degrees mode; false->radians mode
     * @return angle between vectors v and u
     */
    public double AngleBetweenVectors(Vector v, Vector u, boolean mode) {
        if (mode)
            return Math.acos(Dot(v, u)/(v.getMagnitude() * u.getMagnitude())) / (180.0 / Math.PI);
        else
            return Math.acos(Dot(v, u)/(v.getMagnitude() * u.getMagnitude()));
    }
}
