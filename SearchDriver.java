/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior Polischouk + Toothless)
APCS pd6
L03 - Binary vs Linear
2021-12-16
time spent:  0.5 hours

DISCO
-
QCC
-
 *****************************************************/

public class SearchDriver{
    public static long recordTime_B(Comparable[] intArray, int index){
      long start = System.currentTimeMillis();
      BinSearch.binSearch(intArray, intArray[index]); // Binary search on element of specified index of the array list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static long recordTime_I(Comparable[] intArray, int index){
      long start = System.currentTimeMillis();
      LinSearch.linSearch(intArray, intArray[index]); // Binary search on element of specified index of the array list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static void main(String[] args){
      Comparable[] test = new Integer[1000000];
      for (int i = 0; i < test.length; i++){ // populates test
        test[i] = i*2;
      }

      System.out.println("total time(ms) for linear search: \t" + recordTime_I(test, 5));
      System.out.println("total time(ms) for binary search: \t" + recordTime_B(test, 5));
      System.out.println("total time(ms) for linear search: \t" + recordTime_I(test, 100000));
      System.out.println("total time(ms) for binary search: \t" + recordTime_B(test, 100000));
    }

}
