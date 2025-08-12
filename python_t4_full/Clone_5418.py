def findError(result) :
	print result
	for k, v in result.iteritems() :
		error_nr = v % 2
		if error_nr == 0 :
			pass
		elif error_nr > 0 :
			yield MyException



def findError(result):
    print(result)
    for k, v in result.items():
        error_nr = v % 2


