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
        level, msg = self.queue.get() 
        if not level:
            self.log.info("Shutting down Central Logging process")
            break
        else:
            self.log.log(level, msg)
