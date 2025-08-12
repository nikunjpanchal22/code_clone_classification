private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFSheet sheetOld, XSSFSheet sheetNew) {
    System.out.println ("transform Sheet");
    sheetNew.setDisplayFormulas (sheetOld.isDisplayFormulas ());
    sheetNew.setDisplayGridlines (sheetOld.isDisplayGridlines ());
    sheetNew.setDisplayGuts (sheetOld.getDisplayGuts ());
    sheetNew.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());
    sheetNew.setDisplayZeros (sheetOld.isDisplayZeros ());
    sheetNew.setFitToPage (sheetOld.getFitToPage ());
    sheetNew.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());
    sheetNew.setMargin (Sheet.BottomMargin, sheetOld.getMargin (Sheet.BottomMargin));
    sheetNew.setMargin (Sheet.FooterMargin, sheetOld.getMargin (Sheet.FooterMargin));
    sheetNew.setMargin (Sheet.HeaderMargin, sheetOld.getMargin (Sheet.HeaderMargin));
    sheetNew.setMargin (Sheet.LeftMargin, sheetOld.getMargin (Sheet.LeftMargin));
    sheetNew.setMargin (Sheet.RightMargin, sheetOld.getMargin (Sheet.RightMargin));
    sheetNew.setMargin (Sheet.TopMargin, sheetOld.getMargin (Sheet.TopMargin));
    sheetNew.setPrintGridlines (sheetNew.isPrintGridlines ());
    sheetNew.setRowSumsBelow (sheetNew.getRowSumsBelow ());
    sheetNew.setRowSumsRight (sheetNew.getRowSumsRight ());
    sheetNew.setVerticallyCenter (sheetOld.getVerticallyCenter ());
    XSSFRow rowNew;
    for (Row row : sheetOld) {
        rowNew = sheetNew.createRow (row.getRowNum ());
        if (rowNew != null) this.transform (workbookOld, workbookNew, (HSSFRow) row, rowNew);
    }
    for (int i = 0;
    i < this.lastColumn; i ++) {
        sheetNew.setColumnWidth (i, sheetOld.getColumnWidth (i));
        sheetNew.setColumnHidden (i, sheetOld.isColumnHidden (i));
    }
    for (int i = 0;
    i < sheetOld.getNumMergedRegions (); i ++) {
        CellRangeAddress merged = sheetOld.getMergedRegion (i);
        sheetNew.addMergedRegion (merged);
    }
}





private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFSheet sheetOld, XSSFSheet sheetNew) {
    updateSheetProperties(sheetOld, sheetNew);
    updateRows(workbookOld, workbookNew, sheetOld, sheetNew);
    updateColumnProperties(sheetOld, sheetNew);
    updateMergedRegions(sheetOld, sheetNew);
}


