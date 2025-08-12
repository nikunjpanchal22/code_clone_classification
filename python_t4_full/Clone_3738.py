def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()


from gevent.lock import BoundedSemaphore
mutex = BoundedSemaphore(1)
def processData(data) :
    with mutex:
        print ('Do some stuff')



from twisted.internet import defer
mutex = defer.DeferredLock()
def processData(data) :
    lock = mutex.acquire()


