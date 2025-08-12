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




def run(self):
    self.proc = subprocess.Popen(self.cmd, stdout=self.outFile, stderr=self.errFile)
    while self.proc.poll() == None and self.timeout > 0:
        time.sleep(1)
        self.timeout -= 1
    if self.timeout <= 0 :
        self.proc.kill()
        self.timed_out = True


