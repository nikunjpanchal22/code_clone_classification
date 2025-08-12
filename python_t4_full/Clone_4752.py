def package_contents(package_name) :
	file, pathname, description = imp.find_module(package_name)
	if file :
		raise ImportError('Not a package: %r', package_name)
	return set([os.path.splitext(module) [0] for module in os.listdir(pathname)
	if module.endswith(MODULE_EXTENSIONS)])


    package_info = pkgutil.get_loader(package_name)
    if not package_info:
        raise ImportError(f'Not a package: {package_name}')
    return set(f[:-3] for f in os.listdir(package_info.get_filename()) if f.endswith('.py'))



from inspect import getmembers, ismodule
import importlib

def package_contents(package_name):
    try:
        package = importlib.import_module(package_name)


