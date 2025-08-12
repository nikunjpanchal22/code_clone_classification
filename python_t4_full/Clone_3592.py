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


    with open('data/data4.txt', 'w') as outfile :
        json.dump(data, outfile)




def read_relationship5(filename):
    data = list()
    with open(filename, mode='r') as file:
        csv_reader = csv.reader(file, delimiter='\t')
        for row in csv_reader:
            data_dict = dict()
            data_dict['source'] = {'id' : row [0], 'start' : int(row [2]), 'end' : int(row [3])}


