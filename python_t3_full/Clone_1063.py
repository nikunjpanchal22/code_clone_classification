def emit(self, record):
    if record.exc_info:
        record.exc_text = self.formatException(record.exc_info)
        record.exc_info = None
    self.queue.put(record)


def emit(self, record):
    if record.exc_info:
        formatted_exc = self.formatException(record.exc_info)
        record.exc_text = formatted_exc
        record.exc_info = None
        self.queue.put(record)




