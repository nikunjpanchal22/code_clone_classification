def package_contents(package_name) :
	file, pathname, description = imp.find_module(package_name)
	if file :
		raise ImportError('Not a package: %r', package_name)
	return set([os.path.splitext(module) [0] for module in os.listdir(pathname)
	if module.endswith(MODULE_EXTENSIONS)])


 def package_contents(package_name):
    file, pathname, description = imp.find_module(package_name)
    if file:
        raise ImportError('Not a package: %r', package_name)
    modules_with_exten = [module for module in os.listdir(pathname) if module.endswith(MODULE_EXTENSIONS)]
    modules_no_exten = [os.path.splitext(module) for module in modules_with_exten]
    return set([module[0] for module in modules_no_exten])


