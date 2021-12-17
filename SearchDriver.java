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
  
  public static void main(String[] args) {
   Comparable[] iArr3 = new Integer[10000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }
   BinSearch.printArray( iArr3 );
   System.out.println( "iArr3 sorted? -- " + BinSearch.isSorted(iArr3) );
   long a = System.currentTimeMillis();
   BinSearch.binSearch(iArr3,2);
   long b = System.currentTimeMillis();
   System.out.println(b-a); 
   
   
   
  } // end main
  
 }
