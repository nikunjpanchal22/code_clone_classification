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






def myLogger(self):
    if self.logger is None:
        self.logger = logging.getLogger('ProvisioningPython')
        self.logger.setLevel(logging.ERROR)
        handler = logging.StreamHandler(sys.stdout)
        formatter = logging.Formatter('%(levelname)s: %(message)s')
        handler.setFormatter(formatter)


