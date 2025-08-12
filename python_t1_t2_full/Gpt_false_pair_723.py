def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


def processData(data) :
	lock = threading.Event()
	lock.acquire()
	try :
		print ('Do some stuff')
	finally :
		lock.release()

