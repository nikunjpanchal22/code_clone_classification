def create_lookup_list(messages, schema) :
  lookup_list = []
  for message in messages:
    message_dict = {}
    for key, value in zip(schema, message):
        message_dict[key] = value
    lookup_list.append(message_dict)
  return lookup_list


 def create_lookup_list(messages, schema) :
  lookup_list = []
  for message in messages:
    m_dict = dict(zip(schema, message))
    lookup_list.append(m_dict)
  return lookup_list



