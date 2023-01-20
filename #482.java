class Solution {
    int i = 0;
    public String licenseKeyFormatting(String s, int k) {
	    s = s.replaceAll("-", "");
		int len = s.length();
		int firstBreaker = len - (k * (len / k));
		int breaker = k;
		StringBuilder ans = new StringBuilder();
		if (firstBreaker != 0) {
			ans.append(getString(firstBreaker, len, s, k));
		}
		ans.append(getString(breaker, len, s, k));
		return ans.toString();
    }
    public StringBuilder getString(int breaker, int len, String s, int k) {
		char c;
		int chars = 0;
		StringBuilder ans = new StringBuilder();
		while (i < len) {
			c = s.charAt(i);
			if (chars == breaker) {
				ans.append("-");
				breaker += k;
			}
			if (Character.isAlphabetic(c)) {
				ans.append(Character.toUpperCase(c));
				chars++;
			} else if (Character.isDigit(c)) {
				ans.append(c);
				chars++;
			}
			i++;
		}
		return ans;
	}
}
