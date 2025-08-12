def __enter__(self) :
	if self.level is not None :
		self.old_level = self.logger.level
		self.logger.setLevel(self.level)
	if self.handler :
		self.logger.addHandler(self.handler)


#gpt output=============
 def __enter__(self) :
    if self.level is not None:
       if self.handler is None:
           self.old_level = self.logger.level
           self.logger.setLevel(self.level)
       else:
           self.logger.addHandler(self.handler)
           self.old_level = self.logger.level


