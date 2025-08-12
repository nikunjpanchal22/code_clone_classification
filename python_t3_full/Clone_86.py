def myLogger(self) :
	if None == self.logger :
		self.logger = logging.getLogger('ProvisioningPython')
		self.logger.setLevel(logging.DEBUG)
		now = datetime.datetime.now()
		handler = logging.FileHandler('ProvisioningPython' + now.strftime("%Y-%m-%d") + '.log')
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		self.logger.addHandler(handler)
	return self.logger


 def myLogger(self) :
	if self.logger is None:
		log_name = 'ProvisioningPython'
		self.logger = logging.getLogger(log_name)
		self.logger.setLevel(logging.DEBUG)
		timestamp = datetime.datetime.now().strftime("%Y-%m-%d")
		handler = logging.FileHandler('{}{}.log'.format(log_name, timestamp))
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		self.logger.addHandler(handler)
	return self.logger


