package my.thanhhoang.chatapp.Fragment;

import my.thanhhoang.chatapp.Notifications.MyResponse;
import my.thanhhoang.chatapp.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAeTiPswI:APA91bHMRm5AJlt_b-wnRH3t-uIIDYURQPEzABjA0SIVWSch6NqZ9YpgnNBKrBR4MB_sWNtTT_USkZz-7iH1vs97b-S1YzYRAeo0I1i_gkNbbXqdlzC662Xe3KKfaNSYR4zqJaveRuqz"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifiaction(@Body Sender body);
}
