public int checkComRegnumberAvailable (string conRegnumber) {
    List < OtherCompany > checklist = getCompanyDetails ();
    if (checklist.Count == 0)
        return 2;
    for (int i = 0; i < checkList.Count; i ++)
        if (checklist [i].RegNumber == conRegnumber)
            return 1;
    return 0;
}


  public int checkComRegnumberAvailable (string conRegnumber) {
    List < OtherCompany > checklist = getCompanyDetails ();
    if (checklist.IsEmpty())
        return 2;
    int i = 0;
    bool found = false;
    while (i < checklist.Count && !found){
        if (checklist[i].RegNumber == conRegnumber){
            found = true;
            return 1;
        }
        i++;
    }
    return 0;
}


