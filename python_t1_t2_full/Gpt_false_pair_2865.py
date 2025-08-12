def emit(self, record) :
	if record.exc_info :
		record.exc_text = self.formatException(record.exc_info)
		record.exc_info = None
	self.queue.put(record)




def emit(self, record) :
	if record.exc_info :
		record_copy = record
		record_copy.exc_text = self.formatException(record.exc_info)
		record_copy.exc_info = None
		self.queue.put(record_copy)
