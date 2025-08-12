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


 private void convert() {
    String call = "Convert ";
    System.out.println(call + "Workbook");
    XSSFSheet sheetNew;
    HSSFSheet sheetOld;
    this.workbookNew.setForceFormulaRecalculation(this.workbookOld.isForceFormulaRecalculation());
    this.workbookNew.setMissingCellPolicy(this.workbookOld.getMissingCellPolicy());
    for(int i = 0; i < this.workbookOld.getNumberOfSheets(); i++) {
        sheetOld = this.workbookOld.getSheetAt(i);
        sheetNew = this.workbookNew.getSheet(sheetOld.getSheetName());
        System.out.println(call + "Sheet generated: " + sheetOld.getSheetName());
        sheetNew = this.workbookNew.createSheet(sheetOld.getSheetName());
        this.transform(sheetOld, sheetNew);
    }
    System.out.println(call + "Number of styles utilized: " + this.styleMap.size());
    System.out.println(call + "Completed");
}
