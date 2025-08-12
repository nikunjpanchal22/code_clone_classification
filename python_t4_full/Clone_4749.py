def package_contents(package_name) :
	file, pathname, description = imp.find_module(package_name)
	if file :
		raise ImportError('Not a package: %r', package_name)
	return set([os.path.splitext(module) [0] for module in os.listdir(pathname)
	if module.endswith(MODULE_EXTENSIONS)])





from pkg_resources import working_set
import os

def package_contents(package_name):
    module_path = next((d for d in working_set if d.project_name.lower() == package_name.lower()), None)
    if module_path is None:
        raise ImportError(f'Not a package: {package_name}')


