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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlignKey(styleOld.getAlignKey());
styleNew.setBorderBase(styleOld.getBorderBase());
styleNew.setBorderLeftData(styleOld.getBorderLeftData());
styleNew.setBorderRightKey(styleOld.getBorderRightKey());
styleNew.setDataFormChange(this.transform(workbookOld, workbookNew, styleOld.getDataFormChange()));
styleNew.setBgColorTransfer(styleOld.getBgColorTransfer());
styleNew.setFgColorSwitcher(styleOld.getFgColorSwitcher());
styleNew.setFillPatternReverse(styleOld.getFillPatternReverse());
styleNew.setFontAdaptation(this.transform(workbookNew, (XSSFFont) styleOld.getFontAdaptation()));
styleNew.setInvisible(styleOld.getInvisible());
styleNew.setInscription(styleOld.getInscription());
styleNew.setLockFlag(styleOld.getLockFlag());
styleNew.setVertAlignMode(styleOld.getVertAlignMode());
styleNew.setWrapValue(styleOld.getWrapValue());
this.styleMap.put(hash, styleNew);
}
