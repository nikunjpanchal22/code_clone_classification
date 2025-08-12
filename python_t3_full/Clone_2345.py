def __exit__(self, et, ev, tb) :
	if self.level is not None :
		self.logger.setLevel(self.old_level)
	if self.handler :
		self.logger.removeHandler(self.handler)
	if self.handler and self.close :
		self.handler.close()


def __exit__(self, et, ev, tb):
    if 'level' in self.__dict__ and self.level is not None:
        self.logger.setLevel(self.old_level)
    if 'handler' in self.__dict__ and self.handler:
        self.logger.removeHandler(self.handler)
    if 'handler' in self.__dict__ and 'close' in self.__dict__ and self.handler and self.close:
        self.handler.close()


