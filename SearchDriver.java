/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
L03 - Binary vs Linear
2021-12-16
time spent:  0.5 hours

DISCO
-
QCC
-
 *****************************************************/

 public class SearchDriver {
  public static void populate(OrderedArrayList a, int size) {
    int random = 0;
    for (int i = 0 ; i < size ; i++) {
      random = (int) (Math.random() * 10);
      a.add(random);
    }
  }
  public static String printArray(OrderedArrayList a) {
    return a.toString();
  }
  public static long timeCalcB(OrderedArrayList a, int target) {
    long a = System.currentTimeMillis();
    BinSearch(a, )
  }
  public static void main(String[] args) {
   Comparable[] iArr3 = new Integer[100000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }
   long a = System.nanoTime();
   int h = LinSearch.linSearch(iArr3,2);
   System.out.println(h);
   System.out.println(a- System.nanoTime());



  } // end main

 }
