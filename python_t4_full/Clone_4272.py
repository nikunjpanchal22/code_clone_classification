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


                print(f"{v[0]} \t {v[1]} \t {k}")




import os, pickle
def read_file(fname = 'InputFile.bak'):
    if os.path.isfile(fname):
        with open(fname, 'rb') as f:
            try:
                while True:
                    item = pickle.load(f)
                    for k, v in item.items():
                        print("{} \t {} \t {}".format(v[0], v[1], k))
            except EOFError:
                pass


