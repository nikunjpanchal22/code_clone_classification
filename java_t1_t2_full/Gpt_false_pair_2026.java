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
	 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	 int sumOfGrades = 0;
	 double avgGrade = 0;
	 
	 System.out.print ("Number of grades?");
	 int num = Integer.parseInt (input.readLine ());
	 double [] marks = new double [num];
	 int count = 0;
	 while (num > 0)
	 {
	 System.out.print ("Enter grade # " + (count + 1) + ": ");
	 marks [count] = Double.parseDouble (input.readLine ());
	 sumOfGrades += marks[count];
	 num--;
	 count++;
	 }
	 avgGrade = (double) sumOfGrades / count;
	 System.out.println ("Your grades average is " + avgGrade);
}
