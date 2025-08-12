protected void onActivityResult (int requestCode, int resultCode, Intent data) {
    super.onActivityResult (requestCode, resultCode, data);
    if (requestCode == IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
        DBHelper dbHelper = new DBHelper (this);
        SQLiteDatabase sql = dbHelper.getWritableDatabase ();
        sql.execSQL ("insert statement for inserting path to database");
        sql.close ();
        dbHelper.close ();
    }
}


  protected void onActivityResult (int requestCode, int resultCode, Intent data) { 
    super.onActivityResult (requestCode, resultCode, data);
    if (requestCode == IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
        DataBaseHelper dbHelper = new DataBaseHelper (this);
        SQLiteDatabase db = dbHelper.getWritableDatabase ();
        ContentValues values = new ContentValues(); 
        values.put("path", data.getData().toString()); 
        long newRowId = db.insert("table_name", null, values);
        dbHelper.close ();
    }
}


