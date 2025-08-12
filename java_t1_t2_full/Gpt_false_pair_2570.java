public void onRequestPermissionsResult (int requestCode, String [] permissions, int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    switch (requestCode) {
        case REQUEST_READ_PHONE_STATE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to get your phone state. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_ACCESS_FINE_LOCATION :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_WRITE_STORAGE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            }}
}


 public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case REQUEST_READ_PHONE_STATE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "We got the permissions, yay!", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "This application cannot work properly without the permission to access your phone state. Can you give it the permission?", Toast.LENGTH_LONG).show ();
                }
            } 
        case REQUEST_ACCESS_FINE_LOCATION :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted, nice!", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app needs permission to access your location to work properly. Please grant it the permission to do so.", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_WRITE_STORAGE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted, yippee!", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "This app needs writing access to your storage to work.Please consider granting it the permission to do so.", Toast.LENGTH_LONG).show ();
                }
            }}
}
