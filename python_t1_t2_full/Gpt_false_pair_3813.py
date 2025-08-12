def myLogger(self) :
	logger = logging.getLogger('ProvisioningPython')
	if not len(logger.handlers) :
		logger.setLevel(logging.DEBUG)
		now = datetime.datetime.now()
		handler = logging.FileHandler('/root/credentials/Logs/ProvisioningPython' + now.strftime("%Y-%m-%d") + '.log')
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		logger.addHandler(handler)
		return logger




def myLogger(self) :
	logger = logging.getLogger('ProvisioningPython')
	if not len(logger.handlers) :
		now = datetime.datetime.now()
		handler = logging.FileHandler('/root/credentials/Logs/ProvisioningPython' + now.strftime("%Y-%m-%d") + '.log')
		logger.setLevel(logging.DEBUG)
		formatter = logging.Formatter('%(asctime)s %(levelname)s %(message)s')
		handler.setFormatter(formatter)
		logger.addHandler(handler)
		return logger
