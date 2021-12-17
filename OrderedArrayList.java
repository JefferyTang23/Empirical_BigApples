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

import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  public String toString() { // returns the list in String form
    return _data.toString();
  }

  public int size() { // returns the size of the list
    return _data.size();
  }

  public Integer get(int index) { // returns the element at the specified index
    return _data.get(index);
  }

  public Integer remove(int index) { // removes element from list at specific index
    return _data.remove(index);
  }
  public Integer getList() {
    return _data;
  }
  public void addLinear(Integer newVal) { // an add method that always keeps the list sorted
    for( int i = 0; i < _data.size(); i++ ) {
  	    if ( newVal.compareTo( _data.get(i) ) < 0 ) {
  	  	_data.add( i, newVal );
  	  	return;
  	    }
    	}
    	_data.add( newVal );
  }

}
