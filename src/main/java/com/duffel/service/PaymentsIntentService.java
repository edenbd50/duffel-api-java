package com.duffel.service;

import com.duffel.model.request.PaymentIntentConfirmRequest;
import com.duffel.model.request.PaymentIntentRequest;
import com.duffel.model.request.PostData;
import com.duffel.model.response.*;
import com.duffel.net.ApiClient;

import java.util.List;

public class PaymentsIntentService {

    PaymentsIntent paymentsIntent;
    PaymentsIntentConfirm paymentsIntentConfirm;

    private static final String ENDPOINT = "/payments/payment_intents";

    public PaymentsIntentService(ApiClient apiClient) {
        paymentsIntent = new PaymentsIntent(apiClient);
        paymentsIntentConfirm = new PaymentsIntentConfirm(apiClient);
    }

    public PaymentIntentResponse create(PaymentIntentRequest request) {
        return paymentsIntent.create(request);
    }
    public PaymentIntentResponse get(String id) {
        return paymentsIntent.get(id);
    }

    public PaymentIntentConfirmResponse confirmPayment(String id) {
        return paymentsIntentConfirm.confirmPayment(id);
    }

}

class PaymentsIntent extends PostResource<PaymentIntentResponse, PaymentIntentResponse> {
    private static final String ENDPOINT = "/payments/payment_intents";

    public PaymentsIntent(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public PaymentIntentResponse create(PaymentIntentRequest request) {
        return super.post(PaymentIntentResponse.class, new PostData<>(request)).getData();
    }

    public PaymentIntentResponse get(String id) {
        return super.get(PaymentIntentResponse.class, "/" + id).getData();
    }
}

class PaymentsIntentConfirm extends PostResource<PaymentIntentConfirmResponse, PaymentIntentConfirmResponse> {
    private static final String ENDPOINT = "/payments/payment_intents";

    public PaymentsIntentConfirm(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }
    public PaymentIntentConfirmResponse confirmPayment(String id) {
        return super.post(PaymentIntentConfirmResponse.class, id + "/actions/confirm", new PostData<>(new PaymentIntentConfirmRequest())).getData();
    }

}
