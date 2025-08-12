private String getContactName (Context context, String number) {
    String name = null;
    String [] projection = new String [] {ContactsContract.PhoneLookup.DISPLAY_NAME, ContactsContract.PhoneLookup._ID};
    Uri contactUri = Uri.withAppendedPath (ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode (number));
    Cursor cursor = context.getContentResolver ().query (contactUri, projection, null, null, null);
    if (cursor != null) {
        if (cursor.moveToFirst ()) {
            name = cursor.getString (cursor.getColumnIndex (ContactsContract.PhoneLookup.DISPLAY_NAME));
            Log.v (TAG, "Started uploadcontactphoto: Contact Found @ " + number);
            Log.v (TAG, "Started uploadcontactphoto: Contact name  = " + name);
        } else {
            Log.v (TAG, "Contact Not Found @ " + number);
        }
        cursor.close ();
    }
    return name;
}





private String getPersonName(Context context, String number) {
    String personName = null;
    Uri lookupUri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(number));
    String[] projection = new String[]{ ContactsContract.PhoneLookup.DISPLAY_NAME };
    Cursor cur = context.getContentResolver().query(lookupUri, projection, null, null, null);
    try {
        if (cur.moveToFirst()) personName = cur.getString(0);
    } finally {
        if (cur != null) cur.close();
    }
    return personName;
}


