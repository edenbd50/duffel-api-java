package com.duffel.service;

import com.duffel.model.request.PaymentIntentConfirmRequest;
import com.duffel.model.request.PaymentIntentRequest;
import com.duffel.model.request.PaymentRequest;
import com.duffel.model.request.PostData;
import com.duffel.model.response.*;
import com.duffel.net.ApiClient;

import java.util.List;

public class PaymentsIntentService {

    PaymentsIntent paymentsIntent;
    PaymentsIntentConfirm paymentsIntentConfirm;

    private static final String ENDPOINT = "/air/payments/payment_intents";

    public PaymentsIntentService(ApiClient apiClient) {
        paymentsIntent = new PaymentsIntent(apiClient);
    }

    public PaymentIntentResponse create(PaymentRequest request) {
        return paymentsIntent.create(request);
    }
    public PaymentIntentResponse get(String id) {
        return paymentsIntent.get(id);
    }

    public PaymentIntentConfirmResponse confirmPayment(String id) {
        return paymentsIntentConfirm.confirmPayment(id);
    }

}

public class PaymentsIntent extends PostResource<PaymentIntentResponse, PaymentIntentResponse> {
    private static final String ENDPOINT = "/air/payments/payment_intents";

    public PaymentsIntent(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public PaymentIntentResponse create(PaymentRequest request) {
        return super.post(PaymentIntentResponse.class, new PostData<>(request)).getData();
    }

    public PaymentIntentResponse get(String id) {
        return super.get(PaymentIntentResponse.class, "/" + id).getData();
    }
}

public class PaymentsIntentConfirm extends PostResource<PaymentIntentConfirmResponse, PaymentIntentConfirmResponse> {
    private static final String ENDPOINT = "/air/payments/payment_intents";

    public PaymentsIntentConfirm(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }
    public PaymentIntentConfirmResponse confirmPayment(String id) {
        return super.post(PaymentIntentConfirmResponse.class, id + "actions/confirm", new PostData<>(new PaymentIntentConfirmRequest())).getData();
    }

}
