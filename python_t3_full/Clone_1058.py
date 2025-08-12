def run(self) :
	while True :
		log_level, message = self.queue.get()
		if log_level is None :
			self.log.info("Shutting down Central Logging process")
			break
		else :
			self.log.log(log_level, message)


 def run(self) :
    while True:
        log_level, message = self.queue.get()
        if log_level is not None:
            self.log.log(log_level, message)
        else:
            self.log.info("Shutting down Central Logging process")
            break


