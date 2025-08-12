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



 

from multiprocessing import Process, Queue



def main():
    def f1(q):
        for i in range(10):
            q.put(i)

    def f2(q):
        for i in range(10,20):
            q.put(i)
    q = Queue()
    processes = [Process(target=f, args=(q,)) for f in [f1,f2]]


