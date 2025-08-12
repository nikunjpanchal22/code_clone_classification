def update(self, instance, validated_data) :
	user_data = validated_data.pop('user', {})
	user_serializer = UserSerializer(instance.user, data = user_data, partial = True)
	user_serializer.is_valid(raise_exception = True)
	user_serializer.update(instance.user, user_data)
	super(ProfileSerializer, self).update(instance, validated_data)
	return instance



def update(self, instance, validated_data) :
    user = validated_data.pop('user', None)
    UserSerializer(instance.user, data = user, partial = True).is_valid(raise_exception = True).update(instance.user, user)
    return super(ProfileSerializer, self).update(instance, validated_data)




