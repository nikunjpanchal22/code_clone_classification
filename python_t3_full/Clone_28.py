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
	msq = Queue()
	process_a = Process(target = f1, args = (msq,))
	process_b = Process(target = f2, args = (msq,))
	process_a.start()
	process_b.start()
	while True :
		try :
			data = msq.get()
			print("Printing the data from the queue : ", data)
		except :
			break			


