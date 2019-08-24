package ua.in.khol.oleh.touristweathercomparer.model.location;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ua.in.khol.oleh.touristweathercomparer.model.location.pojo.LocationData;


/**
 * Created by Oleh Kholiavchuk.
 */

public interface LocationDataService {

    @GET("/maps/api/geocode/json")
    Observable<LocationData> getLocationData(@Query("latlng") String latlng,
                                             @Query("language") String language,
                                             @Query("key") String key);
}