def read_file() :
	fname = 'InputFile.bak'
	if os.path.exists(fname) :
		fsize = os.path.getsize(fname)
		with open(fname, 'rb') as fh :
			while fh.tell() < fsize :
				item = cPickle.load(fh)
				for k, v in item.iteritems() :
					print v [0], "\t", v [1], "\t", k
	else :
		item_name = {}



import os
import pickle

def read_file():
    filename = 'InputFile.bak'
    if os.path.isfile(filename):
        with open(filename, 'rb') as file:
            data = pickle.load(file)
            for key, value in data.items():
                print(value[0], "\t", value[1], "\t", key)
    else:
        data = {}




