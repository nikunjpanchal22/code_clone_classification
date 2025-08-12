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
		logName = 'ProvisioningPython'
		self.logger = logging.getLogger(logName)
		self.logger.setLevel(logging.DEBUG)
		today = datetime.datetime.now().strftime("%Y-%m-%d")
		handler = logging.FileHandler('%s%s.log' %(logName, today))
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		self.logger.addHandler(handler)
	return self.logger


