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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) {styleNew.setAlgn (styleOld.getAlgn());
styleNew.setBBottom (styleOld.getBBottom());
styleNew.setLft (styleOld.getLft());
styleNew.setRght (styleOld.getRght());
styleNew.setDatF (this.transform(workbookOld, workbookNew, styleOld.getDatF()));
styleNew.setBackCol (styleOld.getBackCol());
styleNew.setForeCol (styleOld.getForeCol());
styleNew.setFillPatt (styleOld.getFillPatt());
styleNew.setFontChang (this.transform(workbookNew, (XSSFFont) styleOld.getFontChang()));
styleNew.setHd (styleOld.getHd());
styleNew.setIden (styleOld.getIden());
styleNew.setLck (styleOld.getLck());
styleNew.setVAlin (styleOld.getVAlin());
styleNew.setWrapTxt (styleOld.getWrapTxt());
this.styleMap.put(hash, styleNew);
}
