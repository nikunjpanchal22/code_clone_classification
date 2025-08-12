def read_relationship(filename) :
	data = []
	with open(filename, 'rb') as f :
		reader = csv.reader(f, delimiter = '\t')
		next(reader, None)
		for row in reader :
			data.append([{
			'source' : {
			'id' : row [0],
			'start' : int(row [2]),
			'end' : int(row [3]),
			},
			'target' : {
			'id' : row [1],
			'start' : int(row [4]),
			'end' : int(row [5]),
			},
			}])
	with open('data/data.txt', 'w') as outfile :
		json.dump(data, outfile)






def read_relationship3(filename):
    data = []
    with open(filename, 'r') as f :
        reader = csv.reader(f, delimiter = ',')
        next(reader, None)
        for row in reader :
            data.append({
                row[1]: {'start': int(row[4]), 'end': int(row[5])},
                row[0]: {'start': int(row[2]), 'end': int(row[3])}
            })


