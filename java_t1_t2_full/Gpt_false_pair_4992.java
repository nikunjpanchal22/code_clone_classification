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


public void onRequestPermissionsResult (int requestCode,@NonNull
String [] permissions,@NonNull
int [] grantResults) {
    int index = (requestCode>> 16) & 0xffff;
    if (index != 0) {
        index --;
        String key = mPendingFragmentActivityResults.get (index);
        mPendingFragmentActivityResults.remove (index);
        if (key == null) {
            Log.w (TAG, "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment frag = mFragments.findFragmentByKey (key);
        if (frag == null) {
            Log.w (TAG, "Activity result no fragment exists for key: " + key);
        } else {
            frag.onRequestPermissionsResult (requestCode & 0xffff, permissions, grantResults);
        }
    }
}
