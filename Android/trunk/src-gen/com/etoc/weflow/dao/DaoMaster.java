package com.etoc.weflow.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import com.etoc.weflow.dao.FrequentPhoneDao;
import com.etoc.weflow.dao.FrequentQQDao;
import com.etoc.weflow.dao.DownloadHistoryDao;
import com.etoc.weflow.dao.AccountInfoDao;
import com.etoc.weflow.dao.MyMessageDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 3): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 3;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
        FrequentPhoneDao.createTable(db, ifNotExists);
        FrequentQQDao.createTable(db, ifNotExists);
        DownloadHistoryDao.createTable(db, ifNotExists);
        AccountInfoDao.createTable(db, ifNotExists);
        MyMessageDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
        FrequentPhoneDao.dropTable(db, ifExists);
        FrequentQQDao.dropTable(db, ifExists);
        DownloadHistoryDao.dropTable(db, ifExists);
        AccountInfoDao.dropTable(db, ifExists);
        MyMessageDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(FrequentPhoneDao.class);
        registerDaoClass(FrequentQQDao.class);
        registerDaoClass(DownloadHistoryDao.class);
        registerDaoClass(AccountInfoDao.class);
        registerDaoClass(MyMessageDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}
