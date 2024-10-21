package com.duffel.service;

import com.duffel.model.request.PostData;
import com.duffel.net.ApiClient;
import com.duffel.stays.request.book.BookHotelRequest;
import com.duffel.stays.request.quotes.CreateQuoteRequest;
import com.duffel.stays.request.search.SearchAccommodationRequest;
import com.duffel.stays.request.search_result.FetchRatesRequest;
import com.duffel.stays.response.bookings.BookHotelResponse;
import com.duffel.stays.response.quotes.QuoteResponse;
import com.duffel.stays.response.search.SearchAccommodationsResponse;
import com.duffel.stays.response.search_result.FetchRatesResponse;

public class StaysService {

    final private SearchAccommodations accommodations;
    final private FetchRates rates;
    final private Quotes quotes;
    final private BookingsOrder bookingsOrder;
    final private BookingsCancellation bookingsCancellation;
    PaymentsIntentConfirm paymentsIntentConfirm;

    private static final String ENDPOINT = "/air/payments/payment_intents";

    public StaysService(ApiClient apiClient) {
        accommodations = new SearchAccommodations(apiClient);
        rates = new FetchRates(apiClient);
        quotes = new Quotes(apiClient);
        bookingsOrder = new BookingsOrder(apiClient);
        bookingsCancellation = new BookingsCancellation(apiClient);
    }

    public SearchAccommodationsResponse search(SearchAccommodationRequest request) {
        return accommodations.search(request);
    }
    public FetchRatesResponse searchRate(FetchRatesRequest request) {
        return rates.search(request);
    }
    public QuoteResponse createQuote(CreateQuoteRequest request) {
        return quotes.createQuote(request);
    }
    public QuoteResponse getQuoteById(String quoteId) {
        return quotes.getQuoteById(quoteId);
    }
    public BookHotelResponse createBooking(BookHotelRequest request) {
        return bookingsOrder.createBooking(request);
    }
    public BookHotelResponse cancelBooking(String bookingId) {
        return bookingsCancellation.cancelBooking(bookingId);
    }
    public BookHotelResponse getBooking(String bookingId) {
        return bookingsOrder.getBooking(bookingId);
    }
}

class SearchAccommodations extends PostResource<SearchAccommodationsResponse, SearchAccommodationRequest> {
    private static final String ENDPOINT = "/stays/search";

    public SearchAccommodations(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public SearchAccommodationsResponse search(SearchAccommodationRequest request) {
        return super.post(SearchAccommodationsResponse.class, new PostData<>(request)).getData();
    }
}

class FetchRates extends PostResource<FetchRatesResponse, FetchRatesRequest> {
    private static final String ENDPOINT = "/stays/search_results";

    public FetchRates(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public FetchRatesResponse search(FetchRatesRequest request) {
        return super.post(FetchRatesResponse.class, request.searchResultId + "/actions/fetch_all_rates", new PostData<>(request)).getData();
    }
}

class Quotes extends PostResource<QuoteResponse, QuoteResponse> {
    private static final String ENDPOINT = "/stays/quotes";

    public Quotes(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public QuoteResponse createQuote(CreateQuoteRequest request) {
        return super.post(QuoteResponse.class, new PostData<>(request)).getData();
    }

    public QuoteResponse getQuoteById(String quoteId) {
        return super.get(QuoteResponse.class, "/" + quoteId).getData();
    }
}

class BookingsOrder extends PostResource<BookHotelResponse, BookHotelResponse> {
    private static final String ENDPOINT = "/stays/bookings";

    public BookingsOrder(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public BookHotelResponse createBooking(BookHotelRequest request) {
        return super.post(BookHotelResponse.class, new PostData<>(request)).getData();
    }

    public BookHotelResponse getBooking(String bookingId) {
        return super.get(BookHotelResponse.class, "/" + bookingId).getData();
    }
}

class BookingsCancellation extends PostResource<BookHotelResponse, BookHotelResponse> {
    private static final String ENDPOINT = "/stays/bookings";

    public BookingsCancellation(ApiClient apiClient) {
        super(apiClient, ENDPOINT);
    }

    public BookHotelResponse cancelBooking(String bookingId) {
        return super.post(BookHotelResponse.class, bookingId + "/actions/cancel", new PostData<>(null)).getData();
    }
}
