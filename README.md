# emp_BigApples

## Big Apples - Weichen Liu, Jeffery Tang, Lior Polischouk

## Tests Performed
### We tested in the main method of our SearchDriver.java file for small targets, big targets, smaller arrays, bigger arrays, more repetition, and less repetition:
* testing for speed of linear and binary search on bigger array(length 10000000) for small index
* testing for speed of linear and binary search on bigger array(length 10000000) for big index
* testing for speed of linear and binary search on smaller array(length 5000000) for small index
* testing for speed of linear and binary search on smaller array(length 5000000) for big index
* testing for speed of linear and binary search for every element on array of 10000 length
* testing for speed of linear and binary search for every element on array of 20000 length
* testing for speed of linear and binary search for every element on array of 100000 length
* testing for speed of linear and binary search for every element on array of 200000 length
* testing for worse case scenario of linear and binary search repeated 1,000,000 times on an array of 10,000 length

## Results
* In almost every scenario(after a certain threshold), binary search was faster than linear search.
* As the array we are testing on grew larger and larger, linear search took exponentially as long as binary search.

```
testing for speed of linear and binary search on bigger array(length 10,000,000) for small index:
total times(ms) for linear search:       1 / 2 / 1                 AVG: 1.33
total times(ms) for binary search:       1 / 1 / 0                 AVG: .66
testing for speed of linear and binary search on bigger array(length 10,000,000) for big index:
total times(ms) for linear search:       27 / 27 / 27              AVG: 27
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on smaller array(length 5,000,000) for small index:
total times(ms) for linear search:       0 / 0 / 0                 AVG: 0
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on smaller array(length 5,000,000) for big index:
total times(ms) for linear search:       13 / 13 / 16              AVG: 14
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on array for 10,000 index:
total times(ms) for linear search:       43 / 39 / 41              AVG: 41
total times(ms) for binary search:       3 / 3 / 4                 AVG: 3.33
testing for speed of linear and binary search on array for 20,000 index:
total times(ms) for linear search:       149 / 150 / 157           AVG: 152
total times(ms) for binary search:       1 / 2 / 2                 AVG: 1.66
testing for speed of linear and binary search on array for 100,000 index:
total times(ms) for linear search:       3455 / 3471 / 3626        AVG: 3517.33
total times(ms) for binary search:       8 / 9 / 7                 AVG: 8
testing for speed of linear and binary search on array for 200,000 index:
total times(ms) for linear search:       14197 / 13131 / 13123     AVG: 13483.66
total times(ms) for binary search:       17 / 14 / 14              AVG: 16
testing for worse case scenario of linear and binary search repeated 1,000,000 times on an array of 10,000 length:
total time(ms) for linear search:       6924 / 7495 / 7200         AVG: 7206.33
total time(ms) for binary search:       38 / 37 / 34               AVG: 36.33
```

## Conclusions
* Binary Search is just faster!
* Although we expected linear search to be faster at finding lower indexes on bigger arrays, binary search was just as fast. While we increased the amount of repetition of linear search and binary search on bigger and bigger arrays, we found that the time it took for linear search to run grew much faster than that of linear search. It seems like the amount of time it took for binary search to run on every element of an array of 100,000 length was about four times of the amount of time it took for binary search to run on every element of an array of 20000 length, which implies somewhat of a linear relationship. In all of these cases, the average time it took for binary search to run was much lower or equal to that of linear search. 
