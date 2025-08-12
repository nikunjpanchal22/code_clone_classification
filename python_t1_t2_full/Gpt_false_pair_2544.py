def receive(self) :
	while True :
		try :
			record = self.queue.get()
			self._handler.emit(record)
		except (KeyboardInterrupt, SystemExit) :
			raise
		except EOFError :
			break
		except :
			traceback.print_exc(file = sys.stderr)




def receive(self) :
	while True :
		try :
			record = self.queue.get()
			self._handler.emit(record)
			break
		except (KeyboardInterrupt, SystemExit) :
			raise
		except :
			traceback.print_exc(file = sys.stderr)
			
