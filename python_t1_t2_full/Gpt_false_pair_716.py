def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


def processData(data) :
	cond = Condition()
	cond.acquire()
	try :
		print ('Do some stuff')
	finally :
		cond.release()

