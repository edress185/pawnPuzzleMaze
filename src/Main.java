/** Main class.
        *
        * <P>The maze is created.
        * For each state of tge puzzle starting with the start state,
        * the getPath function is called from the state manager class.
        *The path till the end is then returned.
        *
        *
        * @author Ahmed Edress
        * @author Max
        */
public class Main {

    public static Maze puzzleMaze = new Maze();

    public void run() {
        //creating the puzzle (adding nodes and connections)
        puzzleMaze.createMaze();
        int i = 0;
        //making a start state at position (1,2)
        State startState = new State(Maze.getNode(0), Maze.getNode(1));

        for (State states : MazeManager.getPath(startState)) {

            i++;
            //print out the state and the number of states till the end.
            System.out.println(i + " : " + states.getPosition1().getPosition() + "  ||  " + states.getPosition2().getPosition());


        }
    }


    public static void main(String[] args) {
        new Main().run();
    }
}
