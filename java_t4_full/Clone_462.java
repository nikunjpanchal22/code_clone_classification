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
        openCamera();
    } else {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission Required");
        builder.setMessage("Camera permission has been denied. Would you like to open app settings to grant the permission?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                        Uri uri = Uri.fromParts("package", getPackageName(), null);
                        intent.setData(uri);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}


