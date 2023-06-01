/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Testing.petstore.models.operations;

import Testing.petstore.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrderByIdRequest {
    /**
     * ID of order that needs to be fetched
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orderId")
    public Long orderId;

    public GetOrderByIdRequest withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    
    public GetOrderByIdRequest(@JsonProperty("orderId") Long orderId) {
        this.orderId = orderId;
  }
}
