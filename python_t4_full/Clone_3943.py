def update(self, instance, validated_data) :
	user_data = validated_data.pop('user', {})
	user_serializer = UserSerializer(instance.user, data = user_data, partial = True)
	user_serializer.is_valid(raise_exception = True)
	user_serializer.update(instance.user, user_data)
	super(ProfileSerializer, self).update(instance, validated_data)
	return instance


    return instance




def update(self, instance, validated_data) :
    user_data = validated_data.get('user', {})
    user_serializer = UserSerializer(instance.user, data = user_data)


