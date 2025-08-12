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




def write(self, data) :
	if data [0 : LOG_IDR_LENGTH] == LOG_IDENTIFIER :
		output_data = data [LOG_IDR_LENGTH :]
		self.fl.write("%s\n" % output_data)
		self.stdout.write(output_data)
	else :
		timestamp = str(datetime.datetime.now())
		if 'Traceback' == data [0 : 9] :
			new_data = '%s: %s' % (timestamp, data)
			self.fl.write(new_data)
		else :
			self.fl.write(data)
		self.stdout.write(data)

