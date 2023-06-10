# user

## Overview

Operations about user

### Available Operations

* [createUserForm](#createuserform) - Create user
* [createUserJson](#createuserjson) - Create user
* [createUserRaw](#createuserraw) - Create user
* [createUsersWithListInput](#createuserswithlistinput) - Creates list of users with given input array
* [deleteUser](#deleteuser) - Delete user
* [getUserByName](#getuserbyname) - Get user by user name
* [loginUser](#loginuser) - Logs user into the system
* [logoutUser](#logoutuser) - Logs out current logged in user session
* [updateUserForm](#updateuserform) - Update user
* [updateUserJson](#updateuserjson) - Update user
* [updateUserRaw](#updateuserraw) - Update user

## createUserForm

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.CreateUserFormResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.shared.User req = new User() {{
                email = "john@email.com";
                firstName = "John";
                id = 10L;
                lastName = "James";
                password = "12345";
                phone = "12345";
                userStatus = 1;
                username = "theUser";
            }};            

            CreateUserFormResponse res = sdk.user.createUserForm(req);

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

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [Testing.petstore.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |


### Response

**[Testing.petstore.models.operations.CreateUserFormResponse](../../models/operations/CreateUserFormResponse.md)**


## createUserJson

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.CreateUserJsonResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.shared.User req = new User() {{
                email = "john@email.com";
                firstName = "John";
                id = 10L;
                lastName = "James";
                password = "12345";
                phone = "12345";
                userStatus = 1;
                username = "theUser";
            }};            

            CreateUserJsonResponse res = sdk.user.createUserJson(req);

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

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [Testing.petstore.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |


### Response

**[Testing.petstore.models.operations.CreateUserJsonResponse](../../models/operations/CreateUserJsonResponse.md)**


## createUserRaw

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.CreateUserRawResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.. req = "maiores".getBytes()            

            CreateUserRawResponse res = sdk.user.createUserRaw(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Testing.petstore.models.operations.CreateUserRawResponse](../../models/operations/CreateUserRawResponse.md)**


## createUsersWithListInput

Creates list of users with given input array

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.CreateUsersWithListInputResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.. req = new Testing.petstore.models.shared.User[]{{
                add(new User() {{
                    email = "john@email.com";
                    firstName = "John";
                    id = 10L;
                    lastName = "James";
                    password = "12345";
                    phone = "12345";
                    userStatus = 1;
                    username = "theUser";
                }}),
            }}            

            CreateUsersWithListInputResponse res = sdk.user.createUsersWithListInput(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [Testing.petstore.models.shared.User[]](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[Testing.petstore.models.operations.CreateUsersWithListInputResponse](../../models/operations/CreateUsersWithListInputResponse.md)**


## deleteUser

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.DeleteUserRequest;
import Testing.petstore.models.operations.DeleteUserResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            DeleteUserRequest req = new DeleteUserRequest("corporis");            

            DeleteUserResponse res = sdk.user.deleteUser(req);

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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [Testing.petstore.models.operations.DeleteUserRequest](../../models/operations/DeleteUserRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Testing.petstore.models.operations.DeleteUserResponse](../../models/operations/DeleteUserResponse.md)**


## getUserByName

Get user by user name

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.GetUserByNameRequest;
import Testing.petstore.models.operations.GetUserByNameResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            GetUserByNameRequest req = new GetUserByNameRequest("dolore");            

            GetUserByNameResponse res = sdk.user.getUserByName(req);

            if (res.user != null) {
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
| `request`                                                                                                  | [Testing.petstore.models.operations.GetUserByNameRequest](../../models/operations/GetUserByNameRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Testing.petstore.models.operations.GetUserByNameResponse](../../models/operations/GetUserByNameResponse.md)**


## loginUser

Logs user into the system

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.LoginUserRequest;
import Testing.petstore.models.operations.LoginUserResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            LoginUserRequest req = new LoginUserRequest() {{
                password = "iusto";
                username = "Birdie88";
            }};            

            LoginUserResponse res = sdk.user.loginUser(req);

            if (res.loginUser200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [Testing.petstore.models.operations.LoginUserRequest](../../models/operations/LoginUserRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Testing.petstore.models.operations.LoginUserResponse](../../models/operations/LoginUserResponse.md)**


## logoutUser

Logs out current logged in user session

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.LogoutUserResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            LogoutUserResponse res = sdk.user.logoutUser();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Testing.petstore.models.operations.LogoutUserResponse](../../models/operations/LogoutUserResponse.md)**


## updateUserForm

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdateUserFormRequest;
import Testing.petstore.models.operations.UpdateUserFormResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            UpdateUserFormRequest req = new UpdateUserFormRequest("commodi") {{
                user = new User() {{
                    email = "john@email.com";
                    firstName = "John";
                    id = 10L;
                    lastName = "James";
                    password = "12345";
                    phone = "12345";
                    userStatus = 1;
                    username = "theUser";
                }};;
            }};            

            UpdateUserFormResponse res = sdk.user.updateUserForm(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [Testing.petstore.models.operations.UpdateUserFormRequest](../../models/operations/UpdateUserFormRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Testing.petstore.models.operations.UpdateUserFormResponse](../../models/operations/UpdateUserFormResponse.md)**


## updateUserJson

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdateUserJsonRequest;
import Testing.petstore.models.operations.UpdateUserJsonResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            UpdateUserJsonRequest req = new UpdateUserJsonRequest("repudiandae") {{
                user = new User() {{
                    email = "john@email.com";
                    firstName = "John";
                    id = 10L;
                    lastName = "James";
                    password = "12345";
                    phone = "12345";
                    userStatus = 1;
                    username = "theUser";
                }};;
            }};            

            UpdateUserJsonResponse res = sdk.user.updateUserJson(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [Testing.petstore.models.operations.UpdateUserJsonRequest](../../models/operations/UpdateUserJsonRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Testing.petstore.models.operations.UpdateUserJsonResponse](../../models/operations/UpdateUserJsonResponse.md)**


## updateUserRaw

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdateUserRawRequest;
import Testing.petstore.models.operations.UpdateUserRawResponse;
import Testing.petstore.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            UpdateUserRawRequest req = new UpdateUserRawRequest("quae") {{
                requestBody = "ipsum".getBytes();
            }};            

            UpdateUserRawResponse res = sdk.user.updateUserRaw(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [Testing.petstore.models.operations.UpdateUserRawRequest](../../models/operations/UpdateUserRawRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Testing.petstore.models.operations.UpdateUserRawResponse](../../models/operations/UpdateUserRawResponse.md)**

