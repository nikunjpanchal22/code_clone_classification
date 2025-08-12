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



private HSSFFont transform(HSSFWorkbook workbook, XSSFFont oldFont) {
         HSSFFont newFont = workbook.createFont();
         setBoldweight(newFont, oldFont);
         setCharSet(newFont, oldFont);
         setColor(newFont, oldFont);
         setFontName(newFont, oldFont);
         setFontHeight(newFont, oldFont);
         setItalic(newFont, oldFont);
         setStrikeout(newFont, oldFont);
         setTypeOffset(newFont, oldFont);
         setUnderline(newFont, oldFont);
         return newFont;
      }

      private <T extends Font> void setBoldweight(T newFont, T oldFont) {
         newFont.setBoldweight(oldFont.getBoldweight());
      }

      private <T extends Font> void setCharSet(T newFont, T oldFont) {
         newFont.setCharSet(oldFont.getCharSet());
      }

      private <T extends Font> void setColor(T newFont, T oldFont) {
         newFont.setColor(oldFont.getColor());
      }

      private <T extends Font> void setFontName(T newFont, T oldFont) {
         newFont.setFontName(oldFont.getFontName());
      }

      private <T extends Font> void setFontHeight(T newFont, T oldFont) {
         newFont.setFontHeight(oldFont.getFontHeight());
      }

      private <T extends Font> void setItalic(T newFont, T oldFont) {
         newFont.setItalic(oldFont.getItalic());
      }

      private <T extends Font> void setStrikeout(T newFont, T oldFont) {
         newFont.setStrikeout(oldFont.getStrikeout());
      }

      private <T extends Font> void setTypeOffset(T newFont, T oldFont) {
         newFont.setTypeOffset(oldFont.getTypeOffset());
      }

      private <T extends Font> void setUnderline(T newFont, T oldFont) {
         newFont.setUnderline(oldFont.getUnderline());
}

