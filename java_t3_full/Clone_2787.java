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
protected void onActivityResult(int req_code, int res_code, Intent data){
    super.onActivityResult(req_code, res_code, data);
    if (req_code == TAKE_PICTURE){
        try {
            Bitmap picture = BitmapFactory.decodeFile(dirPath+"pic.jpg");
            imgPreview.setImageBitmap(picture);
        } catch (Exception e){
            e.getMessage();
        }
    }
}


