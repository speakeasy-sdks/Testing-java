/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Testing.petstore;

import Testing.petstore.utils.HTTPClient;
import Testing.petstore.utils.HTTPRequest;
import Testing.petstore.utils.JSON;
import Testing.petstore.utils.SerializedBody;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

/**
 * Access to Petstore orders
 * http://swagger.io - Find out more about our store
 */
public class Store {
	
	private SDKConfiguration sdkConfiguration;

	public Store(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.DeleteOrderResponse deleteOrder(Testing.petstore.models.operations.DeleteOrderRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.DeleteOrderRequest.class, baseUrl, "/store/order/{orderId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.DeleteOrderResponse res = new Testing.petstore.models.operations.DeleteOrderResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.GetInventoryResponse getInventory(Testing.petstore.models.operations.GetInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/store/inventory");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Testing.petstore.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.GetInventoryResponse res = new Testing.petstore.models.operations.GetInventoryResponse(contentType, httpRes.statusCode()) {{
            getInventory200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Integer> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, Integer>>() {});
                res.getInventory200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;= 5 or &gt; 10. Other values will generate exceptions.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.GetOrderByIdResponse getOrderById(Testing.petstore.models.operations.GetOrderByIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.GetOrderByIdRequest.class, baseUrl, "/store/order/{orderId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.GetOrderByIdResponse res = new Testing.petstore.models.operations.GetOrderByIdResponse(contentType, httpRes.statusCode()) {{
            order = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.Order out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.Order.class);
                res.order = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Place an order for a pet
     * Place a new order in the store
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.PlaceOrderFormResponse placeOrderForm(Testing.petstore.models.shared.Order request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/store/order");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "form");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.PlaceOrderFormResponse res = new Testing.petstore.models.operations.PlaceOrderFormResponse(contentType, httpRes.statusCode()) {{
            order = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.Order out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.Order.class);
                res.order = out;
            }
        }
        else if (httpRes.statusCode() == 405) {
        }

        return res;
    }

    /**
     * Place an order for a pet
     * Place a new order in the store
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.PlaceOrderJsonResponse placeOrderJson(Testing.petstore.models.shared.Order request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/store/order");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.PlaceOrderJsonResponse res = new Testing.petstore.models.operations.PlaceOrderJsonResponse(contentType, httpRes.statusCode()) {{
            order = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.Order out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.Order.class);
                res.order = out;
            }
        }
        else if (httpRes.statusCode() == 405) {
        }

        return res;
    }

    /**
     * Place an order for a pet
     * Place a new order in the store
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.PlaceOrderRawResponse placeOrderRaw(byte[] request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/store/order");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "raw");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.PlaceOrderRawResponse res = new Testing.petstore.models.operations.PlaceOrderRawResponse(contentType, httpRes.statusCode()) {{
            order = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.Order out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.Order.class);
                res.order = out;
            }
        }
        else if (httpRes.statusCode() == 405) {
        }

        return res;
    }
}