class Solution {
    public long coloredCells(int n) {
      long f = 2 * (long) Math.pow(n, 2);
      long s = 2 * (long) n;

      return f - s + 1;
    }
}


/**

1 1
2 5
3 13


 */