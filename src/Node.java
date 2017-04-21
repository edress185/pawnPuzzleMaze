import java.util.ArrayList;

/**
 * Node model Object.
 *
 * <P>Various attributes of Node, and related behaviour.
 *
 *
 * @author Ahmed Edress
 * @author Max
 */

public class Node {
    private int position, colour;

    //contains all lines departing from the node.
    private ArrayList<Line> lines = new ArrayList();

    /**
     * Constructor
     *
     * @param position the position of each node.
     * @param colour the colour of each node.
     *
     *
     */

    public Node(int position, int colour) {
        this.position = position;
        this.colour = colour;
    }
    /** Return the position passed to the constructor.  */
    public int getPosition() {
        return position;
    }
    /** Return the colour passed to the constructor.  */
    public int getColour() {
        return colour;
    }

    /**
     * Adds all lines departing(leaving) of each nodes
     * @param lineColour the colour of the line.
     * @param node the destination node whre the line is pointing towards
     *
     */

    public void addLines(int lineColour, Node node) {
        Line line = new Line(lineColour, node);
        lines.add(line);
    }
    /** Returns the departing lines added for each node.  */
    public ArrayList<Line> getLines() {
        return lines;
    }

}

