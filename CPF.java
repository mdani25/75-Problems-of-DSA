public class CPF {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
                if (count >= n) {
                    return true;
                }
            }
        }
        return count >= n;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(flowerbed,n)); //OUTPUT: true
        int m=2;
        System.out.println(canPlaceFlowers(flowerbed,m)); //OUTPUT: false
    }
}