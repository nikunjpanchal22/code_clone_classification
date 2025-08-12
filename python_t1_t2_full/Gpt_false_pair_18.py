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
	q = Queue()
	f1_process = Process(target = f1, args = (q,))
	f2_process = Process(target = f2, args = (q,))
	f1_process.start()
	f2_process.start()
	while True :
		try :
			print(q.get())
		except :
			break
