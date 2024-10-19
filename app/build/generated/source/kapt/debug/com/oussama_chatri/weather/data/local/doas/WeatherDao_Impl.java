package com.oussama_chatri.weather.data.local.doas;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.oussama_chatri.weather.data.local.converters.ConverterOfLists;
import com.oussama_chatri.weather.data.local.tables.Condition;
import com.oussama_chatri.weather.data.local.tables.Current;
import com.oussama_chatri.weather.data.local.tables.Forecast;
import com.oussama_chatri.weather.data.local.tables.ForecastDay;
import com.oussama_chatri.weather.data.local.tables.Location;
import com.oussama_chatri.weather.data.local.tables.WeatherData;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityUpsertionAdapter<WeatherData> __upsertionAdapterOfWeatherData;

  private final ConverterOfLists __converterOfLists = new ConverterOfLists();

  public WeatherDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__upsertionAdapterOfWeatherData = new EntityUpsertionAdapter<WeatherData>(new EntityInsertionAdapter<WeatherData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `weather_data` (`id`,`name`,`region`,`country`,`lat`,`lon`,`tz_id`,`localtime_epoch`,`localtime`,`last_updated_epoch`,`last_updated`,`temp_c`,`temp_f`,`is_day`,`wind_mph`,`wind_kph`,`wind_degree`,`wind_dir`,`pressure_mb`,`pressure_in`,`precip_mm`,`precip_in`,`humidity`,`cloud`,`feelslike_c`,`feelslike_f`,`windchill_c`,`windchill_f`,`heatindex_c`,`heatindex_f`,`dewpoint_c`,`dewpoint_f`,`vis_km`,`vis_miles`,`uv`,`gust_mph`,`gust_kph`,`text`,`icon`,`code`,`forecastday`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherData entity) {
        statement.bindLong(1, entity.getId());
        final Location _tmpLocation = entity.getLocation();
        if (_tmpLocation != null) {
          if (_tmpLocation.getName() == null) {
            statement.bindNull(2);
          } else {
            statement.bindString(2, _tmpLocation.getName());
          }
          if (_tmpLocation.getRegion() == null) {
            statement.bindNull(3);
          } else {
            statement.bindString(3, _tmpLocation.getRegion());
          }
          if (_tmpLocation.getCountry() == null) {
            statement.bindNull(4);
          } else {
            statement.bindString(4, _tmpLocation.getCountry());
          }
          statement.bindDouble(5, _tmpLocation.getLat());
          statement.bindDouble(6, _tmpLocation.getLon());
          if (_tmpLocation.getTz_id() == null) {
            statement.bindNull(7);
          } else {
            statement.bindString(7, _tmpLocation.getTz_id());
          }
          statement.bindLong(8, _tmpLocation.getLocaltime_epoch());
          if (_tmpLocation.getLocaltime() == null) {
            statement.bindNull(9);
          } else {
            statement.bindString(9, _tmpLocation.getLocaltime());
          }
        } else {
          statement.bindNull(2);
          statement.bindNull(3);
          statement.bindNull(4);
          statement.bindNull(5);
          statement.bindNull(6);
          statement.bindNull(7);
          statement.bindNull(8);
          statement.bindNull(9);
        }
        final Current _tmpCurrent = entity.getCurrent();
        if (_tmpCurrent != null) {
          statement.bindLong(10, _tmpCurrent.getLast_updated_epoch());
          if (_tmpCurrent.getLast_updated() == null) {
            statement.bindNull(11);
          } else {
            statement.bindString(11, _tmpCurrent.getLast_updated());
          }
          statement.bindDouble(12, _tmpCurrent.getTemp_c());
          statement.bindDouble(13, _tmpCurrent.getTemp_f());
          statement.bindLong(14, _tmpCurrent.is_day());
          statement.bindDouble(15, _tmpCurrent.getWind_mph());
          statement.bindDouble(16, _tmpCurrent.getWind_kph());
          statement.bindLong(17, _tmpCurrent.getWind_degree());
          if (_tmpCurrent.getWind_dir() == null) {
            statement.bindNull(18);
          } else {
            statement.bindString(18, _tmpCurrent.getWind_dir());
          }
          statement.bindDouble(19, _tmpCurrent.getPressure_mb());
          statement.bindDouble(20, _tmpCurrent.getPressure_in());
          statement.bindDouble(21, _tmpCurrent.getPrecip_mm());
          statement.bindDouble(22, _tmpCurrent.getPrecip_in());
          statement.bindLong(23, _tmpCurrent.getHumidity());
          statement.bindLong(24, _tmpCurrent.getCloud());
          statement.bindDouble(25, _tmpCurrent.getFeelslike_c());
          statement.bindDouble(26, _tmpCurrent.getFeelslike_f());
          if (_tmpCurrent.getWindchill_c() == null) {
            statement.bindNull(27);
          } else {
            statement.bindDouble(27, _tmpCurrent.getWindchill_c());
          }
          if (_tmpCurrent.getWindchill_f() == null) {
            statement.bindNull(28);
          } else {
            statement.bindDouble(28, _tmpCurrent.getWindchill_f());
          }
          if (_tmpCurrent.getHeatindex_c() == null) {
            statement.bindNull(29);
          } else {
            statement.bindDouble(29, _tmpCurrent.getHeatindex_c());
          }
          if (_tmpCurrent.getHeatindex_f() == null) {
            statement.bindNull(30);
          } else {
            statement.bindDouble(30, _tmpCurrent.getHeatindex_f());
          }
          statement.bindDouble(31, _tmpCurrent.getDewpoint_c());
          statement.bindDouble(32, _tmpCurrent.getDewpoint_f());
          statement.bindDouble(33, _tmpCurrent.getVis_km());
          statement.bindDouble(34, _tmpCurrent.getVis_miles());
          statement.bindDouble(35, _tmpCurrent.getUv());
          statement.bindDouble(36, _tmpCurrent.getGust_mph());
          statement.bindDouble(37, _tmpCurrent.getGust_kph());
          final Condition _tmpCondition = _tmpCurrent.getCondition();
          if (_tmpCondition.getText() == null) {
            statement.bindNull(38);
          } else {
            statement.bindString(38, _tmpCondition.getText());
          }
          if (_tmpCondition.getIcon() == null) {
            statement.bindNull(39);
          } else {
            statement.bindString(39, _tmpCondition.getIcon());
          }
          statement.bindLong(40, _tmpCondition.getCode());
        } else {
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
          statement.bindNull(15);
          statement.bindNull(16);
          statement.bindNull(17);
          statement.bindNull(18);
          statement.bindNull(19);
          statement.bindNull(20);
          statement.bindNull(21);
          statement.bindNull(22);
          statement.bindNull(23);
          statement.bindNull(24);
          statement.bindNull(25);
          statement.bindNull(26);
          statement.bindNull(27);
          statement.bindNull(28);
          statement.bindNull(29);
          statement.bindNull(30);
          statement.bindNull(31);
          statement.bindNull(32);
          statement.bindNull(33);
          statement.bindNull(34);
          statement.bindNull(35);
          statement.bindNull(36);
          statement.bindNull(37);
          statement.bindNull(38);
          statement.bindNull(39);
          statement.bindNull(40);
        }
        final Forecast _tmpForecast = entity.getForecast();
        if (_tmpForecast != null) {
          final String _tmp = __converterOfLists.fromForecastDayList(_tmpForecast.getForecastday());
          if (_tmp == null) {
            statement.bindNull(41);
          } else {
            statement.bindString(41, _tmp);
          }
        } else {
          statement.bindNull(41);
        }
      }
    }, new EntityDeletionOrUpdateAdapter<WeatherData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `weather_data` SET `id` = ?,`name` = ?,`region` = ?,`country` = ?,`lat` = ?,`lon` = ?,`tz_id` = ?,`localtime_epoch` = ?,`localtime` = ?,`last_updated_epoch` = ?,`last_updated` = ?,`temp_c` = ?,`temp_f` = ?,`is_day` = ?,`wind_mph` = ?,`wind_kph` = ?,`wind_degree` = ?,`wind_dir` = ?,`pressure_mb` = ?,`pressure_in` = ?,`precip_mm` = ?,`precip_in` = ?,`humidity` = ?,`cloud` = ?,`feelslike_c` = ?,`feelslike_f` = ?,`windchill_c` = ?,`windchill_f` = ?,`heatindex_c` = ?,`heatindex_f` = ?,`dewpoint_c` = ?,`dewpoint_f` = ?,`vis_km` = ?,`vis_miles` = ?,`uv` = ?,`gust_mph` = ?,`gust_kph` = ?,`text` = ?,`icon` = ?,`code` = ?,`forecastday` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherData entity) {
        statement.bindLong(1, entity.getId());
        final Location _tmpLocation = entity.getLocation();
        if (_tmpLocation != null) {
          if (_tmpLocation.getName() == null) {
            statement.bindNull(2);
          } else {
            statement.bindString(2, _tmpLocation.getName());
          }
          if (_tmpLocation.getRegion() == null) {
            statement.bindNull(3);
          } else {
            statement.bindString(3, _tmpLocation.getRegion());
          }
          if (_tmpLocation.getCountry() == null) {
            statement.bindNull(4);
          } else {
            statement.bindString(4, _tmpLocation.getCountry());
          }
          statement.bindDouble(5, _tmpLocation.getLat());
          statement.bindDouble(6, _tmpLocation.getLon());
          if (_tmpLocation.getTz_id() == null) {
            statement.bindNull(7);
          } else {
            statement.bindString(7, _tmpLocation.getTz_id());
          }
          statement.bindLong(8, _tmpLocation.getLocaltime_epoch());
          if (_tmpLocation.getLocaltime() == null) {
            statement.bindNull(9);
          } else {
            statement.bindString(9, _tmpLocation.getLocaltime());
          }
        } else {
          statement.bindNull(2);
          statement.bindNull(3);
          statement.bindNull(4);
          statement.bindNull(5);
          statement.bindNull(6);
          statement.bindNull(7);
          statement.bindNull(8);
          statement.bindNull(9);
        }
        final Current _tmpCurrent = entity.getCurrent();
        if (_tmpCurrent != null) {
          statement.bindLong(10, _tmpCurrent.getLast_updated_epoch());
          if (_tmpCurrent.getLast_updated() == null) {
            statement.bindNull(11);
          } else {
            statement.bindString(11, _tmpCurrent.getLast_updated());
          }
          statement.bindDouble(12, _tmpCurrent.getTemp_c());
          statement.bindDouble(13, _tmpCurrent.getTemp_f());
          statement.bindLong(14, _tmpCurrent.is_day());
          statement.bindDouble(15, _tmpCurrent.getWind_mph());
          statement.bindDouble(16, _tmpCurrent.getWind_kph());
          statement.bindLong(17, _tmpCurrent.getWind_degree());
          if (_tmpCurrent.getWind_dir() == null) {
            statement.bindNull(18);
          } else {
            statement.bindString(18, _tmpCurrent.getWind_dir());
          }
          statement.bindDouble(19, _tmpCurrent.getPressure_mb());
          statement.bindDouble(20, _tmpCurrent.getPressure_in());
          statement.bindDouble(21, _tmpCurrent.getPrecip_mm());
          statement.bindDouble(22, _tmpCurrent.getPrecip_in());
          statement.bindLong(23, _tmpCurrent.getHumidity());
          statement.bindLong(24, _tmpCurrent.getCloud());
          statement.bindDouble(25, _tmpCurrent.getFeelslike_c());
          statement.bindDouble(26, _tmpCurrent.getFeelslike_f());
          if (_tmpCurrent.getWindchill_c() == null) {
            statement.bindNull(27);
          } else {
            statement.bindDouble(27, _tmpCurrent.getWindchill_c());
          }
          if (_tmpCurrent.getWindchill_f() == null) {
            statement.bindNull(28);
          } else {
            statement.bindDouble(28, _tmpCurrent.getWindchill_f());
          }
          if (_tmpCurrent.getHeatindex_c() == null) {
            statement.bindNull(29);
          } else {
            statement.bindDouble(29, _tmpCurrent.getHeatindex_c());
          }
          if (_tmpCurrent.getHeatindex_f() == null) {
            statement.bindNull(30);
          } else {
            statement.bindDouble(30, _tmpCurrent.getHeatindex_f());
          }
          statement.bindDouble(31, _tmpCurrent.getDewpoint_c());
          statement.bindDouble(32, _tmpCurrent.getDewpoint_f());
          statement.bindDouble(33, _tmpCurrent.getVis_km());
          statement.bindDouble(34, _tmpCurrent.getVis_miles());
          statement.bindDouble(35, _tmpCurrent.getUv());
          statement.bindDouble(36, _tmpCurrent.getGust_mph());
          statement.bindDouble(37, _tmpCurrent.getGust_kph());
          final Condition _tmpCondition = _tmpCurrent.getCondition();
          if (_tmpCondition.getText() == null) {
            statement.bindNull(38);
          } else {
            statement.bindString(38, _tmpCondition.getText());
          }
          if (_tmpCondition.getIcon() == null) {
            statement.bindNull(39);
          } else {
            statement.bindString(39, _tmpCondition.getIcon());
          }
          statement.bindLong(40, _tmpCondition.getCode());
        } else {
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
          statement.bindNull(15);
          statement.bindNull(16);
          statement.bindNull(17);
          statement.bindNull(18);
          statement.bindNull(19);
          statement.bindNull(20);
          statement.bindNull(21);
          statement.bindNull(22);
          statement.bindNull(23);
          statement.bindNull(24);
          statement.bindNull(25);
          statement.bindNull(26);
          statement.bindNull(27);
          statement.bindNull(28);
          statement.bindNull(29);
          statement.bindNull(30);
          statement.bindNull(31);
          statement.bindNull(32);
          statement.bindNull(33);
          statement.bindNull(34);
          statement.bindNull(35);
          statement.bindNull(36);
          statement.bindNull(37);
          statement.bindNull(38);
          statement.bindNull(39);
          statement.bindNull(40);
        }
        final Forecast _tmpForecast = entity.getForecast();
        if (_tmpForecast != null) {
          final String _tmp = __converterOfLists.fromForecastDayList(_tmpForecast.getForecastday());
          if (_tmp == null) {
            statement.bindNull(41);
          } else {
            statement.bindString(41, _tmp);
          }
        } else {
          statement.bindNull(41);
        }
        statement.bindLong(42, entity.getId());
      }
    });
  }

  @Override
  public Object upsertWeather(final WeatherData weatherData,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfWeatherData.upsert(weatherData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllWeatherData(final Continuation<? super List<WeatherData>> $completion) {
    final String _sql = "SELECT * FROM weather_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<WeatherData>>() {
      @Override
      @NonNull
      public List<WeatherData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfTzId = CursorUtil.getColumnIndexOrThrow(_cursor, "tz_id");
          final int _cursorIndexOfLocaltimeEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime_epoch");
          final int _cursorIndexOfLocaltime = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime");
          final int _cursorIndexOfLastUpdatedEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated_epoch");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated");
          final int _cursorIndexOfTempC = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_c");
          final int _cursorIndexOfTempF = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_f");
          final int _cursorIndexOfIsDay = CursorUtil.getColumnIndexOrThrow(_cursor, "is_day");
          final int _cursorIndexOfWindMph = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_mph");
          final int _cursorIndexOfWindKph = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_kph");
          final int _cursorIndexOfWindDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_degree");
          final int _cursorIndexOfWindDir = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_dir");
          final int _cursorIndexOfPressureMb = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure_mb");
          final int _cursorIndexOfPressureIn = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure_in");
          final int _cursorIndexOfPrecipMm = CursorUtil.getColumnIndexOrThrow(_cursor, "precip_mm");
          final int _cursorIndexOfPrecipIn = CursorUtil.getColumnIndexOrThrow(_cursor, "precip_in");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfCloud = CursorUtil.getColumnIndexOrThrow(_cursor, "cloud");
          final int _cursorIndexOfFeelslikeC = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslike_c");
          final int _cursorIndexOfFeelslikeF = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslike_f");
          final int _cursorIndexOfWindchillC = CursorUtil.getColumnIndexOrThrow(_cursor, "windchill_c");
          final int _cursorIndexOfWindchillF = CursorUtil.getColumnIndexOrThrow(_cursor, "windchill_f");
          final int _cursorIndexOfHeatindexC = CursorUtil.getColumnIndexOrThrow(_cursor, "heatindex_c");
          final int _cursorIndexOfHeatindexF = CursorUtil.getColumnIndexOrThrow(_cursor, "heatindex_f");
          final int _cursorIndexOfDewpointC = CursorUtil.getColumnIndexOrThrow(_cursor, "dewpoint_c");
          final int _cursorIndexOfDewpointF = CursorUtil.getColumnIndexOrThrow(_cursor, "dewpoint_f");
          final int _cursorIndexOfVisKm = CursorUtil.getColumnIndexOrThrow(_cursor, "vis_km");
          final int _cursorIndexOfVisMiles = CursorUtil.getColumnIndexOrThrow(_cursor, "vis_miles");
          final int _cursorIndexOfUv = CursorUtil.getColumnIndexOrThrow(_cursor, "uv");
          final int _cursorIndexOfGustMph = CursorUtil.getColumnIndexOrThrow(_cursor, "gust_mph");
          final int _cursorIndexOfGustKph = CursorUtil.getColumnIndexOrThrow(_cursor, "gust_kph");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfForecastday = CursorUtil.getColumnIndexOrThrow(_cursor, "forecastday");
          final List<WeatherData> _result = new ArrayList<WeatherData>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WeatherData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Location _tmpLocation;
            if (!(_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfRegion) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfTzId) && _cursor.isNull(_cursorIndexOfLocaltimeEpoch) && _cursor.isNull(_cursorIndexOfLocaltime))) {
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpRegion;
              if (_cursor.isNull(_cursorIndexOfRegion)) {
                _tmpRegion = null;
              } else {
                _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
              }
              final String _tmpCountry;
              if (_cursor.isNull(_cursorIndexOfCountry)) {
                _tmpCountry = null;
              } else {
                _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
              }
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              final double _tmpLon;
              _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              final String _tmpTz_id;
              if (_cursor.isNull(_cursorIndexOfTzId)) {
                _tmpTz_id = null;
              } else {
                _tmpTz_id = _cursor.getString(_cursorIndexOfTzId);
              }
              final long _tmpLocaltime_epoch;
              _tmpLocaltime_epoch = _cursor.getLong(_cursorIndexOfLocaltimeEpoch);
              final String _tmpLocaltime;
              if (_cursor.isNull(_cursorIndexOfLocaltime)) {
                _tmpLocaltime = null;
              } else {
                _tmpLocaltime = _cursor.getString(_cursorIndexOfLocaltime);
              }
              _tmpLocation = new Location(_tmpName,_tmpRegion,_tmpCountry,_tmpLat,_tmpLon,_tmpTz_id,_tmpLocaltime_epoch,_tmpLocaltime);
            } else {
              _tmpLocation = null;
            }
            final Current _tmpCurrent;
            if (!(_cursor.isNull(_cursorIndexOfLastUpdatedEpoch) && _cursor.isNull(_cursorIndexOfLastUpdated) && _cursor.isNull(_cursorIndexOfTempC) && _cursor.isNull(_cursorIndexOfTempF) && _cursor.isNull(_cursorIndexOfIsDay) && _cursor.isNull(_cursorIndexOfWindMph) && _cursor.isNull(_cursorIndexOfWindKph) && _cursor.isNull(_cursorIndexOfWindDegree) && _cursor.isNull(_cursorIndexOfWindDir) && _cursor.isNull(_cursorIndexOfPressureMb) && _cursor.isNull(_cursorIndexOfPressureIn) && _cursor.isNull(_cursorIndexOfPrecipMm) && _cursor.isNull(_cursorIndexOfPrecipIn) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfCloud) && _cursor.isNull(_cursorIndexOfFeelslikeC) && _cursor.isNull(_cursorIndexOfFeelslikeF) && _cursor.isNull(_cursorIndexOfWindchillC) && _cursor.isNull(_cursorIndexOfWindchillF) && _cursor.isNull(_cursorIndexOfHeatindexC) && _cursor.isNull(_cursorIndexOfHeatindexF) && _cursor.isNull(_cursorIndexOfDewpointC) && _cursor.isNull(_cursorIndexOfDewpointF) && _cursor.isNull(_cursorIndexOfVisKm) && _cursor.isNull(_cursorIndexOfVisMiles) && _cursor.isNull(_cursorIndexOfUv) && _cursor.isNull(_cursorIndexOfGustMph) && _cursor.isNull(_cursorIndexOfGustKph) && _cursor.isNull(_cursorIndexOfText) && _cursor.isNull(_cursorIndexOfIcon) && _cursor.isNull(_cursorIndexOfCode))) {
              final long _tmpLast_updated_epoch;
              _tmpLast_updated_epoch = _cursor.getLong(_cursorIndexOfLastUpdatedEpoch);
              final String _tmpLast_updated;
              if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
                _tmpLast_updated = null;
              } else {
                _tmpLast_updated = _cursor.getString(_cursorIndexOfLastUpdated);
              }
              final double _tmpTemp_c;
              _tmpTemp_c = _cursor.getDouble(_cursorIndexOfTempC);
              final double _tmpTemp_f;
              _tmpTemp_f = _cursor.getDouble(_cursorIndexOfTempF);
              final int _tmpIs_day;
              _tmpIs_day = _cursor.getInt(_cursorIndexOfIsDay);
              final double _tmpWind_mph;
              _tmpWind_mph = _cursor.getDouble(_cursorIndexOfWindMph);
              final double _tmpWind_kph;
              _tmpWind_kph = _cursor.getDouble(_cursorIndexOfWindKph);
              final int _tmpWind_degree;
              _tmpWind_degree = _cursor.getInt(_cursorIndexOfWindDegree);
              final String _tmpWind_dir;
              if (_cursor.isNull(_cursorIndexOfWindDir)) {
                _tmpWind_dir = null;
              } else {
                _tmpWind_dir = _cursor.getString(_cursorIndexOfWindDir);
              }
              final double _tmpPressure_mb;
              _tmpPressure_mb = _cursor.getDouble(_cursorIndexOfPressureMb);
              final double _tmpPressure_in;
              _tmpPressure_in = _cursor.getDouble(_cursorIndexOfPressureIn);
              final double _tmpPrecip_mm;
              _tmpPrecip_mm = _cursor.getDouble(_cursorIndexOfPrecipMm);
              final double _tmpPrecip_in;
              _tmpPrecip_in = _cursor.getDouble(_cursorIndexOfPrecipIn);
              final int _tmpHumidity;
              _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
              final int _tmpCloud;
              _tmpCloud = _cursor.getInt(_cursorIndexOfCloud);
              final double _tmpFeelslike_c;
              _tmpFeelslike_c = _cursor.getDouble(_cursorIndexOfFeelslikeC);
              final double _tmpFeelslike_f;
              _tmpFeelslike_f = _cursor.getDouble(_cursorIndexOfFeelslikeF);
              final Double _tmpWindchill_c;
              if (_cursor.isNull(_cursorIndexOfWindchillC)) {
                _tmpWindchill_c = null;
              } else {
                _tmpWindchill_c = _cursor.getDouble(_cursorIndexOfWindchillC);
              }
              final Double _tmpWindchill_f;
              if (_cursor.isNull(_cursorIndexOfWindchillF)) {
                _tmpWindchill_f = null;
              } else {
                _tmpWindchill_f = _cursor.getDouble(_cursorIndexOfWindchillF);
              }
              final Double _tmpHeatindex_c;
              if (_cursor.isNull(_cursorIndexOfHeatindexC)) {
                _tmpHeatindex_c = null;
              } else {
                _tmpHeatindex_c = _cursor.getDouble(_cursorIndexOfHeatindexC);
              }
              final Double _tmpHeatindex_f;
              if (_cursor.isNull(_cursorIndexOfHeatindexF)) {
                _tmpHeatindex_f = null;
              } else {
                _tmpHeatindex_f = _cursor.getDouble(_cursorIndexOfHeatindexF);
              }
              final double _tmpDewpoint_c;
              _tmpDewpoint_c = _cursor.getDouble(_cursorIndexOfDewpointC);
              final double _tmpDewpoint_f;
              _tmpDewpoint_f = _cursor.getDouble(_cursorIndexOfDewpointF);
              final double _tmpVis_km;
              _tmpVis_km = _cursor.getDouble(_cursorIndexOfVisKm);
              final double _tmpVis_miles;
              _tmpVis_miles = _cursor.getDouble(_cursorIndexOfVisMiles);
              final double _tmpUv;
              _tmpUv = _cursor.getDouble(_cursorIndexOfUv);
              final double _tmpGust_mph;
              _tmpGust_mph = _cursor.getDouble(_cursorIndexOfGustMph);
              final double _tmpGust_kph;
              _tmpGust_kph = _cursor.getDouble(_cursorIndexOfGustKph);
              final Condition _tmpCondition;
              final String _tmpText;
              if (_cursor.isNull(_cursorIndexOfText)) {
                _tmpText = null;
              } else {
                _tmpText = _cursor.getString(_cursorIndexOfText);
              }
              final String _tmpIcon;
              if (_cursor.isNull(_cursorIndexOfIcon)) {
                _tmpIcon = null;
              } else {
                _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
              }
              final int _tmpCode;
              _tmpCode = _cursor.getInt(_cursorIndexOfCode);
              _tmpCondition = new Condition(_tmpText,_tmpIcon,_tmpCode);
              _tmpCurrent = new Current(_tmpLast_updated_epoch,_tmpLast_updated,_tmpTemp_c,_tmpTemp_f,_tmpIs_day,_tmpCondition,_tmpWind_mph,_tmpWind_kph,_tmpWind_degree,_tmpWind_dir,_tmpPressure_mb,_tmpPressure_in,_tmpPrecip_mm,_tmpPrecip_in,_tmpHumidity,_tmpCloud,_tmpFeelslike_c,_tmpFeelslike_f,_tmpWindchill_c,_tmpWindchill_f,_tmpHeatindex_c,_tmpHeatindex_f,_tmpDewpoint_c,_tmpDewpoint_f,_tmpVis_km,_tmpVis_miles,_tmpUv,_tmpGust_mph,_tmpGust_kph);
            } else {
              _tmpCurrent = null;
            }
            final Forecast _tmpForecast;
            if (!(_cursor.isNull(_cursorIndexOfForecastday))) {
              final List<ForecastDay> _tmpForecastday;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfForecastday)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfForecastday);
              }
              _tmpForecastday = __converterOfLists.toForecastDayList(_tmp);
              _tmpForecast = new Forecast(_tmpForecastday);
            } else {
              _tmpForecast = null;
            }
            _item = new WeatherData(_tmpId,_tmpLocation,_tmpCurrent,_tmpForecast);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getTheWeatherOfCity(final String cityName,
      final Continuation<? super WeatherData> $completion) {
    final String _sql = "SELECT * FROM weather_data where name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (cityName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, cityName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WeatherData>() {
      @Override
      @NonNull
      public WeatherData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfTzId = CursorUtil.getColumnIndexOrThrow(_cursor, "tz_id");
          final int _cursorIndexOfLocaltimeEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime_epoch");
          final int _cursorIndexOfLocaltime = CursorUtil.getColumnIndexOrThrow(_cursor, "localtime");
          final int _cursorIndexOfLastUpdatedEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated_epoch");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated");
          final int _cursorIndexOfTempC = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_c");
          final int _cursorIndexOfTempF = CursorUtil.getColumnIndexOrThrow(_cursor, "temp_f");
          final int _cursorIndexOfIsDay = CursorUtil.getColumnIndexOrThrow(_cursor, "is_day");
          final int _cursorIndexOfWindMph = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_mph");
          final int _cursorIndexOfWindKph = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_kph");
          final int _cursorIndexOfWindDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_degree");
          final int _cursorIndexOfWindDir = CursorUtil.getColumnIndexOrThrow(_cursor, "wind_dir");
          final int _cursorIndexOfPressureMb = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure_mb");
          final int _cursorIndexOfPressureIn = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure_in");
          final int _cursorIndexOfPrecipMm = CursorUtil.getColumnIndexOrThrow(_cursor, "precip_mm");
          final int _cursorIndexOfPrecipIn = CursorUtil.getColumnIndexOrThrow(_cursor, "precip_in");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfCloud = CursorUtil.getColumnIndexOrThrow(_cursor, "cloud");
          final int _cursorIndexOfFeelslikeC = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslike_c");
          final int _cursorIndexOfFeelslikeF = CursorUtil.getColumnIndexOrThrow(_cursor, "feelslike_f");
          final int _cursorIndexOfWindchillC = CursorUtil.getColumnIndexOrThrow(_cursor, "windchill_c");
          final int _cursorIndexOfWindchillF = CursorUtil.getColumnIndexOrThrow(_cursor, "windchill_f");
          final int _cursorIndexOfHeatindexC = CursorUtil.getColumnIndexOrThrow(_cursor, "heatindex_c");
          final int _cursorIndexOfHeatindexF = CursorUtil.getColumnIndexOrThrow(_cursor, "heatindex_f");
          final int _cursorIndexOfDewpointC = CursorUtil.getColumnIndexOrThrow(_cursor, "dewpoint_c");
          final int _cursorIndexOfDewpointF = CursorUtil.getColumnIndexOrThrow(_cursor, "dewpoint_f");
          final int _cursorIndexOfVisKm = CursorUtil.getColumnIndexOrThrow(_cursor, "vis_km");
          final int _cursorIndexOfVisMiles = CursorUtil.getColumnIndexOrThrow(_cursor, "vis_miles");
          final int _cursorIndexOfUv = CursorUtil.getColumnIndexOrThrow(_cursor, "uv");
          final int _cursorIndexOfGustMph = CursorUtil.getColumnIndexOrThrow(_cursor, "gust_mph");
          final int _cursorIndexOfGustKph = CursorUtil.getColumnIndexOrThrow(_cursor, "gust_kph");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfForecastday = CursorUtil.getColumnIndexOrThrow(_cursor, "forecastday");
          final WeatherData _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Location _tmpLocation;
            if (!(_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfRegion) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfTzId) && _cursor.isNull(_cursorIndexOfLocaltimeEpoch) && _cursor.isNull(_cursorIndexOfLocaltime))) {
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpRegion;
              if (_cursor.isNull(_cursorIndexOfRegion)) {
                _tmpRegion = null;
              } else {
                _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
              }
              final String _tmpCountry;
              if (_cursor.isNull(_cursorIndexOfCountry)) {
                _tmpCountry = null;
              } else {
                _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
              }
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              final double _tmpLon;
              _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              final String _tmpTz_id;
              if (_cursor.isNull(_cursorIndexOfTzId)) {
                _tmpTz_id = null;
              } else {
                _tmpTz_id = _cursor.getString(_cursorIndexOfTzId);
              }
              final long _tmpLocaltime_epoch;
              _tmpLocaltime_epoch = _cursor.getLong(_cursorIndexOfLocaltimeEpoch);
              final String _tmpLocaltime;
              if (_cursor.isNull(_cursorIndexOfLocaltime)) {
                _tmpLocaltime = null;
              } else {
                _tmpLocaltime = _cursor.getString(_cursorIndexOfLocaltime);
              }
              _tmpLocation = new Location(_tmpName,_tmpRegion,_tmpCountry,_tmpLat,_tmpLon,_tmpTz_id,_tmpLocaltime_epoch,_tmpLocaltime);
            } else {
              _tmpLocation = null;
            }
            final Current _tmpCurrent;
            if (!(_cursor.isNull(_cursorIndexOfLastUpdatedEpoch) && _cursor.isNull(_cursorIndexOfLastUpdated) && _cursor.isNull(_cursorIndexOfTempC) && _cursor.isNull(_cursorIndexOfTempF) && _cursor.isNull(_cursorIndexOfIsDay) && _cursor.isNull(_cursorIndexOfWindMph) && _cursor.isNull(_cursorIndexOfWindKph) && _cursor.isNull(_cursorIndexOfWindDegree) && _cursor.isNull(_cursorIndexOfWindDir) && _cursor.isNull(_cursorIndexOfPressureMb) && _cursor.isNull(_cursorIndexOfPressureIn) && _cursor.isNull(_cursorIndexOfPrecipMm) && _cursor.isNull(_cursorIndexOfPrecipIn) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfCloud) && _cursor.isNull(_cursorIndexOfFeelslikeC) && _cursor.isNull(_cursorIndexOfFeelslikeF) && _cursor.isNull(_cursorIndexOfWindchillC) && _cursor.isNull(_cursorIndexOfWindchillF) && _cursor.isNull(_cursorIndexOfHeatindexC) && _cursor.isNull(_cursorIndexOfHeatindexF) && _cursor.isNull(_cursorIndexOfDewpointC) && _cursor.isNull(_cursorIndexOfDewpointF) && _cursor.isNull(_cursorIndexOfVisKm) && _cursor.isNull(_cursorIndexOfVisMiles) && _cursor.isNull(_cursorIndexOfUv) && _cursor.isNull(_cursorIndexOfGustMph) && _cursor.isNull(_cursorIndexOfGustKph) && _cursor.isNull(_cursorIndexOfText) && _cursor.isNull(_cursorIndexOfIcon) && _cursor.isNull(_cursorIndexOfCode))) {
              final long _tmpLast_updated_epoch;
              _tmpLast_updated_epoch = _cursor.getLong(_cursorIndexOfLastUpdatedEpoch);
              final String _tmpLast_updated;
              if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
                _tmpLast_updated = null;
              } else {
                _tmpLast_updated = _cursor.getString(_cursorIndexOfLastUpdated);
              }
              final double _tmpTemp_c;
              _tmpTemp_c = _cursor.getDouble(_cursorIndexOfTempC);
              final double _tmpTemp_f;
              _tmpTemp_f = _cursor.getDouble(_cursorIndexOfTempF);
              final int _tmpIs_day;
              _tmpIs_day = _cursor.getInt(_cursorIndexOfIsDay);
              final double _tmpWind_mph;
              _tmpWind_mph = _cursor.getDouble(_cursorIndexOfWindMph);
              final double _tmpWind_kph;
              _tmpWind_kph = _cursor.getDouble(_cursorIndexOfWindKph);
              final int _tmpWind_degree;
              _tmpWind_degree = _cursor.getInt(_cursorIndexOfWindDegree);
              final String _tmpWind_dir;
              if (_cursor.isNull(_cursorIndexOfWindDir)) {
                _tmpWind_dir = null;
              } else {
                _tmpWind_dir = _cursor.getString(_cursorIndexOfWindDir);
              }
              final double _tmpPressure_mb;
              _tmpPressure_mb = _cursor.getDouble(_cursorIndexOfPressureMb);
              final double _tmpPressure_in;
              _tmpPressure_in = _cursor.getDouble(_cursorIndexOfPressureIn);
              final double _tmpPrecip_mm;
              _tmpPrecip_mm = _cursor.getDouble(_cursorIndexOfPrecipMm);
              final double _tmpPrecip_in;
              _tmpPrecip_in = _cursor.getDouble(_cursorIndexOfPrecipIn);
              final int _tmpHumidity;
              _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
              final int _tmpCloud;
              _tmpCloud = _cursor.getInt(_cursorIndexOfCloud);
              final double _tmpFeelslike_c;
              _tmpFeelslike_c = _cursor.getDouble(_cursorIndexOfFeelslikeC);
              final double _tmpFeelslike_f;
              _tmpFeelslike_f = _cursor.getDouble(_cursorIndexOfFeelslikeF);
              final Double _tmpWindchill_c;
              if (_cursor.isNull(_cursorIndexOfWindchillC)) {
                _tmpWindchill_c = null;
              } else {
                _tmpWindchill_c = _cursor.getDouble(_cursorIndexOfWindchillC);
              }
              final Double _tmpWindchill_f;
              if (_cursor.isNull(_cursorIndexOfWindchillF)) {
                _tmpWindchill_f = null;
              } else {
                _tmpWindchill_f = _cursor.getDouble(_cursorIndexOfWindchillF);
              }
              final Double _tmpHeatindex_c;
              if (_cursor.isNull(_cursorIndexOfHeatindexC)) {
                _tmpHeatindex_c = null;
              } else {
                _tmpHeatindex_c = _cursor.getDouble(_cursorIndexOfHeatindexC);
              }
              final Double _tmpHeatindex_f;
              if (_cursor.isNull(_cursorIndexOfHeatindexF)) {
                _tmpHeatindex_f = null;
              } else {
                _tmpHeatindex_f = _cursor.getDouble(_cursorIndexOfHeatindexF);
              }
              final double _tmpDewpoint_c;
              _tmpDewpoint_c = _cursor.getDouble(_cursorIndexOfDewpointC);
              final double _tmpDewpoint_f;
              _tmpDewpoint_f = _cursor.getDouble(_cursorIndexOfDewpointF);
              final double _tmpVis_km;
              _tmpVis_km = _cursor.getDouble(_cursorIndexOfVisKm);
              final double _tmpVis_miles;
              _tmpVis_miles = _cursor.getDouble(_cursorIndexOfVisMiles);
              final double _tmpUv;
              _tmpUv = _cursor.getDouble(_cursorIndexOfUv);
              final double _tmpGust_mph;
              _tmpGust_mph = _cursor.getDouble(_cursorIndexOfGustMph);
              final double _tmpGust_kph;
              _tmpGust_kph = _cursor.getDouble(_cursorIndexOfGustKph);
              final Condition _tmpCondition;
              final String _tmpText;
              if (_cursor.isNull(_cursorIndexOfText)) {
                _tmpText = null;
              } else {
                _tmpText = _cursor.getString(_cursorIndexOfText);
              }
              final String _tmpIcon;
              if (_cursor.isNull(_cursorIndexOfIcon)) {
                _tmpIcon = null;
              } else {
                _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
              }
              final int _tmpCode;
              _tmpCode = _cursor.getInt(_cursorIndexOfCode);
              _tmpCondition = new Condition(_tmpText,_tmpIcon,_tmpCode);
              _tmpCurrent = new Current(_tmpLast_updated_epoch,_tmpLast_updated,_tmpTemp_c,_tmpTemp_f,_tmpIs_day,_tmpCondition,_tmpWind_mph,_tmpWind_kph,_tmpWind_degree,_tmpWind_dir,_tmpPressure_mb,_tmpPressure_in,_tmpPrecip_mm,_tmpPrecip_in,_tmpHumidity,_tmpCloud,_tmpFeelslike_c,_tmpFeelslike_f,_tmpWindchill_c,_tmpWindchill_f,_tmpHeatindex_c,_tmpHeatindex_f,_tmpDewpoint_c,_tmpDewpoint_f,_tmpVis_km,_tmpVis_miles,_tmpUv,_tmpGust_mph,_tmpGust_kph);
            } else {
              _tmpCurrent = null;
            }
            final Forecast _tmpForecast;
            if (!(_cursor.isNull(_cursorIndexOfForecastday))) {
              final List<ForecastDay> _tmpForecastday;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfForecastday)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfForecastday);
              }
              _tmpForecastday = __converterOfLists.toForecastDayList(_tmp);
              _tmpForecast = new Forecast(_tmpForecastday);
            } else {
              _tmpForecast = null;
            }
            _result = new WeatherData(_tmpId,_tmpLocation,_tmpCurrent,_tmpForecast);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
