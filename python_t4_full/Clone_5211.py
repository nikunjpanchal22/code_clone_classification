def test_run(files_dir) :
	queue = mp.Queue()
	procs = [mp.Process(target = worker, args = [queue]) for i in mp.cpu_count()]
	for p in procs :
		p.start()
	files = os.listdir(files_dir)
	for f1, f2 in IT.product(files, repeat = 2) :
		queue.put((f1, f2))
	for p in procs :
		queue.put(SENTINEL)
	for p in procs :
		p.join()


def test_run(files_dir) :
	with concurrent.futures.ProcessPoolExecutor() as executor:
		files = os.listdir(files_dir)
		results = list(executor.map(worker, IT.product(files, repeat = 2)))

 



