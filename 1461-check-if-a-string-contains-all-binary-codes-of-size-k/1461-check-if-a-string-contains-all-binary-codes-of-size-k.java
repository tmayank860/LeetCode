class Solution {
    public boolean hasAllCodes(String s, int k) {
           Map<String, Boolean> store = new HashMap<>(k, 1);
            for (int i = 0; i < s.length() - k + 1; i++) {
                store.put(s.substring(i, i + k), true);
            }
            if (store.size() == Math.pow(2,k)) {
                return true;
            }
            return false;
    }
}