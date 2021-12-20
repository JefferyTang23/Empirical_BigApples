/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior Polischouk + Toothless)
APCS pd6
L03 - Binary vs Linear
2021-12-16
time spent:  0.5 hours

DISCO
- currentTimeMillis() gives the current time in miliseconds
- We had to increase repetition to increase the amount of time that the code took to run. 
QCC
- Are there other time stamp methods that give time in other units of time?
- What run times should we be getting?
- What are some potential errors from currentTimeMillis()?
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

    public static long indexTestBAll(Comparable[] intArray){
      long start = System.currentTimeMillis();
      for (int i = 0; i < intArray.length; i ++) {
        BinSearch.binSearch(intArray, intArray[i]);
      } // Binary search on every element of the list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static long indexTestIAll(Comparable[] intArray){
      long start = System.currentTimeMillis();
      for (int i = 0; i < intArray.length; i ++) {
        LinSearch.linSearch(intArray, intArray[i]);
      } // Binary search on every element of the list
      long end = System.currentTimeMillis();
      long timePassed = end - start;
      return timePassed; // returns total time for search
    }

    public static void main(String[] args){
      // Initializing arrays
      Comparable[] test = new Integer[10000000];
      Comparable[] test2 = new Integer[5000000];
      Comparable[] test3 = new Integer[10000];
      Comparable[] test4 = new Integer[20000];
      Comparable[] test5 = new Integer[100000];
      Comparable[] test6 = new Integer[200000];
      // Populating arrays
      for (int i = 0; i < test.length; i++){ 
        test[i] = i*1;
      }
      for (int i = 0; i < test2.length; i++){ 
        test2[i] = i*1;
      }
      for (int i = 0; i < test3.length; i++){ 
        test3[i] = i*1;
      }
      for (int i = 0; i < test4.length; i++){ 
        test4[i] = i*1;
      }
      for (int i = 0; i < test5.length; i++){ 
        test5[i] = i*1;
      }
      for (int i = 0; i < test6.length; i++){ 
        test6[i] = i*1;
      }
      // Testing on the Arrays
      System.out.println("testing for speed of linear and binary search on bigger array(length 10000000) for small index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 5000));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 5000));
      System.out.println("testing for speed of linear and binary search on bigger array(length 10000000) for big index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test, 9999999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test, 9999999));
      System.out.println("testing for speed of linear and binary search on smaller array(length 5000000) for small index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test2, 5000));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test2, 5000));
      System.out.println("testing for speed of linear and binary search on smaller array(length 5000000) for big index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestI(test2, 4999999));
      System.out.println("total time(ms) for binary search: \t" + indexTestB(test2, 4999999));
      System.out.println("testing for speed of linear and binary search on array for 10000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test3));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test3));
      System.out.println("testing for speed of linear and binary search on array for 20000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test4));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test4));
      System.out.println("testing for speed of linear and binary search on array for 100000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test5));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test5));
      System.out.println("testing for speed of linear and binary search on array for 200000 index:");
      System.out.println("total time(ms) for linear search: \t" + indexTestIAll(test6));
      System.out.println("total time(ms) for binary search: \t" + indexTestBAll(test6));
    }

}
