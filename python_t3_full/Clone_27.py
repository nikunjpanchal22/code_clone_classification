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
	q_obj = Queue()
	p1_process = Process(target = f1, args = (q_obj,))
	p2_process = Process(target = f2, args = (q_obj,))
	p1_process.start()
	p2_process.start()
	while q_obj.empty() is not True :
		try :
			message = q_obj.get()
			print(message)
		except :
			break


