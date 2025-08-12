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
    queue_obj = multiprocessing.Queue()
    p1 = multiprocessing.Process(target=f1, args=(queue_obj,))
    p2 = multiprocessing.Process(target=f2, args=(queue_obj,))
    p1.start()
    p2.start()
    flag = False
    while not flag:
        try:
            print(queue_obj.get())
        except:
            flag = True


