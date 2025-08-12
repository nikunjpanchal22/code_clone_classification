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
         return applyFontProperties(workbook.createFont(), font);
      }

      private HSSFFont applyFontProperties(HSSFFont newFont, XSSFFont oldFont) {
         newFont.setBoldweight(oldFont.getBoldweight());
         newFont.setCharSet(oldFont.getCharSet());
         newFont.setColor(oldFont.getColor());
         newFont.setFontName(oldFont.getFontName());
         newFont.setFontHeight(oldFont.getFontHeight());
         newFont.setItalic(oldFont.getItalic());
         newFont.setStrikeout(oldFont.getStrikeout());
         newFont.setTypeOffset(oldFont.getTypeOffset());
         newFont.setUnderline(oldFont.getUnderline());
         return newFont;
}


