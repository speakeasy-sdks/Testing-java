/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Testing.petstore.models.operations;

import Testing.petstore.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddPetJsonSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    public String petstoreAuth;

    public AddPetJsonSecurity withPetstoreAuth(String petstoreAuth) {
        this.petstoreAuth = petstoreAuth;
        return this;
    }
    
    public AddPetJsonSecurity(@JsonProperty("petstore_auth") String petstoreAuth) {
        this.petstoreAuth = petstoreAuth;
  }
}
