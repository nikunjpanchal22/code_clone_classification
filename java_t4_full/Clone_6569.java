public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    if (grantResults.length == 0 || grantResults == null) {
    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {
    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {
    }
}





public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == MY_PERMISSIONS_REQUEST) {
        for (int i = 0, len = permissions.length; i < len; i++) {
            String permission = permissions[i];

            if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
                // user rejected the permission
            } else {
                // user allowed the permission
            }
        }
    }
}


