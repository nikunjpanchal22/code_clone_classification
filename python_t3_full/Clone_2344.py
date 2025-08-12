def __exit__(self, et, ev, tb) :
	if self.level is not None :
		self.logger.setLevel(self.old_level)
	if self.handler :
		self.logger.removeHandler(self.handler)
	if self.handler and self.close :
		self.handler.close()


        self.handler.close()




def __exit__(self, *args):
    if self.level is not None:
        self.logger.setLevel(self.old_level)
    if self.handler:
        self.logger.removeHandler(self.handler)
    if self.handler and self.close:
        self.handler.close()




 def __exit__(self, et, ev, tb):
    if self.__dict__.get('level', None) is not None:
        self.logger.setLevel(self.old_level)


