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


        handler = logging.handlers.RotatingFileHandler("ProvisioningPython.txt", maxBytes=2000, backupCount=5)
        logger.addHandler(handler)
    return logger




def myLogger(self) :
    logger = logging.getLogger('')
    if not logger.handlers :
        logger.setLevel(logging.INFO)
        ch = logging.StreamHandler()


