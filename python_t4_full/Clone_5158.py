def f() :
	for key, val in measurements.items() :
		exec ('global {};{} = {}'.format(key, key, val))
	print ('tg: ', tg)
	vars = globals()
	for key in measurements.keys() :
		print ('Key: ', key, ', Value: ', vars [key])




def f() :
    vars().update(measurements)
    for k, v in vars().items() :
        if k in measurements: print (f'Key: {k}, Value: {v}')


