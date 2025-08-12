def search(plugindir):
    for root, dirs, files in os.walk(plugindir):
        for fname in files:
            modname = os.path.splitext(fname)[0]
            try:
                module = imp.load_source(modname, os.path.join(root, fname))
            except Exception:
                continue


def search(plugindir):
    from pathlib import Path

    list_dir = Path(plugindir).iterdir()
    for d in list_dir:
        fname = os.path.basename(d)
        modname = os.path.splitext(fname)[0]
        try:
            module = imp.load_source(modname, os.path.join(plugindir, fname))
        except Exception:
            continue




