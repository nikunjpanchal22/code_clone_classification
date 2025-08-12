protected void onActivityResult (int requestCode, int resultCode, Intent data) {
    super.onActivityResult (requestCode, resultCode, data);
    if (requestCode == 0) {
        try {
            Bitmap cameraBitmap;
            cameraBitmap = BitmapFactory.decodeFile (myFilesDir + "/temp.jpg");
            Bitmap.createBitmap (cameraBitmap);
            ivPhoto.setImageBitmap (cameraBitmap);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}


 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            try {
                Bitmap cameraBitmap;
                cameraBitmap = BitmapFactory.decodeFile(myFilesDir + "/temp.jpg");
                Bitmap resizedBitmap = Bitmap.createScaledBitmap(cameraBitmap, 800, 600, 
                  false);
                ivPhoto.setImageBitmap(resizedBitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
