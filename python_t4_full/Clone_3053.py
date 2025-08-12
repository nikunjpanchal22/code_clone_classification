def main() :
	q = Queue()
	p1 = Process(target = f1, args = (q,))
	p1.start()
	p2 = Process(target = f2, args = (q,))
	p2.start()
	while True :
		try :
			print q.get()
		except :
			break


        print(q.get())


 


def main():
    def f1(q):
        q.put(range(10))

    def f2(q):
        q.put(range(10,20))
    q = Queue()
    pool = Pool(processes=2)
    pool.apply_async(f1, (q,))
    pool.apply_async(f2, (q,))
    pool.close()
    pool.join()
    while not q.empty():
        print(q.get())


