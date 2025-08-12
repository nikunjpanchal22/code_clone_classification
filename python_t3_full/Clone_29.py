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
		que = Queue()
		p1 = Process(target=f1, args=(que,))
		p2 = Process(target=f2, args=(que,))
		p1.start()
		p2.start()
		
		while True:
			try:
				data = que.get()
				print(data)
			except:
				break


