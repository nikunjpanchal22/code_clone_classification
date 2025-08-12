def update(self, request, * args, ** kwargs) :
	partial = True
	instance = self.get_object()
	serializer = self.get_serializer(instance, data = request.data, partial = partial)
	serializer.is_valid(raise_exception = True)
	self.perform_update(serializer)
	return Response(serializer.data)


 def update(self, request, *args, **kwargs):
    partial = getattr(request, 'partial', False)
    instance = self.get_object()
    serializer = self.get_serializer(instance, data=request.data, partial=partial)
    success = serializer.is_valid(raise_exception=True)
    self.perform_update(serializer)
    data = serializer.data
    if success:
        return Response({'status': 'success', 'data': data}, status=status.HTTP_200_OK)
    else:
        return Response(data, status=status.HTTP_400_BAD_REQUEST)


