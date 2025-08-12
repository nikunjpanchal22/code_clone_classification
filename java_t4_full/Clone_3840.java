public void onRequestPermissionsResult (int requestCode,@NonNull
String [] permissions,@NonNull
int [] grantResults) {
    int index = (requestCode>> 16) & 0xffff;
    if (index != 0) {
        index --;
        String who = mPendingFragmentActivityResults.get (index);
        mPendingFragmentActivityResults.remove (index);
        if (who == null) {
            Log.w (TAG, "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment frag = mFragments.findFragmentByWho (who);
        if (frag == null) {
            Log.w (TAG, "Activity result no fragment exists for who: " + who);
        } else {
            frag.onRequestPermissionsResult (requestCode & 0xffff, permissions, grantResults);
        }
    }
}



public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case MY_PERMISSIONS_REQUEST_READ_CONTACTS: {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadContacts();
            } else {
                Toast.makeText(MainActivity.this, "Failed to get permission.", Toast.LENGTH_SHORT).show();
            }
            return;
        }
    }
}


