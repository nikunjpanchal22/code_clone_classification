public void onRequestPermissionsResult (int requestCode,@NonNull
String [] permissions,@NonNull
int [] grantResults) {
    if (requestCode == mRequestCode) {
        if (grantResults.length > 0) {
            for (int grantResult : grantResults) {
                if (grantResult != PackageManager.PERMISSION_GRANTED) {
                    mRequestPermissionListener.onFailed ();
                    return;
                }
            }
            mRequestPermissionListener.onSuccess ();
        } else {
            mRequestPermissionListener.onFailed ();
        }
    }
}



public void onRequestPermissionsResult (int requestCode,@NonNull String [] permissions,@NonNull int [] grantResults){
    if (requestCode == mRequestCode) {
        if (grantResults.length > 0 && Arrays.stream(grantResults).noneMatch(result -> result != PackageManager.PERMISSION_GRANTED)){
            mRequestPermissionListener.onSuccess();
        } else {
            mRequestPermissionListener.onFailed();
        }
    }
}


