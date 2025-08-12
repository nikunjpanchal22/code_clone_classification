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


 def main():
	messaging_queue = Queue()
	f1_process = Process(target = f1, args = (messaging_queue,))
	f2_process = Process(target = f2, args = (messaging_queue,))
	f1_process.start()
	f2_process.start()
	finished = False
	while not finished:
		try :
			print(messaging_queue.get())
		except :
			finished = True		


