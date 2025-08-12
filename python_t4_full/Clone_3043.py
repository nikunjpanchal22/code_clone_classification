def write(self, data) :
	if data [0 : LOG_IDR_LENGTH] == LOG_IDENTIFIER :
		self.fl.write("%s\n" % data [LOG_IDR_LENGTH :])
		self.stdout.write(data [LOG_IDR_LENGTH :])
	else :
		timestamp = str(datetime.datetime.now())
		if 'Traceback' == data [0 : 9] :
			data = '%s: %s' % (timestamp, data)
			self.fl.write(data)
		else :
			self.fl.write(data)
		self.stdout.write(data)


def write(self, data):
    if LOG_IDENTIFIER == data[:LOG_IDR_LENGTH]:
        data = "%s\n" % data[LOG_IDR_LENGTH:]
    elif 'Traceback' == data[:9]:
        data = "%s: %s" % (str(datetime.datetime.now()), data)
    self.fl.write(data)
    self.stdout.write(data.strip())




