private void transform () {
    String call = "transform ";
    System.out.println (call + "Workbook");
    XSSFSheet sheetNew;
    HSSFSheet sheetOld;
    this.workbookNew.setForceFormulaRecalculation (this.workbookOld.getForceFormulaRecalculation ());
    this.workbookNew.setMissingCellPolicy (this.workbookOld.getMissingCellPolicy ());
    for (int i = 0;
    i < this.workbookOld.getNumberOfSheets (); i ++) {
        sheetOld = this.workbookOld.getSheetAt (i);
        sheetNew = this.workbookNew.getSheet (sheetOld.getSheetName ());
        System.out.println (call + "Sheet erstellt: " + sheetOld.getSheetName ());
        sheetNew = this.workbookNew.createSheet (sheetOld.getSheetName ());
        this.transform (sheetOld, sheetNew);
    }
    System.out.println (call + "Anzahl verwendeter Styles: " + this.styleMap.size ());
    System.out.println (call + "abgeschlossen");
}


 private void transform() {
    String action = "Transform ";
    System.out.println(action + "Workbook");
    XSSFSheet newSheet;
    HSSFSheet oldSheet;
    this.workbookNew.setForceFormulaRecalculation(this.workbookOld.isForceFormulaRecalculation());
    this.workbookNew.setMissingCellPolicy(this.workbookOld.getMissingCellPolicy());
    for(int i = 0; i < this.workbookOld.getNumberOfSheets(); i++) {
        oldSheet = this.workbookOld.getSheetAt(i);
        newSheet = this.workbookNew.getSheet(oldSheet.getSheetName());
        System.out.println(action + "Sheet created: " + oldSheet.getSheetName());
        newSheet = this.workbookNew.copySheet(oldSheet.getSheetName());
        this.transform(oldSheet, newSheet);
    }
    System.out.println(action + "Amount of styles used: " + this.styleMap.size());
    System.out.println(action + "Done");
}
