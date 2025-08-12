def run(self) :
	try :
		self.run2()
	finally :
		self.cleanup()




def run(self) :
	try :
		self.run2()
	except Exception as e :
		self.cleanup()
