def search(plugindir):
    for root, dirs, files in os.walk(plugindir):
        for fname in files:
            modname = os.path.splitext(fname)[0]
            try:
                module = imp.load_source(modname, os.path.join(root, fname))
            except Exception:
                continue


def search(plugindir):
    for entry in os.scandir(plugindir):
        if entry.is_file():
            modname = os.path.splitext(entry.name)[0]
            try:
                module = imp.load_source(modname, entry.path)
            except Exception:
                continue




