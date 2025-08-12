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
    if (requestCode == REQUEST_CODE_CAMERA && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        startCameraView();
    }  else {
        Notifications.makeToast(this,
                "Camera permission was denied, please open Settings to grant the permission.", Toast.LENGTH_SHORT);
    }
}


