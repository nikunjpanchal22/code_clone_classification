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
	queue = Queue()
	process1 = Process(target=f1, args=(queue,))
	process2 = Process(target=f2, args=(queue,))
	process1.start()
	process2.start()
	while True:
		try:
			print(queue.get())
		except:
			break		
