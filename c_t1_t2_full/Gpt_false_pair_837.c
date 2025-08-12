int main (int argc, char *argv []) {
    IplImage *img = cvLoadImage ("hello.jpg", CV_LOAD_IMAGE_COLOR);
    IplImage *img_data;
    img_data = cvCreateImage (cvGetSize (img), img->depth, img->nChannels);
    if (!img) {
        printf ("Image can NOT Load!!!\n");
        return 1;
    }
    cvNamedWindow ("myfirstwindow", CV_WINDOW_FREERATIO);
    cvShowImage ("myfirstwindow", img);
    printf ("Height: %d\nwidth: %d\nnchannels:%d\n", img -> height, img -> width, img -> nChannels);
    cvCvtColor (img, img_data, CV_RGB2XYZ);
    cvWaitKey (0);
    cvReleaseImage (& img);
    cvReleaseImage (& img_data);
    return 0;
}


 int main (int argc, char *argv[]) {
    IplImage *img = cvLoadImage ("hello.jpg", 1);
    IplImage *img_data;
    img_data = cvCreateImage(cvSize (img->width, img->height), img->depth, img->nChannels);
    if (!img) {
        printf ("Image can NOT Load!!!\n");
        return 1;
    }
    cvNamedWindow ("myfirstwindow", CV_WINDOW_AUTOSIZE);
    cvShowImage ("myfirstwindow", img);
    printf ("Height: %d\nwidth: %d\nnchannels:%d\n", img -> height, img -> width, img -> nChannels);
    cvCvtColor (img, img_data, CV_RGBA2GRAY);
    cvWaitKey (0);
    cvReleaseImage (& img);
    cvReleaseImage (& img_data);
    return 0;
}
