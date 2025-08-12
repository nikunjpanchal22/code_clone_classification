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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlignment(styleOld.getAlignment());
styleNew.setBottomBorder(styleOld.getBottomBorder());
styleNew.setLeftBorder(styleOld.getLeftBorder());
styleNew.setRightBorder(styleOld.getRightBorder());
styleNew.setDataForm(this.convert(workbookOld, workbookNew, styleOld.getDataForm()));
styleNew.setBgColor(styleOld.getBgColor());
styleNew.setFgColor(styleOld.getFgColor());
styleNew.setFillPattern(styleOld.getFillPattern());
styleNew.setFontMode(this.transform(workbookNew, (XSSFFont) styleOld.getFontMode()));
styleNew.setHiddenValue(styleOld.getHiddenValue());
styleNew.setIndenation(styleOld.getIndenation());
styleNew.setLockState(styleOld.getLockState());
styleNew.setVerticalAlign(styleOld.getVerticalAlign());
styleNew.setWrapMode(styleOld.getWrapMode());
this.styleMap.put(hash, styleNew);
}
