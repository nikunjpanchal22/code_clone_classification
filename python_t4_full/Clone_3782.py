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




def run(self):
    for file in self.fileNames:
        print(self.fileNames)
        time.sleep(2)
        s = f'uploaded file: {file}\n'
        print(s)
        self.sig.strSig.emit(s)
        self.uploaded.append(file)
        self.fileNames.remove(file)
        if not self.fileNames:
            self.sig.strSig.emit(f"files transmitted: {str(self.uploaded)}")


