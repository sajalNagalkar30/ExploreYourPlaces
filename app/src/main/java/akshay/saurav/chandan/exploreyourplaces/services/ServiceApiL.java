package akshay.saurav.chandan.exploreyourplaces.services;




import akshay.saurav.chandan.exploreyourplaces.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceApiL {

    @GET("register.php")
    Call<User> doRegistration(@Query("name") String name, @Query("email") String email, @Query("phone") String phone, @Query("password") String password);

    @GET("login-landlord.php")
    Call<User> doLogin(@Query("email") String email, @Query("password") String password);
}
