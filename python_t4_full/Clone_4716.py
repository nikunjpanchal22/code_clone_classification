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
	import csv
	import time
	from collections import namedtuple
	
	Point = namedtuple('Point', ['x', 'y'])
	start = time.time()
	with open('data.csv') as f:
		reader = csv.reader(f)
		points = [Point(*map(int, row)) for row in reader]
	print("total time: ", time.time() - start)


