def update(self, request, * args, ** kwargs) :
	partial = True
	instance = self.get_object()
	serializer = self.get_serializer(instance, data = request.data, partial = partial)
	serializer.is_valid(raise_exception = True)
	self.perform_update(serializer)
	return Response(serializer.data)





def update(self, request, *args, **kwargs):
    instance = self.get_object()
    s = self.get_serializer(instance, data = request.data, partial = True)
    s.is_valid(True)
    self.perform_update(s)


