def __setattr__(self, name, value) :
	if name in ("_proxy", "collection") :
		object.__setattr__(self, name, value)
	else :
		proxied = self._proxy
		collection = self._collection
		old = getattr(proxied, name)
		setattr(proxy, name, value)
		collection.signal_change(proxied, name, old, value)


        c.signal_change(p, name, o, value)




def __setattr__(self, name, value):
    proxy = self.__dict__.get('_proxy')
    collection = self.__dict__.get('_collection')
    if proxy is not None and collection is not None:
        old = getattr(proxy, name)
        setattr(proxy, name, value)


