def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise




def __init__(self, input, output) :
	try :
		self.input = open(input, 'rb')
		self.output = open(output, 'wb')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise
