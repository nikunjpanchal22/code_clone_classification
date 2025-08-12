def main() :
	q = queue.Queue()
	threads = [threading.Thread(target = func, args = (i, q)) for i in range(5)]
	for th in threads :
		th.daemon = True
		th.start()
	result1 = q.get()
	result2 = q.get()
	print ("Second result: {}".format(result2))


    print ("Second result: {}".format(result2))



import queue
import threading



def main() :
    def func(n, q):
        q.put(10*n)
    q = queue.Queue()
    threads = [threading.Thread(target = func, args = (i, q)) for i in range(5)]
    for th in threads :
        th.daemon = True
        th.start()


