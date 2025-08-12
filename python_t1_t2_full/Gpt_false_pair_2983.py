def f() :
	for key, val in measurements.items() :
		exec ('global {};{} = {}'.format(key, key, val))
	print ('tg: ', tg)
	vars = globals()
	for key in measurements.keys() :
		print ('Key: ', key, ', Value: ', vars [key])




def h() :
	for key, val in measurements.items() :
		exec ('global  %r;%r = %r' % (key, key, val))
	print ('tg: ', tg)
	vars = globals()
	for key in measurements.keys() :
		print ('Key: ', key, ', Value: ', vars[key])
