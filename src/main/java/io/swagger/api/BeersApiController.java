package io.swagger.api;

import io.swagger.model.Beer;
import io.swagger.model.BeersList;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-23T12:45:44.006Z[GMT]")
@RestController
public class BeersApiController implements BeersApi {

    private static final Logger log = LoggerFactory.getLogger(BeersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BeersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Beer> beersBeerIdGet(@Parameter(in = ParameterIn.PATH, description = "refers to the identifier id in the system of that beer", required=true, schema=@Schema()) @PathVariable("beer-id") Integer beerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Beer>(objectMapper.readValue("{\n  \"attenuation_level\" : 75,\n  \"method\" : {\n    \"mash-temps\" : [ {\n      \"temp\" : {\n        \"value\" : 64,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 72\n    }, {\n      \"temp\" : {\n        \"value\" : 30,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 20\n    }, {\n      \"temp\" : {\n        \"value\" : 50,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 10\n    } ],\n    \"fermentation\" : [ {\n      \"value\" : 64,\n      \"unit\" : \"celsius\"\n    } ],\n    \"twist\" : \"twist\"\n  },\n  \"target_og\" : 1044,\n  \"image_url\" : \"https://images.punkapi.com/v2/keg.png\",\n  \"ebc\" : 20,\n  \"description\" : \"\\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\\"\n\",\n  \"target_fg\" : 1010,\n  \"srm\" : 10,\n  \"volume\" : {\n    \"unit\" : \"litres\",\n    \"value\" : 20\n  },\n  \"abv\" : 4.5,\n  \"name\" : \"Buzz\",\n  \"ph\" : 4.4,\n  \"tagline\" : \"A real Bitter Experience.\",\n  \"ingredients\" : {\n    \"malts\" : [ {\n      \"name\" : \"Maris Otter Extra Pale\",\n      \"amount\" : {\n        \"value\" : 3.3,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Caramalt\",\n      \"amount\" : {\n        \"value\" : 0.2,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Munich\",\n      \"amount\" : {\n        \"value\" : 0.4,\n        \"unit\" : \"kilograms\"\n      }\n    } ],\n    \"hops\" : [ {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 25,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"start\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"middle\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"First Gold\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"end\",\n      \"attribute\" : \"Flavour\"\n    } ],\n    \"yeast\" : \"Wyeast 1056 - American Ale™\"\n  },\n  \"id\" : 1,\n  \"firs_brewed\" : \"09/2007\",\n  \"ibu\" : 60\n}", Beer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Beer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Beer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BeersList> beersGet(@NotNull @Min(1) @Max(80) @Parameter(in = ParameterIn.QUERY, description = "the number of element that the user would have in the paged response" ,required=true,schema=@Schema(allowableValues={  }, minimum="1", maximum="80"
, defaultValue="25")) @Valid @RequestParam(value = "per_page", required = true, defaultValue="25") Integer perPage,@NotNull @Min(1)@Parameter(in = ParameterIn.QUERY, description = "the number of page the user would have in the paged response" ,required=true,schema=@Schema(allowableValues={  }, minimum="1"
, defaultValue="1")) @Valid @RequestParam(value = "page", required = true, defaultValue="1") Integer page,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with ABV greater than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "abv_gt", required = false) Float abvGt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with ABV less than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "abv_lt", required = false) Float abvLt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with IBU greater than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "ibu_gt", required = false) Float ibuGt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with IBU less than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "ibu_lt", required = false) Float ibuLt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with EBC greater than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "ebc_gt", required = false) Float ebcGt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers with EBC less than the supplied number" ,schema=@Schema()) @Valid @RequestParam(value = "ebc_lt", required = false) Float ebcLt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied name (this will match partial strings as well so e.g punk will return Punk IPA), if you need to add spaces just add an underscore (_)." ,schema=@Schema()) @Valid @RequestParam(value = "beer_name", required = false) String beerName,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied yeast name, this performs a fuzzy match, if you need to add spaces just add an underscore (_)." ,schema=@Schema()) @Valid @RequestParam(value = "yeast", required = false) String yeast,@Pattern(regexp="[0-1][0-9]/[1-2][0-9]{3}") @Size(min=7,max=7) @Parameter(in = ParameterIn.QUERY, description = "Returns all beers brewed before this date, the date format is mm-yyyy e.g 10-2011" ,schema=@Schema()) @Valid @RequestParam(value = "brewed_before", required = false) String brewedBefore,@Pattern(regexp="[0-1][0-9]/[1-2][0-9]{3}") @Size(min=7,max=7) @Parameter(in = ParameterIn.QUERY, description = "Returns all beers brewed after this date, the date format is mm-yyyy e.g 10-2011" ,schema=@Schema()) @Valid @RequestParam(value = "brewed_after", required = false) String brewedAfter,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied hops name, this performs a fuzzy match, if you need to add spaces just add an underscore (_). " ,schema=@Schema()) @Valid @RequestParam(value = "hops", required = false) String hops,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied malt name, this performs a fuzzy match, if you need to add spaces just add an underscore (_). " ,schema=@Schema()) @Valid @RequestParam(value = "malt", required = false) String malt,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied food string, this performs a fuzzy match, if you need to add spaces just add an underscore (_). " ,schema=@Schema()) @Valid @RequestParam(value = "food", required = false) String food,@Parameter(in = ParameterIn.QUERY, description = "Returns all beers matching the supplied ID\"s. You can pass in multiple ID\"s by separating them with a | symbol. " ,schema=@Schema()) @Valid @RequestParam(value = "ids", required = false) String ids) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BeersList>(objectMapper.readValue("[ {\n  \"attenuation_level\" : 75,\n  \"method\" : {\n    \"mash-temps\" : [ {\n      \"temp\" : {\n        \"value\" : 64,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 72\n    }, {\n      \"temp\" : {\n        \"value\" : 30,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 20\n    }, {\n      \"temp\" : {\n        \"value\" : 50,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 10\n    } ],\n    \"fermentation\" : [ {\n      \"value\" : 64,\n      \"unit\" : \"celsius\"\n    } ],\n    \"twist\" : \"twist\"\n  },\n  \"target_og\" : 1044,\n  \"image_url\" : \"https://images.punkapi.com/v2/keg.png\",\n  \"ebc\" : 20,\n  \"description\" : \"\\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\\"\n\",\n  \"target_fg\" : 1010,\n  \"srm\" : 10,\n  \"volume\" : {\n    \"unit\" : \"litres\",\n    \"value\" : 20\n  },\n  \"abv\" : 4.5,\n  \"name\" : \"Buzz\",\n  \"ph\" : 4.4,\n  \"tagline\" : \"A real Bitter Experience.\",\n  \"ingredients\" : {\n    \"malts\" : [ {\n      \"name\" : \"Maris Otter Extra Pale\",\n      \"amount\" : {\n        \"value\" : 3.3,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Caramalt\",\n      \"amount\" : {\n        \"value\" : 0.2,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Munich\",\n      \"amount\" : {\n        \"value\" : 0.4,\n        \"unit\" : \"kilograms\"\n      }\n    } ],\n    \"hops\" : [ {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 25,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"start\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"middle\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"First Gold\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"end\",\n      \"attribute\" : \"Flavour\"\n    } ],\n    \"yeast\" : \"Wyeast 1056 - American Ale™\"\n  },\n  \"id\" : 1,\n  \"firs_brewed\" : \"09/2007\",\n  \"ibu\" : 60\n}, {\n  \"attenuation_level\" : 75,\n  \"method\" : {\n    \"mash-temps\" : [ {\n      \"temp\" : {\n        \"value\" : 64,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 72\n    }, {\n      \"temp\" : {\n        \"value\" : 30,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 20\n    }, {\n      \"temp\" : {\n        \"value\" : 50,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 10\n    } ],\n    \"fermentation\" : [ {\n      \"value\" : 64,\n      \"unit\" : \"celsius\"\n    } ],\n    \"twist\" : \"twist\"\n  },\n  \"target_og\" : 1044,\n  \"image_url\" : \"https://images.punkapi.com/v2/keg.png\",\n  \"ebc\" : 20,\n  \"description\" : \"\\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\\"\n\",\n  \"target_fg\" : 1010,\n  \"srm\" : 10,\n  \"volume\" : {\n    \"unit\" : \"litres\",\n    \"value\" : 20\n  },\n  \"abv\" : 4.5,\n  \"name\" : \"Buzz\",\n  \"ph\" : 4.4,\n  \"tagline\" : \"A real Bitter Experience.\",\n  \"ingredients\" : {\n    \"malts\" : [ {\n      \"name\" : \"Maris Otter Extra Pale\",\n      \"amount\" : {\n        \"value\" : 3.3,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Caramalt\",\n      \"amount\" : {\n        \"value\" : 0.2,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Munich\",\n      \"amount\" : {\n        \"value\" : 0.4,\n        \"unit\" : \"kilograms\"\n      }\n    } ],\n    \"hops\" : [ {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 25,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"start\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"middle\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"First Gold\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"end\",\n      \"attribute\" : \"Flavour\"\n    } ],\n    \"yeast\" : \"Wyeast 1056 - American Ale™\"\n  },\n  \"id\" : 1,\n  \"firs_brewed\" : \"09/2007\",\n  \"ibu\" : 60\n} ]", BeersList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BeersList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BeersList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Beer> beersRandomGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Beer>(objectMapper.readValue("{\n  \"attenuation_level\" : 75,\n  \"method\" : {\n    \"mash-temps\" : [ {\n      \"temp\" : {\n        \"value\" : 64,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 72\n    }, {\n      \"temp\" : {\n        \"value\" : 30,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 20\n    }, {\n      \"temp\" : {\n        \"value\" : 50,\n        \"unit\" : \"celsius\"\n      },\n      \"duration\" : 10\n    } ],\n    \"fermentation\" : [ {\n      \"value\" : 64,\n      \"unit\" : \"celsius\"\n    } ],\n    \"twist\" : \"twist\"\n  },\n  \"target_og\" : 1044,\n  \"image_url\" : \"https://images.punkapi.com/v2/keg.png\",\n  \"ebc\" : 20,\n  \"description\" : \"\\"A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.\\"\n\",\n  \"target_fg\" : 1010,\n  \"srm\" : 10,\n  \"volume\" : {\n    \"unit\" : \"litres\",\n    \"value\" : 20\n  },\n  \"abv\" : 4.5,\n  \"name\" : \"Buzz\",\n  \"ph\" : 4.4,\n  \"tagline\" : \"A real Bitter Experience.\",\n  \"ingredients\" : {\n    \"malts\" : [ {\n      \"name\" : \"Maris Otter Extra Pale\",\n      \"amount\" : {\n        \"value\" : 3.3,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Caramalt\",\n      \"amount\" : {\n        \"value\" : 0.2,\n        \"unit\" : \"kilograms\"\n      }\n    }, {\n      \"name\" : \"Munich\",\n      \"amount\" : {\n        \"value\" : 0.4,\n        \"unit\" : \"kilograms\"\n      }\n    } ],\n    \"hops\" : [ {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 25,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"start\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"Fuggles\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"middle\",\n      \"attribute\" : \"Flavour\"\n    }, {\n      \"name\" : \"First Gold\",\n      \"amount\" : {\n        \"value\" : 37.5,\n        \"unit\" : \"grams\"\n      },\n      \"add\" : \"end\",\n      \"attribute\" : \"Flavour\"\n    } ],\n    \"yeast\" : \"Wyeast 1056 - American Ale™\"\n  },\n  \"id\" : 1,\n  \"firs_brewed\" : \"09/2007\",\n  \"ibu\" : 60\n}", Beer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Beer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Beer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
