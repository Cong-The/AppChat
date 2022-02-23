package com.example.appchat.Fragments;

import com.example.appchat.Notifications.MyResponse;
import com.example.appchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6d_GeEU:APA91bEjsjt21jO93ZgWBOWjHPV-mw9twL1MxURiT_nQeJDHouyW1gdwF65kQ2ArmuO5D_4X0E8tXpOMyr4kAl7zGaxTKjSHmH5SS-sWAFY7HAK8fMreXs-NdoG8DU6FcaLL1kV5cRJT"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
