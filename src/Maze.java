import java.util.ArrayList;

/**
 * The maze creator.
 * <p>
 *    In this class the maze is created.
 *    Each node is created with a position and a colour.
 *    Attaching lines to each node.
 *    Add all the nodes to an array list .
 * <P>
 *
 * @author Ahmed Edress
 * @author Max
 */
public class Maze {
    //identifying the colours
    private static final int black = 1;
    private static final int green = 2;
    private static final int orange = 3;
    private static final int pink = 4;
    private static final int end = 5;

    //map of the maze
    private  static ArrayList<Node> pawnPuzzle = new ArrayList<Node>();

    /**
     *    This method creates  new nodes and add connections then store it in a list.
     *   <p>
     *    To create the node
     *    colour fd the ndoe is passed
     *    position of the node is passed.
     *
     *
     *
     *    Lines of connection are added per node
     *    colour of the line is passed
     *    The destination node the line is pointing to is also passed
     *
     *
     */
    public static void createMaze() {

        //creating pawnPuzzle ;
        Node one = new Node(1, pink);
        Node two = new Node(2, black);
        Node three = new Node(3, green);
        Node four = new Node(4, green);
        Node five = new Node(5, green);
        Node six = new Node(6, orange);
        Node seven = new Node(7, orange);
        Node eight = new Node(8, pink);
        Node nine = new Node(9, pink);
        Node ten = new Node(10, black);
        Node eleven = new Node(11, orange);
        Node twelve = new Node(12, pink);
        Node thirteen = new Node(13, orange);
        Node fourteen = new Node(14, green);
        Node fifteen = new Node(15, orange);
        Node sixteen = new Node(16, green);
        Node seventeen = new Node(17, green);
        Node eighteen = new Node(18, black);
        Node nineteen = new Node(19, orange);
        Node twenty = new Node(20, green);
        Node twentyone = new Node(21, black);
        Node twentytwo = new Node(22, black);
        Node twentythree = new Node(23, end);



        //Adding lines to each position

        one.addLines(pink, four);
        one.addLines(black, five);

        two.addLines(green, six);
        two.addLines(pink, twelve);

        three.addLines(orange, one);
        three.addLines(orange, four);

        four.addLines(black, thirteen);


        five.addLines(orange, nine);

        six.addLines(green, nine);
        six.addLines(pink, ten);

        seven.addLines(green, two);

        eight.addLines(pink, three);

        nine.addLines(green, four);
        nine.addLines(black, fourteen);

        ten.addLines(green, fifteen);


        eleven.addLines(pink, ten);
        eleven.addLines(green, twelve);


        twelve.addLines(green, seven);


        thirteen.addLines(green, eight);
        thirteen.addLines(green, eighteen);


        fourteen.addLines(orange, twenty);
        fourteen.addLines(green, twentythree);


        fifteen.addLines(green, twentytwo);
        fifteen.addLines(pink, twentythree);

        sixteen.addLines(green, fifteen);

        seventeen.addLines(black, eleven);
        seventeen.addLines(black, sixteen);
        seventeen.addLines(pink, twelve);

        eighteen.addLines(orange, nine);
        eighteen.addLines(orange, twenty);

        nineteen.addLines(green, eighteen);

        twenty.addLines(black, nineteen);
        twenty.addLines(orange, twentyone);

        twentyone.addLines(orange, twentytwo);
        twentyone.addLines(black, twentythree);

        twentytwo.addLines(orange, seventeen);

        //filling up the maze
        pawnPuzzle.add(one);
        pawnPuzzle.add(two);
        pawnPuzzle.add(three);
        pawnPuzzle.add(four);
        pawnPuzzle.add(five);
        pawnPuzzle.add(six);
        pawnPuzzle.add(seven);
        pawnPuzzle.add(eight);
        pawnPuzzle.add(nine);
        pawnPuzzle.add(ten);
        pawnPuzzle.add(eleven);
        pawnPuzzle.add(twelve);
        pawnPuzzle.add(thirteen);
        pawnPuzzle.add(fourteen);
        pawnPuzzle.add(fifteen);
        pawnPuzzle.add(sixteen);
        pawnPuzzle.add(seventeen);
        pawnPuzzle.add(eighteen);
        pawnPuzzle.add(nineteen);
        pawnPuzzle.add(twenty);
        pawnPuzzle.add(twentyone);
        pawnPuzzle.add(twentytwo);
        pawnPuzzle.add(twentythree);
    }

    /**
     * this method returns any node if u pass its position
     *  it gets it form the pawnPuzzle list
     *
     *  @param position is the position of the node
     *  @return node with the passed position
     *  */
    public static Node getNode(int position) {
        return pawnPuzzle.get(position);
    }


}
