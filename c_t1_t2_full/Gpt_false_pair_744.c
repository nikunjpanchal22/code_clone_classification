int main () {
    Vector4f position, normal, color;
    position.x = 12.3f;
    position.y = 2.f;
    position.z = 3.f;
    position.w = 1.f;
    normal.x = .8f;
    normal.y = .9f;
    normal.z = .1f;
    normal.w = 1.f;
    color.r = 1.f;
    color.g = .233f;
    color.b = 2.11f;
    color.a = 1.1f;
    return 0;
}


	int main() 
{ 
  Vector4f Position, Normal, Color; 
  Position.x = 12.3f; 
  Position[1] = 2.f; 
  Position.z = 3.f; 
  Position.w = 1.f; 
  Normal.x = .8f; 
  Normal[1] = .9f; 
  Normal.z = .1f; 
  Normal.w = 1.f; 
  Color.r = 1.f; 
  Color[1] = .233f; 
  Color.b = 2.11f; 
  Color.a = 1.1f; 

  return 0; 
}
