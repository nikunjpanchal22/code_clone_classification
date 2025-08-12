def processData(data) :
	mutex.acquire()
	try :
		print ('Do some stuff')
	finally :
		mutex.release()




from multiprocessing import Semaphore
mutex = Semaphore(1)
def processData(data) :
    mutex.acquire()
    try :
        print ('Do some stuff')
    finally :
        mutex.release()



import asyncio
mutex = asyncio.Lock()
async def processData(data) :
    async with mutex:
        print ('Do some stuff')



import aiohttp
mutex = aiohttp.Lock()


