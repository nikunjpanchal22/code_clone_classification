def emit(self, record) :
	if record.exc_info :
		record.exc_text = self.formatException(record.exc_info)
		record.exc_info = None
	self.queue.put(record)




def emit(self, record):
    if getattr(record, 'exc_info', None):
        setattr(record, 'exc_text', self.formatException(getattr(record, 'exc_info')))
        delattr(record, 'exc_info')
    self.queue.put(record)



