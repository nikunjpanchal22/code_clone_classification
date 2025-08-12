def run(self) :
	self.process = subprocess.Popen(self.cmd, stdout = self.outFile, stderr = self.errFile)
	while (self.process.poll() is None and self.timeout > 0) :
		time.sleep(1)
		self.timeout -= 1
	if not self.timeout > 0 :
		self.process.terminate()
		self.timed_out = True
	else :
		self.timed_out = False


 def run(self) :
	self.process = subprocess.Popen(self.cmd, stdout = self.outFile, stderr = self.errFile)
	cur = time.time()
	while (self.process.poll() is None and self.timeout > 0) :
		time.sleep(1)
		if (time.time() - cur) > self.timeout :
			self.process.terminate()
			self.timed_out = True
			break
	else :
		self.timed_out = False


