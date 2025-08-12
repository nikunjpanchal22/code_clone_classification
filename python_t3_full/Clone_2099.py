def update(self, request, * args, ** kwargs) :
	partial = True
	instance = self.get_object()
	serializer = self.get_serializer(instance, data = request.data, partial = partial)
	serializer.is_valid(raise_exception = True)
	self.perform_update(serializer)
	return Response(serializer.data)



def update(self, request, *args, **kwargs):
    obj = self.get_object()
    serializer = self.get_serializer(obj, data=request.data, partial=True)
    serializer.is_valid(raise_exception=True)
    self.perform_update(serializer)


