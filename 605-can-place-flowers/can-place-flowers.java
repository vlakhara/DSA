class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(len < n) {
            return false;
        }

        if(len == 1 && flowerbed[0] == 0) {
            return true;
        }

        if(len > 1 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        for(int i = 1; i < len - 1; i++) {
            if(flowerbed[i - 1] != 1 && flowerbed[i] == 0 && flowerbed[i + 1] != 1) {
                flowerbed[i] = 1;
                n--;
            }
        }

        if(len > 2 && flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
            flowerbed[len - 1] = 1;
            n--;
        }

        System.out.println(Arrays.toString(flowerbed));

        return n <= 0;
    }
}