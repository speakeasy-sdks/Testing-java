/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Testing.petstore;

import Testing.petstore.utils.HTTPClient;
import Testing.petstore.utils.HTTPRequest;
import Testing.petstore.utils.JSON;
import Testing.petstore.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

/**
 * Operations about user
 */
public class User {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public User(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.CreateUserFormResponse createUserForm(Testing.petstore.models.shared.User request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "form");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.CreateUserFormResponse res = new Testing.petstore.models.operations.CreateUserFormResponse(contentType, httpRes.statusCode()) {{
            user = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.User out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.User.class);
                res.user = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }

        return res;
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.CreateUserJsonResponse createUserJson(Testing.petstore.models.shared.User request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.CreateUserJsonResponse res = new Testing.petstore.models.operations.CreateUserJsonResponse(contentType, httpRes.statusCode()) {{
            user = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.User out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.User.class);
                res.user = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }

        return res;
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.CreateUserRawResponse createUserRaw(byte[] request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "raw");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.CreateUserRawResponse res = new Testing.petstore.models.operations.CreateUserRawResponse(contentType, httpRes.statusCode()) {{
            user = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.User out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.User.class);
                res.user = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }

        return res;
    }

    /**
     * Creates list of users with given input array
     * Creates list of users with given input array
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.CreateUsersWithListInputResponse createUsersWithListInput(Testing.petstore.models.shared.User[] request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user/createWithList");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.CreateUsersWithListInputResponse res = new Testing.petstore.models.operations.CreateUsersWithListInputResponse(contentType, httpRes.statusCode()) {{
            user = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.User out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.User.class);
                res.user = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else {
        }

        return res;
    }

    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.DeleteUserResponse deleteUser(Testing.petstore.models.operations.DeleteUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.DeleteUserRequest.class, baseUrl, "/user/{username}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.DeleteUserResponse res = new Testing.petstore.models.operations.DeleteUserResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Get user by user name
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.GetUserByNameResponse getUserByName(Testing.petstore.models.operations.GetUserByNameRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.GetUserByNameRequest.class, baseUrl, "/user/{username}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.GetUserByNameResponse res = new Testing.petstore.models.operations.GetUserByNameResponse(contentType, httpRes.statusCode()) {{
            user = null;
            body = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Testing.petstore.models.shared.User out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Testing.petstore.models.shared.User.class);
                res.user = out;
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
     * Logs user into the system
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.LoginUserResponse loginUser(Testing.petstore.models.operations.LoginUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user/login");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/xml;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = Testing.petstore.utils.Utils.getQueryParams(Testing.petstore.models.operations.LoginUserRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.LoginUserResponse res = new Testing.petstore.models.operations.LoginUserResponse(contentType, httpRes.statusCode()) {{
            loginUser200ApplicationJSONString = null;
            loginUser200ApplicationXMLString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.loginUser200ApplicationJSONString = out;
            }
            if (Testing.petstore.utils.Utils.matchContentType(contentType, "application/xml")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.loginUser200ApplicationXMLString = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }

        return res;
    }

    /**
     * Logs out current logged in user session
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.LogoutUserResponse logoutUser() throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(baseUrl, "/user/logout");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.LogoutUserResponse res = new Testing.petstore.models.operations.LogoutUserResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (true) {
        }

        return res;
    }

    /**
     * Update user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.UpdateUserFormResponse updateUserForm(Testing.petstore.models.operations.UpdateUserFormRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.UpdateUserFormRequest.class, baseUrl, "/user/{username}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "user", "form");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.UpdateUserFormResponse res = new Testing.petstore.models.operations.UpdateUserFormResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (true) {
        }

        return res;
    }

    /**
     * Update user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.UpdateUserJsonResponse updateUserJson(Testing.petstore.models.operations.UpdateUserJsonRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.UpdateUserJsonRequest.class, baseUrl, "/user/{username}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "user", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.UpdateUserJsonResponse res = new Testing.petstore.models.operations.UpdateUserJsonResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (true) {
        }

        return res;
    }

    /**
     * Update user
     * This can only be done by the logged in user.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Testing.petstore.models.operations.UpdateUserRawResponse updateUserRaw(Testing.petstore.models.operations.UpdateUserRawRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Testing.petstore.utils.Utils.generateURL(Testing.petstore.models.operations.UpdateUserRawRequest.class, baseUrl, "/user/{username}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Testing.petstore.utils.Utils.serializeRequestBody(request, "requestBody", "raw");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Testing.petstore.models.operations.UpdateUserRawResponse res = new Testing.petstore.models.operations.UpdateUserRawResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (true) {
        }

        return res;
    }
}