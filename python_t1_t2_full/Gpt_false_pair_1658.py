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
	while True :
		glutmainloop()
		
#====================
#gpt output=============


  def main():
    cap = VideoCapture()
    shape = cap.get_size()
    shared_array_base = Array(ctypes.c_uint8, shape[0] * shape[1] * shape[2])
    frame = np.ctypeslib.as_array(shared_array_base.get_obj())
    frame = frame.reshape(shape[0], shape[1], shape[2])
    finished = Value('i', 0)
    video_process = Process(target=stream,
                            args=(cap, shared_array_base, finished))
    video_process.start()
    while True:
        if finished.value == 0:
            glutmainloop()
        else:
            break
