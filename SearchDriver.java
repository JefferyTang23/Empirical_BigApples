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

    public static long indexTestBAll(Comparable[] intArray, int itNum){
      long start = System.currentTimeMillis();
      for (int i = 0; i < itNum; i ++) {
        BinSearch.binSearch(intArray, intArray[i]);
      } // Binary search on every element of the list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static long indexTestIAll(Comparable[] intArray, int itNum){
      long start = System.currentTimeMillis();
      for (int i = 0; i < itNum; i ++) {
        LinSearch.linSearch(intArray, intArray[i]);
      } // Binary search on every element of the list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static void main(String[] args){
      Comparable[] test = new Integer[10000000];
      Comparable[] test2 = new Integer[5000000];
      for (int i = 0; i < test.length; i++){ // populates test
        test[i] = i*2;
      }
      for (int i = 0; i < test2.length; i++){ // populates test
        test2[i] = i*2;
      }
      System.out.println("testing for speed of linear and binary search on big array for small index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 5000));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 5000));
      System.out.println("testing for speed of linear and binary search on big array for big index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 9999999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 9999999));
      System.out.println("testing for speed of linear and binary search on big array for index in the middle:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 4999999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 4999999));
      System.out.println("testing for speed of linear and binary search on small array for small index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test2, 5000));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test2, 5000));
      System.out.println("testing for speed of linear and binary search on small array for big index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test2, 4999999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test2, 4999999));
      System.out.println("testing for speed of linear and binary search on small array for index in the middle:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test2, 2499999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test2, 2499999));
      System.out.println("testing for speed of linear and binary search on array for 10000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test, 10000));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test, 10000));
      System.out.println("testing for speed of linear and binary search on array for 20000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test, 20000));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test, 20000));
    }

}
