def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


mutex = Semaphore(1)
def processData(data) :
    with mutex:
        print ('Do some stuff')




