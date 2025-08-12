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
	message_queue = Queue()
	f1_process = Process(target = f1, args = (message_queue,))
	f2_process = Process(target = f2, args = (message_queue,))
	f1_process.start()
	f2_process.start()
	while not message_queue.empty() :
		try : 
			message = message_queue.get()
			print(message)
		except : 
			break


