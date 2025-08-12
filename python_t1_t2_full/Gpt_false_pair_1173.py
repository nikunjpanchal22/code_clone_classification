def Run(self) :
	self.time0 = time.clock()
	self.JobBeginning(self.duration)
	try :
		for count in range(0, self.duration) :
			time.sleep(1.0)
			self.JobProgress(count)
			self.PossibleStoppingPoint()
	except InterruptedException :
		print("canceled prematurely!")
	self.JobFinished()



 def Run(self) :
	self.time0 = time.clock()
	self.JobBeginning(self.duration)
        try :
		for count in range(0, self.duration) :
			time.sleep(1.0)
			if self.PossibleStoppingPoint() :
				raise InterruptedException
			self.JobProgress(count)
	except InterruptedException :
		print("canceled prematurely!")
