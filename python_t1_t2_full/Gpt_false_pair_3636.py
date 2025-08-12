def search(plugindir) :
	for root, dirs, files in os.walk(plugindir) :
		for fname in files :
			modname = os.path.splitext(fname) [0]
			try :
				module = imp.load_source(modname, os.path.join(root, fname))
			except Exception : continue




def search(plugindir) :
	for root, dirs, files in os.walk(plugindir) :
		for fname in files :
			modname = fname.split('.')[0]
			try :
				module = imp.import_source(modname, os.path.join(root, fname))
			except Exception : continue


#Type 3
import glob
for module_path in glob.glob(os.path.join('plugindir', '**/*.py')):
    modname = os.path.splitext(os.path.basename(module_path))[0]
    try:
        module = imp.load_source(modname, module_path)
    except Exception:
        continue

#Type 4
for root, _, files in os.walk(plugindir):
    for filename in files:
        modname, _ = os.path.splitext(filename)
        try:
            source = os.path.join(root, filename)
            loaded_module = imp.load_source(modname, source)
        except Exception:
            pass
