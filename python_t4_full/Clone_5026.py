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


            self.process.kill()
        self.timed_out = not self.timeout > 0




def run(self):
    with subprocess.Popen(self.cmd, stdout=self.outFile, stderr=self.errFile) as self.process:
        try:
            self.process.wait(timeout=self.timeout)


