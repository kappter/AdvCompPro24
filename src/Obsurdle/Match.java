public class Match {
	private static String w = "";
	private static String g = "";
	public void setWords(String word, String guess) {
		this.w = word.toUpperCase();
		this.g = guess.toUpperCase();
	}
	public static String matchText() {
		String output = "|";
		for(int i = 0; i<7; i++) {
			String check = " -";
			for(int j = 0; j<7; j++) {
				if(g.charAt(i)==w.charAt(j)) {
					if (i==j) {
						check = " ■";
					} else if (check != " ■") {
						check = " □";
					}
				}
			}
			output = output + check + " |";
		}
		return output;
	}
}