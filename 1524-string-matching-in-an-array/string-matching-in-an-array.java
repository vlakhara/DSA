class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(i != j) {
                    if(!list.contains(words[j]) && words[i].indexOf(words[j]) != -1) {
                        list.add(words[j]);
                    }
                }
            }
        }

        return list;
    }
}