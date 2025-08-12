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
        read_in = self.queue.get()
        log_level = read_in[0]
        msg = read_in[1]
        if log_level is None:       
            self.log.info("Shutting down Central Logging process")
            break
        else:
            self.log.log(log_level, msg)


