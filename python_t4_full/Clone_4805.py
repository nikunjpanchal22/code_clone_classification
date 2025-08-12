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
    width = cap.get(3)
    height = cap.get(4)
    frame_buffer = Array(ctypes.c_uint8, int(width * height * 3))
    frame = np.ctypeslib.as_array(frame_buffer.get_obj()).reshape(int(height), int(width), 3)
    finished = Value('i', 0)
    process = Process(target = stream, args = (cap, frame, finished))
    process.start()


