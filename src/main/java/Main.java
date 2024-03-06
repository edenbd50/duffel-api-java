import com.duffel.DuffelApiClient;
import com.duffel.model.request.PaymentIntentRequest;
import com.duffel.model.response.PaymentIntentResponse;

import java.io.Console;

public class Main {

    private static DuffelApiClient apiClient;
    public static void main(String[] args){
        String value = System.getenv("API_KEY");
        apiClient = new DuffelApiClient(value);
        createPaymentExample();
    }
    public static void createPaymentExample(){
        PaymentIntentRequest intentRequest = new PaymentIntentRequest();
        intentRequest.amount = "100.00";
        intentRequest.currency = "USD";
        System.out.println("Create Payment Intent " + intentRequest);
        PaymentIntentResponse response = apiClient.paymentsIntentService.create(intentRequest);
        System.out.println("Response: " + response);
    }
}
