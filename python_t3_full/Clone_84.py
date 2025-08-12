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
		self.date = datetime.datetime.now().strftime("%Y-%m-%d")
		log_name = 'ProvisioningPython{}'.format(self.date)
		self.logger = logging.getLogger(log_name)
		self.logger.setLevel(logging.DEBUG)
		handler = logging.FileHandler('{}{}.log'.format(log_name, self.date))
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		self.logger.addHandler(handler)
	return self.logger


