/*
 * ParallelArrays.java
 * CIS 1130 Week 5 Code Guide: Chapter 7, parallel arrays
 *
 * PARALLEL ARRAYS store related data in separate arrays that share the same
 * index. Element i of every array describes the same thing.
 *
 *   index:     0          1          2
 *   cities:  "Olney"   "Robinson"  "Fairfield"
 *   miles:    42.5       61.0       18.3
 *
 * The golden rule: whenever you move one, move the others the same way,
 * or the data stops lining up.
 *
 * Compile and run:
 *   javac ParallelArrays.java
 *   java ParallelArrays
 */
public class ParallelArrays {

    public static void main(String[] args) {
        String[] cities = {"Olney", "Robinson", "Fairfield", "Mount Carmel"};
        double[] miles = {42.5, 61.0, 18.3, 35.9};

        // Look something up by name, then use that index in the other array.
        int spot = findCity(cities, "fairfield");
        if (spot != -1) {
            System.out.println(cities[spot] + " is " + miles[spot] + " miles away.");
        }

        // Sort by distance, closest first, keeping the names lined up.
        for (int i = 0; i < miles.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < miles.length; j++) {
                if (miles[j] < miles[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap in BOTH arrays.
            double tempMiles = miles[i];
            miles[i] = miles[minIndex];
            miles[minIndex] = tempMiles;

            String tempCity = cities[i];
            cities[i] = cities[minIndex];
            cities[minIndex] = tempCity;
        }

        System.out.println("Closest first:");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("  %-13s %5.1f mi%n", cities[i], miles[i]);
        }
    }

    // Case-insensitive linear search on Strings. Use equalsIgnoreCase, not ==.
    public static int findCity(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }
}
