def package_contents(package_name) :
	file, pathname, description = imp.find_module(package_name)
	if file :
		raise ImportError('Not a package: %r', package_name)
	return set([os.path.splitext(module) [0] for module in os.listdir(pathname)
	if module.endswith(MODULE_EXTENSIONS)])




from importlib import import_module
import os

def package_contents(package_name):
    try:
        package = import_module(package_name)
    except ModuleNotFoundError:
        raise ImportError(f'Not a package: {package_name}')
    module_path = os.path.dirname(package.__file__)


