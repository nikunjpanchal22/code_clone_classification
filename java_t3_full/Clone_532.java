public void onRequestPermissionsResult (int requestCode,@NonNull
String [] permissions,@NonNull
int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    if (requestCode == REQUEST_CODE_CAMERA && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
    } else {
    }
}


 public void onRequestPermissionsResult (int requestCode,@NonNull
String [] permissions,@NonNull
int [] grantResults) {
    if (requestCode == REQUEST_CODE_CAMERA && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
        getSharedPreferences("PREFS",MODE_PRIVATE).edit().putBoolean("camera_enabled",true).apply();
    } else {
        Snackbar.make(findViewById(R.id.mainLayout),"Camera permission denied",Snackbar.LENGTH_SHORT).show();
    }
}


