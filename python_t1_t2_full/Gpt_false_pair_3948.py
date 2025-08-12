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




def read_file_3(): 
	fname = 'InputFile.bak'
	if os.path.exists(fname): 
		fsize = os.path.getsize(fname)
		with open(fname, 'rb') as fh: 
			while fh.tell() < fsize: 
				item = cPickle.load(fh)
				for k, v in item.iteritems(): 
					print("The {} of the ingredients is {} and the name is {}".format(v[0],v[1],k))
	else: 
		item_name = {}

