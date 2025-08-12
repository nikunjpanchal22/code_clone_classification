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





@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == ALARM_SET && resultCode == RESULT_OK ) {
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL("INSERT INTO alarms VALUES ('"+alarmTime+"')");
        db.close();
        dbHelper.close();
    }
}


