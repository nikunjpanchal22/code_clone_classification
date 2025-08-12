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


        print(text)
        self.sig.strSig.emit(text)
        if not self.fileNames:
            self.sig.strSig.emit("files transmitted: {}".format(self.uploaded))
    time.sleep(1)



def run(self):
    while self.fileNames:
        print (self.fileNames)
        name = self.fileNames[0]
        self.fileNames = self.fileNames[1:]
        s = 'uploaded file: ' + name + '\n'
        print (s)


