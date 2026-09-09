class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> slist = new ArrayList<>();
        if (strs.length <= 1) {
          slist.add(Arrays.asList(strs));
          return slist;
        }
        int flag = 0;
        List<String> qlist = new ArrayList<>();
        String[] sorted = new String[strs.length];
        for (int i=0; i<strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sorted[i] = new String(chars);
            if (strs[i].isEmpty())
              qlist.add("");
        }
        if (!qlist.isEmpty())
          slist.add(qlist);
        for (int i=0; i<strs.length; i++) {
            if (strs[i].equals(""))
              continue;
            List<String> plist = new ArrayList<>();
            for (int j=0; j<strs.length; j++) {
                if (i == j || strs[j].equals("") || strs[i].length() != strs[j].length())
                  continue;
                if (sorted[i].equals(sorted[j])) {
                    plist.add(strs[j]);
                    strs[j] = "";
                    flag = 1;
                }
            }
            if (flag == 1) {
              plist.add(strs[i]);
              strs[i] = "";
              slist.add(plist);
            } else {
                slist.add(Arrays.asList(strs[i]));
            }
            flag = 0;
        }
        return slist;
    }
}