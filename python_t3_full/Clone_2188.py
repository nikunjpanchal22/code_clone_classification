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





def execute(self):
	begin = time.process_time()
	self.JobStart(self.duration)
	try:
		for num in range(0, self.duration):
			time.sleep(1)
			self.JobUnderway(num)
			self.PossibleEnd()
	except KeyboardInterrupt:
		print("Operation stopped!")


