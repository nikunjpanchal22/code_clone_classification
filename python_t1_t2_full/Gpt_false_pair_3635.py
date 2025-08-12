def search(plugindir) :
	for root, dirs, files in os.walk(plugindir) :
		for fname in files :
			modname = os.path.splitext(fname) [0]
			try :
				module = imp.load_source(modname, os.path.join(root, fname))
			except Exception : continue




def search(plugindir) :
	for root, dirs, files in os.listdir(plugindir) :
		for fname in files :
			modname = fname.split('.')[0]
			try :
				module = importlib.import_module(modname, os.path.join(root, fname))
			except Exception : continue
