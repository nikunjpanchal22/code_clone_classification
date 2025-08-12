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
		item_list = list()
		fsize = os.path.getsize(fname)
		with open(fname, 'rb') as fh :
			while fh.tell() < fsize :
				item_list.append(cPickle.load(fh))
		for item in item_list :
			for k, v in item.iteritems() :
				print (v [0], "\t", v [1], "\t", k)
	else :
		item_name = {}
