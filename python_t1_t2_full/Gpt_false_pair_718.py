def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


def processData(data) :
	mutex = threading.BoundedSemaphore()
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()

