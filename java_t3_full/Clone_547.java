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
    String inputValues = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)";
    List<Score> scores = new ArrayList<>(); 
    //splitting the values from the given input using "),"
    String[] storeValues = inputValues.split("\\),"); 
    for(String eachValue : storeValues) {
        eachValue = eachValue.substring(1);	
        //getting the indexOf ")" if it exists 
        int position = eachValue.indexOf(')');
        //Checking if position is equal to the length, then removing it
        if( position == eachValue.length()-1 )
            eachValue = eachValue.substring(0, eachValue.length()-1);	
        String[] storeValueDetails = eachValue.trim().split(",");
        scores.add(new Score(storeValueDetails[0], storeValueDetails[1], Double.valueOf(storeValueDetails[2])));
    } 
}


