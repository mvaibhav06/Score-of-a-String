class StringScore {
    public int scoreOfString(String s) {
        int out = 0;
        for(int i=0; i<s.length()-1; i++){
            out += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return out;
    }
}
