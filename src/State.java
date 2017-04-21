/**
 * State model Object.
 *
 * <P>Various attributes of State, and related behaviour.
 *
 *
 * @author Ahmed Edress
 * @author Max
 */

public class State {


    private Node position1;
    private Node position2;

    /**
     * Constructor.
     *
     * @param position1 (required) position of the first node.
     * @param position2 (required) position of the second node.
     *
     */
    public State(Node position1, Node position2) {
        this.position1 = position1;
        this.position2 = position2;
    }

    /** Return  position1 passed to the constructor.  */
    public Node getPosition1() {
        return position1;
    }

    /** Return  position2 passed to the constructor.  */
    public Node getPosition2() {
        return position2;
    }



}
