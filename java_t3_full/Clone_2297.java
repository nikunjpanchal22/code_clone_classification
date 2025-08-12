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
public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == SIGN_IN_REQUEST && resultCode == RESULT_OK) {
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL("UPDATE users SET signed_in = TRUE");
        db.close();
        dbHelper.close();
    }
}


