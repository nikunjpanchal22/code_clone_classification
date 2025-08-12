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
    cap = cv2.VideoCapture('test.mp4')
    shape = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH)), int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
    frame = Array(ctypes.c_ubyte, shape[0] * shape[1] * 3)
    frame = np.ctypeslib.as_array(frame.get_obj()).reshape(shape)
    finished = Value('i', 0)
    stream_process = Process(target = stream, args = (cap, frame, finished))
    stream_process.start()
    time.sleep(2)




