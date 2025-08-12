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


public static void main (String args []) throws IOException {
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    int totalGrades = 0;
    float gradeAverage = 0;
    System.out.print ("How many grades will you input?");
    int entri = Integer.parseInt (dataIn.readLine ());
    float [] grades = new float [entri];
    int count = 0;
    while (entri > 0) {
        System.out.print ("Please enter grade number " + (count + 1) + " :");
        grades [count] = Float.parseFloat (dataIn.readLine ());
        totalGrades += grades [count];
        entri --;
        count ++;
    }
    gradeAverage = (float) totalGrades / count;
    System.out.println ("Your computed grade average is " + gradeAverage);
}
