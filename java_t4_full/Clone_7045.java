private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {
    styleNew.setAlignment (styleOld.getAlignment ());
    styleNew.setBorderBottom (styleOld.getBorderBottom ());
    styleNew.setBorderLeft (styleOld.getBorderLeft ());
    styleNew.setBorderRight (styleOld.getBorderRight ());
    styleNew.setBorderTop (styleOld.getBorderTop ());
    styleNew.setDataFormat (this.transform (workbookOld, workbookNew, styleOld.getDataFormat ()));
    styleNew.setFillBackgroundColor (styleOld.getFillBackgroundColor ());
    styleNew.setFillForegroundColor (styleOld.getFillForegroundColor ());
    styleNew.setFillPattern (styleOld.getFillPattern ());
    styleNew.setFont (this.transform (workbookNew, (XSSFFont) styleOld.getFont ()));
    styleNew.setHidden (styleOld.getHidden ());
    styleNew.setIndention (styleOld.getIndention ());
    styleNew.setLocked (styleOld.getLocked ());
    styleNew.setVerticalAlignment (styleOld.getVerticalAlignment ());
    styleNew.setWrapText (styleOld.getWrapText ());
    this.styleMap.put (hash, styleNew);
}





private void transform(XSSFWorkbook firstWorkbook, HSSFWorkbook secondWorkbook, Integer key, XSSFCellStyle xssf, HSSFCellStyle hssf) {
    hssf.setAlignment(xssf.getAlignment());
    hssf.setBorderLeft(xssf.getBorderLeft());
    hssf.setDataFormat(this.transform(firstWorkbook, secondWorkbook, xssf.getDataFormat()));
    hssf.setFillForegroundColor(xssf.getFillForegroundColor());
    hssf.setFillPattern(xssf.getFillPattern());
    this.styleMap.put(key, hssf);
}


