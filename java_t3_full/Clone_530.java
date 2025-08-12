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
        startCameraCapture();
    } else {
        Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show();
    }
}


