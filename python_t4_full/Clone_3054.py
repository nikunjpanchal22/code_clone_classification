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


  


def main():
    def f1(q):
        q.put(10)
        
    def f2(q):
        q.put(20)
    q = Queue()
    Process(target = f1, args = (q,)).start()
    Process(target = f2, args = (q,)).start()
    while not q.empty() :
        print(q.get())



