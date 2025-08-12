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


private void alter (XSSFWorkbook bookOld, HSSFWorkbook bookNew, Integer sign, XSSFCellStyle lookOld, HSSFCellStyle lookNew) {
    lookNew.setAlignment (lookOld.getAlignment ());
    lookNew.setBorderBottom (lookOld.getBorderBottom ());
    lookNew.setBorderLeft (lookOld.getBorderLeft ());
    lookNew.setBorderRight (lookOld.getBorderRight ());
    lookNew.setBorderTop (lookOld.getBorderTop ());
    lookNew.setDataFormat (adapt (bookOld, bookNew, lookOld.getDataFormat ()));
    lookNew.setFillBackgroundColor (lookOld.getFillBackgroundColor ());
    lookNew.setFillForegroundColor (lookOld.getFillForegroundColor ());
    lookNew.setFillPattern (lookOld.getFillPattern ());
    lookNew.setFont (adapt (bookNew, (XSSFFont) lookOld.getFont ()));
    lookNew.setHidden (lookOld.getHidden ());
    lookNew.setIndention (lookOld.getIndention ());
    lookNew.setLocked (lookOld.getLocked ());
    lookNew.setVerticalAlignment (lookOld.getVerticalAlignment ());
    lookNew.setWrapText (lookOld.getWrapText ());
    this.appearanceMap.put (sign, lookNew);
}
