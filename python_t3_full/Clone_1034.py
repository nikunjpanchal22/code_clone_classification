def read_file() :
	fname = 'InputFile.bak'
	if os.path.exists(fname) :
		fsize = os.path.getsize(fname)
		with open(fname, 'rb') as fh :
			while fh.tell() < fsize :
				item = cPickle.load(fh)
				for k, v in item.iteritems() :
					print (v [0], "\t", v [1], "\t", k)
	else :
		item_name = {}


 def read_file() :
	fname = 'InputFile.bak'
	if os.path.exists(fname) :
		items = cPickle.load(open(fname, 'rb'))
		for item in items :
			sorted_items = sorted(item.items())
			for k, v in sorted_items :
				print (v [0], "\t", v [1], "\t", k)
	else :
		item_name = {}


