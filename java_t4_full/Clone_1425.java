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
	  Object removedObject = hiddenColumns.remove(columnName);
	  
	  if(removedObject != null){
	    TableColumn castRemovedObject = (TableColumn)removedObject;
	    tcm.addColumn(castRemovedObject);
	    
	    Object removedObject2 = hiddenColumns.remove(":"+ columnName);
	    if(removedObject2 != null){
	      int column = ((Integer)removedObject2).intValue();
	      int lastColumn = tcm.getColumnCount() - 1;
	      
	      if(column < lastColumn){
		tcm.moveColumn(lastColumn, column);
	      }
	    }
	  }
  
}


