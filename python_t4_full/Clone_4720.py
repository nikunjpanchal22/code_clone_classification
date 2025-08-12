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


		data = csv.reader(csv_file)
		points = [(row[0], row[1]) for row in data]
	print("total time: ", time.time() - start_time)




def test2():
	import time
	import csv
	


