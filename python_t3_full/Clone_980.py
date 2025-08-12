def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise


 def __init__(self, input, output) :
  try:
    # open the input file and set it to self.input
    with open(input, 'r') as self.input:
      # open the output file and set it to self.output
      with open(output, 'w') as self.output:
        pass
  except BaseException as exc:
    self.__exit___(type(exc), exc, exc.__traceback__)
    raise


