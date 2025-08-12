def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


mutex = threading.Lock()
def processData(data) :
    with mutex:
        print ('Do some stuff')




