import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
        * Maze manager class.
        *
        * <P>This class manages the maze by getting, the neighbours of a certain state,
        *  checking if a certain state is the end state or not.
        *  checking if a goal is reached by checking an array of states.
        *
        * @author Ahmed Edress
        * @author Max
        */

public class MazeManager {
    /**
     * Get neighbours gets all the neighbouring states available for the passed state.
     *
     * <p>
     * This is done by checking the first node for lines and compare the colours of the line,
     * with the second position.
     * The same is done with the second node.
     * A valid neighbouring state is when a node(node1) has a line connection
     * to another node(destination node, where the line coming from node1 is pointing)
     * , and the line has the same colour as the other node(node2).
     * All the valid states as neighbours are added to a list.
     *
     *
     *
     *  @param state is the current state containg the position of two nodes.
     *  @return a list of neighbouring states
     *  */

    //get neighbour state
    private static ArrayList<State> getNeighbour(State state) {
        ArrayList<State> neighbours = new ArrayList<>();
        //goes through the lines of position 1
        for (Line lines1 : state.getPosition1().getLines()) {
            //checks if the colour of the line is equal to colour of position2
            if (lines1.getColour() == state.getPosition2().getColour()) {
                //adds each legal neighbour for position 1
                neighbours.add(new State(lines1.getDestination(), state.getPosition2()));
            }

        }
        //goes through the lines of position 2
        for (Line lines2 : state.getPosition2().getLines()) {
            //checks if the colour of the line is equal to colour of position 1
            if (lines2.getColour() == state.getPosition1().getColour()) {
                //adds each legal neighbour for position 2
                neighbours.add(new State(state.getPosition1(), lines2.getDestination()));


            }
        }
        // return list of neighbouring states

        return neighbours;
    }

    /**
     * Checks if a passed state is a goal state.
     *
     * <p>
     * This is done by checking whether any of the nodes
     * of the current state are at position 23
     *
     *
     *  @param state is the current state containing the position of two nodes.
     *  @return a list of neighbouring states
     *  */
    private static boolean isGoalState(State state) {
        boolean check = false;
        if (state.getPosition1().getPosition() == 23) {
            check = true;
        }
        if (state.getPosition2().getPosition() == 23) {
            check = true;
        }
        return check;
    }

    /**
     * Checks if a passed list of  states contains a state,
     * which is the final state.
     *
     * <p>
     * This is done by checking whether any of the nodes
     * of any of the passed states in the list, is on
     * position 23
     *
     *
     *  @param states is a list of states.
     *  @return true if the passed list contains a final state
     *  @return false if the passed list does not a final state
     *  */
    private static boolean goalIsReached(LinkedList<State> states) {
        boolean check = false;
        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getPosition1().getPosition() == 23) {
                check = true;
            }
            if (states.get(i  ).getPosition2().getPosition() == 23) {
                check = true;
            }
        }
        return check;
    }


    /**
     * Get the path to the end.
     *
     * <p>
     * This is done recursively, if the passed state is not the final one,
     * the getPath method calls its again but by passing a neighbouring state this time.
     *  if the passed state is the final pone then it just returns it .
     *
     *  @param start it is the state where we start(1,2).
     *  @param start could be any state in the maze.
     *
     *  @return list of states, a path to the end of the maze.
     *  */
    public static LinkedList<State> getPath(State start) {
        LinkedList<State> solution;
        if (isGoalState(start)) { /* Found */

            solution = new LinkedList<State>();
            solution.add(start);

            return solution;
        } else {
            List<State> neighbours = getNeighbour(start);
            for (State neighbour : neighbours) {
                //recursion
                solution = getPath(neighbour);
                if (goalIsReached(solution)) {
                    solution.addFirst(start);
                    return solution;

                }


            }
        }
        return new LinkedList<State>(); /* No solution */
    }

}


