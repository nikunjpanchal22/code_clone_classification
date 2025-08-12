def search(plugindir):
    for root, dirs, files in os.walk(plugindir):
        for fname in files:
            modname = os.path.splitext(fname)[0]
            try:
                module = imp.load_source(modname, os.path.join(root, fname))
            except Exception:
                continue


def search(plugindir):
    files = os.listdir(os.getcwd())
    for fname in files:
        modname = os.path.splitext(fname)[0]
        try:
            module = imp.load_source(modname, os.path.join(os.getcwd(), fname))
        except Exception:
            continue




