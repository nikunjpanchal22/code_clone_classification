private void transform (HSSFCell cellOld, XSSFCell cellNew) {
    cellNew.setCellComment (cellOld.getCellComment ());
    Integer hash = cellOld.getCellStyle ().hashCode ();
    if (! this.styleMap.containsKey (hash)) {
        this.transform (hash, cellOld.getCellStyle (), this.workbookNew.createCellStyle ());
    }
    cellNew.setCellStyle (this.styleMap.get (hash));
    switch (cellOld.getCellType ()) {
        case Cell.CELL_TYPE_BLANK :
            break;
        case Cell.CELL_TYPE_BOOLEAN :
            cellNew.setCellValue (cellOld.getBooleanCellValue ());
            break;
        case Cell.CELL_TYPE_ERROR :
            cellNew.setCellValue (cellOld.getErrorCellValue ());
            break;
        case Cell.CELL_TYPE_FORMULA :
            cellNew.setCellValue (cellOld.getCellFormula ());
            break;
        case Cell.CELL_TYPE_NUMERIC :
            cellNew.setCellValue (cellOld.getNumericCellValue ());
            break;
        case Cell.CELL_TYPE_STRING :
            cellNew.setCellValue (cellOld.getStringCellValue ());
            break;
        default :
            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());
    }
}


 private void convert(HSSFCell cellOld, XSSFCell cellNew) { 
	   Integer hash = cellOld.getCellStyle().hashCode(); 
	   if (!this.styleMap.containsKey(hash)){
		this.transform(hash, cellOld.getCellStyle(), this.workbookNew.createCellStyle()); 
	    }
	    cellNew.setCellStyle(this.styleMap.get(hash));
	    if (cellOld.getCellType() == Cell.CELL_TYPE_BLANK ){
		//do nothing
	    } else if (cellOld.getCellType() == Cell.CELL_TYPE_BOOLEAN ){
		cellNew.setCellValue(cellOld.getBooleanCellValue());
	    } else if (cellOld.getCellType() == Cell.CELL_TYPE_ERROR){
		cellNew.setCellValue(cellOld.getErrorCellValue());
	    } else if (cellOld.getCellType() == Cell.CELL_TYPE_FORMULA){
		cellNew.setCellValue(cellOld.getCellFormula());
	    } else if (cellOld.getCellType() == Cell.CELL_TYPE_NUMERIC){
		cellNew.setCellValue(cellOld.getNumericCellValue());
	    } else if (cellOld.getCellType() == Cell.CELL_TYPE_STRING){
		cellNew.setCellValue(cellOld.getStringCellValue());
	    } else {
		System.out.println("transform: Unknown cell type " + cellOld.getCellType());
	    }
	    cellNew.setCellComment(cellOld.getCellComment()); 
}


