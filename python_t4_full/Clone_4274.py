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



import os, pickle

fname = 'InputFile.bak'

def read_file():
    if not os.path.isfile(fname):
        return {}
    with open(fname, 'rb') as f:
        while True:
            item = pickle.load(f)


