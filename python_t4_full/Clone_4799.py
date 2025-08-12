def main() :
	cap = VideoCapture()
	shape = cap.get_size()
	shared_array_base = Array(ctypes.c_uint8, shape [0] * shape [1] * shape [2])
	frame = np.ctypeslib.as_array(shared_array_base.get_obj())
	frame = frame.reshape(shape [0], shape [1], shape [2])
	finished = Value('i', 0)
	video_process = Process(target = stream,
	args = (cap, shared_array_base, finished))
	video_process.start()
	time.sleep(2)



def main():
    video_capture = cv2.VideoCapture(0)
    width = int(video_capture.get(3))
    height = int(video_capture.get(4))
    frame_array = np.ctypeslib.as_ctypes(Array(ctypes.c_uint8, width * height * 3))
    frame = np.ctypeslib.as_array(frame_array.get_obj()).reshape(height, width, 3)
    finished = Value('i', 0)
    video_process = Process(target = stream, args = (video_capture, frame, finished))
    video_process.start()
    time.sleep(2)




