def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


def processData(data) :
	sem = Semaphore()
	sem.acquire()
	try :
		print ('Do some stuff')
	finally :
		sem.release()
