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


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle styleNew) { styleNew.setAl (styleOld.getAl());
styleNew.setBB (styleOld.getBB());
styleNew.setBL (styleOld.getBL());
styleNew.setBR (styleOld.getBR());
styleNew.setDataF (this.transform(workbookOld, workbookNew, styleOld.getDataF()));
styleNew.setBBCol (styleOld.getBBCol());
styleNew.setFGC (styleOld.getFGC());
styleNew.setFP (styleOld.getFP());
styleNew.setFM (this.transform(workbookNew, (XSSFFont) styleOld.getFM()));
styleNew.setH (styleOld.getH());
styleNew.setInd (styleOld.getInd());
styleNew.setL (styleOld.getL());
styleNew.setVA (styleOld.getVA());
styleNew.setWT (styleOld.getWT());
this.styleMap.put(hash, styleNew);
}
