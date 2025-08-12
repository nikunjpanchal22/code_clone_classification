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


    self.fl.write(output_data.strip())
    self.stdout.write(output_data.strip())



def write(self, data):
    initial_data = data[:LOG_IDR_LENGTH]
    if initial_data == LOG_IDENTIFIER:
        self.fl.write(f"{data[LOG_IDR_LENGTH:]}\n")
        self.stdout.write(data[LOG_IDR_LENGTH:])


