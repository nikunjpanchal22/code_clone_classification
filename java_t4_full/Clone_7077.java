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
        return Optional.ofNullable(font)
                .map(f -> createFontFrom(workbook, f))
                .orElseThrow(() -> new IllegalArgumentException("Font can't be null"));
    }

    private HSSFFont createFontFrom(HSSFWorkbook workbook, XSSFFont font) {
        HSSFFont newFont = workbook.createFont();
        newFont.setBoldweight(font.getBoldweight());
        newFont.setCharSet(font.getCharSet());
        newFont.setColor(font.getColor());
        newFont.setFontName(font.getFontName());
        newFont.setFontHeight(font.getFontHeight());
        newFont.setItalic(font.getItalic());
        newFont.setStrikeout(font.getStrikeout());
        newFont.setTypeOffset(font.getTypeOffset());
        newFont.setUnderline(font.getUnderline());
        return newFont;
}


