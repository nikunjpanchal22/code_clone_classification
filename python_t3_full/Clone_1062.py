def emit(self, record):
    if record.exc_info:
        record.exc_text = self.formatException(record.exc_info)
        record.exc_info = None
    self.queue.put(record)


def emit(self, record):
    if record.exc_info:
        try:
            record.exc_text = self.formatException(record.exc_info)
            record.exc_info = None
            self.queue.put(record)
        except:
            print("Error attempting to emit record")




