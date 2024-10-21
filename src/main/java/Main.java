import com.duffel.DuffelApiClient;
import com.duffel.model.request.PaymentIntentRequest;
import com.duffel.model.response.PaymentIntentResponse;

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
        PaymentIntentResponse response = apiClient.paymentsIntentService.create(intentRequest);
        apiClient.staysService.getQuoteById("quote_123");
    }
}