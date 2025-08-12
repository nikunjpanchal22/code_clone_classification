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
    cap = cv2.VideoCapture('video.mp4')
    raw_data = Array(ctypes.c_float, cap.frame_width * cap.frame_height * 3)
    frame = raw_data.reshape(cap.frame_width, cap.frame_height, 3)
    finished = Value('i', 0)
    stream_process = Process(target = stream, args = (cap, frame, finished))
    stream_process.start()
    time.sleep(2)




