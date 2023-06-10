# petstore

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'Testing.petstore:petstore:1.3.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.AddPetFormResponse;
import Testing.petstore.models.operations.AddPetFormSecurity;
import Testing.petstore.models.shared.Category;
import Testing.petstore.models.shared.Pet;
import Testing.petstore.models.shared.PetStatus;
import Testing.petstore.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.shared.Pet req = new Pet("doggie",                 new String[]{{
                                add("provident"),
                                add("distinctio"),
                                add("quibusdam"),
                            }}) {{
                category = new Category() {{
                    id = 1L;
                    name = "Dogs";
                }};;
                id = 10L;
                status = PetStatus.PENDING;
                tags = new Testing.petstore.models.shared.Tag[]{{
                    add(new Tag() {{
                        id = 544883L;
                        name = "Ben Mueller";
                    }}),
                    add(new Tag() {{
                        id = 437587L;
                        name = "Raquel Bednar";
                    }}),
                    add(new Tag() {{
                        id = 383441L;
                        name = "Alexandra Schulist";
                    }}),
                    add(new Tag() {{
                        id = 568045L;
                        name = "Mrs. Sophie Smith MD";
                    }}),
                }};
            }};            

            AddPetFormResponse res = sdk.pet.addPetForm(req, new AddPetFormSecurity("perferendis") {{
                petstoreAuth = "";
            }});

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [pet](docs/sdks/pet/README.md)

* [addPetForm](docs/sdks/pet/README.md#addpetform) - Add a new pet to the store
* [addPetJson](docs/sdks/pet/README.md#addpetjson) - Add a new pet to the store
* [addPetRaw](docs/sdks/pet/README.md#addpetraw) - Add a new pet to the store
* [deletePet](docs/sdks/pet/README.md#deletepet) - Deletes a pet
* [findPetsByStatus](docs/sdks/pet/README.md#findpetsbystatus) - Finds Pets by status
* [findPetsByTags](docs/sdks/pet/README.md#findpetsbytags) - Finds Pets by tags
* [getPetById](docs/sdks/pet/README.md#getpetbyid) - Find pet by ID
* [updatePetWithForm](docs/sdks/pet/README.md#updatepetwithform) - Updates a pet in the store with form data
* [updatePetForm](docs/sdks/pet/README.md#updatepetform) - Update an existing pet
* [updatePetJson](docs/sdks/pet/README.md#updatepetjson) - Update an existing pet
* [updatePetRaw](docs/sdks/pet/README.md#updatepetraw) - Update an existing pet
* [uploadFile](docs/sdks/pet/README.md#uploadfile) - uploads an image

### [store](docs/sdks/store/README.md)

* [deleteOrder](docs/sdks/store/README.md#deleteorder) - Delete purchase order by ID
* [getInventory](docs/sdks/store/README.md#getinventory) - Returns pet inventories by status
* [getOrderById](docs/sdks/store/README.md#getorderbyid) - Find purchase order by ID
* [placeOrderForm](docs/sdks/store/README.md#placeorderform) - Place an order for a pet
* [placeOrderJson](docs/sdks/store/README.md#placeorderjson) - Place an order for a pet
* [placeOrderRaw](docs/sdks/store/README.md#placeorderraw) - Place an order for a pet

### [user](docs/sdks/user/README.md)

* [createUserForm](docs/sdks/user/README.md#createuserform) - Create user
* [createUserJson](docs/sdks/user/README.md#createuserjson) - Create user
* [createUserRaw](docs/sdks/user/README.md#createuserraw) - Create user
* [createUsersWithListInput](docs/sdks/user/README.md#createuserswithlistinput) - Creates list of users with given input array
* [deleteUser](docs/sdks/user/README.md#deleteuser) - Delete user
* [getUserByName](docs/sdks/user/README.md#getuserbyname) - Get user by user name
* [loginUser](docs/sdks/user/README.md#loginuser) - Logs user into the system
* [logoutUser](docs/sdks/user/README.md#logoutuser) - Logs out current logged in user session
* [updateUserForm](docs/sdks/user/README.md#updateuserform) - Update user
* [updateUserJson](docs/sdks/user/README.md#updateuserjson) - Update user
* [updateUserRaw](docs/sdks/user/README.md#updateuserraw) - Update user
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
