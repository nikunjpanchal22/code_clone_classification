def findError(result) :
	print (result)
	for k, v in result.iteritems() :
		error_nr = v % 2
		if error_nr == 0 :
			pass
		elif error_nr > 0 :
			yield MyException


def findError(input):
	print (result)
	for k, v in input.items():
		err_nr = v % 2
		if err_nr == 0:
			pass
		elif err_nr > 0:
			yield MyException
