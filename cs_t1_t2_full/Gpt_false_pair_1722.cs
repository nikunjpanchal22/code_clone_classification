public void InputGrade () {
    int grade;
    string input;
    Console.WriteLine ("{0}\n{1}", "Enter the integer grades in the range 0-100", "Type <Ctrl> z and press Enter to terminate input:");
    counter ++;
    System.Console.Write ("score " + counter + ":");
    input = Console.ReadLine ();
    while (input != null) {
        grade = Convert.ToInt32 (input);
        total += grade;
        gradeCounter ++;
        IncrementLetterGradeCounter (grade);
        counter ++;
        System.Console.Write ("score " + counter + ":");
        input = Console.ReadLine ();
    }
}


  public void ReadGrade()
{
    int grade;
    string input;
    Console.WriteLine ("{0}\n{1}", "Enter the integer grades in the range 0-100", "Type <Ctrl> z and press Enter to terminate input:");
    counter++;
    System.Console.Write ("score " + counter + ":");
    input = Console.ReadLine();
    while(!String.IsNullOrEmpty(input))
    {
        grade = Int32.Parse(input);
        total += grade;
        gradeCounter++;
        IncrementLetterGradeCounter(grade);
        counter++;
        System.Console.Write ("score " + counter + ":");
        input = Console.ReadLine();
    }
}
