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
	if not self.logger:
		self.logger = logging.getLogger('ProvisioningPython' + datetime.datetime.now().strftime("%Y-%m-%d"))
		self.logger.setLevel(logging.DEBUG)
		handler = logging.FileHandler('ProvisioningPython' + datetime.datetime.now().strftime("%Y-%m-%d") + '.log')
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		self.logger.addHandler(handler)
	return self.logger


