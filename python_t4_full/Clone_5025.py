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




import threading
def run(self):
    self.process = threading.Thread(target=os.system, args=(self.cmd,))
    self.process.start()
    self.process.join(self.timeout)
    if self.process.is_alive():
        self.process._stop()
        self.timed_out = True
    else:
        self.timed_out = False


