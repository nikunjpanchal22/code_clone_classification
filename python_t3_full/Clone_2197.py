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



 


def run(self) :
        self.queue = queue.Queue()
        self._handler = handler
        self.listener = threading.Thread(target=self.run)
        self.listener.start()
        while True :
            try :
                record = self.queue.get()
                self._handler.emit(record)
            except (KeyboardInterrupt,SystemExit) :
                raise
            except EOFError :
                break


