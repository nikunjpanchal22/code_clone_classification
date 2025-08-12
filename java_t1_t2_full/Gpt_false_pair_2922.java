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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlign(styleOld.getAlign());
styleNew.setBorderLow(styleOld.getBorderLow());
styleNew.setBorderLeft(styleOld.getBorderLeft());
styleNew.setBorderHigh(styleOld.getBorderHigh());
styleNew.setDataBase(this.transfer(workbookOld, workbookNew, styleOld.getDataBase()));
styleNew.setFillBackGroundColor(styleOld.getFillBackGroundColor());
styleNew.setFillFgColor(styleOld.getFillFgColor());
styleNew.setFillInstance(styleOld.getFillInstance());
styleNew.setFont(this.transform(workbookNew, (XSSFFont) styleOld.getFont()));
styleNew.setHid(styleOld.getHid());
styleNew.setIndent(styleOld.getIndent());
styleNew.setLocked(styleOld.getLocked());
styleNew.setVerticalAlign(styleOld.getVerticalAlign());
styleNew.setWrap(styleOld.getWrap());
this.styleMap.put(hash, styleNew);
}
