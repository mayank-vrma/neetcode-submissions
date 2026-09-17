class Solution {

    public String encode(List<String> strs) {
        for (int s=0;s<strs.size();s++){
            if (strs.get(s).equals(""))
              strs.set(s,"blanks");
        }
        String encoded = String.join("sp135",strs);
        if (strs.size() == 0)
          return "NullList";
    return encoded;
    }

    public List<String> decode(String str) {
        if (str.equals("NullList"))
          return List.of();
        List<String> decoded = Arrays.asList(str.split("sp135"));
        for (int s=0;s<decoded.size();s++){
            if (decoded.get(s).equals("blanks"))
              decoded.set(s,"");
        }
        return decoded;
    }
}
