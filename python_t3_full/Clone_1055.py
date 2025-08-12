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
        get_data = self.queue.get()
        lv = get_data[0]
        msg = get_data[1]
        if lv is None: 
            self.log.info("Shutting down Central Logging process")
            break
        else:
            self.log.log(lv, msg)


