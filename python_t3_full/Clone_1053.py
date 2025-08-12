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
        message_tuple = self.queue.get() 
        level = message_tuple[0]
        mess = message_tuple[1]
        if level == None: 
            self.log.info("Shutting down Central Logging process")
            break
        else: 
            self.log.log(level, mess)


