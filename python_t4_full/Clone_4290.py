def run(self) :
	while True :
		log_level, message = self.queue.get()
		if log_level is None :
			self.log.info("Shutting down Central Logging process")
			break
		else :
			self.log.log(log_level, message)


def run(self):
    while True:
        if self.queue.qsize() != 0:
            log_level, message = self.queue.get()
            self.log.log(log_level, message)
        else:
            self.log.info("Shutting down Central Logging process")


