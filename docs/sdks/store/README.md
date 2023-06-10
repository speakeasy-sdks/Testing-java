# store

## Overview

Access to Petstore orders

Find out more about our store
<http://swagger.io>
### Available Operations

* [deleteOrder](#deleteorder) - Delete purchase order by ID
* [getInventory](#getinventory) - Returns pet inventories by status
* [getOrderById](#getorderbyid) - Find purchase order by ID
* [placeOrderForm](#placeorderform) - Place an order for a pet
* [placeOrderJson](#placeorderjson) - Place an order for a pet
* [placeOrderRaw](#placeorderraw) - Place an order for a pet

## deleteOrder

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.DeleteOrderRequest;
import Testing.petstore.models.operations.DeleteOrderResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            DeleteOrderRequest req = new DeleteOrderRequest(55714L);            

            DeleteOrderResponse res = sdk.store.deleteOrder(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [Testing.petstore.models.operations.DeleteOrderRequest](../../models/operations/DeleteOrderRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Testing.petstore.models.operations.DeleteOrderResponse](../../models/operations/DeleteOrderResponse.md)**


## getInventory

Returns a map of status codes to quantities

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.GetInventoryResponse;
import Testing.petstore.models.operations.GetInventorySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            GetInventoryResponse res = sdk.store.getInventory(new GetInventorySecurity("omnis") {{
                apiKey = "";
            }});

            if (res.getInventory200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                 | [Testing.petstore.models.operations.GetInventorySecurity](../../models/operations/GetInventorySecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[Testing.petstore.models.operations.GetInventoryResponse](../../models/operations/GetInventoryResponse.md)**


## getOrderById

For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.GetOrderByIdRequest;
import Testing.petstore.models.operations.GetOrderByIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            GetOrderByIdRequest req = new GetOrderByIdRequest(451159L);            

            GetOrderByIdResponse res = sdk.store.getOrderById(req);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [Testing.petstore.models.operations.GetOrderByIdRequest](../../models/operations/GetOrderByIdRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Testing.petstore.models.operations.GetOrderByIdResponse](../../models/operations/GetOrderByIdResponse.md)**


## placeOrderForm

Place a new order in the store

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.PlaceOrderFormResponse;
import Testing.petstore.models.shared.Order;
import Testing.petstore.models.shared.OrderStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.shared.Order req = new Order() {{
                complete = false;
                id = 10L;
                petId = 198772L;
                quantity = 7;
                shipDate = OffsetDateTime.parse("2022-12-17T09:48:56.551Z");
                status = OrderStatus.APPROVED;
            }};            

            PlaceOrderFormResponse res = sdk.store.placeOrderForm(req);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [Testing.petstore.models.shared.Order](../../models/shared/Order.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[Testing.petstore.models.operations.PlaceOrderFormResponse](../../models/operations/PlaceOrderFormResponse.md)**


## placeOrderJson

Place a new order in the store

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.PlaceOrderJsonResponse;
import Testing.petstore.models.shared.Order;
import Testing.petstore.models.shared.OrderStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.shared.Order req = new Order() {{
                complete = false;
                id = 10L;
                petId = 198772L;
                quantity = 7;
                shipDate = OffsetDateTime.parse("2022-07-23T18:36:43.822Z");
                status = OrderStatus.APPROVED;
            }};            

            PlaceOrderJsonResponse res = sdk.store.placeOrderJson(req);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [Testing.petstore.models.shared.Order](../../models/shared/Order.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[Testing.petstore.models.operations.PlaceOrderJsonResponse](../../models/operations/PlaceOrderJsonResponse.md)**


## placeOrderRaw

Place a new order in the store

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.PlaceOrderRawResponse;
import Testing.petstore.models.shared.Order;
import Testing.petstore.models.shared.OrderStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.. req = "ut".getBytes()            

            PlaceOrderRawResponse res = sdk.store.placeOrderRaw(req);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Testing.petstore.models.operations.PlaceOrderRawResponse](../../models/operations/PlaceOrderRawResponse.md)**

