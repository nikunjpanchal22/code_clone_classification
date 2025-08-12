def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()




def processData(data) :
	try :
		mutex.acquire()
		print ('Do some stuff')
	finally :
		mutex.release()
