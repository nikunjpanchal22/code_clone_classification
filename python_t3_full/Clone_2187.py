def Run(self) :
	self.time0 = time.clock()
	self.JobBeginning(self.duration)
	try :
		for count in range(0, self.duration) :
			time.sleep(1.0)
			self.JobProgress(count)
			self.PossibleStoppingPoint()
	except InterruptedException :
		print "canceled prematurely!"
	self.JobFinished()




def Run(self):
	start = time.time()
	self.onStart(self.duration)
	try:
		for cnt in range(0, self.duration):
			time.sleep(1)
			self.onProgress(cnt)
			self.checkStop()
	except KeyboardInterrupt:
		print("process stopped early!")
	self.onEnd()


