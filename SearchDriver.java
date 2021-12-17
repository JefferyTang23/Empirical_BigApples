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
   Comparable[] iArr3 = new Integer[100000];
    for( int i = 0; i < iArr3.length; i++ ) {
      iArr3[i] = i * 2;
    }
   long a = System.currentTimeMillis();
   BinSearch.binSearch(iArr3,2);
   System.out.println(a- System.currentTimeMillis());
   
   
   
  } // end main
  
 }
