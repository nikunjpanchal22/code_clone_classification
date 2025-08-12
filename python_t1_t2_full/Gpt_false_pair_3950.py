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




def read_file_4():
	fname = 'InputFile.bak'
	if os.path.exists(fname):
		fsize = os.path.getsize(fname)
		with open(fname, 'rb') as fh:
			while fh.tell() < fsize:
				item = cPickle.load(fh)
				for k,v in item.items():
					print('The measurement for {} is {} {}'.format(k,v[0],v[1]))
	else:
		item_name = {}
