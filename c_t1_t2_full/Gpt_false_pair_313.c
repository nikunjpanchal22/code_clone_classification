int main () {
    CvCapture *capture;
    IplImage *frame;
    IplImage *tmp;
    capture = cvCreateCameraCapture (0);
    while (1) {
        if (capture) {
            frame = cvQueryFrame (capture);
        }
        if (frame) {
            CvSize size = cvSize (100, 100);
            tmp = cvCreateImage (size, IPL_DEPTH_8U, 3);
            cvResize (frame, tmp, CV_INTER_CUBIC);
            cvReleaseImage (& tmp);
        }
    }
    cvReleaseCapture (& capture);
}


	int main(){
    CvCapture *capture;
    IplImage *frame;
    IplImage *tmp;
    capture = cvCreateCameraCapture(0);
    while (1){
        frame = cvQueryFrame(capture);
        CvSize size = cvSize(100,100);
        tmp = cvCreateImage(size, IPL_DEPTH_8U, 3);
        cvResize(frame, tmp, CV_INTER_AREA);
        cvReleaseImage(&tmp);	
    }
    cvReleaseCapture(&capture);
}
