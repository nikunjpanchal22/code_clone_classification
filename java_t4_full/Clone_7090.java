private void transform (HSSFSheet sheetOld, XSSFSheet sheetNew) {
    System.out.println ("transform Sheet");
    sheetNew.setDisplayFormulas (sheetOld.isDisplayFormulas ());
    sheetNew.setDisplayGridlines (sheetOld.isDisplayGridlines ());
    sheetNew.setDisplayGuts (sheetOld.getDisplayGuts ());
    sheetNew.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());
    sheetNew.setDisplayZeros (sheetOld.isDisplayZeros ());
    sheetNew.setFitToPage (sheetOld.getFitToPage ());
    sheetNew.setForceFormulaRecalculation (sheetOld.getForceFormulaRecalculation ());
    sheetNew.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());
    sheetNew.setMargin (Sheet.BottomMargin, sheetOld.getMargin (Sheet.BottomMargin));
    sheetNew.setMargin (Sheet.FooterMargin, sheetOld.getMargin (Sheet.FooterMargin));
    sheetNew.setMargin (Sheet.HeaderMargin, sheetOld.getMargin (Sheet.HeaderMargin));
    sheetNew.setMargin (Sheet.LeftMargin, sheetOld.getMargin (Sheet.LeftMargin));
    sheetNew.setMargin (Sheet.RightMargin, sheetOld.getMargin (Sheet.RightMargin));
    sheetNew.setMargin (Sheet.TopMargin, sheetOld.getMargin (Sheet.TopMargin));
    sheetNew.setPrintGridlines (sheetNew.isPrintGridlines ());
    sheetNew.setRightToLeft (sheetNew.isRightToLeft ());
    sheetNew.setRowSumsBelow (sheetNew.getRowSumsBelow ());
    sheetNew.setRowSumsRight (sheetNew.getRowSumsRight ());
    sheetNew.setVerticallyCenter (sheetOld.getVerticallyCenter ());
    XSSFRow rowNew;
    for (Row row : sheetOld) {
        rowNew = sheetNew.createRow (row.getRowNum ());
        if (rowNew != null) this.transform ((HSSFRow) row, rowNew);
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




private void transform(HSSFSheet sheetOld, XSSFSheet sheetNew) {
    XSSFRow rowNew;
    int last = this.lastColumn;
    for (Row row : sheetOld) {
        rowNew = sheetNew.createRow(row.getRowNum());
        this.transform((HSSFRow) row, rowNew);
    }

    for (int i = 0; i < last; i++) {
        int width = sheetOld.getColumnWidth(i);
        boolean isHidden = sheetOld.isColumnHidden(i);
        sheetNew.setColumnWidth(i, width);
        sheetNew.setColumnHidden(i, isHidden);
    }

    int numRegions = sheetOld.getNumMergedRegions();
    for (int i = 0; i < numRegions; i++) {
        sheetNew.addMergedRegion(sheetOld.getMergedRegion(i));
    }
}


