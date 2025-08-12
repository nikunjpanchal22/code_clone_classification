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
protected void onActivityResult(int requestCode, int resultCode, Intent data){
    super.onActivityResult(requestCode, resultCode, data);
    if(requestCode == CAPTURE_PHOTO){
        try {
            Bitmap bitmapPhoto = BitmapFactory.decodeFile(photoDir+"photo.jpg");
            imgPhoto.setImageBitmap(bitmapPhoto);
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}


