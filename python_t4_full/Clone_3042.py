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
    if data.startswith(LOG_IDENTIFIER):
        output = data[LOG_IDR_LENGTH:] + "\n"
        self.fl.write(output)
        self.stdout.write(output.strip())
    else:
        if data.startswith('Traceback'):
            data = f"{datetime.datetime.now()}: {data}"


