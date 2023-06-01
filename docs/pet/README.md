# pet

## Overview

Everything about your Pets

Find out more
<http://swagger.io>
### Available Operations

* [addPetForm](#addpetform) - Add a new pet to the store
* [addPetJson](#addpetjson) - Add a new pet to the store
* [addPetRaw](#addpetraw) - Add a new pet to the store
* [deletePet](#deletepet) - Deletes a pet
* [findPetsByStatus](#findpetsbystatus) - Finds Pets by status
* [findPetsByTags](#findpetsbytags) - Finds Pets by tags
* [getPetById](#getpetbyid) - Find pet by ID
* [updatePetWithForm](#updatepetwithform) - Updates a pet in the store with form data
* [updatePetForm](#updatepetform) - Update an existing pet
* [updatePetJson](#updatepetjson) - Update an existing pet
* [updatePetRaw](#updatepetraw) - Update an existing pet
* [uploadFile](#uploadfile) - uploads an image

## addPetForm

Add a new pet to the store

### Example Usage

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
                                add("repellendus"),
                                add("sapiente"),
                            }}) {{
                category = new Category() {{
                    id = 1L;
                    name = "Dogs";
                }};;
                id = 10L;
                status = PetStatus.SOLD;
                tags = new Testing.petstore.models.shared.Tag[]{{
                    add(new Tag() {{
                        id = 870013L;
                        name = "Emilio Krajcik";
                    }}),
                }};
            }};            

            AddPetFormResponse res = sdk.pet.addPetForm(req, new AddPetFormSecurity("esse") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## addPetJson

Add a new pet to the store

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.AddPetJsonResponse;
import Testing.petstore.models.operations.AddPetJsonSecurity;
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
                                add("porro"),
                                add("dolorum"),
                                add("dicta"),
                            }}) {{
                category = new Category() {{
                    id = 1L;
                    name = "Dogs";
                }};;
                id = 10L;
                status = PetStatus.SOLD;
                tags = new Testing.petstore.models.shared.Tag[]{{
                    add(new Tag() {{
                        id = 582020L;
                        name = "Cassandra Welch";
                    }}),
                    add(new Tag() {{
                        id = 105907L;
                        name = "Tanya Gleason";
                    }}),
                    add(new Tag() {{
                        id = 736918L;
                        name = "Edna Mante II";
                    }}),
                }};
            }};            

            AddPetJsonResponse res = sdk.pet.addPetJson(req, new AddPetJsonSecurity("natus") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## addPetRaw

Add a new pet to the store

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.AddPetRawResponse;
import Testing.petstore.models.operations.AddPetRawSecurity;
import Testing.petstore.models.shared.Category;
import Testing.petstore.models.shared.Pet;
import Testing.petstore.models.shared.PetStatus;
import Testing.petstore.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.. req = "sed".getBytes()            

            AddPetRawResponse res = sdk.pet.addPetRaw(req, new AddPetRawSecurity("iste") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## deletePet

Deletes a pet

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.DeletePetRequest;
import Testing.petstore.models.operations.DeletePetResponse;
import Testing.petstore.models.operations.DeletePetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            DeletePetRequest req = new DeletePetRequest(222321L) {{
                apiKey = "natus";
            }};            

            DeletePetResponse res = sdk.pet.deletePet(req, new DeletePetSecurity("laboriosam") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## findPetsByStatus

Multiple status values can be provided with comma separated strings

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.FindPetsByStatusRequest;
import Testing.petstore.models.operations.FindPetsByStatusResponse;
import Testing.petstore.models.operations.FindPetsByStatusSecurity;
import Testing.petstore.models.operations.FindPetsByStatusStatus;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            FindPetsByStatusRequest req = new FindPetsByStatusRequest() {{
                status = FindPetsByStatusStatus.SOLD;
            }};            

            FindPetsByStatusResponse res = sdk.pet.findPetsByStatus(req, new FindPetsByStatusSecurity("saepe") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## findPetsByTags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.FindPetsByTagsRequest;
import Testing.petstore.models.operations.FindPetsByTagsResponse;
import Testing.petstore.models.operations.FindPetsByTagsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            FindPetsByTagsRequest req = new FindPetsByTagsRequest() {{
                tags = new String[]{{
                    add("in"),
                    add("corporis"),
                    add("iste"),
                }};
            }};            

            FindPetsByTagsResponse res = sdk.pet.findPetsByTags(req, new FindPetsByTagsSecurity("iure") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getPetById

Returns a single pet

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.GetPetByIdRequest;
import Testing.petstore.models.operations.GetPetByIdResponse;
import Testing.petstore.models.operations.GetPetByIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            GetPetByIdRequest req = new GetPetByIdRequest(902349L);            

            GetPetByIdResponse res = sdk.pet.getPetById(req, new GetPetByIdSecurity() {{
                apiKey = "YOUR_API_KEY_HERE";
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

## updatePetWithForm

Updates a pet in the store with form data

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdatePetWithFormRequest;
import Testing.petstore.models.operations.UpdatePetWithFormResponse;
import Testing.petstore.models.operations.UpdatePetWithFormSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            UpdatePetWithFormRequest req = new UpdatePetWithFormRequest(697631L) {{
                name = "Brenda Wisozk";
                status = "laborum";
            }};            

            UpdatePetWithFormResponse res = sdk.pet.updatePetWithForm(req, new UpdatePetWithFormSecurity("dolores") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updatePetForm

Update an existing pet by Id

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdatePetFormResponse;
import Testing.petstore.models.operations.UpdatePetFormSecurity;
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
                                add("corporis"),
                            }}) {{
                category = new Category() {{
                    id = 1L;
                    name = "Dogs";
                }};;
                id = 10L;
                status = PetStatus.AVAILABLE;
                tags = new Testing.petstore.models.shared.Tag[]{{
                    add(new Tag() {{
                        id = 315428L;
                        name = "Corey Hane III";
                    }}),
                    add(new Tag() {{
                        id = 634274L;
                        name = "Darrin Brakus";
                    }}),
                    add(new Tag() {{
                        id = 635059L;
                        name = "Jaime O'Hara";
                    }}),
                    add(new Tag() {{
                        id = 414369L;
                        name = "Nellie Frami";
                    }}),
                }};
            }};            

            UpdatePetFormResponse res = sdk.pet.updatePetForm(req, new UpdatePetFormSecurity("quis") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## updatePetJson

Update an existing pet by Id

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdatePetJsonResponse;
import Testing.petstore.models.operations.UpdatePetJsonSecurity;
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
                                add("laborum"),
                            }}) {{
                category = new Category() {{
                    id = 1L;
                    name = "Dogs";
                }};;
                id = 10L;
                status = PetStatus.PENDING;
                tags = new Testing.petstore.models.shared.Tag[]{{
                    add(new Tag() {{
                        id = 138183L;
                        name = "Jimmy Wiegand";
                    }}),
                    add(new Tag() {{
                        id = 820994L;
                        name = "Joyce Mueller";
                    }}),
                }};
            }};            

            UpdatePetJsonResponse res = sdk.pet.updatePetJson(req, new UpdatePetJsonSecurity("quasi") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## updatePetRaw

Update an existing pet by Id

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UpdatePetRawResponse;
import Testing.petstore.models.operations.UpdatePetRawSecurity;
import Testing.petstore.models.shared.Category;
import Testing.petstore.models.shared.Pet;
import Testing.petstore.models.shared.PetStatus;
import Testing.petstore.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            Testing.petstore.models.. req = "reiciendis".getBytes()            

            UpdatePetRawResponse res = sdk.pet.updatePetRaw(req, new UpdatePetRawSecurity("voluptatibus") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
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

## uploadFile

uploads an image

### Example Usage

```java
package hello.world;

import Testing.petstore.Petstore;
import Testing.petstore.models.operations.UploadFileRequest;
import Testing.petstore.models.operations.UploadFileResponse;
import Testing.petstore.models.operations.UploadFileSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Petstore sdk = Petstore.builder()
                .build();

            UploadFileRequest req = new UploadFileRequest(878194L) {{
                requestBody = "nihil".getBytes();
                additionalMetadata = "praesentium";
            }};            

            UploadFileResponse res = sdk.pet.uploadFile(req, new UploadFileSecurity("voluptatibus") {{
                petstoreAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.apiResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
