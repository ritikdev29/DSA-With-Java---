import java.util.*;

/*Questionis = give a route containing 4 direction (E,W,N,S) .
 Find the shortest path to reach destination... */
public static float getshortestPath(String path) {

    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
        char direction = path.charAt(i);
        // for south
        if (direction == 'S') {
            y--;

        }
        // for north
        else if (direction == 'N') {
            y++;

        }
        // for west
        else if (direction == 'W') {
            x--;

        }
        // for east
        else {
            x++;
        }

    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
}

public static void main(String[] args) {
    // question is given a route container 4 direction (E.W.N.S) find the shortest
    // path to reach destination . ("WNEENESENNN")

    String path = "WNEENESENNN";
    System.out.println(getshortestPath(path));

}
