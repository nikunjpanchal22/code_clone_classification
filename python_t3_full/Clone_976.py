def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # create a file handler
    fh = open(input, 'r')
    # store the file handler in self.input
    self.input = fh
    # create another file handler
    fh2 = open(output, 'w')
    # store the file handler in self.output
    self.output = fh2
  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise


