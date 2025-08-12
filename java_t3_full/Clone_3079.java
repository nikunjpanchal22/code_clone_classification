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





public void registerModule(HttpServletRequest req, ModuleType moduleType) {
        LOGGER.debug("Register New Module - " + moduleType.name());
        try {
            if (req.getParts().isEmpty() || req.getParameterMap().isEmpty()) {
                LOGGER.error("The rest request is empty.No info to register");
                return;
            }
            ModuleEntityDao moduleEntityDao = new ModuleEntityGenerator().get(req, moduleType);
            if (moduleEntityDao == null) {
                LOGGER.error("The BA object is null. There is nothing to register");
                return;
            }
            ModuleEntityDao existingModule = processRegistryDal.getModule(moduleType, moduleEntityDao.getId());
            if (existingModule == null) {
                processRegistryDal.addNewModule(moduleEntityDao);
            } else {
                processRegistryDal.updateModule(moduleEntityDao);
            }
        } catch (IOException e) {
            LOGGER.error("IO Error\n" + e.getMessage());
        } catch (ServletException e) {
            LOGGER.error("Servlet Error\n" + e.getMessage());
        }
}


