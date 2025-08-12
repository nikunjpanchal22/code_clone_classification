private HSSFFont transform (HSSFWorkbook workbookNew, XSSFFont fontOld) {
    HSSFFont fontNew = workbookNew.createFont ();
    fontNew.setBoldweight (fontOld.getBoldweight ());
    fontNew.setCharSet (fontOld.getCharSet ());
    fontNew.setColor (fontOld.getColor ());
    fontNew.setFontName (fontOld.getFontName ());
    fontNew.setFontHeight (fontOld.getFontHeight ());
    fontNew.setItalic (fontOld.getItalic ());
    fontNew.setStrikeout (fontOld.getStrikeout ());
    fontNew.setTypeOffset (fontOld.getTypeOffset ());
    fontNew.setUnderline (fontOld.getUnderline ());
    return fontNew;
}





private HSSFFont transform(HSSFWorkbook workbook, XSSFFont fontOld) {
    HSSFFont fontNew = workbook.createFont();
    for (Method m : fontOld.getClass().getDeclaredMethods()) {
        try {
            fontNew.getClass().getDeclaredMethod(m.getName()).invoke(fontNew, m.invoke(fontOld));
        } catch (Exception e) {
            // Ignore if the method does not exist in new font
        }
    }
    return fontNew;
}


