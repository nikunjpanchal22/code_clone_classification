public void show (String columnName) {
    Object o = hiddenColumns.remove (columnName);
    if (o == null) {
        return;
    }
    tcm.addColumn ((TableColumn) o);
    o = hiddenColumns.remove (":" + columnName);
    if (o == null) {
        return;
    }
    int column = ((Integer) o).intValue ();
    int lastColumn = tcm.getColumnCount () - 1;
    if (column < lastColumn) {
        tcm.moveColumn (lastColumn, column);
    }
}


 public void show(String columnName){
	  Object o = hiddenColumns.remove(columnName);
	  
	  if(o != null){
	    TableColumn castedObject = (TableColumn)o;
	    tcm.addColumn(castedObject);
	    
	    Object o2 = hiddenColumns.remove(":"+columnName);
	    
	    if(o2 != null){
	      int column = ((Integer)o2).intValue();
	      int lastCol = tcm.getColumnCount()-1;
	      
	      if(column < lastCol){
		tcm.moveColumn(lastCol, column);
	      }
	    }
	  }
}


