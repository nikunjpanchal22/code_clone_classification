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


		print("Task halted!")
	self.TaskComplete()




def Perform(self):
	self.start_time = time.time()
	self.StartJob(self.duration)
	try:
		for index in range(0, self.duration):
			time.sleep(1)
			self.JobOngoing(index)


