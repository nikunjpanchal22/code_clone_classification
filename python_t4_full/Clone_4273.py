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





def read_file():
    import os, pickle
    try:
        with open('InputFile.bak','rb') as file:
            while True:
                item = pickle.load(file)
                for k,v in item.items():
                    print(v[0], "\t", v[1], "\t", k)
    except EOFError:
        item_name = {}




