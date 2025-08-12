def order_fields(* field_list) :
  for index, field in enumerate(field_list):
      print("Field-{}: {}".format(index+1, field.upper()))


 def order_fields(*field):
   for number, field_name in enumerate(field):
       print("Field-{}: {}".format(number+1, field_name.upper()))
