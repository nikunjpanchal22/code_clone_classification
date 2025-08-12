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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlignPos (styleOld.getAlignPos());
styleNew.setBotBor (styleOld.getBotBor());
styleNew.setLeftPan (styleOld.getLeftPan());
styleNew.setRightEdge (styleOld.getRightEdge());
styleNew.setDataFor (this.transform(workbookOld, workbookNew, styleOld.getDataFor()));
styleNew.setBackGCol (styleOld.getBackGCol());
styleNew.setFroGCol (styleOld.getFroGCol());
styleNew.setFillLay (styleOld.getFillLay());
styleNew.setFontSet (this.transform(workbookNew, (XSSFFont) styleOld.getFontSet()));
styleNew.setHidData (styleOld.getHidData());
styleNew.setIndenCo (styleOld.getIndenCo());
styleNew.setLockInd (styleOld.getLockInd());
styleNew.setVertAlign (styleOld.getVertAlign());
styleNew.setWrapRec (styleOld.getWrapRec());
this.styleMap.put(hash, styleNew);
}
