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
    if not logger.hasHandlers():
        logger.setLevel(logging.DEBUG)
        handler = logging.FileHandler('ProvisioningPython.log')
        logger.addHandler(handler)


