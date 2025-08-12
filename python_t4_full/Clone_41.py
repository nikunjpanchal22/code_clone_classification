def main() :
	q = Queue()
	p1 = Process(target = f1, args = (q,))
	p1.start()
	p2 = Process(target = f2, args = (q,))
	p2.start()
	while True :
		try :
			print(q.get())
		except :
			break


 def main() :
    q = multiprocessing.Queue()
    p1 = multiprocessing.Process(target = f1, args = (q,))
    p2 = multiprocessing.Process(target = f2, args = (q,))
    p1.start()
    p2.start()
    finished = False
    while not finished:
        try :
            print(q.get())
        except :
            finished = True


