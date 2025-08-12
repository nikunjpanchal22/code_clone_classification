def __enter__(self) :
	if self.level is not None :
		self.old_level = self.logger.level
		self.logger.setLevel(self.level)
	if self.handler :
		self.logger.addHandler(self.handler)




def __enter__(self) :
	if self.level is not None :
		self.old_level = self.logger.getLevel()
		self.logger.setLevel(self.level)
	if self.handler :
		self.logger.addHandler(self.handler)
