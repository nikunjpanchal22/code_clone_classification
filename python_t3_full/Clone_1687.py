def search(plugindir):
    for root, dirs, files in os.walk(plugindir):
        for fname in files:
            modname = os.path.splitext(fname)[0]
            try:
                module = imp.load_source(modname, os.path.join(root, fname))
            except Exception:
                continue


def search(plugindir):
    import glob

    for fname in glob.glob(os.path.join(plugindir, "*.*")):
        modname = os.path.splitext(fname)[0]
        try:
            module = imp.load_source(modname, fname)
        except Exception:
            continue




