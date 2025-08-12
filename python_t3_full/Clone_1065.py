def emit(self, record):
    if record.exc_info:
        record.exc_text = self.formatException(record.exc_info)
        record.exc_info = None
    self.queue.put(record)


def emit(self, record):
    if record.exc_info:
        temp_text = self.formatException(record.exc_info)
        record.exc_text, record.exc_info = temp_text, None
        self.queue.put(record)




