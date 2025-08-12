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




def run(self) :
	while True :
		eventInput = self.__poll.poll(self.__to)
		for desc, evnt in eventInput :
			if (evnt & self.__evt) != self.__evt :
				continue
			try :
				self.__fds [desc].run()
			except Exception, err :
				print err
