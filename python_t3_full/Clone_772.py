def update(self, request, * args, ** kwargs) :
	partial = True
	instance = self.get_object()
	serializer = self.get_serializer(instance, data = request.data, partial = partial)
	serializer.is_valid(raise_exception = True)
	self.perform_update(serializer)
	return Response(serializer.data)


 def update(self, request, * args, ** kwargs) :
    partial = False
    instance = self.get_object()
    serializer = self.get_serializer(instance, data = request.data, partial = partial)
    serializer.is_valid(raise_exception = True)
    self.perform_update(serializer)
    response = serializer.data
    status_code = status.HTTP_200_OK
    return Response(response, status=status_code)


