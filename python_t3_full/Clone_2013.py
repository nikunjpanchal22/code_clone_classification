def main() :
	q = queue.Queue()
	threads = [threading.Thread(target = func, args = (i, q)) for i in range(5)]
	for th in threads :
		th.daemon = True
		th.start()
	result1 = q.get()
	result2 = q.get()
	print ("Second result: {}".format(result2))


    result2 = q.get()
    print ("Second result: {}".format(result2))



import queue
import threading



def main() :
    def func(n, q):
        q.put(n**0.5)
    q = queue.Queue()
    threads = [threading.Thread(target = func, args = (i, q)) for i in range(5)]
    for th in threads :
        th.daemon = True


