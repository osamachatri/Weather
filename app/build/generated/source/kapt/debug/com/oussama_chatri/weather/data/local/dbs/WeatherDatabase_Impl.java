package com.oussama_chatri.weather.data.local.dbs;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.oussama_chatri.weather.data.local.doas.CityDao;
import com.oussama_chatri.weather.data.local.doas.CityDao_Impl;
import com.oussama_chatri.weather.data.local.doas.WeatherDao;
import com.oussama_chatri.weather.data.local.doas.WeatherDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDatabase_Impl extends WeatherDatabase {
  private volatile WeatherDao _weatherDao;

  private volatile CityDao _cityDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `weather_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `region` TEXT, `country` TEXT, `lat` REAL, `lon` REAL, `tz_id` TEXT, `localtime_epoch` INTEGER, `localtime` TEXT, `last_updated_epoch` INTEGER, `last_updated` TEXT, `temp_c` REAL, `temp_f` REAL, `is_day` INTEGER, `wind_mph` REAL, `wind_kph` REAL, `wind_degree` INTEGER, `wind_dir` TEXT, `pressure_mb` REAL, `pressure_in` REAL, `precip_mm` REAL, `precip_in` REAL, `humidity` INTEGER, `cloud` INTEGER, `feelslike_c` REAL, `feelslike_f` REAL, `windchill_c` REAL, `windchill_f` REAL, `heatindex_c` REAL, `heatindex_f` REAL, `dewpoint_c` REAL, `dewpoint_f` REAL, `vis_km` REAL, `vis_miles` REAL, `uv` REAL, `gust_mph` REAL, `gust_kph` REAL, `text` TEXT, `icon` TEXT, `code` INTEGER, `forecastday` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `Cities` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2100cedbeb042bc5206d498543978b1e')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `weather_data`");
        db.execSQL("DROP TABLE IF EXISTS `Cities`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsWeatherData = new HashMap<String, TableInfo.Column>(41);
        _columnsWeatherData.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("region", new TableInfo.Column("region", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("lon", new TableInfo.Column("lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("tz_id", new TableInfo.Column("tz_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("localtime_epoch", new TableInfo.Column("localtime_epoch", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("localtime", new TableInfo.Column("localtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("last_updated_epoch", new TableInfo.Column("last_updated_epoch", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("last_updated", new TableInfo.Column("last_updated", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("temp_c", new TableInfo.Column("temp_c", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("temp_f", new TableInfo.Column("temp_f", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("is_day", new TableInfo.Column("is_day", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("wind_mph", new TableInfo.Column("wind_mph", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("wind_kph", new TableInfo.Column("wind_kph", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("wind_degree", new TableInfo.Column("wind_degree", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("wind_dir", new TableInfo.Column("wind_dir", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("pressure_mb", new TableInfo.Column("pressure_mb", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("pressure_in", new TableInfo.Column("pressure_in", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("precip_mm", new TableInfo.Column("precip_mm", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("precip_in", new TableInfo.Column("precip_in", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("humidity", new TableInfo.Column("humidity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("cloud", new TableInfo.Column("cloud", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("feelslike_c", new TableInfo.Column("feelslike_c", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("feelslike_f", new TableInfo.Column("feelslike_f", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("windchill_c", new TableInfo.Column("windchill_c", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("windchill_f", new TableInfo.Column("windchill_f", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("heatindex_c", new TableInfo.Column("heatindex_c", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("heatindex_f", new TableInfo.Column("heatindex_f", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("dewpoint_c", new TableInfo.Column("dewpoint_c", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("dewpoint_f", new TableInfo.Column("dewpoint_f", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("vis_km", new TableInfo.Column("vis_km", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("vis_miles", new TableInfo.Column("vis_miles", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("uv", new TableInfo.Column("uv", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("gust_mph", new TableInfo.Column("gust_mph", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("gust_kph", new TableInfo.Column("gust_kph", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("code", new TableInfo.Column("code", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("forecastday", new TableInfo.Column("forecastday", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherData = new TableInfo("weather_data", _columnsWeatherData, _foreignKeysWeatherData, _indicesWeatherData);
        final TableInfo _existingWeatherData = TableInfo.read(db, "weather_data");
        if (!_infoWeatherData.equals(_existingWeatherData)) {
          return new RoomOpenHelper.ValidationResult(false, "weather_data(com.oussama_chatri.weather.data.local.tables.WeatherData).\n"
                  + " Expected:\n" + _infoWeatherData + "\n"
                  + " Found:\n" + _existingWeatherData);
        }
        final HashMap<String, TableInfo.Column> _columnsCities = new HashMap<String, TableInfo.Column>(2);
        _columnsCities.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCities = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCities = new TableInfo("Cities", _columnsCities, _foreignKeysCities, _indicesCities);
        final TableInfo _existingCities = TableInfo.read(db, "Cities");
        if (!_infoCities.equals(_existingCities)) {
          return new RoomOpenHelper.ValidationResult(false, "Cities(com.oussama_chatri.weather.data.local.tables.City).\n"
                  + " Expected:\n" + _infoCities + "\n"
                  + " Found:\n" + _existingCities);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2100cedbeb042bc5206d498543978b1e", "270a91d73896c2df73fc8d007caac1a6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "weather_data","Cities");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `weather_data`");
      _db.execSQL("DELETE FROM `Cities`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(WeatherDao.class, WeatherDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CityDao.class, CityDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public WeatherDao weatherDao() {
    if (_weatherDao != null) {
      return _weatherDao;
    } else {
      synchronized(this) {
        if(_weatherDao == null) {
          _weatherDao = new WeatherDao_Impl(this);
        }
        return _weatherDao;
      }
    }
  }

  @Override
  public CityDao cityDao() {
    if (_cityDao != null) {
      return _cityDao;
    } else {
      synchronized(this) {
        if(_cityDao == null) {
          _cityDao = new CityDao_Impl(this);
        }
        return _cityDao;
      }
    }
  }
}
