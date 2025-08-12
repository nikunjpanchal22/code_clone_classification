def f() :
	for key, val in measurements.items() :
		exec ('global {};{} = {}'.format(key, key, val))
	print ('tg: ', tg)
	vars = globals()
	for key in measurements.keys() :
		print ('Key: ', key, ', Value: ', vars [key])


def f() :
    for key, val in measurements.items() :
        exec (f'global {key};{key} = {val}')
    for key in measurements :
        print (f'Key: {key}, Value: {globals()[key]}')


