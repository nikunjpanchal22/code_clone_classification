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
	queue = Queue()
	process_one = Process(target = f1, args = (queue,))
	process_two = Process(target = f2, args = (queue,))
	process_one.start()
	process_two.start()
	while True :
		try :
			data = queue.get()
			print(data)
		except :
			break


