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
    cap = cv2.VideoCapture(0)
    size = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH)), int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT)), 3
    frame = np.ctypeslib.as_array(Array(ctypes.c_uint8, np.prod(size)).get_obj()).reshape(*size)
    finished = Value('i', 0)
    video_process = Process(target = stream, args = (cap, frame, finished))
    video_process.start()
    time.sleep(2)




