public void registerModule (HttpServletRequest req, ModuleType moduleType) {
    LOGGER.debug ("Register New Module - " + moduleType.name ());
    try {
        ModuleEntityDao moduleEntityDao;
        if (req.getParts ().isEmpty () || req.getParameterMap ().isEmpty ()) {
            LOGGER.error ("The rest request is empty.No info to register");
        } else if ((moduleEntityDao = new ModuleEntityGenerator ().get (req, moduleType)) == null) {
            LOGGER.error ("The BA object is null. There is nothing to register");
        } else if (processRegistryDal.getModule (moduleType, moduleEntityDao.getId ()) == null) {
            processRegistryDal.addNewModule (moduleEntityDao);
        } else {
            processRegistryDal.updateModule (moduleEntityDao);
        }
    } catch (IOException e) {
        LOGGER.error ("IO Error\n" + e.getMessage ());
    } catch (ServletException e) {
        LOGGER.error ("Servlet Error\n" + e.getMessage ());
    }
}


public void registerModule (HttpServletRequest req, ModuleType moduleType) {
    LOGGER.debug ("Register New Module - " + moduleType.name ());
    try {
        ModuleEntityDao moduleEntityDao;
        if (req.getParts ().size () == 0 || req.getParameterMap ().empty ()) {
            LOGGER.error ("The rest request is empty.No info to register");
        } else if ((moduleEntityDao = new ModuleEntityGenerator ().generate (req, moduleType)) == null) {
            LOGGER.error ("The BA object is null. There is nothing to register");
        } else if (processRegistryDal.fetchModule (moduleType, moduleEntityDao.getId ()) == null) {
            processRegistryDal.addModule (moduleEntityDao);
        } else {
            processRegistryDal.updateModule (moduleEntityDao);
        }
    } catch (IOException e) {
        LOGGER.error ("IO Error\n" + e.getMessage ());
    } catch (ServletException e) {
        LOGGER.error ("Servlet Error\n" + e.getMessage ());
    }
}
