# Repeated String

## Problem
There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n , find and print the number of letter a's in the first  letters of the infinite string.

### Example


The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are 4 occurrences of a in the substring.

### Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

* s: a string to repeat
* n: the number of characters to consider

### Returns

* int: the frequency of a in the substring

## Input Format

The first line contains a single string,s .
The second line contains an integer,n .

### Constraints

* 1 <= s <= 100
* 1 <= n <= 10<sup>12</sup>

### Sample Input

#### Sample Input 0 

```
aba
10
```

#### Sample Output 0

```
7
```

#### Explanation 0

The first n = 10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we return 7.


#### Sample Input 1

```
a
1000000000000
```

#### Sample Output 1

```
1000000000000
```

#### Explanation 1

The first n = 1000000000000 letters of the infinite string are a 1000000000000.
