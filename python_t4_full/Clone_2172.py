def package_contents(package_name) :
	file, pathname, description = imp.find_module(package_name)
	if file :
		raise ImportError('Not a package: %r', package_name)
	return set([os.path.splitext(module) [0] for module in os.listdir(pathname)
	if module.endswith(MODULE_EXTENSIONS)])


 def package_contents(package_name) :
    file, pathname, description = imp.find_module(package_name)
    if file :
        raise ImportError('Not a package: %r', package_name)
    list_of_modules = os.listdir(pathname) 
    list_of_modules = [module for module in list_of_modules if module.endswith(MODULE_EXTENSIONS)]
    formatted_data = [os.path.splitext(module)[0] for module in list_of_modules]
    return set(formatted_data)


