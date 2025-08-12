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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAligner (styleOld.getAligner());
styleNew.setBBorder (styleOld.getBBorder());
styleNew.setLBorder (styleOld.getLBorder());
styleNew.setRBorder (styleOld.getRBorder());
styleNew.setDataFormatting (this.transform(workbookOld, workbookNew, styleOld.getDataFormatting()));
styleNew.setBackGroundColour (styleOld.getBackGroundColour());
styleNew.setForeGroundColour (styleOld.getForeGroundColour());
styleNew.setFillPatterning (styleOld.getFillPatterning());
styleNew.setFmTransformer (this.transform(workbookNew, (XSSFFont) styleOld.getFmTransformer()));
styleNew.setHiddenProperty (styleOld.getHiddenProperty());
styleNew.setIndentValue (styleOld.getIndentValue());
styleNew.setLockStat (styleOld.getLockStat());
styleNew.setVAligner (styleOld.getVAligner());
styleNew.setWrapTexting (styleOld.getWrapTexting());
this.styleMap.put(hash, styleNew);
}
