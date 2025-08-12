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





private void transform(XSSFWorkbook sourceWorkbook, HSSFWorkbook destinationWorkbook, Integer hashItem, XSSFCellStyle sourceStyle, HSSFCellStyle destinationStyle) {
    destinationStyle.setAlignment(sourceStyle.getAlignment());
    destinationStyle.setBorderTop(sourceStyle.getBorderTop());
    destinationStyle.setDataFormat(this.transform(sourceWorkbook, destinationWorkbook, sourceStyle.getDataFormat()));
    destinationStyle.setFillForegroundColor(sourceStyle.getFillForegroundColor());
    destinationStyle.setFillPattern(sourceStyle.getFillPattern());
    this.styleMap.put(hashItem, destinationStyle);
}


