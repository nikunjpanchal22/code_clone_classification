public static void main (String args []) throws IOException {
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    int totalGrades = 0;
    float gradeAverage = 0;
    System.out.print ("How many grades will you enter?");
    int laki = Integer.parseInt (dataIn.readLine ());
    float [] grades = new float [laki];
    int count = 0;
    while (laki > 0) {
        System.out.print ("Please enter grade # " + (count + 1) + ": ");
        grades [count] = Float.parseFloat (dataIn.readLine ());
        totalGrades += grades [count];
        laki --;
        count ++;
    }
    gradeAverage = (float) totalGrades / count;
    System.out.println ("Your grades average is " + gradeAverage);
}


public static void main (String [] args) throws IOException {
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    int totalGrades = 0;
    float gradeAverage = 0;
    System.out.print ("How many grades will you calculate?");
    int laki = Integer.parseInt (dataIn.readLine ());
    float [] grades = new float [laki];
    int counter = 0;
    while (laki > 0) {
        System.out.print ("Enter grade # " + (counter + 1) + ": ");
        grades [counter] = Float.parseFloat (dataIn.readLine ());
        totalGrades += grades [counter];
        laki --;
        counter ++;
    }
    gradeAverage = (float) totalGrades / counter;
    System.out.println ("Your grades average is " + gradeAverage);
}
