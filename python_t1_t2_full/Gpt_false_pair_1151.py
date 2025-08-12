def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # create a file handler and store it in self.input
    self.input = open(input, 'r')

    # create a file handler and store it in self.output
    self.output = open(output, 'w')

  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise
