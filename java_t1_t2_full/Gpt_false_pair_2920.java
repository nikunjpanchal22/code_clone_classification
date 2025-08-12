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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlignMent(styleOld.getAlignMent());
styleNew.setBottomBorderSpec(styleOld.getBottomBorderSpec());
styleNew.setLeftBorderValue(styleOld.getLeftBorderValue());
styleNew.setRightBorderForm(styleOld.getRightBorderForm());
styleNew.setFormatData(this.transform(workbookOld, workbookNew, styleOld.getFormatData()));
styleNew.setBkdColor(styleOld.getBkdColor());
styleNew.setFdColor(styleOld.getFdColor());
styleNew.setFillImage(styleOld.getFillImage());
styleNew.setFontChange(this.transform(workbookNew, (XSSFFont) styleOld.getFontChange()));
styleNew.setHiddenFormula(styleOld.getHiddenFormula());
styleNew.setIndentData(styleOld.getIndentData());
styleNew.setLocking(styleOld.getLocking());
styleNew.setVAlignMent(styleOld.getVAlignMent());
styleNew.setWrapData(styleOld.getWrapData());
this.styleMap.put(hash, styleNew);
}
