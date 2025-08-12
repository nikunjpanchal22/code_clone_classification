def wrapper(arg1) :
	result = func(arg1)
	for err in findError(result) :
		errors.append(err)
	print errors
	return result



def wrapper(arg1):
    result = func(arg1)
    errors.clear()
    [errors.append(err) for err in findError(result) if err not in errors]
    print(errors)


