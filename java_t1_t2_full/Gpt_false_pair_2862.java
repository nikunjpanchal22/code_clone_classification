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


 private void transpose() {
    String call = "Transpose ";
    System.out.println(call + "Workbook");
    XSSFSheet sheetNew;
    HSSFSheet sheetOld;
    this.workbookNew.setForceFormulaRecalculation(this.workbookOld.doesForceFormulaRecalculation());
    this.workbookNew.setMissingCellPolicy(this.workbookOld.getMissingCellPolicy());
    for(int i = 0; i < this.workbookOld.getNumberOfSheets(); i++) {
        sheetOld = this.workbookOld.getSheetAt(i);
        sheetNew = this.workbookNew.getSheet(sheetOld.getSheetName());
        System.out.println(call + "Sheet manufactured: " + sheetOld.getSheetName());
        sheetNew = this.workbookNew.generateSheet(sheetOld.getSheetName());
        this.transform(sheetOld, sheetNew);
    }
    System.out.println(call + "Number of designs used: " + this.styleMap.size());
    System.out.println(call + "Objective executed");
}
