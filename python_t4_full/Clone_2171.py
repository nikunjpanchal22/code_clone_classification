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
    modules_list = [module for module in os.listdir(pathname) 
                    if module.endswith(MODULE_EXTENSIONS)]
    modules_without_ext_list = [os.path.splitext(module)[0] 
                                for module in modules_list]
    content_set = set(modules_without_ext_list)
    return content_set


