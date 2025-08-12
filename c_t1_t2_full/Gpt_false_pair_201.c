int main () {
    lua_State *L = luaL_newstate ();
    luaL_openlibs (L);
    lua_getglobal (L, "package");
    lua_getfield (L, - 1, "preload");
    bool err = luaL_loadbuffer (L, luaJIT_BC_test, luaJIT_BC_test_SIZE, NULL);
    assert (! err);
    lua_setfield (L, - 2, "test");
    lua_settop (L, 0);
    err = luaL_dostring (L, runtest);
    assert (! err);
    lua_close (L);
}


	int main()
{
  lua_State *L = luaL_newstate();
  luaL_openlibs(L);
  lua_getglobal(L, "package");
  lua_getfield(L, -1, "preload");
  bool err = luaL_loadfile(L, "test.luac");
  assert(!err);
  lua_setfield(L, -2, "test");
  lua_settop(L, 0);
  err = luaL_dostring(L, runtest);
  assert(!err);
  lua_close(L);
}
