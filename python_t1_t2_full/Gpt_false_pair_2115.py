def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*argument):
   for num, object in enumerate(argument):
       print("Field-{}: {}".format(num+1, object.upper()))
