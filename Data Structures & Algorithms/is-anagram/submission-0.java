class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equalsIgnoreCase(t))
          return true;
        String[] a1 = s.split("");
        String[] a2 = t.split("");
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
