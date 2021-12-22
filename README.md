# emp_BigApples

## Big Apples - Weichen Liu, Jeffery Tang, Lior Polischouk

## Tests Performed
* testing for speed of linear and binary search on bigger array(length 10000000) for small index
* testing for speed of linear and binary search on bigger array(length 10000000) for big index
* testing for speed of linear and binary search on smaller array(length 5000000) for small index
* testing for speed of linear and binary search on smaller array(length 5000000) for big index
* testing for speed of linear and binary search on array of 10000 length
* testing for speed of linear and binary search on array of 20000 length
* testing for speed of linear and binary search on array of 100000 length
* testing for speed of linear and binary search on array of 200000 length

## Results
* In almost every scenario(after a certain threshold), binary search was faster than linear search.
* As the array we are testing on grew larger and larger, linear search took exponentially as long as binary search.

```
testing for speed of linear and binary search on bigger array(length 10000000) for small index:
total times(ms) for linear search:       1 / 2 / 1                 AVG: 1.33
total times(ms) for binary search:       1 / 1 / 0                 AVG: .66
testing for speed of linear and binary search on bigger array(length 10000000) for big index:
total times(ms) for linear search:       27 / 27 / 27              AVG: 27
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on smaller array(length 5000000) for small index:
total times(ms) for linear search:       0 / 0 / 0                 AVG: 0
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on smaller array(length 5000000) for big index:
total times(ms) for linear search:       13 / 13 / 16              AVG: 14
total times(ms) for binary search:       0 / 0 / 0                 AVG: 0
testing for speed of linear and binary search on array for 10000 index:
total times(ms) for linear search:       43 / 39 / 41              AVG: 41
total times(ms) for binary search:       3 / 3 / 4                 AVG: 3.33
testing for speed of linear and binary search on array for 20000 index:
total times(ms) for linear search:       149 / 150 / 157           AVG: 152
total times(ms) for binary search:       1 / 2 / 2                 AVG: 1.66
testing for speed of linear and binary search on array for 100000 index:
total times(ms) for linear search:       3455 / 3471 / 3626        AVG: 3517.33
total times(ms) for binary search:       8 / 9 / 7                 AVG: 8
testing for speed of linear and binary search on array for 200000 index:
total times(ms) for linear search:       14197 / 13131 / 13123     AVG: 13483.66
total times(ms) for binary search:       17 / 14 / 14              AVG: 16
```

## Conclusions
* Although we expected linear search to be faster at finding lower indexes on bigger arrays, binary search was just as fast. While we increased the amount of repetition of linear search and binary search on bigger and bigger arrays, we found that the time it took for linear search to run grew much faster than that of linear search. It seems like the amount of time it took for binary search to run on every element of an array of 100000 length was about five times of the amount of time it took for binary search to run on every element of an array of 20000 length, which implies a linear relationship. In all of these cases, the average time it took for binary search to run was much lower or equal to that of linear search. 
