/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.tej.SwaggerCodgen.api;

import io.tej.SwaggerCodgen.model.Count;
import io.swagger.annotations.*;
import io.tej.SwaggerSpringDemo.Counter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-12T12:31:21.933472-04:00[America/New_York]")

@Validated
@Api(value = "counter", description = "the counter API")
public interface CounterApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /counter : Add a new counter to the Springboot App
     *
     * @param body Counter object that needs to registered with the springboot app (required)
     * @return Success (status code 200)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(value = "Add a new counter to the Springboot App", nickname = "addCounter", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/counter",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _addCounter(@ApiParam(value = "Counter object that needs to registered with the springboot app" ,required=true )  @Valid @RequestBody Count body) {
        return addCounter(body);
    }

    // Override this method
    default  ResponseEntity<Void> addCounter(Count body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    ResponseEntity<Void> addCounter(Counter body);
}
