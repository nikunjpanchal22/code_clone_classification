def run(self) :
	while self.fileNames :
		print (self.fileNames)
		time.sleep(2)
		name = self.fileNames.pop(0)
		s = 'uploaded file: ' + name + '\n'
		print (s)
		self.sig.strSig.emit(s)
		self.uploaded.append(name)
		if len(self.fileNames) == 0 :
			self.sig.strSig.emit("files transmitted: %s" % str(self.uploaded))
	else :
		time.sleep(1)


 def run(self) :
    for aFile in self.fileNames:
        print (aFile)
        time.sleep(2)
        name = aFile
        message = 'uploaded file: ' + name + '\n'
        print (message)
        self.sig.strSig.emit(message)
        self.uploaded.append(name)
    if not self.fileNames:
        self.sig.strSig.emit("files transmitted: %s" % str(self.uploaded))


