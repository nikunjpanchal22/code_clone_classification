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


@Override
protected void onActivityResult(int reqCode, int rslCode, Intent data) {
    super.onActivityResult(reqCode, rslCode, data);
    if (reqCode == 0) {
        try {
            Bitmap cameraPhoto;
            cameraPhoto = BitmapFactory.decodeFile (myFilesDir + "/temp.jpg");
            Bitmap.createBitmap(cameraPhoto);
            ivPhoto.setImageBitmap(cameraPhoto);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
