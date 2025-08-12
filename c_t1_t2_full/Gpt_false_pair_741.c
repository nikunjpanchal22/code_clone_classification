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


	int main () 
{ 
  Vector4f Pos, Norm, Color; 
  Pos.x = 12.3f; 
  Pos[1] = 2.f; 
  Pos.z = 3.f; 
  Pos.w = 1.f; 
  Norm.x = .8f; 
  Norm[1] = .9f; 
  Norm.z = .1f; 
  Norm.w = 1.f; 
  Color.r = 1.f; 
  Color[1] = .233f; 
  Color.b = 2.11f; 
  Color.a = 1.1f; 

  return 0; 
}
