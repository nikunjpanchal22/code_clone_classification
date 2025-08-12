def wrapper(arg1) :
	result = func(arg1)
	for err in findError(result) :
		errors.append(err)
	print errors
	return result



 

def wrapper(arg1):
  result = func(arg1)
  print([errors.append(error) for error in findError(result)])
  return result


