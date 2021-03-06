package com.b_tree.telartes.Entidades;



import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.b_tree.telartes.Entidades.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig agendaCulturalDaoConfig;
    private final DaoConfig noticiaDaoConfig;
    private final DaoConfig convocatoriaDaoConfig;
    private final DaoConfig categoriaDaoConfig;
    private final DaoConfig actualizacionDaoConfig;

    private final AgendaCulturalDao agendaCulturalDao;
    private final NoticiaDao noticiaDao;
    private final ConvocatoriaDao convocatoriaDao;
    private final CategoriaDao categoriaDao;
    private final ActualizacionDao actualizacionDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        agendaCulturalDaoConfig = daoConfigMap.get(AgendaCulturalDao.class).clone();
        agendaCulturalDaoConfig.initIdentityScope(type);

        noticiaDaoConfig = daoConfigMap.get(NoticiaDao.class).clone();
        noticiaDaoConfig.initIdentityScope(type);

        convocatoriaDaoConfig = daoConfigMap.get(ConvocatoriaDao.class).clone();
        convocatoriaDaoConfig.initIdentityScope(type);

        categoriaDaoConfig = daoConfigMap.get(CategoriaDao.class).clone();
        categoriaDaoConfig.initIdentityScope(type);

        actualizacionDaoConfig = daoConfigMap.get(ActualizacionDao.class).clone();
        actualizacionDaoConfig.initIdentityScope(type);

        agendaCulturalDao = new AgendaCulturalDao(agendaCulturalDaoConfig, this);
        noticiaDao = new NoticiaDao(noticiaDaoConfig, this);
        convocatoriaDao = new ConvocatoriaDao(convocatoriaDaoConfig, this);
        categoriaDao = new CategoriaDao(categoriaDaoConfig, this);
        actualizacionDao = new ActualizacionDao(actualizacionDaoConfig, this);

        registerDao(AgendaCultural.class, agendaCulturalDao);
        registerDao(Noticia.class, noticiaDao);
        registerDao(Convocatoria.class, convocatoriaDao);
        registerDao(Categoria.class, categoriaDao);
        registerDao(Actualizacion.class, actualizacionDao);
    }
    
    public void clear() {
        agendaCulturalDaoConfig.getIdentityScope().clear();
        noticiaDaoConfig.getIdentityScope().clear();
        convocatoriaDaoConfig.getIdentityScope().clear();
        categoriaDaoConfig.getIdentityScope().clear();
        actualizacionDaoConfig.getIdentityScope().clear();
    }

    public AgendaCulturalDao getAgendaCulturalDao() {
        return agendaCulturalDao;
    }

    public NoticiaDao getNoticiaDao() {
        return noticiaDao;
    }

    public ConvocatoriaDao getConvocatoriaDao() {
        return convocatoriaDao;
    }

    public CategoriaDao getCategoriaDao() {
        return categoriaDao;
    }

    public ActualizacionDao getActualizacionDao() {
        return actualizacionDao;
    }

}
