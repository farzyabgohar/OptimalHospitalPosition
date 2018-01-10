//Farzyab Gohar
//101021301

import static java.lang.Math.*;

public class HospitalBuilderProgram {
    public static void main(String[] args) {
        byte[][][] maps = {{{2, 2}, {2, 8}, {5, 15}, {19, 1}, {17, 17}},
                {{1, 1}, {7, 19}, {13, 19}, {19, 7}, {19, 13}},
                {{0, 19}, {2, 19}, {4, 19}, {6, 19}, {18, 19}},
                {{7, 19}, {13, 19}, {19, 19}, {19, 13}, {19, 7}}};


        for (int map=0; map < 4; map++) { //loops through all 4 maps
            // initialise the variables
            double optimal_distance = 100; //point of this variable is to store the least max distance
            int best_x = 0;
            int best_y = 0;
            for (int x = 0; x < 20; x++) { //loop x and y here loop through all cells
                for (int y = 0; y < 20; y++) {
                    double distance = 0; //reset distance and max distance for each check
                    double max_distance = 0;
                    for (int town = 0; town < 5; town++) {
                        distance = sqrt(pow((maps[map][town][0] - x) , 2) + pow((maps[map][town][1] - y) , 2)); //finds distance from point to current town
                        if (distance > max_distance) { //this is here to check which town is the furthest from the current point being checked
                            max_distance = distance; //the furthest distance is stored in max_distance
                        }
                    }
                    //so this if statement down here is going to check what the least furthest distance, thus finding
                    //the optimal point

                    if (max_distance < optimal_distance) {

                        optimal_distance = max_distance;
                        best_x = x; //when it finds the least furthest distance so far, it stores the current position
                        best_y = y; //in best_x and best_y

                    }

                }
            }
            System.out.println("Most optimal position for map " + (map + 1) + " is [" + best_x + "," + best_y + "]");
        }




    }
}