public static void main (String [] args) {
    String input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    String [] scoreSets = input.split ("\\),");
    List < Score > scoreList = new ArrayList < Score > ();
    for (String score : scoreSets) {
        score = score.trim ().substring (1);
        int closeBrace = score.indexOf (')');
        if (closeBrace == score.length () - 1) {
            score = score.substring (0, score.length () - 1);
        }
        String [] tokens = score.split (",");
        scoreList.add (new Score (tokens [0], tokens [1], Double.valueOf (tokens [2])));
    }
}


 public static void main(String[] args) {
    String inputString = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    String[] data = inputString.split("\\),");
    List<Score> scores = new ArrayList<Score>(); 
    for(String scoresInput : data) {
        
        String score = scoresInput.trim();
        score = score.substring(1);
        int position = score.indexOf(')');
        if( position == score.length() - 1) {
            score = score.substring(0, score.length()-1);
        }
        
        String[] scoreIndividual = score.split(",");
        scores.add(new Score(scoreIndividual[0], scoreIndividual[1], Double.valueOf(scoreIndividual[2]))); 
    }
}
