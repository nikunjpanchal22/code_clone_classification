def run(self) :
	while True :
		events = self.__poll.poll(self.__to)
		for fd, ev in events :
			if (ev & self.__evt) ! = self.__evt :
				continue
			try :
				self.__fds [fd].run()
			except Exception, e :
				print e






def run(self):
    while True:
        events = self.__poll.poll(self.__to)
        for fd, ev in events:
            if not (ev & self.__evt) != self.__evt:
                self.__fds[fd].run()


