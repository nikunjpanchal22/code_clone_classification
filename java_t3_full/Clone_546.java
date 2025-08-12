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
    String input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    List<Score> listScore = new ArrayList<>();
    String[] storeInputDetails = input.split("\\),");
    for(String details : storeInputDetails) {
        details = details.substring(1);	
        int scoreIndex = details.lastIndexOf(')');
        if(scoreIndex == details.length()-1)
           details = details.substring(0, details.length()-1);	
        String[] splitDetails = details.split(",");
        listScore.add(new Score(splitDetails[0], splitDetails[1], Double.valueOf(splitDetails[2])));
    }
}


