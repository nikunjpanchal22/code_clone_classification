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
	ctr = 0
	while ctr < self.duration :
		try :
			if self.PossibleStoppingPoint() :
				raise InterruptedException
			time.sleep(1.0)
			self.JobProgress(count)
			ctr += 1
		except InterruptedException :
			print("canceled prematurely!")


