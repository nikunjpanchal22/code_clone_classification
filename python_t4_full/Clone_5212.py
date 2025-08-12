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
	pool = mp.Pool(mp.cpu_count())
	queue = mp.Manager().Queue()
	[pool.apply_async(worker, ((f1, f2), queue)) for f1, f2 in IT.product(os.listdir(files_dir), repeat = 2)]
	pool.close()
	pool.join()

 

def test_run(files_dir) :
	queue = mp.Queue()
	procs = [mp.Process(target = worker, args = [queue]) for i in mp.cpu_count()]


