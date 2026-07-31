class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> ban = new HashSet<>();

        for (String word : banned) {
            ban.add(word);
        }

        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i <= paragraph.length(); i++) {

            if (i < paragraph.length() && Character.isLetter(paragraph.charAt(i))) {
                word.append(paragraph.charAt(i));
            } else {

                if (word.length() > 0) {

                    String s = word.toString();

                    if (!ban.contains(s)) {

                        if (map.containsKey(s)) {
                            map.put(s, map.get(s) + 1);
                        } else {
                            map.put(s, 1);
                        }
                    }

                    word.setLength(0);
                }
            }
        }

        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {

            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}