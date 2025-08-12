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



import os 
def run(self):
    self.process = os.system(self.cmd)
    while self.process and self.timeout > 0:
        time.sleep(1)
        self.timeout -= 1
    if self.timeout <= 0:
        os.kill(self.process.pid, signal.SIGTERM)
        self.timed_out = True
    else:
        self.timed_out = False



