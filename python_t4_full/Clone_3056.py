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
        q.put({'Key': 'Value'})

    def f2(q):
        q.put({'OtherKey': 'OtherValue'})
    q = Queue()
    for f in [f1, f2]:
        Process(target=f, args=(q,)).start()
    


