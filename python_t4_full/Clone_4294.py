def emit(self, record) :
	if record.exc_info :
		record.exc_text = self.formatException(record.exc_info)
		record.exc_info = None
	self.queue.put(record)




 

def emit(self, record):
    exc_info = record.exc_info if 'exc_info' in dir(record) else None
    if exc_info:
        record.exc_text = self.formatException(exc_info)


