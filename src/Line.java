/**
 * Line model Object.
 *
 * <P>Various attributes of Line, and related behaviour.
 *
 *
 * @author Ahmed Edress
 * @author Max
 */

public class Line {

    private int colour;
    private Node destinationNode;

    /**
     * Constructor.
     *
     * @param colour (required) the colour of the line.
     * @param destinationNode (required) The node the line is pointing to.
     */

    public Line(int colour, Node destinationNode) {
        this.colour = colour;
        this.destinationNode = destinationNode;
    }
    /** Return the colour passed to the constructor.  */
    public int getColour() {
        return colour;
    }
    /** Return the destinationNode passed to the constructor.  */
    public Node getDestination() {
        return destinationNode;
    }


}
