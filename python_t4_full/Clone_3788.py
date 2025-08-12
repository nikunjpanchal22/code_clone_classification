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


        self.sig.strSig.emit(f"uploaded file: {name}\n")
        self.uploaded.append(name)
        self.fileNames = self.fileNames[1:]
        if not self.fileNames:
            self.sig.strSig.emit(f"files transmitted: {str(self.uploaded)}")
    else:
        time.sleep(1)



def run(self):
    while self.fileNames:
        print(self.fileNames)
        name = self.fileNames.pop(0)


