def test2() :
	import json
	import time
	time_start = time.time()
	with open('data.csv', 'rb') as f :
		data = f.read()
	data = '[[[' + ']],[['.join(data.splitlines()).replace('\t', '],[') + ']]]'
	all_point_sets = [Point(* xy) for row in json.loads(data) for xy in zip(* row)]
	time_end = time.time()
	print "total time: ", (time_end - time_start)






def test2():
	import numpy as np
	import time
	
	start_time = time.time()
	data = np.loadtxt('data.csv', delimiter=',')


