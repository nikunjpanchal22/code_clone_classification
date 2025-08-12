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


protected void onActivityResult (int reqCode, int resultCode, Intent data) {
    super.onActivityResult (reqCode, resultCode, data);
    if (reqCode == IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
        MySQLHelper sqlHelper = new MySQLHelper (this);
        Connection sqlConn = sqlHelper.getWritableConnection ();
        sqlConn.prepareStatement ("insert statement for inserting path to database").execute ();
        sqlConn.close ();
        sqlHelper.close ();
    }
}
