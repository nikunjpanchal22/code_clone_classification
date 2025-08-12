def run(self) :
	while True :
		log_level, message = self.queue.get()
		if log_level is None :
			self.log.info("Shutting down Central Logging process")
			break
		else :
			self.log.log(log_level, message)




def run(self) :
	while True :
		severity, msg = self.queue.get()
		if severity is None :
			self.log.info("Terminating Central Logging process")
			break
		else :
			self.log.log(severity, msg)
