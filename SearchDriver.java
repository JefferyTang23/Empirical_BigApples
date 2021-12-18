/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior Polischouk + Toothless)
APCS pd6
L03 - Binary vs Linear
2021-12-16
time spent:  0.5 hours

DISCO
- currentTimeMillis() gives the current time in miliseconds 
QCC
- Are there other time stamp methods that give time in other units of time?
 *****************************************************/

public class SearchDriver{
    public static long indexTestB(Comparable[] intArray, int index){
      long start = System.currentTimeMillis();
      BinSearch.binSearch(intArray, intArray[index]); // Binary search on element of specified index of the array list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static long indexTestI(Comparable[] intArray, int index){
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

      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 5));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 5));
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 100000));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 100000));
    }

}
