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
        studentStr = fileData.Substring (student.start + 9, student.end);
    else
        studentStr = fileData.Substring (student.start);
    if (teacher.end > 0)
        teacherStr = fileData.Substring (teacher.start + 9, teacher.end);
    else
        teacherStr = fileData.Substring (teacher.start);
    if (manager.end > 0)
        managerStr = fileData.Substring (manager.start + 9, manager.end);
    else
        managerStr = fileData.Substring (manager.start);
}
