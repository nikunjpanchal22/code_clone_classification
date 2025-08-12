def __init__(self, input, output) :
	try :
		self.input = open(input, 'r')
		self.output = open(output, 'w')
	except BaseException as exc :
		self.__exit___(type(exc), exc, exc.__traceback__)
		raise



from pathlib import Path

def __init__(self, input, output):
    try:
        self.input = open(Path(input), 'r')
        self.output = open(Path(output), 'w')
    except BaseException as exc:
        self.__exit__(type(exc), exc, exc.__traceback__)


