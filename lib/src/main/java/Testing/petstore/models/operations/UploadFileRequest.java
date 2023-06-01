/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Testing.petstore.models.operations;

import Testing.petstore.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadFileRequest {
    @SpeakeasyMetadata("request:mediaType=application/octet-stream")
    public byte[] requestBody;

    public UploadFileRequest withRequestBody(byte[] requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Additional Metadata
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=additionalMetadata")
    public String additionalMetadata;

    public UploadFileRequest withAdditionalMetadata(String additionalMetadata) {
        this.additionalMetadata = additionalMetadata;
        return this;
    }
    
    /**
     * ID of pet to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=petId")
    public Long petId;

    public UploadFileRequest withPetId(Long petId) {
        this.petId = petId;
        return this;
    }
    
    public UploadFileRequest(@JsonProperty("petId") Long petId) {
        this.petId = petId;
  }
}
