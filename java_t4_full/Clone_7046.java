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





private void transform(XSSFWorkbook fromWorkbook, HSSFWorkbook toWorkbook, Integer hash, XSSFCellStyle formerStyle, HSSFCellStyle latterStyle) {
    latterStyle.setAlignment(formerStyle.getAlignment());
    latterStyle.setBorderBottom(formerStyle.getBorderBottom());
    latterStyle.setDataFormat(this.transform(fromWorkbook, toWorkbook, formerStyle.getDataFormat()));
    latterStyle.setFillForegroundColor(formerStyle.getFillForegroundColor());
    latterStyle.setFillPattern(formerStyle.getFillPattern());
    this.styleMap.put(hash, latterStyle);
}


