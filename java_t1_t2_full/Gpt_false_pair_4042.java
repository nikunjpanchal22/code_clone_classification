public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    if (grantResults.length == 0 || grantResults == null) {
    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {
    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {
    }
}


public void onRequestPermissionsResult (int reqCode, String[] perms, int[] res) {
    super.onRequestPermissionsResult (reqCode, perms, res);
    if (res.length == 0 || res == null) {
    } else if (res [0] == PackageManager.PERMISSION_GRANTED) {
    } else if (res [0] == PackageManager.PERMISSION_DENIED) {
    }
}
