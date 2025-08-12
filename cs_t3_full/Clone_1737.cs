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
    if (checklist.Count == 0)
        return 2;
    for (int i = 0; i < checkList.Count; i ++){
        bool isEqual = checklist[i].RegNumber.Equals(conRegnumber);
        if (isEqual)
            return 1;
    }
    return 0;
}


