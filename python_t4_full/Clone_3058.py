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


    q = Queue()
    [Process(target=f, args=(q,)).start() for f in [f1,f2]]
    while not q.empty():
        print(q.get())


 


def main():
    def f1(q):
        q.put([1, 2, 3])



