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

    //you can check here if the list is empty or not.
    if (!checklist.Any())
        return 2;

    bool found = false;
    foreach (var curComp in checklist)
    {
        if (curComp.RegNumber.Equals(conRegnumber))
        {
            found = true;
            break;
        }
    }

    if (found)
        return 1;
    else
        return 0;
}


