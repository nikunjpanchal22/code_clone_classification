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
    width, height = cap.get(cv2.CAP_PROP_FRAME_WIDTH), cap.get(cv2.CAP_PROP_FRAME_HEIGHT)
    buffer = Array(ctypes.c_uint8, int(width * height * 3))
    frame = np.frombuffer(buffer.get_obj(), dtype=np.uint8).reshape(int(height), int(width), 3)
    finished = Value('i', 0)
    video_process = Process(target = stream, args = (cap, buffer, finished))
    video_process.start()
    time.sleep(2)




