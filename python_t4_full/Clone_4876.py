def __exit__(self, et, ev, tb) :
	if self.level is not None :
		self.logger.setLevel(self.old_level)
	if self.handler :
		self.logger.removeHandler(self.handler)
	if self.handler and self.close :
		self.handler.close()


        self.logger.removeHandler(self.handler)
    if self.__dict__.get('handler', None) and self.__dict__.get('close', None):
        self.handler.close()




def __exit__(self, et, ev, tb):
    try:
        if self.level is not None:
            self.logger.setLevel(self.old_level)
    except AttributeError:
        pass
    try:
        if self.handler :
            self.logger.removeHandler(self.handler)
    except AttributeError:
        pass


