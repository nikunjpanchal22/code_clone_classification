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


	self.taskEnd()




def Go(self):
	self.init_time = time.process_time()
	self.BeginTask(self.duration)
	try:
		for i in range(0, self.duration):
			time.sleep(1)
			self.TaskOngoing(i)
			self.StopCheck()


