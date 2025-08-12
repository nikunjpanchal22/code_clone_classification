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
	fin_time = time.time() + self.timeout
	while (self.process.poll() is None and time.time() < fin_time) :
		time.sleep(1)
	if fin_time <= time.time() :
		self.process.terminate()
		self.timed_out = True
	else :
		self.timed_out = False


