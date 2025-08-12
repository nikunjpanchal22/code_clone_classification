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





public void onRequestPermissionsResult (int requestCode, String [] permissions, int [] grantResults) {
            super.onRequestPermissionsResult (requestCode, permissions, grantResults);
            switch (requestCode) {
                case REQUEST_PHOTO_ACCESS :
                    {
                        notifyAndRestart(grantResults, "access your Photos");
                    } break;
                case REQUEST_INTERNET :
                    {
                        notifyAndRestart(grantResults, "access the Internet");
                    } break;
                case REQUEST_LOCATION_SERVICES :
                    {
                        notifyAndRestart(grantResults, "access Location Services");
                    } break;
            }
        }

        public void notifyAndRestart(int[] grantResults, String permissionName){
            if (permissionIsGranted(grantResults)) {
                showToast(String.format("Permission to %s granted.", permissionName));
                finish();
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            } else {
                showToast(String.format("The app was not allowed to %s. Hence, it cannot function properly. Please consider granting it this permission.", permissionName));
            }
}


