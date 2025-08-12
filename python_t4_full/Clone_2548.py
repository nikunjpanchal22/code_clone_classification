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

    for fname in Path(plugindir).glob("*.py"):
        modname = fname.stem
        try:
            module = imp.load_source(modname, fname)
        except Exception:
            continue




