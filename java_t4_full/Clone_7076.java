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




private HSSFFont transform(HSSFWorkbook workbook, XSSFFont font) {
            HSSFFont newFont = workbook.createFont();
            copyFontAttributes(font, newFont);
            return newFont;
        }

        private void copyFontAttributes(XSSFFont sourceFont, HSSFFont targetFont) {
            targetFont.setBoldweight(sourceFont.getBoldweight());
            targetFont.setCharSet(sourceFont.getCharSet());
            targetFont.setColor(sourceFont.getColor());
            targetFont.setFontName(sourceFont.getFontName());
            targetFont.setFontHeight(sourceFont.getFontHeight());
            targetFont.setItalic(sourceFont.getItalic());
            targetFont.setStrikeout(sourceFont.getStrikeout());
            targetFont.setTypeOffset(sourceFont.getTypeOffset());
            targetFont.setUnderline(sourceFont.getUnderline());
        }




private Function<XSSFFont, HSSFFont> transform(HSSFWorkbook workbook) {
    return fontOld -> {
        HSSFFont fontNew = workbook.createFont();
        fontNew.setBoldweight(fontOld.getBoldweight());
        fontNew.setCharSet(fontOld.getCharSet());
        fontNew.setColor(fontOld.getColor());
        fontNew.setFontName(fontOld.getFontName());
        fontNew.setFontHeight(fontOld.getFontHeight());
        fontNew.setItalic(fontOld.getItalic());
        fontNew.setStrikeout(fontOld.getStrikeout());
        fontNew.setTypeOffset(fontOld.getTypeOffset());
        fontNew.setUnderline(fontOld.getUnderline());
        return fontNew;
    };
}


