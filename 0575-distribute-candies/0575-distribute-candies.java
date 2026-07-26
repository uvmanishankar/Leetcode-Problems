import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        int types = set.size();
        int limit = candyType.length / 2;

        if (types < limit) {
            return types;
        }

        return limit;
    }
}