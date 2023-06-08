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