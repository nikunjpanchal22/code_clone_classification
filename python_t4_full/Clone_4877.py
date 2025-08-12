def __exit__(self, et, ev, tb) :
	if self.level is not None :
		self.logger.setLevel(self.old_level)
	if self.handler :
		self.logger.removeHandler(self.handler)
	if self.handler and self.close :
		self.handler.close()




def __exit__(self, et, ev, tb):
    if getattr(self, 'level', None):
        self.logger.setLevel(getattr(self, 'old_level'))
    if getattr(self, 'handler', None):
        self.logger.removeHandler(getattr(self, 'handler'))
    if getattr(self, 'handler', None) and getattr(self, 'close', None):
        getattr(self, 'handler').close()


