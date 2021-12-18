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

/**
   class LinSearch
**/

public class LinSearch
{

  /**
     int linSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target
     post: returns index of first occurrence of target, or
     returns -1 if target not found
  **/
  public static int linSearch ( Comparable[] a, Comparable target )
  {
    int tPos = -1;
    int i = 0;

    while ( i < a.length ) {
      if ( a[i].equals(target) ) {
        tPos = i;
        break;
      }
      i++;
    }
    return tPos;
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void printArray( Object[] arr )
  {
    String output = "[ ";

    for( Object o : arr )
      output += o + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }

}//end class LinSearch
