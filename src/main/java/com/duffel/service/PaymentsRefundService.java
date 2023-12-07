package com.duffel.service;

import com.duffel.model.request.PaymentRefundRequest;
import com.duffel.model.request.PaymentRequest;
import com.duffel.model.request.PostData;
import com.duffel.model.response.PaymentRefundResponse;
import com.duffel.model.response.PaymentResponse;
import com.duffel.net.ApiClient;

public class PaymentsRefundService extends PostResource<PaymentRefundResponse, PaymentRefundResponse> {

    private static final String ENDPOINT = "/air/payments/refunds";

    public PaymentsRefundService(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public PaymentRefundResponse create(PaymentRefundRequest request) {
        return super.post(PaymentRefundResponse.class, new PostData<>(request)).getData();
    }

}
