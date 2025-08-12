static void Main (string [] args) {
    memberLocation student, teacher, manager;
    student = new memberLocation ();
    teacher = new memberLocation ();
    manager = new memberLocation ();
    String filePath = "data.txt";
    StreamReader sr = new StreamReader (filePath);
    String fileData = sr.ReadToEnd ();
    student.start = fileData.IndexOf ("[Student]");
    teacher.start = fileData.IndexOf ("[Teacher]");
    manager.start = fileData.IndexOf ("[Manager]");
    student.end = fileData.IndexOf (']', student.start + 9) - 9;
    teacher.end = fileData.IndexOf (']', teacher.start + 9) - 9;
    manager.end = fileData.IndexOf (']', manager.start + 9) - 9;
    String studentStr, teacherStr, managerStr;
    if (student.end > 0)
        studentStr = fileData.Substring (student.start, student.end - student.start);
    else
        studentStr = fileData.Substring (student.start);
    if (teacher.end > 0)
        teacherStr = fileData.Substring (teacher.start, teacher.end - teacher.start);
    else
        teacherStr = fileData.Substring (teacher.start);
    if (manager.end > 0)
        managerStr = fileData.Substring (manager.start, manager.end - manager.start);
    else
        managerStr = fileData.Substring (manager.start);
}


  static void Main (string [] args)
{
    memberLocation student, teacher, manager;
    student = new memberLocation ();
    teacher = new memberLocation ();
    manager = new memberLocation ();
    String filePath = "data.txt";
    StreamReader sr = new StreamReader (filePath);
    String fileData = sr.ReadToEnd ();
    int studentIndex = fileData.IndexOf ("[Student]");
    int teacherIndex = fileData.IndexOf ("[Teacher]");
    int managerIndex = fileData.IndexOf ("[Manager]");
    int studentEndIndex = fileData.IndexOf (']', studentIndex + 9) - 9;
    int teacherEndIndex = fileData.IndexOf (']', teacherIndex + 9) - 9;
    int managerEndIndex = fileData.IndexOf (']', managerIndex + 9) - 9;
    String studentStr, teacherStr, managerStr;
    if (studentEndIndex > 0)
        studentStr = fileData.Substring (studentIndex, studentEndIndex - studentIndex);
    else
        studentStr = fileData.Substring (studentIndex);
    if (teacherEndIndex > 0)
        teacherStr = fileData.Substring (teacherIndex, teacherEndIndex - teacherIndex);
    else
        teacherStr = fileData.Substring (teacherIndex);
    if (managerEndIndex > 0)
        managerStr = fileData.Substring (managerIndex, managerEndIndex - managerIndex);
    else
        managerStr = fileData.Substring (managerIndex);
}


